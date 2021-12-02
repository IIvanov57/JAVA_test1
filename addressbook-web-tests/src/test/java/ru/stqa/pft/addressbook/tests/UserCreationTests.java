package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.stqa.pft.addressbook.model.UserData;


public class UserCreationTests {
  private WebDriver wd;

  @BeforeMethod(alwaysRun = true)
  public void setUp() throws Exception {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    login("admin", "secret");
  }

  private void login(String username, String password) {
    wd.get("http://localhost/addressbook/edit.php");
    wd.findElement(By.name("user")).sendKeys(username);
    wd.findElement(By.name("pass")).sendKeys(password);
    wd.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    gotoUserPage();
    initUserCreation(new UserData("Ivan", "Ivanov", "ivan92", "RTK", "Moskow", "89992506670", "ivan@qa.ru"));
    returnToUserPage();
  }

  private void returnToUserPage() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void initUserCreation(UserData userData) {
    wd.findElement(By.name("firstname")).sendKeys(userData.getFirstname());
    wd.findElement(By.name("lastname")).sendKeys(userData.getLastname());
    wd.findElement(By.name("nickname")).sendKeys(userData.getNickname());
    wd.findElement(By.name("company")).sendKeys(userData.getCompany());
    wd.findElement(By.name("address")).sendKeys(userData.getAddress());
    wd.findElement(By.name("mobile")).sendKeys(userData.getMobile());
    wd.findElement(By.name("email")).sendKeys(userData.getEmail());
  }

  private void gotoUserPage() {
    wd.findElement(By.linkText("add new")).click();
  }


  @AfterMethod(alwaysRun = true)
  public void tearDown() throws Exception {
    wd.quit();
  }
}
