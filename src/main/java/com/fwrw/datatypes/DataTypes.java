package com.fwrw.datatypes;

public class DataTypes {
  public static void main(String[] args) {
    
    int number; // 4bytes | -2b ~ +2b
    float floatNum = 1.0f;
    short year = 2024; // 2bytes | -32k ~ +32k
    final double PI = 3.1416; // constant - value cannot change (uppercase convention)

    number = (int) floatNum; // casting float -> int

    System.out.println(number);

    String text = "Hello world"; // text -_-

    System.out.println(text);
  }
}
