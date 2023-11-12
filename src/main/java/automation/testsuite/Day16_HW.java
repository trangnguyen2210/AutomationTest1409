package automation.testsuite;

import automation.PageLocator.AladaFactory;
import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day16_HW extends CommonBase {
    @BeforeMethod
    public void initChrome() {
        driver = initChromeDriver("https://alada.vn/tai-khoan/dang-nhap.html");
    }

    @Test(priority = 1)
    public void updateInformation() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);

        AladaFactory alada = new AladaFactory(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Đăng nhập bằng tài khoản Alada']")));
        alada.login("wpw54373@omeie.com", "123456");
        Actions actions = new Actions(driver);
        alada.clickEdit(actions);
        scrollToElement(By.xpath("//div[text()='Thông tin đăng nhập']"));
        pause(3000);
        alada.updateInfo("123456", "1234567");
        wait.until(ExpectedConditions.alertIsPresent());
        String alertText = driver.switchTo().alert().getText();
        System.out.println("alert text: " + alertText);
        Assert.assertTrue(alertText.equalsIgnoreCase("Cập nhật mật khẩu mới thành công!"));
        driver.switchTo().alert().accept();
    }

    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }
}
