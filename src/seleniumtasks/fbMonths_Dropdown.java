
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbMonths_Dropdown {
	public static void main(String[] args) throws InterruptedException {
		
	    WebDriver driver=new ChromeDriver();
	    
        driver.get("https://www.facebook.com/");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(2000);
        Select s=new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
		List<WebElement> list = s.getOptions();
		System.out.println("months");
		for (WebElement op : list) {
			String text = op.getText();
			System.out.println(text);
        }}}
