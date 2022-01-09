import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adaction_Registration {
    
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("http://adactinhotelapp.com/");

        WebElement reg=driver.findElement(By.xpath("//a[text()='New User Register Here']"));
        reg.click();
        driver.findElement(By.id("username")).sendKeys("bharathkanna");
        driver.findElement(By.id("password")).sendKeys("12345678");
        driver.findElement(By.id("re_password")).sendKeys("12345678");
        driver.findElement(By.id("full_name")).sendKeys("bk");
        driver.findElement(By.id("email_add")).sendKeys("barathshiva4@gmail.com");
        driver.findElement(By.id("captcha-form")).sendKeys("illyric");
        driver.findElement(By.id("tnc_box")).click();
        driver.findElement(By.id("Submit")).click();

       



    }
}
