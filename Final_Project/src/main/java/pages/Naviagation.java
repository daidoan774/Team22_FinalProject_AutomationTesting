package pages;

import base.BasePage;
import base.DataField;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naviagation extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;
    DataField dataField;
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;
    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//button[@class='oxd-icon-button oxd-main-menu-button']/i[@class='oxd-icon bi-chevron-left']")
    public WebElement navigation;

    public Naviagation() throws  Exception{
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
    public void changeNavi() throws Exception {
        WebElement navigationButton = edriver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']/i[@class='oxd-icon bi-chevron-left']"));
        String classAttributeValue = navigationButton.getAttribute("class");

        if (classAttributeValue.equals("oxd-icon bi-chevron-right")) {
            Click(navigation);
        } else if (classAttributeValue.equals("oxd-icon bi-chevron-left")) {
            WebElement newNavigationButton = edriver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-main-menu-button']/i[@class='oxd-icon bi-chevron-left']"));
            Click(newNavigationButton);
        } else {

            throw new Exception("Unknown state of navigation");
        }
    }


}
