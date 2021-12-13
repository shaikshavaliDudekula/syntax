package tests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Window_Handles {
	@SuppressWarnings("deprecation")
	@Test
	public void windows()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String parentwindow=driver.getWindowHandle();
//		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
//		Set<String>windows=driver.getWindowHandles();
//		for(String window:windows)
//		{
//			if(!window.equalsIgnoreCase(parentwindow))
//			{
//				driver.switchTo().window(window);
//				driver.findElement(By.id("firstName")).sendKeys("shaiksha");
//				driver.findElement(By.id("lastName")).sendKeys("vali");
//				driver.close();
//				
//			}
//		}
//		driver.switchTo().window(parentwindow);
//		driver.findElement(By.id("name")).sendKeys("shaikshavali");
//		driver.close();
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		Set<String> newtab=driver.getWindowHandles();
		for(String window:newtab)
		{
		if(!window.equalsIgnoreCase(parentwindow))	
		{
			driver.switchTo().window(window);
			String title=driver.getTitle();
			System.out.println(title);
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,1000)");
			WebElement button=driver.findElement(By.xpath("//button[@id='f']"));
			js.executeScript("argument[0].click", button);
			
			Alert alert=driver.switchTo().alert();
			alert.sendKeys("shaiksha");
			alert.accept();
			driver.close();
			
		}
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("shaikshavali");
	driver.close();
	}

}
