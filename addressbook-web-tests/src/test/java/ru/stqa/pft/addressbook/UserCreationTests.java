package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class UserCreationTests extends TestBase{

  @Test
  public void testUserCreation() throws Exception {
    addNewUser();
    fillUser(new UserData("Ivan", "Ivanov", "OOO", "89997775567", "exampel@ya.ru"));
    creatUser();
  }

}
