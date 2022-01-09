

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_noofroom {
public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();;
     driver.get("http://adactinhotelapp.com/");
     driver.findElement(By.id("username")).sendKeys("bharathkanna");;
     driver.findElement(By.id("password")).sendKeys("12345678");
     driver.findElement(By.id("login")).click();
     Select room=new Select(driver.findElement(By.id("room_type")));
     List<WebElement> list = room.getOptions();
		for (WebElement op : list) {
			String text = op.getText();
			System.out.println(text);
}}}
