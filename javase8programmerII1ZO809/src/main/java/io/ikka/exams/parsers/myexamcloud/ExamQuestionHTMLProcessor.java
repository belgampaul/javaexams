package io.ikka.exams.parsers.myexamcloud;

import io.ikka.exams.api.IExamQuestion;
import org.apache.commons.lang3.StringEscapeUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestionHTMLProcessor {
  public static IExamQuestion processFile(Path path) {
    StringBuilder sb = new StringBuilder();
    try {
      Files.readAllLines(path).stream().forEachOrdered(s -> sb.append(s).append("\n"));
      return parseHTML(sb.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * parses html string  into an ExamQuestion POJO.
   *
   * @param content the content to be parsed.
   * @return ExamQuestion
   */
  private static IExamQuestion parseHTML(final String content) {
    Document doc = Jsoup.parse(content);

    ArrayList<String> choices = new ArrayList<>();
    doc.select(".quesChoice").stream().forEachOrdered(element -> choices.add(element.text()));

    String question = doc.select(".userContent").first().html();
    question = Jsoup.parse(question.replaceAll("(?i)<br[^>]*>", "br2n")).text().replaceAll("br2n", "\n");//remove all html markup but keep new lines

    IExamQuestion examQuestion = new ExamQuestion();
    examQuestion.setQuestion(StringEscapeUtils.unescapeHtml4(question));
    examQuestion.setInstructions(doc.select(".singleMulti").select(".choices").select("h3").text());
    examQuestion.setTopic(doc.select(".quesTopic").text());
    examQuestion.setQuestionNumber(doc.select(".bees").first().text());
    examQuestion.setQuestionNumber(doc.select(".bees").first().text());
    examQuestion.setAnswer("");
    examQuestion.setChoices(choices);

    return examQuestion;
  }
}
