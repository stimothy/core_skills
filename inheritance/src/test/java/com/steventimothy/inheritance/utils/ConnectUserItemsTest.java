package com.steventimothy.inheritance.utils;

import org.junit.Assert;
import org.junit.Test;

public class ConnectUserItemsTest {

  @Test
  public void connectUserItemsDefaultConstructorTest() {
    ConnectUserItems item = new ConnectUserItems();

    testConnectUserItems(0, "", item);
  }

  @Test
  public void connectUserItemsOverloadedConstructorTest() {
    ConnectUserItems item = new ConnectUserItems(1, "Groceries");

    testConnectUserItems(1, "Groceries", item);
  }

  @Test
  public void connectUserItemsGetSetBudgetIDTest() {
    ConnectUserItems item = new ConnectUserItems(1, "Groceries");

    Assert.assertEquals("BudgetIds do not match up.", 1, item.getBudgetID());

    item.setBudgetID(5);

    Assert.assertEquals("budgetIds do not match up.", 5, item.getBudgetID());
  }

  @Test
  public void connectUserItemsGetSetBudgetNameTest() {
    ConnectUserItems item = new ConnectUserItems(1, "Groceries");

    Assert.assertEquals("budget names do not match up.", "Groceries", item.getBudgetName());

    item.setBudgetName("Fun");

    Assert.assertEquals("budget names do not match up.", "Fun", item.getBudgetName());
  }

  private void testConnectUserItems(int budgetId, String budgetName, ConnectUserItems item) {
    Assert.assertEquals("budgetIds do not match up.", budgetId, item.getBudgetID());
    Assert.assertEquals("budget names do not match up.", budgetName, item.getBudgetName());
  }
}