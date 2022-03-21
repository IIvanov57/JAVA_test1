package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;
import ru.stqa.pft.addressbook.model.UserData;


public class UserCreationTests extends TestBase{

  @Test
  public void testUserCreation() throws Exception {
    app.getNavigationHelper().gotoGroupPage();
    //добавил предусловие - если отсутвует на странице грппа, то создать группу
    if (! app.getUserHelper().checkGroup()) {
      app.getUserHelper().createGroupForUsers();
    }
    app.getUserHelper().initUserCreation();
    app.getUserHelper().fillUser(new UserData("Ivan", "Ivanov", "OOO", "89997775567", "exampel@ya.ru", "test1"),true);
    app.getUserHelper().submitUserCreation();
  }

}
