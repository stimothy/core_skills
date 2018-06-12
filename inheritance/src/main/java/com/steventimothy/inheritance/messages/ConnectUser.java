package com.steventimothy.inheritance.messages;

import java.util.ArrayList;
import java.util.List;

import com.steventimothy.inheritance.utils.ConnectUserItems;

public class ConnectUser extends Message {
  private List<ConnectUserItems> budgetList;

  public ConnectUser() {
    this(new ArrayList<ConnectUserItems>());
  }

  public ConnectUser(List<ConnectUserItems> budgetList) {
    super((short) 3);
    this.budgetList = budgetList;
  }

  public List<ConnectUserItems> getBudgetList() {
    return budgetList;
  }

  public void setBudgetList(List<ConnectUserItems> budgetList) {
    this.budgetList = budgetList;
  }

  public void decode(String data) {
    ConnectUser message = (ConnectUser) super.decoder(data);

    this.setMsgID(message.getMsgID());
    this.budgetList = message.getBudgetList();
  }
}
