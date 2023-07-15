package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostPage extends BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;

    @FindBy(how = How.XPATH, using = "//input[@name='username']")
    public WebElement userName;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement passW;

    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    public WebElement btnLogin;
    @FindBy(how = How.XPATH, using = "//ul[@class='oxd-main-menu']//li[@class='oxd-main-menu-item-wrapper']//a[@class='oxd-main-menu-item']//span[text()='Buzz']")
    public WebElement buzz ;
    @FindBy(how = How.XPATH, using = "//textarea[@class='oxd-buzz-post-input']")
            public WebElement textArea;
    @FindBy(how = How.XPATH, using = "//button[@class='oxd-button oxd-button--medium oxd-button--main']")
    public WebElement btnArea;


    public PostPage() throws Exception{
        super(BasePage.edriver);
        edriver = BasePage.edriver;
        ewait = BasePage.ewait;

    }
    public void login() throws Exception {
        enterText(userName,"Admin");
        enterText(passW,"admin123");
        Click(btnLogin);
    }
    public void clickBuzz() throws  Exception{
        Click(buzz);
    }
    public void choseArea(String text) throws Exception{
        Click(textArea);
        waitUntilElementVisible(textArea);
        textArea.sendKeys(text);
        Click(btnArea);
    }
}
