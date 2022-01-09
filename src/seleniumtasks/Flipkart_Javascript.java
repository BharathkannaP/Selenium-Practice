import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Javascript {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.flipkart.com/");

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement email=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
        email.sendKeys("bharath");
        WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
        pass.sendKeys("123");
        WebElement login= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
        executor.executeScript("arguments[0].click()",login);
        String val1=email.getAttribute("value");
        String val = pass.getAttribute("value");
        System.out.println("entered text is " +val1);
        System.out.println("entered text is " +val);
        
        
        
}
}