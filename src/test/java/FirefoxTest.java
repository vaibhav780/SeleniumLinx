import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

    @Test
    public static void ff(){

        System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());
        driver.quit();
    }
}
