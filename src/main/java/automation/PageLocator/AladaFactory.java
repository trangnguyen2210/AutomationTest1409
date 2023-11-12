package automation.PageLocator;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AladaFactory {
    WebDriver driver;
    public AladaFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    @FindBy(xpath = "(//label[text()='Departing']/following-sibling::div/input[@name='daterange-single' and @readonly])[1]")
//    WebElement departingDate;
    @FindBy(xpath = "//p[text()='Đăng nhập bằng tài khoản Alada']/following-sibling::form//input[@placeholder='Địa chỉ email']")
    WebElement inputEmail;
    @FindBy(xpath = "//p[text()='Đăng nhập bằng tài khoản Alada']/following-sibling::form//input[@placeholder='Mật khẩu']")
    WebElement inputPassword;
    @FindBy(xpath = "//p[text()='Đăng nhập bằng tài khoản Alada']/following-sibling::form//button[text()='ĐĂNG NHẬP']")
    WebElement btnLogin;
    @FindBy(xpath = "//li[@id='showsub']/a[@rel='nofollow']")
    WebElement avatar;
    @FindBy(xpath = "//a[text()='Chỉnh sửa thông tin']")
    WebElement textUpdate;

    @FindBy(xpath = "//input[@placeholder='Mật khẩu hiện tại']")
    WebElement inputCurrentPassword;

    @FindBy(xpath = "//input[@placeholder='Mật khẩu mới']")
    WebElement inputNewPassword;

    @FindBy(xpath = "//input[@placeholder='Nhập lại mật khẩu mới']")
    WebElement inputRepeatNewPassword;

    @FindBy(xpath = "//button[text()='Lưu mật khẩu mới']")
    WebElement btnSavePassword;

    public void login(String email, String pass) {
        inputEmail.sendKeys(email);
        inputPassword.sendKeys(pass);
        btnLogin.click();
    }

    public void clickEdit(Actions actions) {
        actions.moveToElement(avatar);
        actions.moveToElement(textUpdate);
        actions.click().build().perform();
    }
    public void scrollDown() {
        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void updateInfo(String currentPassword, String newPassword) {
        inputCurrentPassword.sendKeys(currentPassword);
        inputNewPassword.sendKeys(newPassword);
        inputRepeatNewPassword.sendKeys(newPassword);
        btnSavePassword.click();
    }
}
