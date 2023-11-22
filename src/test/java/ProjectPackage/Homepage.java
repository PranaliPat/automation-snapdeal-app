package ProjectPackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Homepage extends FirstLaunchClass
{

	
	
	@Test
	public void launch() throws InterruptedException
	{
		//lauch the url
		driver.get(baseurl);
		
		//using for thread sleep
		Thread.sleep(1000);
		
		//To check the title of app
	    String expectedtitle = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
	    String actualtitle = driver.getTitle();
	    Assert.assertEquals(actualtitle,expectedtitle);
	    System.out.println(driver.getTitle());
	
	    //Tp check the title length
	     int titlelength = driver.getTitle().length();
	  	System.out.println(driver.getTitle().length());
	    
	    
	    //url
	      String expectedUrl = "https://www.snapdeal.com/";
	      String actualUrl = driver.getCurrentUrl();
	      Assert.assertEquals(actualUrl,expectedUrl);
	      
	  	if(expectedUrl.equals(actualUrl))
	  	{
	  		System.out.println("Correct page open");
	  	}
	     else
	     {
	  	   System.out.println("Correct page not open");
	     }
		
		
		
		
	}



	
}
