import Utility.CustLogger;
import Utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MyTest {


    @Test
    public void setupandTest(){
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
        WebElement btn1= driver.findElement(By.id("btn1"));
        WebElement btn2 = driver.findElement(By.id("btn2"));
   //     WebElement txt1= driver.findElement(By.id("txt1"));
        Assert.assertTrue(btn1.isDisplayed(),"Butin is not displayed");
        CustLogger.Info("Button1 is present");
        Assert.assertTrue(btn2.isDisplayed());
        CustLogger.Info("Button2 is present");
        btn1.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
              CustLogger.Info("Textbox1 is displayed");
        Util.Screenshot(driver);

        btn2.click();

      Wait <WebDriver>  fwait= new FluentWait<>(driver)
              .pollingEvery(Duration.ofSeconds(10))
              .withMessage("Checked for 1 second");
      CustLogger.Info("waited for 10 seconds");
        fwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        Util.Screenshot(driver);
        driver.close();


    }
}
