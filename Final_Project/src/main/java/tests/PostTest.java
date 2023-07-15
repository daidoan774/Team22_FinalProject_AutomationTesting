package tests;

import org.junit.Test;
import pages.PostPage;

public class PostTest {
 @Test
    public void fillPostvalid() throws Exception {
  PostPage postPage = new PostPage();
  postPage.login();
  postPage.clickBuzz();
  postPage.choseArea("Demo");
 }
}
