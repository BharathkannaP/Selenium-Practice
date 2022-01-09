import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_withoutUtils {
    public static void main(String[] args) throws IOException, InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

TakesScreenshot ts=(TakesScreenshot) driver;
File sourceFile=ts.getScreenshotAs(OutputType.FILE);
File destinaFile=new File ( "/home/bk/Documents/Scrren/sample1.png");
FileHandler.copy(sourceFile,destinaFile);

Thread.sleep(5000);

driver.quit();

    }
    
}
