package com.fwrw.bank;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount acc = new BankAccount();

    System.out.println("Enter the Account ID: ");
    acc.setID(sc.nextInt());
    System.out.println("Enter the Account Agency: ");
    acc.setAgency(sc.next());
    System.out.println("Enter the OwnerName: ");
    acc.setOwnerName(sc.next());

    System.out.println("Enther the amount to deposit: ");
    acc.deposit(sc.nextDouble());

    System.out.println("Enther the amount to withdraw: ");
    acc.withdraw(sc.nextDouble());


    System.out.println(acc.toString());
    sc.close();

  }
}
