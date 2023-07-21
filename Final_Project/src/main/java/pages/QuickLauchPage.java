package pages;

import base.BasePage;
import base.DataField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QuickLauchPage extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='Assign Leave']")
    public WebElement assignLeave;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='Leave List']")
    public WebElement leaveQuick;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='Timesheets']")
    public WebElement timeSheets;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='Apply Leave']")
    public WebElement applyLeave;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='My Leave']")
    public WebElement myLeave;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button orangehrm-quick-launch-icon'and @title ='My Timesheet']")
    public WebElement myTimeSheets;
    DataField dataField;

    public QuickLauchPage() throws Exception{
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
//    public void backItem() throws Exception{
//
//    }
}
