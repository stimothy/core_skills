package com.steventimothy.inheritance.messages;

import com.steventimothy.inheritance.utils.JsonSerializer;

public class Message {
  private short msgID;

  public Message() {
    this((short) 0);
  }

  public Message(short msgID) {
    setMsgID(msgID);
  }

  public short getMsgID() {
    return msgID;
  }

  public void setMsgID(short msgID) {
    this.msgID = msgID;
  }

  public String encode() {
    return JsonSerializer.encode(this, this.getClass());
  }

  protected Object decoder(String data) {
    return JsonSerializer.decode(data, this.getClass());
  }
}
