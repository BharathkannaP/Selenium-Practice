import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Actionhotel_Javascript {
    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("http://adactinhotelapp.com/");

        JavascriptExecutor executor= (JavascriptExecutor) driver;
        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("bk");
        WebElement pass= driver.findElement(By.id("password"));
        pass.sendKeys("123");
        WebElement login= driver.findElement(By.xpath("//input[@name='login']"));
        executor.executeScript("arguments[0].click()",login);


}
}