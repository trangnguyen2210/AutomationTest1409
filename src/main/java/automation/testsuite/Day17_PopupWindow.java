package automation.testsuite;

import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class Day17_PopupWindow extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.WEB_POPUP);
    }

    @Test
    public void VerifyNewTab() {
        click(By.xpath("//a[text()='Click Here']"));
        String mainWindow = driver.getWindowHandle();
        System.out.println("Main Window is:" + mainWindow);
        Set<String> listSubWindows = driver.getWindowHandles();
        for (String subWinDow : listSubWindows) {
            System.out.println("subWindow is: " + subWinDow);
            if(!subWinDow.equals(mainWindow)) {
                driver.switchTo().window(subWinDow);
                System.out.println("Sub window title: " + driver.switchTo().window(subWinDow).getTitle());
                System.out.println("Sub window url: " + driver.switchTo().window(subWinDow).getCurrentUrl());
                Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/articles_popup.php");
                type(By.xpath("//input[@name='emailid']"), "email@gmail.com");
                click(By.xpath("//input[@name='btnLogin']"));
                driver.close();
            }
        }
        driver.switchTo().window(mainWindow);
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/popup.php");
        System.out.println("Main window url: " + driver.switchTo().window(mainWindow).getCurrentUrl());
        System.out.println("Main window Title: " + driver.switchTo().window(mainWindow).getTitle());

    }
}
