package io.ikka.exams.parsers.myexamcloud;

import io.ikka.exams.api.IExamQuestion;
import io.ikka.utils.MarkdownHelper;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestionWithMDSupport extends ExamQuestion {


  public static String toMarkdownString(IExamQuestion question) {
    final StringBuilder sb = new StringBuilder();
    String nl = System.getProperty("line.separator");

    sb.append(MarkdownHelper.h1(question.getTopic()));
    sb.append(MarkdownHelper.bold(question. getQuestionNumber())).append(nl);
    sb.append(MarkdownHelper.code( question.getQuestion())).append(nl);
    sb.append(question.getInstructions()).append(nl);
    sb.append(MarkdownHelper.list(question.getChoices())).append(nl);
    sb.append("Answer: ").append(MarkdownHelper.italic(question.getAnswer())).append(nl).append(nl);

    return sb.toString();

  }


}
