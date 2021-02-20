package optimumproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {
public static WebDriver driver;

public static void navigate() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "dependencies\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.get("https://www.dbs.com.sg");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
}
public static void menuSelect() throws InterruptedException {
	driver.findElement(By.xpath("//div[@id='flpHeader']/header/div/div[4]/div/button/span")).click();
	Thread.sleep(2000);
	java.util.List<WebElement> webElements=driver.findElements(By.xpath("//div[@id='flpHeader']/header/div/div[4]/div/ul/li"));
	 for(WebElement eles:webElements) {
		 String text=eles.getText();
		 System.out.println("test information"+text);		
		 Thread.sleep(2000);
		 if(text.equalsIgnoreCase("India")) {
			 
			 driver.findElement(By.xpath("//*[@id='flpHeader']/header/div/div[4]/div/ul/li[5]/a/span")).click();
			 
			 break;
		 }
		 
	 }
	
}
public static void learnM() throws InterruptedException {
	driver.findElement(By.xpath("//div[@id=\"dbsgroup\"]/div[3]/p[3]/a/button")).click();
	Thread.sleep(3000);
}
public static void selectDigi() throws InterruptedException {
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//div[@id=\"flpHeader\"]/header/div/div[2]/ul/li[2]/a"));
	act.moveToElement(ele).build().perform();
	Thread.sleep(2000);
	WebElement ele2 =driver.findElement(By.xpath("//div[@id=\"flpHeader\"]/header/div/div[2]/ul/li[2]/dl/dd[1]/a"));
	act.moveToElement(ele2).build().perform();
	ele2.click();
	Thread.sleep(2000);
}
public static void login() throws InterruptedException {
	driver.findElement(By.xpath("//div[@id=\"flpHeader\"]/header/div/div[3]/ul/li[2]")).click();
	Thread.sleep(2000);
	String parent=driver.getWindowHandle();
	Set<String> window	=driver.getWindowHandles();
	//int count=window.size();
	for(String child:window) {
		if(!parent.equalsIgnoreCase(child)) {
	driver.switchTo().window(child);
	System.out.println(child);
		}
	}
	
	
	driver.findElement(By.xpath("//div[@id=\"bodyWrap\"]/div/div[2]/div[1]/div[2]/form/div[1]/label/input")).sendKeys("xxx");
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("xxx");
	driver.findElement(By.xpath("//div[@id=\"bodyWrap\"]/div/div[2]/div[1]/div[2]/form/button")).click();
	 
}
public static void verification() {
	String verify=driver.findElement(By.xpath("//div[@id=\"bodyWrap\"]/div/div[2]/div[1]/div[2]/form/div[1]/p")).getText();
	if(verify.equalsIgnoreCase("Invalid username")) {
		System.out.println("validation Message is exist");
	}
	else {
		System.out.println("validation message is not exists");
	}
}
public static void quit() throws InterruptedException {
	Thread.sleep(5000);
	driver.quit();
	
}
	

}