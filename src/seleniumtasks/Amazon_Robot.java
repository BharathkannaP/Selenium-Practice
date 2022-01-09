import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Amazon_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        
        WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
        signin.click();
        WebElement email=driver.findElement(By.id("ap_email"));
        email.sendKeys("barathshiva4@gmail.com");  
        
        Actions a= new Actions(driver);
        a.moveToElement(email).perform();
            
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);

       
        a.contextClick().perform();

            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
    }
    
}
