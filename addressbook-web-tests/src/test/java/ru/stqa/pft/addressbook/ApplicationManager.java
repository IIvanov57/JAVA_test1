package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  private WebDriver wd;

  protected void init() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.get("http://localhost/addressbook/group.php");
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  protected void returnToGroupPage() {
    wd.findElement(By.linkText("group page")).click();
    wd.findElement(By.linkText("Logout")).click();
  }

  protected void submitGroupCreation() {
    wd.findElement(By.name("submit")).click();
  }

  protected void fillGroupForm(GroupData groupData) {
    wd.findElement(By.name("group_name")).sendKeys(groupData.getName());
    wd.findElement(By.name("group_header")).sendKeys(groupData.getHeder());
    wd.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  protected void initGroupCreation() {
    wd.findElement(By.name("new")).click();
  }

  protected void gotoGroupPage() {
    wd.findElement(By.linkText("groups")).click();
  }

  protected void stop() {
    wd.quit();
  }

  protected void deletSelectedGroup() {
    wd.findElement(By.name("delete")).click();
  }

  protected void delectGroup() {
    wd.findElement(By.name("selected[]")).click();
  }
}