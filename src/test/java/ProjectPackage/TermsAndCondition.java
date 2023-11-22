package ProjectPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TermsAndCondition extends FirstLaunchClass
{

	@Test
	public void terms_condition () throws InterruptedException
	{
		
		//open the url
		driver.get(baseurl);
				
		// sleep the window
		Thread.sleep(1000);
				
		//click on search box enter the value using sendkey
		driver.findElement(By.name("keyword")).sendKeys("Kurti");
				
		//cick on search button
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")).click();
		
		//click one dress 
		driver.findElement(By.xpath("//*[@id=\"639463367029\"]/div[2]")).click();
		
		
				
		//switch to new window 
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String WindowHandle :WindowHandles)
		{
			driver.switchTo().window(WindowHandle);
		}
		if(driver.getTitle() != null)
		{
			System.out.println("Tite of new window:"+driver.getTitle());
		}
		
		
		//To see terms and condition
	    WebElement TermAndCondition = driver.findElement(By.xpath("//*[@id=\"buyPriceBox\"]/div[2]/div[2]/div[2]/div[1]/div/div/span/a"));
	    TermAndCondition.click();
		Assert.assertTrue(TermAndCondition.isDisplayed(),"terms and comdition is not present");
		
		//switch to new window 
				Set<String> WindowHandles1 = driver.getWindowHandles();
				for (String WindowHandle :WindowHandles1)
				{
					driver.switchTo().window(WindowHandle);
				}
				if(driver.getTitle() != null)
				{
					System.out.println("Tite of new window:"+driver.getTitle());
				}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
