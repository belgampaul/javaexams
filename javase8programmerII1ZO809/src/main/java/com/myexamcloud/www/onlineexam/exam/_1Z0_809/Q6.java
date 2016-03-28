package com.myexamcloud.www.onlineexam.exam._1Z0_809;

import java.util.concurrent.ForkJoinTask;

public class Q6 {
  public static void main(String[] args) {
    new ForkJoinTask<String>() {
      @Override
      public String getRawResult() {
        return null;
      }

      @Override
      protected void setRawResult(String value) {

      }

      @Override
      protected boolean exec() {
        return false;
      }
    };
  }
}
