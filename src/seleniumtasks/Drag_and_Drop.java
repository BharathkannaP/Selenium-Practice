

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        Actions a = new Actions(driver);
        WebElement source=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        a.dragAndDrop(source, destination).perform();
        

        
    }
    
}
