package automation.testsuite;

import automation.PageLocator.TrizenFlightFactory;
import automation.common.CommonBase;
import automation.constant.CT_Account;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day15_DatePicker extends CommonBase {
    @BeforeMethod
    public void openChrome() {
        driver= initChromeDriver(CT_Account.webURL2);
    }

    @Test
    public void chooseDateTimeSuccessfully() {
        TrizenFlightFactory trizenFlight = new TrizenFlightFactory(driver);
        pause(5000);
        trizenFlight.chooseDateTime("28022024");
    }
    @AfterMethod
    public void closeChrome() {
        quitDriver(driver);
    }

}
