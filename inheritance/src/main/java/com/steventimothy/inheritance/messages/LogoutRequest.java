package com.steventimothy.inheritance.messages;

public class LogoutRequest extends Message {
  public LogoutRequest() {
    super((short) 2);
  }

  public void decode(String data) {
    LogoutRequest message = (LogoutRequest) super.decoder(data);

    this.setMsgID(message.getMsgID());
  }
}
