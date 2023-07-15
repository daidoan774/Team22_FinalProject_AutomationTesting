package pages;

import base.BasePage;
import base.DataField;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static pages.LoginPage.passW;


public class MyinfoPage extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;
    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//a[@class='oxd-main-menu-item']/span[text()='My Info']")
    public WebElement btnInfor;
    @FindBy(how = How.XPATH, using = "//label[text()='Employee Full Name']/../following-sibling::div//input[@name='firstName']")
    public WebElement firstname;
    @FindBy(how = How.XPATH, using = "//label[text()='Employee Full Name']/../following-sibling::div//input[@name='middleName']")
    public WebElement midlename;
    @FindBy(how = How.XPATH, using = "//label[text()='Employee Full Name']/../following-sibling::div//input[@name='lastName']")
    public WebElement lastname;
    @FindBy(how = How.XPATH, using = "//label[text()='Employee Id']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement eloId;
    @FindBy(how = How.XPATH, using = "//label[text()='Nickname']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement nickName;
    @FindBy(how = How.XPATH, using = "//label[text()='Other Id']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement otherId;
    @FindBy(how = How.XPATH, using = "//label[text()=\"Driver's License Number\"]/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement driverLicenseNum;
    @FindBy(how = How.XPATH, using = "//label[text()='License Expiry Date']/../following-sibling::div//div[@class=\"oxd-date-wrapper\"]//input[@placeholder=\"yyyy-mm-dd\"]")
    public WebElement licenseExp;
    @FindBy(how = How.XPATH, using = "//label[text()='SSN Number']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement SSNNum;
    @FindBy(how = How.XPATH, using = "//label[text()='Nationality']/../following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']")
    public WebElement Nationality;
    @FindBy(how = How.XPATH, using = "//label[text()='Marital Status']/../following-sibling::div//div[@class='oxd-select-text oxd-select-text--active']")
    public WebElement maritalStt;
    @FindBy(how = How.XPATH, using = "//label[text()='Date of Birth']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement DateOfBirth;
    @FindBy(how = How.XPATH, using = "//label[text()='Gender']/../following-sibling::div//div[@class='oxd-radio-wrapper']//input[@type='radio' and @value ='2']")
    public WebElement Gender;
    @FindBy(how = How.XPATH, using = "//label[text()='Military Service']/../following-sibling::div//input[@class='oxd-input oxd-input--active']")
    public WebElement militaryService;
    @FindBy(how = How.XPATH, using = "//label[text()='Smoker']/../following-sibling::div//div//label//input[@type='checkbox']")
    public WebElement Smoker;
    DataField dataField;
    public MyinfoPage() throws Exception{
        super(BasePage.edriver);
        edriver = BasePage.edriver;
        ewait = BasePage.ewait;
        dataField = new DataField("D:\\AutoTest\\Final\\Team22_FinalProject_AutomationTesting\\Final_Project\\src\\main\\java\\base\\Db.xlsx");
    }

    public void login() throws Exception {
        enterText(userName,"Admin");
        enterText(passW,"admin123");
        Click(btnLogin);
    }
    public void getcaledar(WebElement element) throws Exception{
        waitUntilElementVisible(element);
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = localDate.format(time);
        element.sendKeys(formattedDate);
    }

}
