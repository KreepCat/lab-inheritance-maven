package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {


  int count;
  int start;

  public BasicCounter (int startVal){
    this.count = startVal;
    this.start = startVal;
  }

  public void increment() throws Exception {
    if (this.count == Integer.MAX_VALUE){
      throw new Exception("Count too large.");
    }
    this.count++;
  }

  public void reset(){
    this.count = this.start;
  }

  public int get(){
    return this.count;
  }

  public String toString(){
    return "[" + this.count + "]";
  }
  
}
