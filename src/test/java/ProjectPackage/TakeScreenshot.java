package ProjectPackage;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TakeScreenshot extends FirstLaunchClass
{

	@Test
	public void Screenshot() throws InterruptedException, IOException
	{
	 //open the url
	driver.get(baseurl);
			
	// sleep the window
	Thread.sleep(1000);
	
	//click on search box enter the value using sendkey
	driver.findElement(By.name("keyword")).sendKeys("kur124ti");
			
	//cick on search button
	driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button")).click();
			
	//switch to new window 
	Set<String> WindowHandles = driver.getWindowHandles();
	for (String WindowHandle :WindowHandles)
	{
	 driver.switchTo().window(WindowHandle);
	}
	
	//to give screenshot
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f,new File("C:\\Users\\lenovo\\Desktop\\Sceenshot\\Snapdeal.jpg"));
			
	
	
	
	
	
	
	
	
	
	}
	
	
	
}
