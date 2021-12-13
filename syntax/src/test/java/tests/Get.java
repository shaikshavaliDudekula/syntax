package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get {
	@Test
	public void gets()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		String page=driver.getPageSource();
		System.out.println(page);
		WebElement butn=driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[3]/center[1]/input[1]"));
		String eletext=butn.getTagName();
		
		System.out.println(eletext);
		
	}
}
