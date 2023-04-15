package Maven_Testing.Maven_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paralel_Testing{
	
	WebDriver driver=null; 
	
	@SuppressWarnings("deprecation")
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Test case 1:"  +Thread.currentThread().getId());
	}
	 
	@SuppressWarnings("deprecation")
	@Test
	public void test2()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("Test case 2:"  +Thread.currentThread().getId());
	}
	
}
