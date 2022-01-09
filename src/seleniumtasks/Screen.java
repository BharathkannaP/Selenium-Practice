import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Screen {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/home/bk/chromedriver_linux64/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("email");

        Alert a=driver.switchTo().alert();
        a.accept();
        

        
    }
}
