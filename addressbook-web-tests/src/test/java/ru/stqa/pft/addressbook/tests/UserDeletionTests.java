package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class UserDeletionTests extends TestBase {
  @Test
  public void testUserDeletion(){
    app.getUserHelper().selectUser("1");
    app.getUserHelper().deletedUser();
  }
}
