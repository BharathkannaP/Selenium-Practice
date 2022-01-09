import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage_Screenshot
{
    public static void main(String[] args) throws IOException {
        
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");
        driver.findElement(By.xpath("//a[@class='activeLink']")).click();
        //using FileUtils method (common.io)
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("/home/bk/Documents/Scrren/Homepage.png"));
        
        //using Filehandler method (selenium inbuild)
        // TakesScreenshot ts=(TakesScreenshot) driver;
        // File SourceFile=ts.getScreenshotAs(OutputType.FILE);
        // File destinationFile=new File ( "/home/bk/Documents/Scrren/Homepage.png");
        // org.openqa.selenium.io.FileHandler.copy(SourceFile, destinationFile);
        driver.quit();
    }
    
}
