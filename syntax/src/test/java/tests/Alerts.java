package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts {
	@SuppressWarnings("deprecation")
	@Test
	public void alerts() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		WebElement but1=driver.findElement(By.xpath("//button[@id='alertBox']"));
//		but1.click();
//		Alert alert1=driver.switchTo().alert();
//				Thread.sleep(500);
//		alert1.accept();
		//WebElement btn2=driver.findElement(By.xpath("//button[@id='confirmBox']"));
		//btn2.click();
		//Alert alert2=driver.switchTo().alert();
		//Thread.sleep(500);
		//String msg2=alert2.getText();
		//alert2.dismiss();
		//System.out.println(msg2);
WebElement btn3=driver.findElement(By.xpath("//button[@id='promptBox']"));
btn3.click();
Alert alert3=driver.switchTo().alert();
String msg3=alert3.getText();
alert3.sendKeys("shaiksha");
Thread.sleep(500);

alert3.accept();
System.out.println(msg3);
		
	}

}
