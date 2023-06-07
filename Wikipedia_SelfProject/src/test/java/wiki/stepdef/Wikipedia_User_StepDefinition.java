package wiki.stepdef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stqa.utils.STQA_Utilities;
import wiki.basepage.Wikipedia_BasePage;
import wiki.elemnets.Wikipedia_ElemnetPage;

public class Wikipedia_User_StepDefinition extends Wikipedia_BasePage
{
	//Connecting the StepDefinition to the Wikipedia Element Page
	Wikipedia_ElemnetPage pf = PageFactory.initElements(driver, Wikipedia_ElemnetPage.class);
	
	//Background  **********  **********  **********  **********  **********  **********  **********
	
	@Given("User opens browser")
	public void user_opens_browser() throws InterruptedException, IOException {
	    
		Wikipedia_BasePage.setUp();
	}

	@Given("Navigates to {string}")
	public void navigates_to(String string) {
	    
	    
	}

	@Given("Selects English as the desired choice of language")
	public void selects_english_as_the_desired_choice_of_language() {
	    
		//Selects English as the desired choice of language
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@lang='en']")), 4);
		driver.findElement(By.xpath("//div[@lang='en']")).click();
	}

	@When("User clicks on the Log In button on the webpage")
	public void user_clicks_on_the_log_in_button_on_the_webpage() {
	    
		//Using Page Factory to get Log In button on the webpage
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//li[@id='pt-login-2']")), 4);
		driver.findElement(By.xpath("//li[@id='pt-login-2']")).click();
	}

	@When("User enters the correct username")
	public void user_enters_the_correct_username() {
	    
		//Username Field
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpName1']")), 4);
		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("QA.Test001");
	}

	@When("User enters the correct password")
	public void user_enters_the_correct_password() {
	    
		//Password Field
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpPassword1']")), 4);
		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("WiKi@QATest");
	}

	@Then("Clicks on the Log In button on the log in page")
	public void clicks_on_the_log_in_button_on_the_log_in_page() {
	    
		//logInButton_LogInPage
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@value='Log in']")), 4);
		driver.findElement(By.xpath("//button[@value='Log in']")).click();
	}

	@Then("The user is successfully logged in")
	public void the_user_is_successfully_logged_in() throws InterruptedException {
	    
		Thread.sleep(500);
	}

	@Then("The user name is displayed and taken to the home page")
	public void the_user_name_is_displayed_and_taken_to_the_home_page() throws InterruptedException {
	    
		Thread.sleep(500);
		
		//Set String Values
		String ExpectedUN = "QA.Test001";
		String ActualUN = driver.findElement(By.xpath("//li[@id='pt-userpage-2']")).getText();
		
		//Assert from TestNG
		Assert.assertEquals(ActualUN, ExpectedUN);
		
		//Print Expected and Actual
		System.out.println("\n****Assert Username****");
		System.out.println("\nActual Username:\t " + ActualUN);
		System.out.println("Expected Username:\t " + ExpectedUN + "\n");
	}
	
	@Given("The user is logged in and on the home page")
	public void the_user_is_logged_in_and_on_the_home_page() throws InterruptedException {
	    
		//Print Home Page Title
		System.out.println("\nHome Page Title: " + driver.getTitle() + "\n");
		
		Thread.sleep(1000);
	}

	@When("User clicks on the search field")
	public void user_clicks_on_the_search_field() {
	    
		//Click on the Search Field 
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("(//input[@name='search'])[1]")), 5);
		driver.findElement(By.xpath("(//input[@name='search'])[1]")).click();
	}

	@When("Enters {string} on the search field")
	public void enters_on_the_search_field(String string) throws InterruptedException { 
		 
		Thread.sleep(500);
		
		//Send "Formula One" to the Search Field 
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("(//input[@name='search'])[1]")), 5);
		driver.findElement(By.xpath("(//input[@name='search'])[1]")).sendKeys("Formula One");
	}

	@When("User clicks on the Search button")
	public void user_clicks_on_the_search_button() throws InterruptedException {
	    
		Thread.sleep(500);
		
		//Click on the Search Button
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("(//button[text()='Search'])[1]")), 5);
		driver.findElement(By.xpath("(//button[text()='Search'])[1]")).click();
	}

	@Then("User is able to see the search results")
	public void user_is_able_to_see_the_search_results() throws IOException, InterruptedException {
	    
		//Print Home Page Title
		System.out.println("\nHome Page Title: " + driver.getTitle() + "\n");
		
		//Green Highlight Title of Page
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//h1[@id='firstHeading']")), 5);
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("//h1[@id='firstHeading']")));
		
		//Green Highlight Info Box
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//table[@class='infobox vcard']")), 5);
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("//table[@class='infobox vcard']")));
		
		Thread.sleep(500);
		
		//Take Screenshot
		STQA_Utilities.takeScreenshot();
	}
	
	@When("User clicks on the Contents icon to open menu")
	public void user_clicks_on_the_contents_icon_to_open_menu() throws InterruptedException {
	    
		Thread.sleep(500);
		
		//Contents Menu Click
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@id='vector-page-titlebar-toc']")), 5);
		driver.findElement(By.xpath("//div[@id='vector-page-titlebar-toc']")).click();
	}

	@When("User toggles on the Grands Prix dropdown")
	public void user_toggles_on_the_grands_prix_dropdown() throws InterruptedException {
	    
		Thread.sleep(500);
		
		//Grands Prix Dropdown Click
	    STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@aria-controls='toc-Grands_Prix-sublist']")), 5);
	    driver.findElement(By.xpath("//button[@aria-controls='toc-Grands_Prix-sublist']")).click();
	}

	@When("Clicks on the Future Grands Prix option")
	public void clicks_on_the_future_grands_prix_option() throws InterruptedException {
	    
		Thread.sleep(500);
		
		//"Future Grands Prix" Option Click
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//li[@id='toc-Future_Grands_Prix']")), 5);
	    driver.findElement(By.xpath("//li[@id='toc-Future_Grands_Prix']")).click();
	}

	@Then("User is taken to Future Grand Prix source")
	public void user_is_taken_to_future_grand_prix_source() throws InterruptedException, IOException {
	    
		Thread.sleep(500);
		
		//"Future Grands Prix" Green Highlight 
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//span[text()='Future Grands Prix']")), 5);
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("//span[text()='Future Grands Prix']")));
		
		//"Future Grands Prix" Chart Green Highlight
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("(//table[@class='wikitable sortable jquery-tablesorter'])[2]")), 5);
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("(//table[@class='wikitable sortable jquery-tablesorter'])[2]")));
		
		//Assert Dropdown Navigation Result
		String Expected_DropdownResult = "Future Grands Prix";
		String Actual_DropdownResult = driver.findElement(By.xpath("//span[text()='Future Grands Prix']")).getText();
		
		Assert.assertEquals(Actual_DropdownResult, Expected_DropdownResult);
		
		//Print Assert 
		System.out.println("\n****Assert Dropdown Navigation Results****");
		System.out.println("\nActual Navigation Result:\t " + Actual_DropdownResult);
		System.out.println("Expected Navigation Result:\t " + Expected_DropdownResult + "\n");
		
		//Take Screenshot
		STQA_Utilities.takeScreenshot();
		
		Thread.sleep(1000);
	}

	@Then("User scrolls down to Revenue and Profits source")
	public void user_scrolls_down_to_revenue_and_profits_source() throws InterruptedException, IOException {
	    
		//Scroll to "Revenue and Profits" and Explicit Wait
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//span[text()='Revenue and profits']")), 5);
		STQA_Utilities.elemrntScroll(driver.findElement(By.xpath("//span[text()='Revenue and profits']")));
		
		Thread.sleep(600);
		
		//"Revenue and Profits" Green Highlight
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("//span[text()='Revenue and profits']")));
		
		//"Revenue and Profits" Pie Chart Green Highlight
		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("(//div[@class='thumbinner'])[22]")), 5);
		STQA_Utilities.getHighligterGreen(driver.findElement(By.xpath("(//div[@class='thumbinner'])[22]")));
		
		Thread.sleep(2000);
		
		//Take Screenshot
		STQA_Utilities.takeScreenshot();
		
		driver.quit();
	}
}