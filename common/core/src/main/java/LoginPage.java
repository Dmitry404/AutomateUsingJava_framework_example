import org.openqa.selenium.By;

public class LoginPage extends Page {
    public static void goTo() {
        Driver.getInstance().navigate().to("https://automatewithjava.wordpress.com");
    }

    public static boolean at() {
        return Driver.getInstance().findElement(By.id("login")).isDisplayed();
    }

    public static LoginCommand loginAs(String username) {
        return new LoginCommand(username);
    }

    static class LoginCommand {
        private String username;

        public LoginCommand(String username) {
            this.username = username;
        }

        public void withPassword(String password) {
            Driver.getInstance().findElement(By.id("user_login")).sendKeys(username);
            Driver.getInstance().findElement(By.id("user_pass")).sendKeys(password);
            Driver.getInstance().findElement(By.id("wp-submit")).click();
        }
    }
}
