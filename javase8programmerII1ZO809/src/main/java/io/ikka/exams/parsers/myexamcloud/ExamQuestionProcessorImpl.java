package io.ikka.exams.parsers.myexamcloud;

import io.ikka.exams.api.ExamQuestionProcessor;
import io.ikka.exams.api.IExamQuestion;
import io.ikka.exams.api.IExamQuestionProcessor;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestionProcessorImpl extends ExamQuestionProcessor {

  public ExamQuestionProcessorImpl(Path dirPath, Path destDirPath) throws IOException {
    super(destDirPath, dirPath);


  }

  public static void main(String[] args) {
    try {
      if (args.length != 2) {
        System.out.println("Not enough arguments.\nParameters:\n1. Directory name containing source html files of the exam.\n2. Output directory");
        System.exit(0);
      }

      String htmlSrcDir = args[0];
      String destDir = args[1];

      IExamQuestionProcessor questionProcessor = new ExamQuestionProcessorImpl(Paths.get(htmlSrcDir), Paths.get(destDir));
      questionProcessor.process();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  protected void setExamQuestions(Object... params) {
    DirectoryStream<Path> paths;
    try {
      paths = Files.newDirectoryStream((Path) params[0]);
      SortedMap<String, IExamQuestion> examQuestionsMap = new TreeMap<>();
      paths.forEach(path -> examQuestionsMap.put(path.toString(), ExamQuestionHTMLProcessor.processFile(path)));
      examQuestions = examQuestionsMap.values();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
