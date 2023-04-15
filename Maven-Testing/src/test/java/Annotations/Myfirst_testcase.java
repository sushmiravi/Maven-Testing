package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


public class Myfirst_testcase {
	
	WebDriver driver=null;
  @Test
  public void Test1() {
	  
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	 // WebElement element= driver.findElement(By.xpath("https://www.selenium.dev/"));
	 // element.click();
	  String actualtitle= driver.getTitle();
	  System.out.println(actualtitle);
	  Assert.assertEquals(actualtitle, "Downloads | Selenium");
	  
	  
  }
  
  @Test
  public void test2()
  {
	  driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
	  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/div[9]/div[1]/div[1]/p[1]/a[1]")).click();
	  driver.findElement(By.xpath("/html/body/div/main/div[1]/div[3]/div/div[1]/h2/a[1]")).click();
	 WebElement e= driver.findElement(By.xpath("//*[@id=\"snippets\"]/div/div/div/table/tbody[1]/tr[1]/td[2]/a"));
    e.click();
	 
	 String s= driver.findElement(By.xpath("//*[@id=\"maven-a\"]")).getText();
     System.out.println("the dependency file of selenium maven /n" +s);
     
    
 
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.getProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("https://www.selenium.dev/");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.quit();
  }

}
