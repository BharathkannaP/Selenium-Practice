import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Javascript {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.facebook.com/");

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("bk");
        WebElement pass= driver.findElement(By.id("pass"));
        pass.sendKeys("123");
        WebElement login= driver.findElement(By.xpath("//button[@value='1']"));
        executor.executeScript("arguments[0].click()",login);

        
        
      
      

        
    }
    
}
