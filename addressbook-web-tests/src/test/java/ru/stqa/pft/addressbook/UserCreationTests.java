package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class UserCreationTests {
  private WebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\JAVA_test1\\addressbook-web-tests\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");

  }

  private void login(String username, String password) {
    driver.get("http://localhost/addressbook/edit.php");
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.id("LoginForm")).click();
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.id("LoginForm")).click();
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testUserCreation() throws Exception {
    addNewUser();
    fillUser(new UserData("Ivan", "Ivanov", "OOO", "89997775567", "exampel@ya.ru"));
    creatUser();
  }

  private void creatUser() {
    driver.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillUser(UserData userData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(userData.getLastname());
    driver.findElement(By.name("company")).click();
    driver.findElement(By.name("company")).clear();
    driver.findElement(By.name("company")).sendKeys(userData.getCompany());
    driver.findElement(By.name("mobile")).click();
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys(userData.getPhone());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(userData.getEmail());
  }

  private void addNewUser() {
    driver.findElement(By.linkText("add new")).click();
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
