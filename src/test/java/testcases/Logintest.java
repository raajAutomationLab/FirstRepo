package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Logintest {

	WebDriver driver;

@BeforeMethod

public void SetUp(){
	
	  System.setProperty("webdriver.chrome.driver","chromedriver80.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Users/ASHWINI/Desktop/Raaj-TouchMeNot/JBK/Offline%20Website/Offline%20Website/pages/examples/logout.html");
	  driver.manage().window().maximize();
}

@AfterMethod
public void tearDown(){
	driver.close();
	
}
@Test
public void test01(){
	driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
	driver.findElement(By.id("password")).sendKeys("123456");
	driver.findElement(By.xpath("//*[@id='form']/div[3]/div/button")).click();
	
}
		  

	  
}


