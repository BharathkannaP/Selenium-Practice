import javax.lang.model.element.Element;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://toolsqa.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        driver.findElement(by.)
        js.executeScript("arguments[0].scrollIntoview(true);",
        
    }
    
}
