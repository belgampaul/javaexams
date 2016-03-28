package com.myexamcloud.www.onlineexam.exam._1Z0_809;

class Q2 {
  public static void main(String[] args) {
    new Q2().go();
  }

  void go() {
    System.out.print("A ");
    try {
      run(0);
      System.out.print("B ");
    } catch (Exception e) {
      System.out.print("C ");
    } finally {
      System.out.print("D ");
    }
  }

  void run(int i) {
    try {
      System.out.print("E ");
      int x = 5 / i;
      System.out.print("F ");
    } catch (NumberFormatException e2) {
      System.out.print("G ");
    } finally {
      System.out.print("H ");
    }
  }
}
