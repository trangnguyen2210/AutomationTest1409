package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Day8_LocatorPractice extends CommonBase {
// Để chạy automation test cho website, dùng TestNG Annotation
    //1. BeforeMethod: cc hàm được khai báo annotation này sẽ được chạy đầu tiên
    //2. AfterMethod: cc hàm được khai báo annotation này sẽ được chạy cuối cùng
    //3. Test: các hàm được khai báo annotation này sẽ được chạy giữa Before và After, in ra kết quả test

//    @BeforeMethod
//    public void initChromeWebDriver() {
//        initChromeDriver("https://rise.fairsketch.com/signin");
//    }

    public void findLocatorById() {
       WebElement email = driver.findElement(By.id("email"));
       System.out.println("Email locator is: " + email);

       WebElement password = driver.findElement(By.id("password"));
       System.out.println("Password locator is: " + password);

       WebElement button = driver.findElement(By.tagName("button"));
       System.out.println("Button locator is: " + button);
    }

    @BeforeMethod
    public void initChromeWebDriver() {
        initChromeDriver("https://bepantoan.vn/danh-muc/may-hut-mui");
    }
    @Test
    public void findLocatorByLinkText() {
        WebElement textMHMAmTu = driver.findElement(By.linkText("Máy Hút Mùi Âm Tủ"));
        System.out.println("Máy Hút Mùi Âm Tủ" + textMHMAmTu);

        WebElement textMHMCoDien = driver.findElement(By.partialLinkText("Cổ Điển"));
        System.out.println("Máy Hút Mùi Cổ Điển" + textMHMCoDien);
    }
}
