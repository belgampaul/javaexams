package io.ikka.exams.topics.forloop;

/**
 * @author ikka
 * @date: 11.04.2016.
 */
public class Q1 {
  public static void main(String[] args) {
    String[] names = new String[3];
    names[0] = "Lisa";
    names[1] = "Kevin";
    names[2] = "Roger";
    for(String name : names) {
      System.out.print(name + ", ");
    }
  }
}
