package com.steventimothy.inheritance;

import java.util.ArrayList;
import java.util.List;

import com.steventimothy.inheritance.messages.ConnectUser;
import com.steventimothy.inheritance.messages.LoginRequest;
import com.steventimothy.inheritance.messages.LogoutRequest;
import com.steventimothy.inheritance.utils.ConnectUserItems;

/**
 * Hello world!
 */
public class App {
  public static void main(String[] args) {
    LoginRequest loginRequest = new LoginRequest("Happy", "Feet", true);
    LoginRequest loginRequest2 = new LoginRequest();
    String jsonString = loginRequest.encode();
    loginRequest2.decode(jsonString);

    LogoutRequest logoutRequest = new LogoutRequest();
    LogoutRequest logoutRequest2 = new LogoutRequest();
    jsonString = logoutRequest.encode();
    logoutRequest2.decode(jsonString);

    List<ConnectUserItems> budgetList = new ArrayList<>();
    budgetList.add(new ConnectUserItems(1, "bbq"));
    ConnectUser connectUser = new ConnectUser(budgetList);
    ConnectUser connectUser2 = new ConnectUser();
    jsonString = connectUser.encode();
    connectUser2.decode(jsonString);
  }
}
