package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.UserData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private final GroupHelper groupHelper = new GroupHelper();

  public void init() {
    System.setProperty("webdriver.chrome.driver", "C:\\JAVA_test1\\addressbook-web-tests\\chromedriver.exe");
    groupHelper.wd = new ChromeDriver();
    groupHelper.wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    groupHelper.wd.get("http://localhost/addressbook/");
    groupHelper.wd.findElement(By.name("user")).clear();
    groupHelper.wd.findElement(By.name("user")).sendKeys(username);
    groupHelper.wd.findElement(By.name("pass")).clear();
    groupHelper.wd.findElement(By.name("pass")).sendKeys(password);
    groupHelper.wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  public void gotoGroupPage() {
    groupHelper.returnGroupPage();
  }

  public void stop() {
    groupHelper.wd.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      groupHelper.wd.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      groupHelper.wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void creatUser() {
    groupHelper.wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  public void fillUser(UserData userData) {
    groupHelper.wd.findElement(By.name("firstname")).click();
    groupHelper.wd.findElement(By.name("firstname")).clear();
    groupHelper.wd.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
    groupHelper.wd.findElement(By.name("lastname")).click();
    groupHelper.wd.findElement(By.name("lastname")).clear();
    groupHelper.wd.findElement(By.name("lastname")).sendKeys(userData.getLastname());
    groupHelper.wd.findElement(By.name("company")).click();
    groupHelper.wd.findElement(By.name("company")).clear();
    groupHelper.wd.findElement(By.name("company")).sendKeys(userData.getCompany());
    groupHelper.wd.findElement(By.name("mobile")).click();
    groupHelper.wd.findElement(By.name("mobile")).clear();
    groupHelper.wd.findElement(By.name("mobile")).sendKeys(userData.getPhone());
    groupHelper.wd.findElement(By.name("email")).click();
    groupHelper.wd.findElement(By.name("email")).clear();
    groupHelper.wd.findElement(By.name("email")).sendKeys(userData.getEmail());
  }

  public void addNewUser() {
    groupHelper.wd.findElement(By.linkText("add new")).click();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }
}
