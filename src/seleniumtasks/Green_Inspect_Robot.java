import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;

public class Green_Inspect_Robot {
    public static void main(String[] args) throws AWTException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement em = driver.findElement(By.id("heading304"));
                
        Actions a=new Actions(driver);
        a.contextClick(em).perform();

        Robot r=new Robot();
                  
        r.keyPress(KeyEvent.VK_UP);
        r.keyRelease(KeyEvent.VK_UP);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
    
    }
    
    }
