package ProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstLaunchClass {
  


	/*
	@Parameters("browserName")
	@Test
	public void setup(@Optional String browserName)
	{
		switch(browserName = "chrome")
		{
		    case "chrome":
		    { WebDriver driver = new ChromeDriver();
		    break;
		    }
		    
		    case "FirefoxDriver":
		    {	FirefoxDriver driver = new FirefoxDriver();
			    break;
		    }
		    
		    default:
		    	System.out.println("Invalid browser");
		    
		    
		}
		
	}
	
	*/
	
	WebDriver driver = new ChromeDriver();
	String baseurl = "https://www.snapdeal.com/"; 
	
	@Test
	@Parameters("browse")
	public void OpenBrowser(@Optional String browse)
	{
		
		driver.get(baseurl);
		driver.manage().window().maximize();
		
	}
}
