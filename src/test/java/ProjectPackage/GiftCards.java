package ProjectPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftCards extends FirstLaunchClass
{

	@Test
public void GiftCard() throws InterruptedException
{
		//open the url
		driver.get(baseurl);
				
		// sleep the window
		Thread.sleep(1000);
		
		//to check giftcards tab
		WebElement giftcard = driver.findElement(By.linkText("Gift Cards"));
		Assert.assertTrue(giftcard.isDisplayed(),"add to giftcard is not displayed");
		
		//click on this tab
		giftcard.click();
		
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
		
		//to check colour catgory checkbox
		WebElement BrandCategory = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[9]/div[1]/div/div[1]/div[2]/div[3]/div[3]/div"));
		Assert.assertTrue(BrandCategory.isDisplayed(),"BrandCategory is not present");
			
		//click on snapdeal checkbox button
		BrandCategory.click();
		
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
