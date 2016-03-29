package io.ikka.exams.java;

import org.apache.commons.lang3.StringUtils;

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
public class ExamQuestionProcessor {
  public static void main(String[] args) {
    try {
      if (args.length != 2) {
        System.out.println("Not enough arguments.\nParameters:\n1. Directory name containing source html files of the exam.\n2. Output directory");
      }
      String htmlSrcDir = args[0];
      DirectoryStream<Path> paths = Files.newDirectoryStream(Paths.get(htmlSrcDir));

      SortedMap<String, ExamQuestion> examQuestions = new TreeMap<>();
      paths.forEach(path -> examQuestions.put(path.toString(), ExamQuestionHTMLProcessor.processFile(path)));
      StringBuilder sb = new StringBuilder();

      for (ExamQuestion examQuestion : examQuestions.values()) {
        String str = ExamQuestionWithMDSupport.toMarkdownString(examQuestion);
        sb.append(str);
        String qNumber = examQuestion.getQuestionNumber().split(" ")[1];
        Files.write(Paths.get(args[1] + "/q" + StringUtils.leftPad(qNumber, 2, "0") + ".md"), str.getBytes());
      }
      //save all questions in one file
      Files.write(Paths.get(args[1] + "/questions.md"), sb.toString().getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
