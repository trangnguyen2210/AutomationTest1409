package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Day16_AlertPractice extends CommonBase {
    @BeforeMethod
    public void openChromeDriver() {
        driver = initChromeDriver("https://demo.guru99.com/test/delete_customer.php");
    }

    @Test
    public void deleteUser() {
        type(By.xpath("//input[@name='cusid']"), "id123");
        click(By.xpath("//input[@name='submit']"));
        driver.switchTo().alert().accept();
        driver.switchTo().alert().accept();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Delete Customer");
        Assert.assertTrue(isElementPresent(By.xpath("//h2[text()='Guru99 Bank']")));
    }

    @AfterMethod
    public void quitChrome() {
        quitDriver(driver);
    }
}
