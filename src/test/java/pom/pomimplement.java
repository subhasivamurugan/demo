package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pomimplement {
	
	public static void main(String arg[])
	{
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		   driver=new ChromeDriver();
		   Page pobject=new Page(driver);
		   driver.get("http://demowebshop.tricentis.com/");
		   driver.manage().window().maximize();
		  // pobject.ClickLink();
		   String Username="subhabtech191@gmail.com" ;
		   String password="Subha#1998" ;
		   pobject.typename(Username,password);
		  // pobject.login();
		   System.out.println("title of the page is :"+driver.getTitle());
		   
	}

}
