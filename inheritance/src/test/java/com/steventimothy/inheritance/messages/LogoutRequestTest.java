package com.steventimothy.inheritance.messages;

import org.junit.Assert;
import org.junit.Test;

public class LogoutRequestTest {

  @Test
  public void logoutRequestDefaultConstructorTest() {
    LogoutRequest message = new LogoutRequest();

    testLogoutRequestMessage((short) 2, message);
  }

  @Test
  public void loginRequestEncodeDecodeTest() {
    LogoutRequest message = new LogoutRequest();
    LogoutRequest message2 = new LogoutRequest();

    message.decode(message.encode());

    testLogoutRequestMessage(message2.getMsgID(), message);
  }

  private void testLogoutRequestMessage(short msgId, LogoutRequest message) {
    Assert.assertEquals("Message Ids did not match up.", msgId, message.getMsgID());
  }
}