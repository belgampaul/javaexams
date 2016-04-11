package io.ikka.exams.api;

import io.ikka.exams.parsers.myexamcloud.ExamQuestionWithMDSupport;
import io.ikka.utils.MardownConstants;
import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;

/**
 * @author ikka
 * @date 09.04.2016.
 */
public interface IExamQuestionProcessor {
  String QUESTIONS_MD_FILE_NAME = "questions." + MardownConstants.DEFAULT_FILE_EXTENSION;
  String FILE_PREFIX = "q";

  Collection<IExamQuestion> getQuestions();

  Path getDestDirPath();

  void process();

  default void saveAsMarkdownFiles() {
    StringBuilder allQuestions = new StringBuilder();

    try {
      final int[] cnt = {0};

      getQuestions().parallelStream().forEach(examQuestion -> {
        String oneQuestion = ExamQuestionWithMDSupport.toMarkdownString(examQuestion);
        allQuestions.append(oneQuestion);

        String questionNumber = examQuestion.getQuestionNumber();
        questionNumber = questionNumber == null ? "" : questionNumber;
        String qNumber = !questionNumber.contains(" ") ? questionNumber : questionNumber.split(" ")[1];
        String body = StringUtils.leftPad(qNumber, 2, "0");
        String fileName = FILE_PREFIX + body + "." + MardownConstants.DEFAULT_FILE_EXTENSION;

        String _destFilePath = String.format("%s/%s", getDestDirPath().toString(), fileName);
        Path destFilePath = Paths.get(_destFilePath);
        byte[] data = oneQuestion.getBytes();

        File file = new File(destFilePath.toString());
        //noinspection ResultOfMethodCallIgnored
        file.getParentFile().mkdirs();
        try {
          Files.write(destFilePath, data);
        } catch (IOException e) {
          e.printStackTrace();
        }
      });

      //save all questions in one file
      Path destFilePath = Paths.get(String.format("%s/%s", getDestDirPath().toString(), QUESTIONS_MD_FILE_NAME));
      byte[] data = allQuestions.toString().getBytes();

      Files.write(destFilePath, data);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
