import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Green_SaveAs_Robot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement Save=driver.findElement(By.id("heading201"));
        Save.click();
        WebElement resume=driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
        
        Actions a= new Actions(driver);
        a.moveToElement(resume);
        a.contextClick().perform();

        Robot r = new Robot();
        for (int i = 0; i < 4; i++) {

            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
                    
        }
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    
}
