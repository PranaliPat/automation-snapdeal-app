package ProjectPackage;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class DeliveryWithChargesButton extends FirstLaunchClass
{

	@Test
public void DeliveryWithChargesTab() throws InterruptedException, IOException
{
	   //open the url
		driver.get(baseurl);
		
	
				
		// sleep the window
		Thread.sleep(1000);
		
		//click on search box enter the value using sendkey
		driver.findElement(By.name("keyword")).sendKeys("kurti");
				
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
		
		
		//check delivery with chargees
		WebElement checkDeliveryCharges = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/input"));
				
		//put the value
		checkDeliveryCharges.sendKeys("411046");
				
		//to check the checkButton
		WebElement CheckButton = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[7]/div[5]/div[3]/div[2]/div/div[2]/button")); 
				
		//click check the rror show to enter valid pincode
		CheckButton.click();
		
		
		
		
		
		
		
}
	
	
	
	
	
	
	
	
	
	
	

}
