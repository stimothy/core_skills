package com.steventimothy.inheritance.messages;

import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

  @Test
  public void messageDefaultConstructorTest() {
    Message message = new Message();

    Assert.assertEquals("Message Ids did not match up.", 0, message.getMsgID());
  }

  @Test
  public void messageOverloadedConstructorTest() {
    Message message = new Message((short) 5);

    Assert.assertEquals("Message Ids did not match up.", 5, message.getMsgID());
  }

  @Test
  public void messageGetSetMsgIdTest() {
    Message message = new Message();

    Assert.assertEquals("Message Ids did not match up.", 0, message.getMsgID());

    message.setMsgID((short) 5);

    Assert.assertEquals("Message Ids did not match up.", 5, message.getMsgID());
  }

  @Test
  public void messageEncodeDecodeTest() {
    Message message = new Message();
    String ans = "{\"msgID\":0}";

    String str = message.encode();

    Assert.assertEquals("Object did not serialize correctly.", ans, str);
  }
}