package automation.PageLocator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TrizenFlightFactory {
    WebDriver driver;
    public TrizenFlightFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    @FindBy(xpath = "(//label[text()='Departing']/following-sibling::div/input[@name='daterange-single' and @readonly])[1]")
//    WebElement departingDate;
    @FindBy(xpath = "//ul[@id='myTab']/li[1]")
    WebElement tabFlight;
    @FindBy(xpath = "(//label[text()='Flying from']/following-sibling::div/input[@placeholder='City or airport'])[1]")
    WebElement departureText;
    @FindBy(xpath = "(//label[text()='Flying to']/following-sibling::div/input[@placeholder='City or airport'])[1]")
    WebElement arrivalText;
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]")
    WebElement passengerDropdown;
    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[1]/following-sibling::div/div[1]//div[@class='qtyInc']")
    WebElement adultPlus;
    @FindBy(xpath = "(//label[text()='Coach'])[1]/following-sibling::div//button[@role='combobox']")
    WebElement boxCoach;
    @FindBy(xpath = "(//label[text()='Coach'])[1]/following-sibling::div//select/option[@value=2]")
    WebElement selectCoach;

    @FindBy(xpath = "(//a[text()='Search Now'])[1]")
    WebElement btnSearch;
    public void chooseDateTime(String dateTime) {
        WebElement selectDepartingDate = driver.findElement(By.xpath("(//label[text()='Departing']/following-sibling::div/input[@name='daterange-single' and @readonly])[1]"));
        System.out.println(selectDepartingDate);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].removeAttribute('readonly','')", selectDepartingDate);
        selectDepartingDate.clear();
        selectDepartingDate.sendKeys(dateTime);
        selectDepartingDate.sendKeys(Keys.TAB);
    }

    public void searchFlightHW2(String departure, String arrival, String dateTime) throws InterruptedException {
        WebElement selectedFlightTab = driver.findElement(By.xpath("//ul[@id='myTab']/li[1]/a[@id='flight-tab' and @aria-selected='true']"));
        if (!selectedFlightTab.isDisplayed()) {
            tabFlight.click();
        }
        departureText.sendKeys(departure);
        arrivalText.sendKeys(arrival);

        WebElement dateBox = driver.findElement(By.xpath("(//label[text()='Departing']/following-sibling::div//input[@name='daterange-single'])[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly','readonly')", dateBox);
        dateBox.clear();
        dateBox.sendKeys(dateTime);

        passengerDropdown.click();
        Thread.sleep(1000);
        adultPlus.click();
        boxCoach.click();
        Thread.sleep(1000);
        selectCoach.click();
        btnSearch.click();
    }
}
