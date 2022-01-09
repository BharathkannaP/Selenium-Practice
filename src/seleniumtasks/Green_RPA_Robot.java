import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Green_RPA_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement Save=driver.findElement(By.xpath("//a[@title='RPA Training in chennai']"));
        Save.click();
               
        Actions a= new Actions(driver);
        a.moveToElement(Save);
        a.contextClick().perform();

        Robot r = new Robot();
            r.keyPress(KeyEvent.VK_UP);
            r.keyRelease(KeyEvent.VK_UP);
                    
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    
}
    
