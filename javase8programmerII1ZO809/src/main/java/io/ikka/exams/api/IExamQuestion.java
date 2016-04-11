package io.ikka.exams.api;

import java.util.List;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
public interface IExamQuestion {
  String getQuestion();

  void setQuestion(String question);

  String getId();

  void setId(String id);

  String getQuestionNumber();

  void setQuestionNumber(String questionNumber);

  String getTopic();

  void setTopic(String topic);

  String getInstructions();

  void setInstructions(String instructions);

  List<String> getChoices();

  void setChoices(List<String> choices);

  String getAnswer();

  void setAnswer(String answer);
}
