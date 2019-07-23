package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Page {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a") WebElement login;
	@FindBy(how=How.ID,using="Email") WebElement username;
	@FindBy(how=How.NAME,using="Password") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Login']") WebElement log;
	
	public Page(WebDriver driver)
	{
		this.driver=null;
	}
	
	public void typename(String Username,String Password)
	{
		 login.click();
		 username.sendKeys(Username);
		 password.sendKeys(Password);
		 log.click();
	}
	

}
