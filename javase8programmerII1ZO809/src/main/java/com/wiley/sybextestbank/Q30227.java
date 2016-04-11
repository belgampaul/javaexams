package com.wiley.sybextestbank;

/**
 * @author ikka
 * @date: 10.04.2016.
 */
public class Q30227 {
  class CanNotHopException extends Exception {}
  class Kangaroo {
    public void hop() throws CanNotHopException { }
  }
  class Joey extends Kangaroo {
    // INSERT CODE HERE
    public void hop() {}
  }
}
