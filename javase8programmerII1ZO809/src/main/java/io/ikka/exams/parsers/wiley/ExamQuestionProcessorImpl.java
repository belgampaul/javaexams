package io.ikka.exams.parsers.wiley;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.ikka.exams.api.ExamQuestionProcessor;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
public class ExamQuestionProcessorImpl extends ExamQuestionProcessor {
  private static final ObjectMapper objectMapper = new ObjectMapper();
//  private static final String PATHNAME = "com.wiley.sybextestbank/questions.json";
  private static final String PATHNAME = "com.wiley.sybextestbank/questionsReview.json";

  public ExamQuestionProcessorImpl(Path destDirPath, Path pathToJson) {
    super(destDirPath, pathToJson);
  }

  public static void main(String[] args) {
    URL resource = ExamQuestionProcessorImpl.class.getClassLoader().getResource(PATHNAME);
    if (resource != null) {
      String pathToJsonFile = resource.getFile();
      ExamQuestionProcessorImpl examQuestionProcessor = new ExamQuestionProcessorImpl(Paths.get("./tmp/com.wiley.sybextestbank"), Paths.get(pathToJsonFile.substring(1)));
      examQuestionProcessor.process();
    }

  }

  @Override
  protected void setExamQuestions(Object... params) {
    try {
      examQuestions = Arrays.asList(objectMapper.readValue(new File(params[0].toString()), QuestionImpl[].class));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
