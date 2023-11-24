package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day16_AlertPractice2 extends CommonBase {
    @BeforeMethod
    public void initChrome() {
        driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");
    }
    @Test
    public void alertPractice() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        click(By.xpath("//a[normalize-space()='Alert with OK']"));
        click(By.xpath("//button[normalize-space()='click the button to display an alert box:']"));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
    }
    @Test(priority = 2)
    public void alertPractice2() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        click(By.xpath("//a[normalize-space()='Alert with OK & Cancel']"));
        click(By.xpath("//button[normalize-space()='click the button to display a confirm box']"));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().dismiss();
        Assert.assertTrue(isElementPresent(By.xpath("//p[text()='You Pressed Cancel']")));
    }
    @Test(priority = 3)
    public void alertPractice3() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        click(By.xpath("//a[normalize-space()='Alert with Textbox']"));
        click(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']"));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys("world!!");
        driver.switchTo().alert().accept();
        Assert.assertTrue(isElementPresent(By.xpath("//p[text()='Hello world!! How are you today']")));
    }

    @AfterMethod
    public void quitChrome() {
        quitDriver(driver);
    }
}
