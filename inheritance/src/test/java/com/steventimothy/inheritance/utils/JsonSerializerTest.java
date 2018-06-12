package com.steventimothy.inheritance.utils;

import com.steventimothy.inheritance.messages.Message;
import org.junit.Assert;
import org.junit.Test;

public class JsonSerializerTest {

  @Test
  public void jsonSerializerEncodeTest() {
    String json = "{\"msgID\":0}";

    Assert.assertEquals("Json strings do not match up.", json, JsonSerializer.encode(new Message(), Message.class));
  }

  @Test
  public void jsonSerializerDecodeTest() {
    String json = "{\"msgID\":0}";

    Assert.assertEquals("MsgIds do not match up.", 0, ((Message) JsonSerializer.decode(json, Message.class)).getMsgID());
  }
}