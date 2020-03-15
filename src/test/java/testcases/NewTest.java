package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
		
	  System.setProperty("webdriver.chrome.driver","chromedriver80.exe");
	  driver = new ChromeDriver();
	  driver.get("file:///C:/Users/ASHWINI/Desktop/Raaj-TouchMeNot/JBK/Offline%20Website/Offline%20Website/pages/examples/logout.html");
	  driver.manage().window().maximize();
  }
  
	@Test
	public void test02(){
	String title=driver.getTitle();
	String expTitle = "JavaByKiran | Dashboard";
		Assert.assertEquals(title, expTitle);
		System.out.println("1111");
	}

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
