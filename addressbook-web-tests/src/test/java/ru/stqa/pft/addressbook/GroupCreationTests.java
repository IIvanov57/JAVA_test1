package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test2", "test3", "test1"));
    submitGroupCreation();
    returnGroupPage();
  }

}
