package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FRAMES 
{
	@SuppressWarnings("deprecation")
	@Test
public void frames()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	int framecount=driver.findElements(By.tagName("iframe")).size();
	System.out.println(framecount);
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
	Select select=new Select(driver.findElement(By.id("selectnav2")));
	select.selectByVisibleText("Contact");
	driver.switchTo().defaultContent();
	driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("shaiksha");
	driver.close();
	
			}
}
