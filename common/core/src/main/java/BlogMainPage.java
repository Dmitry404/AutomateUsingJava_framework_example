import org.openqa.selenium.By;

public class BlogMainPage extends Page {
    public static boolean at() {
        return Driver.getInstance().findElement(By.cssSelector("#site-title > a"))
                .getAttribute("title").equalsIgnoreCase("my blog");
    }
}
