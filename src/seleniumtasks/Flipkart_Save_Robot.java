import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Flipkart_Save_Robot {
    public static void main (String[]args){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        
        WebElement close=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
        close.click();
        WebElement Mobiles=driver.findElement(By.xpath("//div[@class='xtXmba' and text()='Mobiles']"));
        Actions a= new Actions(driver);
        a.moveToElement(Mobiles).perform();
        a.contextClick(Mobiles).perform();

        Robot r=new Robot();
        for(int i=1;i<5;i++){
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
                    }


    }
       
   } 
        