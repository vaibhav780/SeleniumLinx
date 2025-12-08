package Utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.sql.Driver;

public class Util {
    WebDriver driver;

    public static void Screenshot(WebDriver driver)  {
       try {
           File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
           //   Files.copy(file.toPath(), new File("/screenshot/"+System.currentTimeMillis()+".png").toPath());
           FileUtils.copyFile(file, new File(System.getProperty("user.dir")+"/screenshot/"+System.currentTimeMillis()+".png"));
       }
        catch (IOException e){

           CustLogger.FATAL(e.getStackTrace().toString());
        }
    }
}
