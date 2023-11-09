package automation.testsuite;

import automation.PageLocator.ClientPageFactory;
import automation.PageLocator.LoginPageFactory;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_AddClient extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver= initChromeDriver(CT_Account.webURL);
    }

//    @Test(priority = 1)
    public void addClientSuccessfully() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        ClientPageFactory client = new ClientPageFactory(driver);
        client.AddNewClientFunction("Company Test 1");

        /*keep this step if find element right after add new client successfully
        pause(6000);
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Company Test 1']")).isDisplayed());*/
    }

    @Test(priority = 2)
    public void searchClientSuccessfully() throws InterruptedException {
        LoginPageFactory login = new LoginPageFactory(driver);
        login.LoginFunction("admin@demo.com", "riseDemo");
        ClientPageFactory client = new ClientPageFactory(driver);
        client.SearchNewClient("Company Test 1");
    }
    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }
}
