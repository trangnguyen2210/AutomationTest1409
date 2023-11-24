package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day12_HW_Dropdown extends CommonBase {
    @BeforeTest
    public void initWeb() {
        driver = initChromeDriver("http://demo.seleniumeasy.com/input-form-demo.html ");
    }

    @Test(priority = 1)
    public void handleDropdown() throws InterruptedException{
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='state']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Alaska");
        WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='yes']"));
        if (!radio.isSelected()) {
            radio.click();
        }
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void homework12() throws InterruptedException{
        WebElement dropdown = driver.findElement(By.xpath("//select[@name='state']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Alaska");
        WebElement radio = driver.findElement(By.xpath("//input[@type='radio' and @value='yes']"));
        if (!radio.isSelected()) {
            radio.click();
        }
    }

}
