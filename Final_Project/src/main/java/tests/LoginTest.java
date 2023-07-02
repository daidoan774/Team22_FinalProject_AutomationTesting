package tests;

import base.BasePage;
import base.DataField;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPage;

public class LoginTest {
    DataField dataField = new DataField("D:\\AutoTest\\Final\\Team22_FinalProject_AutomationTesting\\Final_Project\\src\\main\\java\\base\\Db.xlsx");
    @Test
    public void LoginWithIvalidCompleted() throws Exception {
        LoginPage loginPage = new LoginPage();

        loginPage.enterText(loginPage.userName, "Admin");
        loginPage.enterText(loginPage.passW, "admin123");
        loginPage.Click(loginPage.btnLogin);

        Assert.assertTrue("Login completed with invalid username and password",LoginPage.isDashboardPageDisplayed());
    }
    @Test
    public void LoginWithInvalidcredentials() throws  Exception{
        LoginPage loginPage = new LoginPage();

        loginPage.enterText(loginPage.userName, "Admin");
        loginPage.enterText(loginPage.passW, "admin123");
        loginPage.Click(loginPage.btnLogin);
        try{

            Assert.assertNotEquals(dataField.getData(1,0),"Admin1");
            Assert.assertNotEquals(dataField.getData(1,1),"admni456");
            System.out.println("Username is not Invalidcredentials");
            System.out.printf("Password is not Invalidcredentials");

        }
        catch (Exception e)
        {
            System.out.printf("Username is Invalid");
        }

    }
    @Test
    public void LoginWithEmtyField() throws Exception{
        LoginPage loginPage = new LoginPage();
        loginPage.enterText(loginPage.userName, "");
        loginPage.enterText(loginPage.passW, "");
        loginPage.Click(loginPage.btnLogin);
        try {
            Assert.assertNotEquals(dataField.getData(1,0),loginPage.userName.getText());
            Assert.assertNotEquals(dataField.getData(1,1),loginPage.passW.getText());
            LoginPage.isErrorMessageDisplayed();
            System.out.println("Error message is displayed for empty field");
        }
        catch (Exception e){
            System.out.println("Error message is not displayed for empty field");

        }

    }


}
