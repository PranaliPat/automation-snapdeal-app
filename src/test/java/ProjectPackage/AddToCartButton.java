package ProjectPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartButton extends FirstLaunchClass
{

@Test
public void AddCart() throws InterruptedException
{
	//open the url
	driver.get(baseurl);
			
	// sleep the window
	Thread.sleep(1000);
	
	//to check cart is empty or not
	WebElement cart = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[1]"));
			
	//to check clickable or not
	cart.click();
	
	//close the cart popup
	Thread.sleep(3000);
	
	
	//search the searchbox and enter the value
	driver.findElement(By.name("keyword")).sendKeys("watch");
	
	//click on search button
	driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")).click(); 
	
	
	//click on one watch item which is price 339
	driver.findElement(By.id("652415109752")).click(); //clik 410 watch
	
	//switch to new window 
		Set<String> WindowHandles = driver.getWindowHandles();
		for (String WindowHandle :WindowHandles)
		{
			driver.switchTo().window(WindowHandle);
		}
		if(driver.getTitle().contains("Buy HMCT - Silver Metal Analog Men's Watch Online at Best Price in India - Snapdeal"))
		{
			System.out.println("Title of new window:"+driver.getTitle());
		}


		
		//to check on add to cart button
		WebElement addtocartbutton = driver.findElement(By.xpath("//*[@id=\"add-cart-button-id\"]"));
		Assert.assertTrue(addtocartbutton.isDisplayed(),"add to cart button is not displayed");
		
		//To check it is clickable or not
		addtocartbutton.click();
		
		//close add to cart 
		Thread.sleep(2000);
		
		// view to cart
		WebElement viewCartButton = driver.findElement(By.xpath("//*[@id=\"cartProductContainer\"]/div/div[2]/div[2]/div/div[2]/div")); 
		Assert.assertTrue( viewCartButton.isDisplayed(),"viewCartButton is not displayed");
		
		//click on view cart button
		viewCartButton.click();
		
		
}
	
	
	
	
	
	
	
	
	
	
	
}
