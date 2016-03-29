package io.ikka.exams.java;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestionWithMDSupport extends ExamQuestion {


  public static String toMarkdownString(ExamQuestion eq) {
    final StringBuilder sb = new StringBuilder();
    String nl = System.getProperty("line.separator");

    sb.append(MarkdownHelper.h1(eq.getTopic()));
    sb.append(MarkdownHelper.bold(eq. getQuestionNumber())).append(nl);
    sb.append(MarkdownHelper.code( eq.getQuestion())).append(nl);
    sb.append(eq.getInstructions()).append(nl);
    sb.append(MarkdownHelper.list(eq.getChoices())).append(nl);

    return sb.toString();

  }


}
