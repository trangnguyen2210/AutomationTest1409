package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day17_Iframe extends CommonBase {
    @BeforeMethod
    public void openChromeBrowser() {
//        driver = initChromeDriver(CT_Account.WEB_IFRAME);
        driver = initChromeDriver(CT_Account.CODE_STAR);
    }
    @Test(priority = 1)
    public void findIframeIndex() {
        pause(50000);
        int totalFrame = driver.findElements(By.tagName("iframe")).size();
        //span[text()='Bắt đầu chat']
        System.out.println("Tổng số iframe: " + totalFrame);
        for (int i = 0; i < totalFrame; i++) {
            System.out.println(i);
            driver.switchTo().frame(i);
//            int indexIframe = driver.findElements(By.xpath("//span[text()='Bắt đầu chat']")).size();
            int indexIframe = driver.findElements(By.xpath("//span[text()='Đăng ký ngay']")).size();
            System.out.println("Đã tìm thấy element index: " + indexIframe);
            driver.switchTo().defaultContent();
        }
    }
//    @Test(priority = 2)
    public void handleIFrame() {
        pause(20000);
        scrollToElement(By.xpath("//h2[contains(text(),'Đăng ký nhận tài liệu')]"));
        driver.switchTo().frame(3);
        type(By.xpath("//input[@name='account_name']"), "AutoTestName");
        click(By.xpath("//button[text()='Đăng ký ngay']"));
        Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Đăng ký ngay']")));
        driver.switchTo().defaultContent();
    }
}
