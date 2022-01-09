import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook_Robot{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
       
        WebElement c= driver.findElement(By.id("u_0_j_1/"));
        JavascriptExecutor js = (JavascriptExecutor) driver;  
        js.executeScript("arguments[0].scrollIntoView(true);",c);
       
        WebElement em = driver.findElement(By.id("email"));
        em.sendKeys("uma");
        
        
        Actions a=new Actions(driver);
        a.doubleClick(em).perform();
        a.contextClick(em).perform();
        
    
    Robot r=new Robot();
    for (int i = 0; i < 8; i++) {
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        }
    r.keyPress(KeyEvent.VK_ENTER);
    r.keyRelease(KeyEvent.VK_ENTER);
    
    r.keyPress(KeyEvent.VK_TAB);
        r.keyRelease(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);

     
    
    }
    
    }