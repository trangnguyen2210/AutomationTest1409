package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day12_Radio_Checkbox_Dropdown extends CommonBase {
    @BeforeTest
    public void OpenChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
    }

    @Test
    public void ClickOnCheckBox() {
        // Kiểm tra giá trị mặc định của Default checkbox đã được check
        WebElement defaultCheckBox = driver.findElement(By.xpath("//label[normalize-space()='Default Checked']/input"));
        System.out.println(defaultCheckBox);
        if (defaultCheckBox.isSelected()) {
            System.out.println("Pass default checked checkbox");
        } else {
            System.out.println("Fail default unchecked checkbox");
        }

        // Ấn vào checkbox bất kỳ còn lại
        WebElement testCheckBox = driver.findElement(By.xpath("//label[normalize-space()='Click on this check box']/input"));
        testCheckBox.click();
        if (testCheckBox.isSelected()) {
            System.out.println("Pass vì checkbox đã được check");
        } else {
            System.out.println("Fail vì checkbox chưa được check");
        }
    }

}
