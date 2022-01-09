package org.js;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Book_room {
public static void main(String[] args) throws InterruptedException {
	
	 WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();;
     driver.get("http://adactinhotelapp.com/");
     driver.findElement(By.id("username")).sendKeys("bharathkanna");;
     driver.findElement(By.id("password")).sendKeys("12345678");
     driver.findElement(By.id("login")).click();
     Select loc=new Select(driver.findElement(By.name("location")));
     loc.selectByVisibleText("Paris");
     Select hotel=new Select(driver.findElement(By.id("hotels")));
     hotel.selectByVisibleText("Hotel Creek");
    Select room=new Select(driver.findElement(By.id("room_type")));
    room.selectByVisibleText("Super Deluxe");		
    Select numberofrooms=new Select(driver.findElement(By.id("room_nos")));
    numberofrooms.selectByVisibleText("4 - Four");
    driver.findElement(By.id("datepick_in")).sendKeys("20/12/2021");
    driver.findElement(By.id("datepick_out")).sendKeys("22/12/2021");
    Select adultsroom =new Select(driver.findElement(By.id("adult_room")));
    adultsroom.selectByVisibleText("3 - Three");
    Select childroom=new Select(driver.findElement(By.id("child_room")));
    childroom.selectByValue("3");
    driver.findElement(By.id("Submit")).click();
    driver.findElement(By.id("radiobutton_0")).click();
    driver.findElement(By.id("continue")).click();
    driver.findElement(By.id("first_name")).sendKeys("cinthak");
    driver.findElement(By.id("last_name")).sendKeys("chinnakolanthai");
    driver.findElement(By.id("address")).sendKeys("Area 41, Matisa iela,Riga");
    driver.findElement(By.id("cc_num")).sendKeys("1234567890123456");
    Select cc=new Select(driver.findElement(By.id("cc_type")));
    cc.selectByVisibleText("VISA");
    Select ex=new Select(driver.findElement(By.id("cc_exp_month")));
    ex.selectByVisibleText("February");
    Select ex2=new Select(driver.findElement(By.id("cc_exp_year")));
    ex2.selectByVisibleText("2022");
    driver.findElement(By.id("cc_cvv")).sendKeys("1234");
    driver.findElement(By.id("book_now")).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    WebElement order=driver.findElement(By.id("order_no"));
    String val1=order.getAttribute("value");
    System.out.println("Order no. is " +val1);
}}