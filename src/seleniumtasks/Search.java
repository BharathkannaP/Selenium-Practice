import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Search {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

       WebElement search= driver.findElement(By.name("keyword"));
       search.sendKeys("HP laptop");
       
       TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        File destinationFile=new File ("/home/bk/Documents/Scrren/search.png");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        FileHandler.copy(sourceFile,destinationFile);
        driver.close();


    }
    
}
