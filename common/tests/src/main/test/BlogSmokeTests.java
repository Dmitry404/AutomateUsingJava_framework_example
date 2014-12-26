import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BlogSmokeTests {
    @AfterTest
    public void tearDown() throws Exception {
        LoginPage.tearDown();
    }

    @Test
    public void testIfAppCanStart() throws Exception {
        LoginPage.goTo();

        assertThat(LoginPage.at(), is(true));
    }

    @Test
    public void testIfCanLogin() throws Exception {
        LoginPage.goTo();

        LoginPage.loginAs("dmitry404")
                 .withPassword("*@YZU83C%uDJKF+JUe&RvgEzzePn5Qey76^");

        assertThat(BlogMainPage.at(), is(true));
    }
}

