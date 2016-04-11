package io.ikka.exams.parsers.myexamcloud;

import io.ikka.exams.api.IExamQuestion;

import java.util.List;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestion implements IExamQuestion {
  private String question;
  private String id;
  private String questionNumber;
  private String topic;
  private String instructions;
  private String answer;
  private List<String> choices;

  @Override
  public String getQuestion() {
    return question;
  }

  @Override
  public void setQuestion(String question) {
    this.question = question;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public String getQuestionNumber() {
    return questionNumber;
  }

  @Override
  public void setQuestionNumber(String questionNumber) {
    this.questionNumber = questionNumber;
  }

  @Override
  public String getTopic() {
    return topic;
  }

  @Override
  public void setTopic(String topic) {
    this.topic = topic;
  }

  @Override
  public String getInstructions() {
    return instructions;
  }

  @Override
  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  @Override
  public List<String> getChoices() {
    return choices;
  }

  @Override
  public void setChoices(List<String> choices) {
    this.choices = choices;
  }

  @Override
  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ExamQuestion{");
    sb.append("question='").append(question).append('\'');
    sb.append(", id='").append(id).append('\'');
    sb.append(", questionNumber='").append(questionNumber).append('\'');
    sb.append(", topic='").append(topic).append('\'');
    sb.append(", instructions='").append(instructions).append('\'');
    sb.append(", answer='").append(answer).append('\'');
    sb.append(", choices=").append(choices);
    sb.append('}');
    return sb.toString();
  }
}
