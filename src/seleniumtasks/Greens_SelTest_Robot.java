import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Greens_SelTest_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement Save=driver.findElement(By.id("heading303"));
        WebElement test=driver.findElement(By.xpath("//a[text()=' DAY 6 TASK']"));
        Save.click();
               
        Actions a= new Actions(driver);
        a.moveToElement(test);
        a.contextClick().perform();

        Robot r = new Robot();
            r.keyPress(KeyEvent.VK_UP);
            r.keyRelease(KeyEvent.VK_UP);
                            
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    
}