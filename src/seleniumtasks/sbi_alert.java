import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sbi_alert {
    public static void main(String[] args) {
        
        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.onlinesbi.com/retail/login.htm");

        driver.findElement(By.xpath("(//a[@class='login_button' and text()='CONTINUE TO LOGIN'])[1]")).click();
        
        driver.findElement(By.id("Button2")).click();

        Alert r= driver.switchTo().alert();
        r.accept();

    }
    
}
