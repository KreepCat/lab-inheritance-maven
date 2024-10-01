package edu.grinnell.csc207.util;

public class BoundedCounter extends BasicCounter {

  int bound;

  public BoundedCounter(int start, int upperBound){
    super(start);
    this.bound = upperBound;
  }

  @Override
  public void increment() throws Exception {
    if (this.count == bound){
      throw new Exception("Count too large.");
    }
    this.count++;
  }
  
}
