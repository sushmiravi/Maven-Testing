package Maven_Testing.Maven_Testing;

//Maven_Testing.Maven_Testing.Methods

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

public class Methods {
	
	  
		 WebDriver driver=null;
	
	
  @Test()// this test case will not run when we give enabled=false   
  public void f1() {
	  
	  
	driver.get("https://demo.guru99.com/test/newtours/");
	  
  }
  
  @Test() 
  public void f2() {
	  
  driver.findElement(By.linkText("SIGN-ON")).click();
	
  }
  
  @BeforeClass(alwaysRun= true)
  @Parameters("browser")
  void beforeClass(String browser) {
	  
	  //driver.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	// WebDriverManager.chromedriver().setup();// setting up my chrome driver
	if(browser.equalsIgnoreCase("chrome"))
	{
			WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	}
	       else if(browser.equalsIgnoreCase("Edge"))
	       {
	    	   WebDriverManager.edgedriver().setup();
	    	   driver=new EdgeDriver();
	       }
	       else if(browser.equalsIgnoreCase("firefox"))
	       {
	    	   WebDriverManager.firefoxdriver().setup();
	    	   driver=new FirefoxDriver();
	       }
	    	   
  }

  @AfterClass(alwaysRun= true) 
  public void afterClass() {
	  driver.close();
	  
  }

}
