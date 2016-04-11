package io.ikka.utils;

import java.util.List;

/**
 * @author ikka
 * @date: 29.03.2016.
 */
public class MarkdownHelper implements MardownConstants {

  public static String bold(String s) {
    if (s == null) {
      return "";
    }
    return BOLD + s + BOLD;
  }

  public static String italic(String s) {
    if (s == null) {
      return "";
    }
    return ITALIC + s + ITALIC;
  }

  public static String h1(String s) {
    if (s == null) {
      return "";
    }
    return s + NL + underline(s) + NL;
  }

  private static String underline(String s) {
    if (s == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append("=");//let's use a literal
    }
    return sb.toString();
  }

  public static String code(String s) {
    if (s == null) {
      return "";
    }
    return CODE + NL + s + NL + CODE + NL;
  }

  public static String list(List<String> list) {
    if (list == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    list.stream().forEachOrdered(s -> sb.append(LIST).append(s).append(NL));
    return sb.toString();
  }
}
