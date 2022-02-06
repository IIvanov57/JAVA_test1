package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserModificationTests extends TestBase {
  @Test
  public void testUserModification() {
    app.getUserHelper().selectUser();
    app.getUserHelper().initUserModification();
    app.getUserHelper().fillUser(new UserData("Ivan111", "Ivanov", "OOO", "89997775567", "exampel@ya.ru"));
    app.getUserHelper().submitUserModification();
    app.getUserHelper().gotoHomePage();

  }

}
