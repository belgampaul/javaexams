package io.ikka.exams.parsers.wiley;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author ikka
 * @date: 09.04.2016.
 */
class Question {
  public final String id;
  public final String attempts_id;
  public final String question_id;
  public final User_answer user_answer;
  public final Notes notes;
  public final String is_bookmarked;
  public final Is_correct is_correct;
  public final long time_spent;
  public final String status;
  public final String section_id;
  public final Question_type_id question_type_id;
  public final String question_type;
  public final String answer;
  public final String is_final;
  public final String opt_start;
  public final CorrectAnserForDisplay correctAnserForDisplay;
  public final String difficulty_level;
  public final String assessment_title;
  public final String learning_objective;
  public final Suffix suffix;
  public final Prefix prefix;
  public final Direction direction[];
  public final QuestionData questionData[];
  public final ChoiceData choiceData[];
  public final Hint hints[];

  @JsonCreator
  public Question(@JsonProperty("id") String id, @JsonProperty("attempts_id") String attempts_id, @JsonProperty("question_id") String question_id, @JsonProperty("user_answer") User_answer user_answer, @JsonProperty("notes") Notes notes, @JsonProperty("is_bookmarked") String is_bookmarked, @JsonProperty("is_correct") Is_correct is_correct, @JsonProperty("time_spent") long time_spent, @JsonProperty("status") String status, @JsonProperty("section_id") String section_id, @JsonProperty("question_type_id") Question_type_id question_type_id, @JsonProperty("question_type") String question_type, @JsonProperty("answer") String answer, @JsonProperty("is_final") String is_final, @JsonProperty("opt_start") String opt_start, @JsonProperty("correctAnserForDisplay") CorrectAnserForDisplay correctAnserForDisplay, @JsonProperty("difficulty_level") String difficulty_level, @JsonProperty("assessment_title") String assessment_title, @JsonProperty("learning_objective") String learning_objective, @JsonProperty("suffix") Suffix suffix, @JsonProperty("prefix") Prefix prefix, @JsonProperty("direction") Direction[] direction, @JsonProperty("questionData") QuestionData[] questionData, @JsonProperty("choiceData") ChoiceData[] choiceData, @JsonProperty("hints") Hint[] hints) {
    this.id = id;
    this.attempts_id = attempts_id;
    this.question_id = question_id;
    this.user_answer = user_answer;
    this.notes = notes;
    this.is_bookmarked = is_bookmarked;
    this.is_correct = is_correct;
    this.time_spent = time_spent;
    this.status = status;
    this.section_id = section_id;
    this.question_type_id = question_type_id;
    this.question_type = question_type;
    this.answer = answer;
    this.is_final = is_final;
    this.opt_start = opt_start;
    this.correctAnserForDisplay = correctAnserForDisplay;
    this.difficulty_level = difficulty_level;
    this.assessment_title = assessment_title;
    this.learning_objective = learning_objective;
    this.suffix = suffix;
    this.prefix = prefix;
    this.direction = direction;
    this.questionData = questionData;
    this.choiceData = choiceData;
    this.hints = hints;
  }

  public static final class User_answer {

    @JsonCreator
    public User_answer() {
    }
  }

  public static final class Notes {

    @JsonCreator
    public Notes() {
    }
  }

  public static final class Is_correct {

    @JsonCreator
    public Is_correct() {
    }
  }

  public static final class Question_type_id {

    @JsonCreator
    public Question_type_id() {
    }
  }

  public static final class CorrectAnserForDisplay {

    @JsonCreator
    public CorrectAnserForDisplay() {
    }
  }

  public static final class Suffix {

    @JsonCreator
    public Suffix() {
    }
  }

  public static final class Prefix {

    @JsonCreator
    public Prefix() {
    }
  }

  public static final class Direction {

    @JsonCreator
    public Direction() {
    }
  }

  public static final class QuestionData {
    public final String data_type_id;
    public final String data;
    public final String display_order;

    @JsonCreator
    public QuestionData(@JsonProperty("data_type_id") String data_type_id, @JsonProperty("data") String data, @JsonProperty("display_order") String display_order) {
      this.data_type_id = data_type_id;
      this.data = data;
      this.display_order = display_order;
    }
  }

  public static final class ChoiceData {
    public final String id;
    public final Data data[];

    @JsonCreator
    public ChoiceData(@JsonProperty("id") String id, @JsonProperty("data") Data[] data) {
      this.id = id;
      this.data = data;
    }

    public static final class Data {
      public final String data_type_id;
      public final String data;
      public final String display_order;

      @JsonCreator
      public Data(@JsonProperty("data_type_id") String data_type_id, @JsonProperty("data") String data, @JsonProperty("display_order") String display_order) {
        this.data_type_id = data_type_id;
        this.data = data;
        this.display_order = display_order;
      }
    }
  }

  public static final class Hint {
    public final String data_type_id;
    public final String data;
    public final String display_order;

    @JsonCreator
    public Hint(@JsonProperty("data_type_id") String data_type_id, @JsonProperty("data") String data, @JsonProperty("display_order") String display_order) {
      this.data_type_id = data_type_id;
      this.data = data;
      this.display_order = display_order;
    }
  }
}
