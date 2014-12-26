import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Driver {
    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null)
            driver = new FirefoxDriver();
        return driver;
    }
}
