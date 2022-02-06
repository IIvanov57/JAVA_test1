package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.UserData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {

    super(wd);
  }

  public void submitUserCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillUser(UserData userData) {
    type(By.name("firstname"), userData.getFirstname());
    type(By.name("lastname"),userData.getLastname());
    type(By.name("company"),userData.getCompany() );
    type(By.name("mobile"),userData.getPhone() );
    type(By.name("email"),userData.getEmail() );
  }

  public void initUserCreation() {
    click(By.linkText("add new"));
  }

  public void selectUser() {
    click(By.xpath("//td/input"));
  }

  public void initUserModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void submitUserModification() {
    click(By.name("update"));
  }

  public void gotoHomePage() {
    click(By.linkText("home page"));
  }

  public void deletedUser() {
    click(By.xpath("//input[@value='Delete']"));
    wd.switchTo().alert().accept();
  }
}
