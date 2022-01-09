import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;



public class mouseover {
    public static void main(String[] args) throws IOException, InterruptedException{
        
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        WebElement cancel=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        cancel.click();
        WebElement fashion =driver.findElement(By.xpath("//img[@class='_396cs4 _3exPp9' and @alt='Fashion']"));
        fashion.click();

        Actions a=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement women=driver.findElement(By.xpath("//span[@class='_2I9KP_' and text()='Women']"));
        a.moveToElement(women).build().perform();

        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        File destinationFile=new File ("/home/bk/Documents/Scrren/women.png");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        FileHandler.copy(sourceFile,destinationFile);
        driver.close();

    }
    
}
