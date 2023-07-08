package pages;

import base.BasePage;
import base.DataField;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class naviagation extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;
    DataField dataField;
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;
    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-list oxd-topbar-header-hamburger']")
    public WebElement navigation;

    public naviagation() throws  Exception{
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
        Click(btnLogin);
        Click(navigation);
    }
}
