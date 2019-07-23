package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class testdemo {
	WebDriver driver=null;
	@Given("the signup page is opened")
	public void the_signup_page_is_opened() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.00.10\\Desktop\\Browsers and Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		String url = "http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		  driver.get(url);
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	  
	   
	}

	@When("user enters subhashini as username")
	public void user_enters_subhashini_as_username() {
		driver.findElement(By.name("userName")).sendKeys("subha");
	   
	  
	}

	@When("user enters subhashini as first name")
	public void user_enters_subhashini_as_first_name() {
		driver.findElement(By.name("firstName")).sendKeys("subhashini");
	 
	   
	}

	@When("user enters sivamurugan as last name")
	public void user_enters_sivamurugan_as_last_name() {
		driver.findElement(By.name("lastName")).sendKeys("sivamurugan");
	    
	  
	}

	@When("user enters Subha{int} as password")
	public void user_enters_Subha_as_password(Integer int1) {
		driver.findElement(By.name("password")).sendKeys("Subha1998");
	    
	    
	}

	@When("user enters Subha{int} as confirm password")
	public void user_enters_Subha_as_confirm_password(Integer int1) {
		driver.findElement(By.name("confirmPassword")).sendKeys("Subha1998");
	    
	   
	}

	@When("user select female as gender")
	public void user_select_female_as_gender() {
	   
	   
	}

	@When("user enters subhabtech{int}@gmail.com as email")
	public void user_enters_subhabtech_gmail_com_as_email(Integer int1) {
		driver.findElement(By.name("emailAddress")).sendKeys("subhabtech191@gmail.com");
	   
	   
	}

	@When("user enters {int} as phone number")
	public void user_enters_as_phone_number(Integer int1) {
		driver.findElement(By.name("mobileNumber")).sendKeys("9566569030");
	    
	   
	}

	@When("user select {int}\\/{int}\\/{int} as DOB")
	public void user_select_as_DOB(Integer int1, Integer int2, Integer int3) {
	   
	    throw new cucumber.api.PendingException();
	}

	@When("user enters tirupur,tamilnadu as address")
	public void user_enters_tirupur_tamilnadu_as_address() {
		driver.findElement(By.name("address")).sendKeys("tirupur,tamilnadu");
	   
	}

	@When("user select what is your pet name as security question")
	public void user_select_what_is_your_pet_name_as_security_question() {
	    
	   
	}

	@When("user enters rocy as answer for security question")
	public void user_enters_rocy_as_answer_for_security_question() {
		driver.findElement(By.name("answer")).sendKeys("rocy");
	    
	 
	}


}
