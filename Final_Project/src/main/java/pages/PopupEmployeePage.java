package pages;

import base.BasePage;
import base.DataField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopupEmployeePage extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//i[@class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
    public WebElement employeePop;
    DataField dataField;
    public PopupEmployeePage() throws Exception{
        super(BasePage.edriver);
        edriver = BasePage.edriver;
        ewait = BasePage.ewait;
        dataField = new DataField("D:\\AutoTest\\Final\\Team22_FinalProject_AutomationTesting\\Final_Project\\src\\main\\java\\base\\Db.xlsx");

    }
    public void login() throws Exception {
        waitUntilElementVisible(userName);
        enterText(userName, dataField.getData(1, 0));
        enterText(passW, dataField.getData(1, 1));
        waitUntilElementVisible(passW);
        Click(btnLogin);
    }
}
