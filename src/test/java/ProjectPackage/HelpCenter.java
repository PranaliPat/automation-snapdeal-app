package ProjectPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelpCenter extends FirstLaunchClass
{
	
	
@Test
public void HelpAndCenter() throws InterruptedException
{
	//open the url
	 driver.get(baseurl);
			
	// sleep the window
	Thread.sleep(1000);
	
	//to check link is present or not
	WebElement Help = driver.findElement(By.linkText("Help Center"));
    Assert.assertTrue(Help.isDisplayed(),"Help and center is not displayed");
	
	//To check it is clickable or not
	Help.click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.titleContains("Snapdeal : Help Center"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//scoll down by 500 pixel
	js.executeScript("window.scrollBy(0,500)",""); 
	
	//to check on cancellation
		WebElement cancellation = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[4]/div[19]/div[2]/div/div[3]/div[2]"));
		Assert.assertTrue(cancellation.isDisplayed(),"cancellation is not displayed");
	
		//to check on Refund
		WebElement Refund = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[4]/div[19]/div[2]/div/div[3]/div[4]"));
		Assert.assertTrue(Refund.isDisplayed(),"Refund is not displayed");
	
		//to check on Return/replacement
		WebElement ReturnReplacement = driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/div[4]/div[19]/div[2]/div/div[3]/div[3]"));
		Assert.assertTrue(ReturnReplacement.isDisplayed(),"ReturnReplacement is not displayed");
			
	
	
	
}
}
