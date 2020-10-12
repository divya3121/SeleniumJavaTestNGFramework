package SeleniumDemo;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumVerification {
	public WebDriver driver;
	

	@Test(priority=0)
	public void Selenium() throws InterruptedException
	{
	    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.google.com");
	    //System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	    //driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		//driver.getTitle();
		System.out.println("verified");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@href=\"https://www.selenium.dev/\"]")).click();
    }
		
	
	@Test(priority=1)
	public void PageVerification() throws InterruptedException
	{
	    Thread.sleep(9000);	
	    WebElement	ele=driver.findElement(By.xpath("//*[contains(text(),'BLACK LIVES MATTER')]"));
	    String text=ele.getText();
	    if(text.contains("BLACK LIVES MATTER"))
	  {
		System.out.println("PageVerification is done successfully");
	  }
	  else
	  {
		System.out.println("PageVerification is not done");
	  }
	
	}
	
	@Test(priority=2)
	public void Verification() throws InterruptedException
	{
	  driver.findElement(By.xpath("//*[@class=\'button green\']")).click();
	  Thread.sleep(3000);
	  WebElement title=driver.findElement(By.xpath("//a[@href='/blog']//*[contains(text(),'Selenium Blog')]"));
	  String ActualTitle=title.getText();
	  String ExpectedTitle="Selenium Blog";
	  if(ActualTitle.contains(ExpectedTitle))
	  {
		  System.out.println("Verification of blog is done successfully");
		  
	  }
	  else
	  {
		  System.out.println("Verification of blog is not done");
	  }
	  
	}
	
	
}
