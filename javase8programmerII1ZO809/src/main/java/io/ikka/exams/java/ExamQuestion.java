package io.ikka.exams.java;

import java.util.List;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class ExamQuestion {
  private String question;
  private String id;
  private String questionNumber;
  private String topic;
  private String instructions;
  private List<String> choices;

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getQuestionNumber() {
    return questionNumber;
  }

  public void setQuestionNumber(String questionNumber) {
    this.questionNumber = questionNumber;
  }

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public List<String> getChoices() {
    return choices;
  }

  public void setChoices(List<String> choices) {
    this.choices = choices;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ExamQuestion{");
    sb.append("question='").append(question).append('\'');
    sb.append(", id='").append(id).append('\'');
    sb.append(", questionNumber='").append(questionNumber).append('\'');
    sb.append(", topic='").append(topic).append('\'');
    sb.append(", instructions='").append(instructions).append('\'');
    sb.append(", choices=").append(choices);
    sb.append('}');
    return sb.toString();
  }
}
