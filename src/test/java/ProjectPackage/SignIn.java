package ProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn extends FirstLaunchClass
{

	@Test
	public void signin() throws InterruptedException
	{
		//lauch the url
		driver.get(baseurl);
		
		//sleep the window
		Thread.sleep(2000);
		
		//on sign in
		WebElement signin = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]"));
		Assert.assertTrue(signin.isDisplayed(),"signin is not displayed");
		
		//click on sign in
		signin.click();
		
		//check login
		WebElement login = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));
		Assert.assertTrue(login.isDisplayed(),"login is not displayed");
		
		//click on login button
		login.click();
		/*
		  //to enter invalid mobile number error message show here use black box tech equivalence partitioning
	     WebElement login1 = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
	     login1.sendKeys("07558411291");
	     //click on continue button
	     WebElement continueButton1 = driver.findElement(By.xpath("//*[@id=\"checkUser\"]"));
			Assert.assertTrue(continueButton1.isDisplayed(),"continueButton is not displayed");
			//check login button is clickble or not
			continueButton1.click();
			/*
			//error message shown
			WebElement error1 = driver.findElement(By.id("userName-error"));
			Assert.assertTrue(error1.isDisplayed(),"error is not displayed");
		     System.out.println(error1.getText());
*/
		/*
		//without entring data click on continue button
		WebElement continueButton = driver.findElement(By.linkText("continue"));
		Assert.assertTrue(continueButton.isDisplayed(),"continueButton is not displayed");
		//check login buttonis clickble or not
		continueButton.click();
		
		//error message shown
		WebElement error = driver.findElement(By.id( "userName-error"));
		Assert.assertTrue(error.isDisplayed(),"error is not displayed");
	     System.out.println(error.getText());
	     
	     //to enter invalid mobile number error message show here use black box tech equivalence partitioning
	     WebElement login1 = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[3]/div[3]/div/div/div[2]/div[2]/span[2]/a"));
	     login1.sendKeys("07558411291");
	     //click on continue button
	     WebElement continueButton1 = driver.findElement(By.xpath("//*[@id=\\\"checkUsercheckUser"));
			Assert.assertTrue(continueButton1.isDisplayed(),"continueButton is not displayed");
			//check login button is clickble or not
			continueButton1.click();
			//error message shown
			WebElement error1 = driver.findElement(By.id( "userName-error"));
			Assert.assertTrue(error1.isDisplayed(),"error is not displayed");
		     System.out.println(error1.getText());
	     
	     
	   
	     
		WebElement username = driver.findElement(By.id("userName"));
		Assert.assertTrue(username.isDisplayed(),"username is not displayed");
		//check username and enter the data
		username.sendKeys("pranali@2312");
		//click on continue button
	     WebElement continueButton2 = driver.findElement(By.xpath("//*[@id=\\\"checkUsercheckUser"));
	   //check login button is clickble or not
			continueButton2.click();
		*/ 
		/*
		//To check google user login option
		WebElement googleuser = driver.findElement(By.id("googleUserLogin"));
		Assert.assertTrue(googleuser.isDisplayed(),"googleuser is not displayed");
		//click on googleuser
		googleuser.click();
		
		*/
		
		
	}
}
