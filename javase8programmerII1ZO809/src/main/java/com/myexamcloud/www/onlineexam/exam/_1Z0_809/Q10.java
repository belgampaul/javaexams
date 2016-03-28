package com.myexamcloud.www.onlineexam.exam._1Z0_809;

import java.util.Optional;


interface I {}

abstract class A implements I {}

class B extends A {}

class Q10 {
  public static void main(String[] args) {
    I i = new B();
    A a = new B();

    boolean t1 = i instanceof I, t2 = a instanceof I;

    System.out.print(t1 + " " + t2);
  }
}
