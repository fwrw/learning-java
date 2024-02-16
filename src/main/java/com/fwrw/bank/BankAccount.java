package com.fwrw.bank;

public class BankAccount {
  private int ID;
  private String agency;
  private String userName;
  private double balance = 0.0;

  public void setID(int iD) {
    this.ID = iD;
  }

  public String getID() {
    return String.valueOf(ID);
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public String getAgency() {
    return agency;
  }

  private void setBalance(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    String formatedBalance = String.format("%.2f", this.balance);
    return Double.parseDouble(formatedBalance);
  }

  public void setOwnerName(String userName) {
    this.userName = userName;
  }

  public String getOwnerName() {
    return userName;
  }

  @Override
  public String toString() {
    return "ID = " + getID() + "\nAgency = " + getAgency() + "\nOwner = " + getOwnerName() + "\nBalance = " + getBalance() + "\n\n";
  }

  public boolean withdraw(double value) {
    if (this.getBalance() >= value) {
      double newBalance = this.getBalance() - value;
      this.setBalance(newBalance);
      return true;
    }
    return false;
  }

  public boolean deposit(double value) {
    double newBalance = this.getBalance() + value;
    this.setBalance(newBalance);
    return true;
  } 
}
