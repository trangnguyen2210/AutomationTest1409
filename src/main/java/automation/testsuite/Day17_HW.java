package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Day17_HW extends CommonBase {
    @BeforeMethod
    public void initChrome() {
        driver = initChromeDriver(CT_Account.CODE_STAR);
    }
    @Test(priority = 1)
    public void verifyModalSignup() {
        pause(50000);
        JavascriptExecutor executor = (JavascriptExecutor)driver;

        WebElement iconChat = driver.findElement(By.xpath("//div[@class='fb_dialog  fb_dialog_advanced']"));
        executor.executeScript("arguments[0].click();", iconChat);
        driver.switchTo().frame(5);

        WebElement startChatBtn = driver.findElement(By.xpath("(//div[@class='_a2zm'])[1]"));
        executor.executeScript("arguments[0].click();", startChatBtn);

        WebElement UseMessBtn = driver.findElement(By.xpath("(//div[@class='_a2zm'])[2]"));
        executor.executeScript("arguments[0].click();", UseMessBtn);

        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window is:" + mainWindow);
        Set<String> listSubWindows = driver.getWindowHandles();
        for (String subWinDow : listSubWindows) {
            System.out.println("subWindow is: " + subWinDow);
            if(!subWinDow.equals(mainWindow)) {
                driver.switchTo().window(subWinDow);
                Assert.assertEquals(driver.getTitle(), "Facebook");
            }
        }
    }

    @Test(priority = 2)
    public void verifyRegisterForm() {
        pause(10000);
        scrollToElement(By.xpath("//h2[text()='VTC nói gì về chúng tôi']"));
        driver.switchTo().frame(1);
        pause(20000);
        type(By.xpath("//button[text()='Gửi ngay']/ancestor::div/preceding::div[2]/input[@id='account_phone']"), "0987654321");
        click(By.xpath("//button[text()='Gửi ngay']"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Gửi ngay']/ancestor::div/preceding::div/label[text()='Điện thoại']")));
    }

    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }
}
