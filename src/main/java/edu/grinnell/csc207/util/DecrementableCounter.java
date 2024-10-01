package edu.grinnell.csc207.util;


public class DecrementableCounter extends BasicCounter {
  /**
   * Create a new decrementable counter.
   *
   * @param start
   *   The initial value of the counter.
   */
  public DecrementableCounter(int start) {
    super(start);
  } // DecrementableCounter(int)

  public void decrement() throws Exception {
    if (this.count == Integer.MIN_VALUE){
      throw new Exception("Count too small.");
    }
    this.count--;
  }
} // class DecrementableCounter

