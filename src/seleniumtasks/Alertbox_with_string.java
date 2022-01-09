import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox_with_string {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement tex = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		tex.click();
	
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		button.click();
		
		Alert b = driver.switchTo().alert();
		b.sendKeys("Hi i am Ramya");
	b.accept();
	}

}
    

