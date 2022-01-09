import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.get("http://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();

        String parentid=driver.getWindowHandle();
        System.out.println(parentid);

        

        driver.switchTo().frame(0);
       
        WebElement frames=driver.findElement(By.id("a077aa5e"));
        frames.click();

        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("//i[@class='icon-suitcase']"));
             
    }
    
}
