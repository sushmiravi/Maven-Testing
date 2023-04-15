package Assertionpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class assertdemo {
	
	@Test()
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String curtitle= driver.getTitle();
		// Hard assertion ex: when the condition is false it will terminate  
		//Assert.assertEquals(curtitle, "Google","Checking the title matches or not ");
		boolean flag=true;
		if(curtitle.contains("Google"))
		{
			Assert.assertTrue(flag);
		}
		
		driver.navigate().refresh();
		driver.close();
		
	}
	
	@Test(enabled= false)
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String curtitle= driver.getTitle();
		// soft assertion we have to create object 
		// NO termination when the condition is false  
		SoftAssert ass= new SoftAssert();
		ass.assertEquals(curtitle, "google","Checking the title matches or not");
		
		driver.navigate().refresh();
		driver.close();
		
		ass.assertAll();// Gives all exceptions  
		
	}

}
