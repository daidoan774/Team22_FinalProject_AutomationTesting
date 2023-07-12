package tests;

import base.DataField;
import org.junit.Test;
import pages.MyinfoPage;

public class MyinfoTest {
    @Test
    public void EnterfillInvalid() throws Exception{
        MyinfoPage myinfo = new MyinfoPage();
        myinfo.login();
        myinfo.Click(myinfo.btnInfor);
        myinfo.enterText(myinfo.firstname,"AutoTest");
        myinfo.enterText(myinfo.midlename, "22");
        myinfo.enterText(myinfo.lastname,"5");
        myinfo.enterText(myinfo.nickName,"Testing");
        myinfo.enterText(myinfo.eloId,"22");
        myinfo.enterText(myinfo.otherId,"220");
        myinfo.enterText(myinfo.driverLicenseNum,"11111");
        myinfo.getcaledar(myinfo.licenseExp);
    }
}
