import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green_Framework_Javascript {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://greenstech.in/selenium-course-content.html");
        WebElement frame=driver.findElement(By.id("heading304"));
        
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView(true)",frame);
    }
    
}
