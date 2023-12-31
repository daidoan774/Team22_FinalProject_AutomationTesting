package base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BasePage {
    public static WebDriver edriver;
    public static WebDriverWait ewait;

    public BasePage(WebDriver driver) throws Exception{
        edriver= new ChromeDriver();
        PageFactory.initElements(edriver,this);
        ewait = new WebDriverWait(edriver, Duration.ofSeconds(20));
        edriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void closeWeb() throws Exception{
        edriver.close();
    }
    public void waitUntilElementVisible(WebElement element) {
        int tryTimes = 0;
        while (tryTimes < 2) {
            try {
                ewait.until(ExpectedConditions.visibilityOf(element));
                break;
            } catch (StaleElementReferenceException se) {
                tryTimes++;
                if (tryTimes == 2)
                    throw se;
            }
        }
    }
    public void Click(WebElement element) {
        waitUntilElementVisible(element);
        element.click();
    }

    public void enterText(WebElement element, String text) {
        waitUntilElementVisible(element);
        String value = element.getDomProperty("_value");
        if (!value.isEmpty()) {

            element.sendKeys(Keys.CONTROL + "a", Keys.DELETE);
        }
        element.sendKeys(text);
    }



}
