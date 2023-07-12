package tests;

import org.junit.Test;
import pages.PopupEmployeePage;

public class PopupEmployeePageTest {
    @Test
    public void ClickEmployeeSuccess() throws Exception {
    PopupEmployeePage poup = new PopupEmployeePage();
    poup.login();
    poup.Click(poup.employeePop);
    }
}
