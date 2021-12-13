package basictest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A {
	public WebDriver driver;
	
	
@Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		 driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/https://opensource-demo.orangehrmlive.com/");
	
	LoginPom login=new LoginPom();
	login.login();
	driver.close();
	}
@Test
public void login()
{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	
	 driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://opensource-demo.orangehrmlive.com/https://opensource-demo.orangehrmlive.com/");
LoginPFactory log=new LoginPFactory(driver);
log.login();
	
}
	

	}


