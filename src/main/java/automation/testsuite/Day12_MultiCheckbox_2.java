package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Day12_MultiCheckbox_2 extends CommonBase {
    @BeforeTest
    public void OpenChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

//    @Test
    public void multiCheckbox() {
        List<WebElement> listCheckBox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
        System.out.println("Tổng số checkbox: " + listCheckBox.size());
        for (int i = 0; i < listCheckBox.size(); i++) {
            WebElement checkbox = listCheckBox.get(i);
            if (i % 2 == 0) {
                checkbox.click();
            }
            if (checkbox.isSelected()) {
                System.out.println("Checkbox ở vị trí " + (i + 1) + " đã được check");
            } else {
                System.out.println("Checkbox ở vị trí " + (i + 1) + " chưa được check");
            }
        }
        pause(2000);
        driver.close();
    }

    @Test
    public void multiCheckbox3() {
        List<WebElement> listCheckBox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox']//input"));
        System.out.println("Tổng số checkbox: " + listCheckBox.size());
        for (int i = 0; i < listCheckBox.size(); i++) {
            WebElement checkbox = driver.findElement(By.xpath("(//div[@class='panel-body'])[3]//div[@class='checkbox'][" + (i+1) + "]//input"));
            if (i % 2 == 0) {
                checkbox.click();
            }
            System.out.println("Checkbox ở vị trí " + (i + 1) + " có giá trị check là: " + checkbox.isSelected());
        }
        pause(2000);
        driver.close();
    }
}
