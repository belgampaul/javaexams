package io.ikka.exams.topics.immutable;

/**
 * @author ikka
 * @date: 07.04.2016.
 */
public class Q1 {

  public static void change(Long aLong) {
    aLong = 4L;
  }

  public static Long change2(Long aLong) {
    return 4L;
  }

  public static Long change3(Long aLong) {
    return new Long("4");
  }

  public static void main(String[] args) {
    Long a = new Long(4L);
    final Long finalA = a;
    Long b = new Long("4");
    Long c = 4L;
    Long d = 4L;
    Long e = Long.valueOf(4L);
    Long f = Long.valueOf("4");
    Long g = new Long("4");
    Long h = new Long(4L);

    System.out.println(String.format("a == b ? %s", a == b));
    System.out.println(String.format("a == c ? %s", a == c));
    System.out.println(String.format("a == h ? %s", a == h));
    System.out.println(String.format("c == d  %s", c == d));
    System.out.println(String.format("c == e ? %s", c == e));
    System.out.println(String.format("c == f ? %s", c == f));

    change(a);
    System.out.println(String.format("a == c ? %s", a == c));

    a = change2(a);
    System.out.println(String.format("a == c ? %s", a == c));

    a = change3(a);
    System.out.println(String.format("a == h ? %s", a == h));

  }
}
