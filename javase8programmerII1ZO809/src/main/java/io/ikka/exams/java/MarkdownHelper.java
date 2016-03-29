package io.ikka.exams.java;

import java.util.List;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class MarkdownHelper {
  public static final String NL = System.getProperty("line.separator");//new line

  public static final String BOLD = "**";
  public static final String ITALIC = "*";
  public static final String CODE = "```";
  public static final String LIST = "- ";

  public static String bold(String s) {
    return BOLD + s + BOLD;
  }

  public static String italic(String s) {
    return ITALIC + s + ITALIC;
  }

  public static String h1(String s) {
    return s + NL + underline(s) + NL;
  }

  private static String underline(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append("=");//let's use a literal
    }
    return sb.toString();
  }

  public static String code(String s) {
    return CODE + NL + s + NL + CODE + NL;
  }

  public static String list(List<String> list) {
    StringBuilder sb = new StringBuilder();
    list.stream().forEachOrdered(s -> sb.append(LIST).append(s).append(NL));
    return sb.toString();
  }
}
