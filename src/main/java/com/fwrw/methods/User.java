package com.fwrw.methods;

public class User {
  public static void main(String[] args) {
    
    Television Tv = new Television();

    // System.out.println(Tv.on); // result ~> false

    Tv.turnOn();

    // System.out.println(Tv.on); // result ~> true
    
    Tv.nextCH();

    // System.out.println(Tv.currentCH()); // result ~> '2'
    
    Tv.increaseVol();

    // System.out.println(Tv.currentVol()); // result ~> '21'
    
    Tv.turnOff();

    // System.out.println(Tv.on); // result ~> false
  }
}
