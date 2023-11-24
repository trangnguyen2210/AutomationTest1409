package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day20_Dropdownlist_Dynamic extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
    }

    @Test
    public void chooseCountry() {
        click(By.xpath("//div[@class='chosen-container chosen-container-single chosen-container-active']"));
        type(By.xpath("(//div[@class='chosen-search']/input[@type='text' and @autocomplete])[2]"), "Vietnam");
        driver.findElement(By.xpath("(//div[@class='chosen-search']/input[@type='text' and @autocomplete])[2]")).sendKeys(Keys.TAB);
    }
}
