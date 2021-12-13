package basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPFactory {
WebDriver driver;
	
	@FindBy(how=How.ID,using="txtUsername")
	WebElement uname;
	@FindBy(id="txtPassword")
	WebElement pwd;
	@FindBy(how=How.ID,using="btnLogin")
	WebElement btn;
	
	public LoginPFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void login()
	{
		uname.sendKeys("Admin");
		pwd.sendKeys("admin123");
		btn.click();
	}
	

}
