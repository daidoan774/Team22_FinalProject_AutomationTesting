package tests;

import org.junit.Test;
import pages.Naviagation;

public class NavigationTest {
    @Test
    public void NavigationToMinisize() throws Exception {

        Naviagation navi = new Naviagation();
        navi.login();
        navi.Click(navi.navigation);
    }
    @Test
    public void NavigationMinisizeToMax() throws Exception{
        Naviagation navi = new Naviagation();
        navi.login();
        try{
            navi.changeNavi();
        }
        catch (Exception e) {
            System.out.println("DDOR"+e.getMessage());
        }
    }
}
