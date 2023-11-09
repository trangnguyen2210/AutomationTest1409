package automation.PageLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ClientPageFactory {
    private WebDriver driver;

    public ClientPageFactory(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[text()='Clients']")
    WebElement clientsMenu;

    @FindBy(xpath = "//a[@title='Add client']")
    WebElement btnAddClient;

    @FindBy(id="company_name")
    WebElement textCompanyName;

    @FindBy(xpath = "//button[normalize-space()='Save']")
    WebElement btnSave;

    @FindBy(xpath = "//a[text()='Clients']")
    WebElement tabClients;

    @FindBy(xpath = "//div[@class='dataTables_filter']//input[@placeholder='Search']")
    WebElement textSearch;

    @FindBy(xpath = "//a[text()='Company Test 1']")
    WebElement searchCompanyResult;

    @FindBy(xpath="//label[text()='Person']")
    private WebElement checkboxPerson;
    //xpath của Owner dropdownlist
    @FindBy(xpath="//div[@id='s2id_created_by']")
    private WebElement checkboxOwner;

    @FindBy(xpath="//div[@id='s2id_created_by']/input")
    private WebElement inputOwner;

    @FindBy(xpath="//div[@class='select2-result-label' and text()='Sara Ann']")
    private WebElement optionOwner;

    // Giá trị của từng Owner trong màn Add Client
    @FindBy(xpath="(//ul[@role='listbox'])[2]/li[3]")
//    @FindBy(xpath="(//(ul[@role='listbox'])[2]/li[3]") error???
    private WebElement ownerValue1;

    @FindBy(xpath="//a[text()='Clients']")
    private WebElement clientTab;
    @FindBy(xpath="(//input[@placeholder='Search'])[2]")
    private WebElement textboxSearch;
    @FindBy(xpath="//a[text()='Company Test 2023']")
    private WebElement searchResult;

    public void AddNewClientFunction(String companyName) throws InterruptedException {
        /*javascript execution click btnAddClient and set value for textCompanyName
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", btnAddClient);
        js.executeScript("arguments[0].value = '" + companyName + "'", textCompanyName);*/
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clientsMenu.click();
        Thread.sleep(3000);
        btnAddClient.click();
        Thread.sleep(3000);
        textCompanyName.sendKeys(companyName);
        btnSave.click();
    }

    public void SearchNewClient(String companyName) throws InterruptedException {
        clientsMenu.click();
        Thread.sleep(3000);
        tabClients.click();
        Thread.sleep(3000);
        textSearch.sendKeys(companyName);
        Thread.sleep(9000);

        /*error
        String xpath = "//a[text()="+ companyName + "]";
        Assert.assertTrue(driver.findElement(By.xpath(xpath )).isDisplayed());*/
       /* also error
        WebElement el = driver.findElement(By.xpath("//a[text()="+ companyName + "]"));*/

        Assert.assertTrue(searchCompanyResult.isDisplayed());
    }

    public void AddNewClientFunctionHW1(String companyName) throws InterruptedException {
        clientsMenu.click();
        Thread.sleep(3000);
        btnAddClient.click();
        Thread.sleep(3000);
        checkboxPerson.click();
        textCompanyName.clear();
        textCompanyName.sendKeys(companyName);

        checkboxOwner.click();
        ownerValue1.click();

        btnSave.click();
        Thread.sleep(3000);
        tabClients.click();
        Thread.sleep(3000);
        textSearch.sendKeys(companyName);
        Thread.sleep(3000);
        Assert.assertTrue(searchResult.isDisplayed());
    }
}
