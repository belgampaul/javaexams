package io.ikka.exams.api;

import java.nio.file.Path;
import java.util.Collection;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
public abstract class ExamQuestionProcessor implements IExamQuestionProcessor {


  protected final Path destDirPath;
  protected Collection<IExamQuestion> examQuestions;

  public ExamQuestionProcessor(Path destDirPath, Object ... params) {
    this.destDirPath = destDirPath;
    setExamQuestions(params);
  }

  abstract protected void setExamQuestions(Object... params);


  @Override
  final public Path getDestDirPath() {
    return destDirPath;
  }

  @Override
  final public Collection<IExamQuestion> getQuestions() {
    return examQuestions;
  }

  @Override
  final public void process() {
    saveAsMarkdownFiles();
  }

  @Override
  final public void saveAsMarkdownFiles() {
    IExamQuestionProcessor.super.saveAsMarkdownFiles();
  }
}
