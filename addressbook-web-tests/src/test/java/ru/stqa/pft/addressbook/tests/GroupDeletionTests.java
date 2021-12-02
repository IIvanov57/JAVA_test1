package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().delectGroup();
    app.getGroupHelper().deletSelectedGroup();
    app.getGroupHelper().returnToGroupPage();
  }

}
