package com.steventimothy.inheritance.messages;

public class LoginRequest extends Message {
  private String username;
  private String password;
  private boolean newUser;

  public LoginRequest() {
    this("", "", false);
  }

  public LoginRequest(String username, String password, boolean newUser) {
    super((short) 1);
    this.username = username;
    this.password = password;
    this.newUser = newUser;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean getNewUser() {
    return newUser;
  }

  public void setNewUser(boolean newUser) {
    this.newUser = newUser;
  }

  public void decode(String data) {
    LoginRequest message = (LoginRequest) super.decoder(data);

    this.setMsgID(message.getMsgID());
    this.setUsername(message.getUsername());
    this.setPassword(message.getPassword());
    this.setNewUser(message.getNewUser());
  }
}