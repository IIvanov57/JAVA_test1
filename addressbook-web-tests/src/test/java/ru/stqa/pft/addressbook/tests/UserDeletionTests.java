package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.UserData;

public class UserDeletionTests extends TestBase {
  @Test
  public void testUserDeletion() {
    //если нет контакта для удаления, то создать его
    if (!app.getUserHelper().isThereAUser()) {
      app.getUserHelper().createUser(new UserData("Ivan", "Ivanov", "OOO", "89997775567", "exampel@ya.ru", "test1"));
    }
    app.getUserHelper().selectUser();
    app.getUserHelper().deletedUser();
  }
}
