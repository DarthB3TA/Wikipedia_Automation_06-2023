package wiki.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stqa.utils.STQA_Utilities;
import wiki.basepage.Wikipedia_BasePage;

public class Wikipedia_NegativeUser_StepDefinition  extends Wikipedia_BasePage
{
	@Given("User opens the browser")
	public void user_opens_the_browser() throws InterruptedException, IOException {
	    
		Wikipedia_BasePage.setUp();
	}

	@Given("Naviagtes to {string}")
	public void naviagtes_to(String string) {
	    
	    
	}

	@Given("User selects English as the desired choice of language")
	public void user_selects_english_as_the_desired_choice_of_language() {
	    
		//Selects English as the desired choice of language
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@lang='en']")), 4);
		driver.findElement(By.xpath("//div[@lang='en']")).click();
	}

	@When("User clicks on the Log In button on the webpage and taken to the Log In page")
	public void user_clicks_on_the_log_in_button_on_the_webpage_and_taken_to_the_log_in_page() {
	    
		//Using Page Factory to get Log In button on the webpage
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//li[@id='pt-login-2']")), 4);
		driver.findElement(By.xpath("//li[@id='pt-login-2']")).click();
	}

	@When("User enters incorret {string} and incorrect {string}")
	public void user_enters_incorret_and_incorrect(String Username, String Password) {
	    
		//Username Field
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpName1']")), 4);
		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys(Username);
		
		//Password Field
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpPassword1']")), 4);
		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys(Password);
	}

	@Then("Clicks on the Log In button on the Log In page")
	public void clicks_on_the_log_in_button_on_the_log_in_page() {
	    
		//logInButton_LogInPage
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@value='Log in']")), 4);
		driver.findElement(By.xpath("//button[@value='Log in']")).click();
	}

	@Then("The user is expected to get an error message")
	public void the_user_is_expected_to_get_an_error_message() throws InterruptedException, IOException {
	    
		//Red Highlight Error Box
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@id='userloginForm']")), 5);
		STQA_Utilities.getHighligterRed(driver.findElement(By.xpath("//div[@id='userloginForm']")));
		
		Thread.sleep(500);
		
		STQA_Utilities.takeScreenshot();
		
		Thread.sleep(500);
		
		driver.quit();	
	}
}