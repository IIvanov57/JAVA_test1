package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.UserData;

public class UserDeletionTests extends TestBase {
  @Test
  public void testUserDeletion() {
    /*предусловие проверки группы
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
      app.getGroupHelper().createGroup(new GroupData("test2", null, null));
    } */
    //если нет контакта для удаления, то создать его
    if (!app.getUserHelper().isThereAUser()) {
      app.getUserHelper().createUser(new UserData("Ivan", "Ivanov", "OOO", "89997775567", "exampel@ya.ru", null));
    }
    app.getUserHelper().selectUser();
    app.getUserHelper().deletedUser();
  }
}
