package com.steventimothy.inheritance.messages;

import java.util.ArrayList;
import java.util.List;

import com.steventimothy.inheritance.utils.ConnectUserItems;
import org.junit.Assert;
import org.junit.Test;

public class ConnectUserTest {

  @Test
  public void connectUserDefaultConstructorTest() {
    ConnectUser message = new ConnectUser();

    testConnectUserMessage((short) 3, new ArrayList<ConnectUserItems>(), message);
  }

  @Test
  public void connectUserOverloadedConstructorTest() {
    ConnectUserItems item = new ConnectUserItems(1, "bbq");
    List<ConnectUserItems> budgetList = new ArrayList<>();
    List<ConnectUserItems> budgetList2 = new ArrayList<>();
    budgetList.add(item);
    budgetList2.add(item);
    ConnectUser message = new ConnectUser(budgetList);


    testConnectUserMessage((short) 3, budgetList2, message);
  }

  @Test
  public void connectUserGetSetBudgetListTest() {
    ConnectUserItems item = new ConnectUserItems(1, "bbq");
    List<ConnectUserItems> budgetList = new ArrayList<>();
    List<ConnectUserItems> budgetList2 = new ArrayList<>();
    budgetList.add(item);
    budgetList2.add(item);
    ConnectUser message = new ConnectUser(budgetList);

    testConnectUserMessage((short) 3, budgetList2, message);

    message.setBudgetList(new ArrayList<ConnectUserItems>());

    testConnectUserMessage((short) 3, new ArrayList<ConnectUserItems>(), message);
  }

  @Test
  public void connectUserEncodeDecodeTest() {
    ConnectUserItems item = new ConnectUserItems(1, "bbq");
    List<ConnectUserItems> budgetList = new ArrayList<>();
    List<ConnectUserItems> budgetList2 = new ArrayList<>();
    budgetList.add(item);
    budgetList2.add(item);
    ConnectUser message = new ConnectUser(budgetList);
    ConnectUser message2 = new ConnectUser(budgetList2);

    message.decode(message.encode());

    testConnectUserMessage(message2.getMsgID(), message2.getBudgetList(), message);
  }

  private void testConnectUserMessage(short msgId, List<ConnectUserItems> budgetList, ConnectUser message) {
    Assert.assertEquals("Message Ids did not match up.", msgId, message.getMsgID());
    Assert.assertEquals("Message budgetLists did not have the same number of items.", budgetList.size(), message.getBudgetList().size());
    for (int i = 0; i < budgetList.size() && i < message.getBudgetList().size(); ++i) {
      Assert.assertEquals("Message ConnectUserItems ids do not match up.", budgetList.get(i).getBudgetID(), message.getBudgetList().get(i).getBudgetID());
      Assert.assertEquals("Message ConnectUserItems ids do not match up.", budgetList.get(i).getBudgetName(), message.getBudgetList().get(i).getBudgetName());
    }
  }
}