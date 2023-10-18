package automation.testsuite;

import automation.common.CommonBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class practiceXpathDay8 extends CommonBase {

    public void initHW1() {
        driver = initDriverTest("https://selectorshub.com/xpath-practice-page/");
    }
    public void findLocatorHW1() {
        WebElement email = driver.findElement(By.id("userId"));
        System.out.println("User Email locator is: " + email);

        WebElement password = driver.findElement(By.id("pass"));
        System.out.println("Password locator is: " + password);

        WebElement company = driver.findElement(By.name("company"));
        System.out.println("Company locator is: " + company);

        WebElement mobile = driver.findElement(By.name("mobile number"));
        System.out.println("Mobile number locator is: " + mobile);
    }

    @BeforeTest
    public void initHW2() {
        driver = initDriverTest("https://automationfc.github.io/basic-form/index.html");
    }

    @Test
    public void findLocatorHW2() {
        WebElement name = driver.findElement(By.id("name"));
        System.out.println("Name locator is: " + name);

        WebElement address = driver.findElement(By.id("address"));
        System.out.println("Address locator is: " + address);

        WebElement email = driver.findElement(By.id("email"));
        System.out.println("Email locator is: " + email);

        WebElement password = driver.findElement(By.id("password"));
        System.out.println("Password locator is: " + password);
    }

}
