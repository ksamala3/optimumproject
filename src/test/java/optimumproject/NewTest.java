package optimumproject;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class NewTest extends optimumproject.Test {
  @Test (priority = 1)
  public void menu() throws InterruptedException {
	 menuSelect();
  }
 
  @Test (priority = 2)
  public void clickLearnMore() throws InterruptedException {
	  learnM();
  }
  @Test (priority = 3)
  public void digi() throws InterruptedException {
	  selectDigi();
  }
  @Test (priority = 4)
  public void loginPage() throws InterruptedException {
	  login();
  }
  @Test (priority = 5)
  public void verify() {
	  verification();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  navigate();
  }
  
@AfterTest
public void close() throws InterruptedException {
	quit();
	}



}
