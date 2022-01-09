import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Green_Javascript {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");

        JavascriptExecutor executor=(JavascriptExecutor) driver;
        WebElement green= driver.findElement(By.xpath("//span[text()='Greens Technologies Porur']"));
        System.out.println(green.getAttribute("textContent"));
        executor.executeScript("arguments[0].scrollIntoView(true);",green);
        Thread.sleep(3000);
        driver.close();


    }
    
}
