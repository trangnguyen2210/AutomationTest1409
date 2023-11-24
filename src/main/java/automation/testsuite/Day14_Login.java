package automation.testsuite;

import automation.PageLocator.LoginPageFactory;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class Day14_Login extends CommonBase {
    @BeforeMethod
    public void openSystemUnderTest() {
        driver = initChromeDriver(CT_Account.webURL);
    }

    @Test(priority = 1)
    public void LoginSuccessfully() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        assertTrue(driver.findElement(By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")).isDisplayed());
    }

    @Test(priority = 2)
    public void LoginFailIncorrectEmail() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo", "riseDemo");
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 3)
    public void LoginFailIncorrectPass() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDem");
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 4)
    public void LoginFailIncorrectEmailAndPass() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo", "riseDem");
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 5)
    public void LoginAndLogoutSuccessfully() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");

        WebElement user = driver.findElement(By.xpath("//ul[@class='navbar-nav']/li[last()]"));
        user.click();
        WebElement signOut = driver.findElement(By.xpath("//li/a[normalize-space()='Sign Out']"));
        signOut.click();
        assertTrue(driver.findElement(By.xpath("//div[@class='card-header text-center']/h2[text()='Sign in']")).isDisplayed());
    }

    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }
}
