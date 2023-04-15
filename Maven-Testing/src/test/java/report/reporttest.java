package report;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class reporttest {
  @Test
  public void f() {
	  
	 Reporter.log("setting up the browser and to check the title og google page", true);
	 
	WebDriverManager.firefoxdriver().setup();
	 
	 WebDriver chrome =new FirefoxDriver();
	 
	 chrome.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 
	 String title=chrome.getTitle();
	 
	 Reporter.log("the title is :"  +title);
	 
	
  }
}
