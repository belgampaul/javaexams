package com.myexamcloud.www.onlineexam.exam._1Z0_809;

import java.util.stream.Stream;

public class Q1 {
  public static void main(String[] args) {
    Stream ints = Stream.of(1, 2, 3);
    //todo uncomment
//    ints.forEach((Integer i) -> {
//      System.out.print(i * 2);
//    });
    ints.forEach(System.out::print);
  }
}
