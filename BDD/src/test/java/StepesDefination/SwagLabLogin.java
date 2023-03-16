package StepesDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabLogin {
	
	
	WebDriver driver;
	By username=By.id("user-name");
	By password=By.id("password");
	By login=By.id("login-button");
	
	@Given("User is on Sauce Demo Login Page")
	public void user_is_on_Sauce_Demo_Login_Page() throws InterruptedException {
	    
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
	    
	}

	@When("user enters valid username  and password")
	public void user_enters_valid_username_and_password() {
	    
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	}   

	@And("user clicks on Login Button")
	public void user_clicks_on_Login_Button() {
	   
		driver.findElement(By.id("login-button")).click();
	   
	}

	@Then("user is navigated to the  Sauce Demo Main Page")
	public void user_is_navigated_to_the_Sauce_Demo_Main_Page() {
	    
		System.out.println("Login Successfully");
		
		
	}

	@Then("user verify the App Logo")
	public void user_verify_the_App_Logo() {
	   
	
		WebElement  logo = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div[2]/div"));
		String text=logo.getText();
		System.out.println(text);
		
		driver.quit();
	    
	}

	@Given("user is on sauce login page")
	public void user_is_on_sauce_login_page() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);	
		
	    
	}

	@When("user enter  username and password")
	public void user_enter_username_and_password() {
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
	    
	}

	@And("user click on the Login Button")
	public void user_click_on_the_Login_Button() {
		
		driver.findElement(By.id("login-button")).click();
	}

	@Then("user verify the Error Message contain text {string}")
	public void user_verify_the_Error_Message_contain_text(String string) {
	 
		driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).click();
	System.out.println(driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]")).getText());
	  
	driver.quit();
	}
	
	
	
	
}



