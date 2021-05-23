/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diningphilosopher;

/**
 *
 * @author royla
 */
public class philosopher implements Runnable {
  private final int seat;
  private final StickHolder left, right;
  public philosopher(int seat,
    StickHolder left, StickHolder right) {
    this.seat = seat;
    this.left = left;
    this.right = right;
  }
  @Override
  public String toString() {
    return "P" + seat;
  }
  @Override
  public void run() {
    while(true) {
      // System.out.println("Thinking");   // [1]
      right.pickUp();
      left.pickUp();
      System.out.println(this + " eating");
      right.putDown();
      left.putDown();
    }
  }
}
