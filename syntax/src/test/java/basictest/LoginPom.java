package basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPom {
	WebDriver driver1;
	By uname=By.id("txtUsername");
	By pwd=By.id("txtPassword");
	By btn=By.id("btnLogin");

	
	public void login()
	{
		driver1.findElement(uname).sendKeys("Admin");
		driver1.findElement(pwd).sendKeys("admin123");
		driver1.findElement(btn).click();
		
	}
	
	
}

