package com.steventimothy.inheritance.messages;

import org.junit.Assert;
import org.junit.Test;

public class LoginRequestTest {

  @Test
  public void loginRequestDefaultConstructorTest() {
    LoginRequest message = new LoginRequest();

    testLoginRequestMessage((short) 1, "", "", false, message);
  }

  @Test
  public void loginRequestOverloadedConstructorTest() {
    LoginRequest message = new LoginRequest("Bob1234", "apple", true);

    testLoginRequestMessage((short) 1, "Bob1234", "apple", true, message);
  }

  @Test
  public void loginRequestGetSetUsernameTest() {
    LoginRequest message = new LoginRequest("Bob1234", "apple", true);

    Assert.assertEquals("Did not get back the right username.", "Bob1234", message.getUsername());

    message.setUsername("Alpha");

    Assert.assertEquals("Did not get back the right username.", "Alpha", message.getUsername());
  }

  @Test
  public void loginRequestGetSetPasswordTest() {
    LoginRequest message = new LoginRequest("Bob1234", "apple", true);

    Assert.assertEquals("Did not get back the right password.", "apple", message.getPassword());

    message.setPassword("banana");

    Assert.assertEquals("Did not get back the right password.", "banana", message.getPassword());
  }

  @Test
  public void loginRequestGetSetNewUserTest() {
    LoginRequest message = new LoginRequest("Bob1234", "apple", true);

    Assert.assertTrue("Did not get back the right boolean newUser.", message.getNewUser());

    message.setNewUser(false);

    Assert.assertFalse("Did not get back the right boolean newUser.", message.getNewUser());
  }

  @Test
  public void loginRequestEncodeDecodeTest() {
    LoginRequest message = new LoginRequest("Bob1234", "apple", true);
    LoginRequest message2 = new LoginRequest("Bob1234", "apple", true);

    message.decode(message.encode());

    testLoginRequestMessage(message2.getMsgID(), message2.getUsername(), message2.getPassword(), message2.getNewUser(), message);
  }

  private void testLoginRequestMessage(short msgId, String username, String password, boolean newUser, LoginRequest message) {
    Assert.assertEquals("Message Ids did not match up.", msgId, message.getMsgID());
    Assert.assertEquals("Message user names did not match up.", username, message.getUsername());
    Assert.assertEquals("Message passwords did not match up.", password, message.getPassword());
    Assert.assertEquals("Message newUser boolean did not match up.", newUser, message.getNewUser());
  }
}