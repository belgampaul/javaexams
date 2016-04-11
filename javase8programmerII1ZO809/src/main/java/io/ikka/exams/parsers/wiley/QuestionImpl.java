package io.ikka.exams.parsers.wiley;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.ikka.exams.api.IExamQuestion;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
public class QuestionImpl extends Question implements IExamQuestion {
  public QuestionImpl(@JsonProperty("id") String id, @JsonProperty("attempts_id") String attempts_id, @JsonProperty("question_id") String question_id, @JsonProperty("user_answer") User_answer user_answer, @JsonProperty("notes") Notes notes, @JsonProperty("is_bookmarked") String is_bookmarked, @JsonProperty("is_correct") Is_correct is_correct, @JsonProperty("time_spent") long time_spent, @JsonProperty("status") String status, @JsonProperty("section_id") String section_id, @JsonProperty("question_type_id") Question_type_id question_type_id, @JsonProperty("question_type") String question_type, @JsonProperty("answer") String answer, @JsonProperty("is_final") String is_final, @JsonProperty("opt_start") String opt_start, @JsonProperty("correctAnserForDisplay") CorrectAnserForDisplay correctAnserForDisplay, @JsonProperty("difficulty_level") String difficulty_level, @JsonProperty("assessment_title") String assessment_title, @JsonProperty("learning_objective") String learning_objective, @JsonProperty("suffix") Suffix suffix, @JsonProperty("prefix") Prefix prefix, @JsonProperty("direction") Direction[] direction, @JsonProperty("questionData") QuestionData[] questionData, @JsonProperty("choiceData") ChoiceData[] choiceData, @JsonProperty("hints") Hint[] hints) {
    super(id, attempts_id, question_id, user_answer, notes, is_bookmarked, is_correct, time_spent, status, section_id, question_type_id, question_type, answer, is_final, opt_start, correctAnserForDisplay, difficulty_level, assessment_title, learning_objective, suffix, prefix, direction, questionData, choiceData, hints);
  }

  @Override
  public String getQuestion() {
    Document parse = Jsoup.parse(questionData[0].data);
    String question = parse.html();
    return Jsoup.parse(question.replaceAll("(?i)<br[^>]*>", "br2n")).text().replaceAll("br2n", "\n");
  }

  @Override
  public void setQuestion(String question) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getQuestionNumber() {
    return getId();
  }

  @Override
  public void setQuestionNumber(String questionNumber) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getTopic() {
    return learning_objective;
  }

  @Override
  public void setTopic(String topic) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getInstructions() {
    return "";//no such element in the data
  }

  @Override
  public void setInstructions(String instructions) {
    throw new UnsupportedOperationException();
  }

  @Override
  public List<String> getChoices() {
    List<String> choicesList = new ArrayList<>();
    for (ChoiceData cd : choiceData) {
      choicesList.add(cd.id + " " + Jsoup.parse(cd.data[0].data).text());
    }
    return choicesList;
  }

  @Override
  public void setChoices(List<String> choices) {
    throw new UnsupportedOperationException();
  }

  @Override
  public String getAnswer() {
    return answer;
  }

  @Override
  public void setAnswer(String answer) {

  }
}
