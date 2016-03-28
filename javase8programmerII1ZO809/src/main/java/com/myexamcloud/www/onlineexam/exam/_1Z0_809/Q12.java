package com.myexamcloud.www.onlineexam.exam._1Z0_809;

import java.util.stream.Stream;

public class Q12 {

  public static void main(String[] args) {
    Stream ints = Stream.of(3,6,0,4);
    ints.sorted().peek(System.out::print).findFirst();
  }
}
