package automation.testsuite;

import automation.PageLocator.ClientPageFactory;
import automation.PageLocator.LoginPageFactory;
import automation.PageLocator.TrizenFlightFactory;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_HW extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver = initChromeDriver(CT_Account.webURL2);
    }

//    @Test(priority = 1)
    public void HW1_AddClientSuccessfully () throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        ClientPageFactory client = new ClientPageFactory(driver);
        client.AddNewClientFunctionHW1("Company Test 2023");
    }

    @Test(priority = 2)
    public void HW2_SearchFlightSuccessfully () throws InterruptedException {
        TrizenFlightFactory trizen = new TrizenFlightFactory(driver);
        pause(3000);
        trizen.searchFlightHW2("Hà Nội", "Hồ Chí Minh", "25092024");
        pause(5000);
        WebElement result = driver.findElement(By.xpath("//h3[text()='New Jersey: 24 Flights found']"));
        Assert.assertTrue(result.isDisplayed());
    }

    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }
}
