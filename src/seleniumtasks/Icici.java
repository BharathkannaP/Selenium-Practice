import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icici {
	public static void main(String[] args) {
		
		
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

	driver.findElement(By.xpath("//input[@id='DUMMY1']")).sendKeys("789891");
	driver.findElement(By.xpath("(//img[@id='user-id-goahead'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='AuthenticationFG.USER_PRINCIPAL']")).sendKeys("2133454");
	driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']")).sendKeys("eretry");
	driver.findElement(By.xpath("//input[@id='VALIDATE_CREDENTIALS1']")).click();
    }
    
}
