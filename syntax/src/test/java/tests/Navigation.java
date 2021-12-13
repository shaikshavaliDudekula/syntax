package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigation {
@Test	
public void navigations()
{
	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
}
}
