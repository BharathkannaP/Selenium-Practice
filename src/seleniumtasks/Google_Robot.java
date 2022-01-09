import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/webhp");
      
        WebElement em = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        WebElement cook=driver.findElement(By.xpath("//div[text()='Piekrītu']"));
        cook.click();
        em.sendKeys("VELMURUGAN");      
        Actions a=new Actions(driver);
        a.doubleClick(em).perform();
        Robot r=new Robot();
                 
            r.keyPress(KeyEvent.VK_CONTROL);
            r.keyPress(KeyEvent.VK_X);
            r.keyRelease(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_X);
    }
    }
    