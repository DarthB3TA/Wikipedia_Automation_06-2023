package wiki.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stqa.utils.STQA_Utilities;
import wiki.basepage.Wikipedia_BasePage;
import wiki.elemnets.Wikipedia_ElemnetPage;

public class Wikipedia_NegativeUser_StepDefinition  extends Wikipedia_BasePage
{
	//Connecting the StepDefinition to the Wikipedia Element Page
	Wikipedia_ElemnetPage pf = PageFactory.initElements(driver, Wikipedia_ElemnetPage.class);
	
	@Given("User opens the browser")
	public void user_opens_the_browser() throws InterruptedException, IOException {
	    
		//Has been moved to Wikipedia_Hook
		//Wikipedia_BasePage.setUp();
	}

	@Given("Naviagtes to {string}")
	public void naviagtes_to(String string) {
	    
	    
	}

	@Given("User selects English as the desired choice of language")
	public void user_selects_english_as_the_desired_choice_of_language() {
	    
		//Selects English as the desired choice of language
		
		//Using Page Factory
		STQA_Utilities.getExplicitWait(pf.getEnglish_Language(), 5);
		pf.getEnglish_Language().click();
		
//		--------------------------------------------------------------------------------------------		
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@lang='en']")), 4);
//		driver.findElement(By.xpath("//div[@lang='en']")).click();
	}

	@When("User clicks on the Log In button on the webpage and taken to the Log In page")
	public void user_clicks_on_the_log_in_button_on_the_webpage_and_taken_to_the_log_in_page() {
	    
		//Log In button on the webpage
		
		//Using Page Factory
		STQA_Utilities.getExplicitWait(pf.getLogInButton_WebPage(), 5);
		pf.getLogInButton_WebPage().click();
		
//		--------------------------------------------------------------------------------------------		
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//li[@id='pt-login-2']")), 4);
//		driver.findElement(By.xpath("//li[@id='pt-login-2']")).click();
	}

	@When("User enters incorret {string} and incorrect {string}")
	public void user_enters_incorret_and_incorrect(String Username, String Password) {
	    
		//Username Field, send keys
		
		//Using Page Factory
		STQA_Utilities.getExplicitWait(pf.getUserName_Field(), 5);
		pf.getUserName_Field().sendKeys(Username);
		
//		--------------------------------------------------------------------------------------------				
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpName1']")), 4);
//		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys(Username);
		
//		**********  **********  **********  **********  **********  **********  **********  **********
		
		//Password Field, send keys
		
		//Using Page Factory
		STQA_Utilities.getExplicitWait(pf.getPassWord_Field(), 5);
		pf.getPassWord_Field().sendKeys(Password);
		
//		--------------------------------------------------------------------------------------------			
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpPassword1']")), 4);
//		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys(Password);
	}

	@Then("Clicks on the Log In button on the Log In page")
	public void clicks_on_the_log_in_button_on_the_log_in_page() {
	    
		//logInButton_LogInPage
		
		//Using Page Factory
		STQA_Utilities.getExplicitWait(pf.getLogInButton_LogInPage(), 5);
		pf.getLogInButton_LogInPage().click();
		
//		--------------------------------------------------------------------------------------------			
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@value='Log in']")), 4);
//		driver.findElement(By.xpath("//button[@value='Log in']")).click();
	}

	@Then("The user is expected to get an error message")
	public void the_user_is_expected_to_get_an_error_message() throws InterruptedException, IOException {
	    
		//Red Highlight Error Box
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@id='userloginForm']")), 5);
		STQA_Utilities.getHighligterRed(driver.findElement(By.xpath("//div[@id='userloginForm']")));
		
		Thread.sleep(500);
		
		STQA_Utilities.takeScreenshot();
		
		Thread.sleep(1000);
		
		//Has been moved to Wikipedia_Hook
		//driver.quit();	
	}
}