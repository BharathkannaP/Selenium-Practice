import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.awt.event.KeyEvent;

public class Green_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement em = driver.findElement(By.id("heading20"));
        WebElement cts=driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
        em.click();
        
        Actions a=new Actions(driver);
        a.moveToElement(cts).perform();
        a.contextClick().perform();

        Robot r=new Robot();
        for (int i = 0; i < 2; i++) {
            
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        }
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
    
    }
    
    }
    

