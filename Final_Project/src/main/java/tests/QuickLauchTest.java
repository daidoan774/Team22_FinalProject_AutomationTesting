package tests;

import org.junit.Test;
import pages.QuickLauchPage;

public class QuickLauchTest {
    @Test
    public void ClickQuickLauAssignLeaveSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.assignLeave);
    }

    @Test
    public void ClickQuickLauLeaveQuickSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.leaveQuick);
    }

    @Test
    public void ClickQuickLaumyLeaveSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.myLeave);
    }

    @Test
    public void ClickQuickLauApplyLeaveSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.applyLeave);
    }

    @Test
    public void ClickQuickLauTimeSheetsSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.timeSheets);
    }
    @Test
    public void ClickQuickLauMyTimeSheetsSuccess() throws Exception {
        QuickLauchPage quickLauchPage = new QuickLauchPage();
        quickLauchPage.login();
        quickLauchPage.Click(quickLauchPage.myTimeSheets);
    }
}