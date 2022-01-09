import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ok {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
		
		WebElement tex = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		tex.click();

        WebElement String=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        String.click();
		
		Alert b = driver.switchTo().alert();
        Thread.sleep(2000);
		b.accept();
	}

}