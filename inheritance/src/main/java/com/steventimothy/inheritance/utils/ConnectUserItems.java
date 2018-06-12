package com.steventimothy.inheritance.utils;

public class ConnectUserItems {
  private int budgetID;
  private String budgetName;

  public ConnectUserItems() {
    this(0, "");
  }

  public ConnectUserItems(int budgetID, String budgetName) {
    this.budgetID = budgetID;
    this.budgetName = budgetName;
  }

  public int getBudgetID() {
    return budgetID;
  }

  public void setBudgetID(int budgetID) {
    this.budgetID = budgetID;
  }

  public String getBudgetName() {
    return budgetName;
  }

  public void setBudgetName(String budgetName) {
    this.budgetName = budgetName;
  }
}
