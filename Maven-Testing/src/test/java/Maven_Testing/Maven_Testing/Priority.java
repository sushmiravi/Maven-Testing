package Maven_Testing.Maven_Testing;

//Priority has to be an integer
// it will start from - to +
// if we dont give priority it will run according to the alphabetical order 

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Priority {
  @Test(priority = 1)
  public void a1() {
	  
	  System.out.println("#1");
  }
  
  @Test
  public void a2() {
	  
	  System.out.println("#2");
  }
  @Test
  public void a3() {
	  
	  System.out.println("#3");
  }
  @Test
  public void a4() {
	  
	  System.out.println("#4");
  }
  @Test
  public void a5() {
	  
	  System.out.println("#5");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("priority check");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("checked");
  }

}
