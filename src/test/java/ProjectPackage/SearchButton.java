package ProjectPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchButton extends FirstLaunchClass
{

	@Test
	public void search() throws InterruptedException
	{
		//open the url
		driver.get(baseurl);
		
		// sleep the window
		Thread.sleep(1000);
		
		//click on search box enter the value using sendkey
		driver.findElement(By.name("keyword")).sendKeys("saree");
		
		//cick on search button
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")).click();
		
		//switch to new window 
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String WindowHandle :WindowHandles)
		{
			driver.switchTo().window(WindowHandle);
		}
		if(driver.getTitle() != null)
		{
			System.out.println("Title of new window:"+driver.getTitle());
		}
		
		
	}
	
	
	@Test
	public void sortBy()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//scoll down by 2000 pixel
		js.executeScript("window.scrollBy(0,2000)",""); 
		
		//to check the fabric category Banarasi silk checkbox
        WebElement fabricCategory = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[5]/div[3]/div/div[4]"));
        fabricCategory.click();
		Assert.assertTrue(fabricCategory.isDisplayed(),"fabric information Category is not present");
		
		//switch to new window 
				Set<String> WindowHandles = driver.getWindowHandles();
				for (String WindowHandle :WindowHandles)
				{
					driver.switchTo().window(WindowHandle);
				}
				if(driver.getTitle().contains("search fabric category"))
				{
					System.out.println("Tite of new window:"+driver.getTitle());
				}
		
		//to check colour catgory checkbox
			WebElement colourCategory = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[4]"));
			Assert.assertTrue(colourCategory.isDisplayed(),"colour information Category is not present");
				
		//to check Price category
			WebElement priceCategory = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[4]/div/div[1]/div[2]/div[2]"));
			Assert.assertTrue(priceCategory.isDisplayed(),"price information Category is not present");
				
				
				
				
				
	}
	
	
	
	
}
