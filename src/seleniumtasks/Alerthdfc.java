

import java.util.Iterator;
import java.util.Set;
import java.awt.AWTException;	



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthdfc {
	private static final String MainWindow = null;

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	@SuppressWarnings("deprecation")
		
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
        Set<String> set = driver.getWindowHandles();
    Iterator<String> it = set.iterator();
    System.out.println(set.size());

    for( String windowTab : set){
        if(!windowTab.equalsIgnoreCase(MainWindow)){
            driver.switchTo().window(it.next());
            driver.manage().window().maximize();
            String Wdinw2 = driver.getWindowHandle();
            Thread.sleep(10000);
            System.out.println(driver.getTitle());

            driver.findElement(By.xpath(".//*[@id='wrapper']/div[6]/a/img")).click();

            break;
        }

    }
}}
