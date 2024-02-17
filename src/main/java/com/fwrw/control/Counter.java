package com.fwrw.control;

import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter the first value: ");
    int firstValue = sc.nextInt();
    System.out.println("Enter the second value: ");
    int secondValue = sc.nextInt();
  
    try {
      count(firstValue, secondValue);
    } catch (InvalidParamException e) {
      System.out.println(e);
    }
  }

  public static void count(int firstValue, int secondValue) throws InvalidParamException {
    if (firstValue > secondValue) {
      throw new InvalidParamException("The first value must be less than the second value.");
    }

    int totalLoops = secondValue - firstValue;

    for (int i = firstValue; i <= secondValue; i++) {
      System.out.println(i);
    }
  }
}
