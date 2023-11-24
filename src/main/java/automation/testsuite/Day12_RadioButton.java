package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day12_RadioButton extends CommonBase {
    @BeforeTest
    public void OpenChrome() {
        driver = initChromeDriver("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
    }

    @Test
    public void handleRadioButton() {
        WebElement femaleRadio = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        if (!femaleRadio.isEnabled()) {
            pause(2000);
        }
        if (femaleRadio.isEnabled() && !femaleRadio.isSelected()) {
            femaleRadio.click();
        }
        driver.close();
    }
}
