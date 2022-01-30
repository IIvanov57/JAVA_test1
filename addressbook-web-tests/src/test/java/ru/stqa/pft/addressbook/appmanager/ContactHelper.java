package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {

    super(wd);
  }

  public void creatUser() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillUser(UserData userData) {
    type(By.name("firstname"), userData.getFirstname());
    type(By.name("lastname"),userData.getLastname());
    type(By.name("company"),userData.getCompany() );
    type(By.name("mobile"),userData.getPhone() );
    type(By.name("email"),userData.getEmail() );
  }

  public void addNewUser() {
    click(By.linkText("add new"));
  }
}
