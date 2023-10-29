package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day12_HW_Dropdown extends CommonBase {
    @BeforeTest
    public void initWeb() {
        driver = initChromeDriver("http://demo.seleniumeasy.com/input-form-demo.html ");
    }

    @Test
    public void handleDropdown() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='state']/option[3]"));
        dropdown.click();
        WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='yes']"));
        radio.click();
    }

}
