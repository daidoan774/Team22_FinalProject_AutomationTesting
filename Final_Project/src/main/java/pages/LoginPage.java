package pages;

import base.BasePage;
import base.DataField;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.Data;

public class LoginPage extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;

    DataField dataField;
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public static WebElement passW;
    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;

    public LoginPage() throws Exception {
        super(BasePage.edriver);
        edriver = BasePage.edriver;
        ewait = BasePage.ewait;
        dataField = new DataField("D:\\AutoTest\\Final\\Team22_FinalProject_AutomationTesting\\Final_Project\\src\\main\\java\\base\\Db.xlsx");
    }

    @Test
    public void test() throws Exception {
        waitUntilElementVisible(userName);
        userName.sendKeys(dataField.getData(1, 0));
        passW.sendKeys(dataField.getData(1, 1));
        waitUntilElementVisible(passW);
        btnLogin.click();
    }
    public static boolean isDashboardPageDisplayed() {
        return edriver.getCurrentUrl().contains("dashboard");
    }

    public static boolean isErrorMessageDisplayed() {
        try {
            return edriver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']")).isDisplayed();
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }
}