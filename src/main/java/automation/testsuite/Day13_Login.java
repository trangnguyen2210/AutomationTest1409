package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Day13_Login extends CommonBase {
    @BeforeMethod
    public void openSystemUnderTest() {
        driver = initChromeDriver(CT_Account.webURL);
    }

    @Test(priority = 1)
    public void LoginSuccessfully() {
        WebElement txtEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        if (txtEmail.isDisplayed()) {
            txtEmail.clear();
            txtEmail.sendKeys("admin@demo.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(CT_Account.TEXTBOX_PASS);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSubmit = driver.findElement(CT_Account.BTN_LOGIN);
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        }
        assertTrue(driver.findElement(By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")).isDisplayed());
    }

    @Test(priority = 2)
    public void LoginFailIncorrectEmail() {
        WebElement txtEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        if (txtEmail.isDisplayed()) {
            txtEmail.clear();
            txtEmail.sendKeys("admin@demo");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(CT_Account.TEXTBOX_PASS);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSubmit = driver.findElement(CT_Account.BTN_LOGIN);
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        }
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 3)
    public void LoginFailIncorrectPass() {
        WebElement txtEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        if (txtEmail.isDisplayed()) {
            txtEmail.clear();
            txtEmail.sendKeys("admin@demo.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(CT_Account.TEXTBOX_PASS);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDem");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSubmit = driver.findElement(CT_Account.BTN_LOGIN);
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        }
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 4)
    public void LoginFailIncorrectEmailAndPass() {
        WebElement txtEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        if (txtEmail.isDisplayed()) {
            txtEmail.clear();
            txtEmail.sendKeys("admin@demo");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(CT_Account.TEXTBOX_PASS);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("rise");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSubmit = driver.findElement(CT_Account.BTN_LOGIN);
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        }
        assertTrue(driver.findElement(By.xpath("//div[@role='alert']")).isDisplayed());
    }

    @Test(priority = 5)
    public void LoginAndLogoutSuccessfully() {
        WebElement txtEmail = driver.findElement(CT_Account.TEXTBOX_EMAIL);
        if (txtEmail.isDisplayed()) {
            txtEmail.clear();
            txtEmail.sendKeys("admin@demo.com");
        }
        pause(3000);
        WebElement txtPass = driver.findElement(CT_Account.TEXTBOX_PASS);
        if (txtPass.isDisplayed()) {
            txtPass.clear();
            txtPass.sendKeys("riseDemo");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnSubmit = driver.findElement(CT_Account.BTN_LOGIN);
        if (btnSubmit.isDisplayed()) {
            btnSubmit.click();
        }

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
