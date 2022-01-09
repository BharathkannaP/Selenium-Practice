import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_green {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement green = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
        js.executeScript("arguments[0].scrollIntoview(true);",green);
        System.out.println(green.getText());
    }
    
}
