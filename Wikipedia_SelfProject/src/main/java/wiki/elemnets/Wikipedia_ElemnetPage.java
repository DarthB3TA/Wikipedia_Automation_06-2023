package wiki.elemnets;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wiki.basepage.Wikipedia_BasePage;

public class Wikipedia_ElemnetPage extends Wikipedia_BasePage
{	
	//This is a "Constructor". It CANNOT have static nor void
	public Wikipedia_ElemnetPage()
	{
		//You can use "Wikipedia_ElemnetPage.class" instead of "this"
		//"this" = this class
		PageFactory.initElements(driver, this);
	}
	
	//Encapsulation in our framework. We want to make our elements private.
	
	//Selects English as the desired choice of language
	@FindBy(xpath = "//div[@lang='en']")
	private WebElement English_Language;
	
	//Getters for English Language 
	public WebElement getEnglish_Language() {
		return English_Language;
	}
	//---------------------------------------------------------------------------

	//Log In Button on WebPage
	@FindBy(xpath = "//li[@id='pt-login-2']")
	private WebElement logInButton_WebPage;

	//Getters for Log In Button on WebPage
	public WebElement getLogInButton_WebPage() {
		return logInButton_WebPage;
	}
	//---------------------------------------------------------------------------
	
	//Log In Button on Log In Page
	@FindBy(xpath = "//button[@value='Log in']")
	private WebElement logInButton_LogInPage;
	
	//Getters for Log In Button on Log In Page
	public WebElement getLogInButton_LogInPage() {
		return logInButton_LogInPage;
	}
	//---------------------------------------------------------------------------
	
	//Username Field 
	@FindBy(xpath = "//input[@id='wpName1']")
	private WebElement userName_Field;
	
	//Getters for Username field
	public WebElement getUserName_Field() {
		return userName_Field;
	}
	//---------------------------------------------------------------------------
	
	//Password Field 
	@FindBy(xpath = "//input[@id='wpPassword1']")
	private WebElement passWord_Field;

	//Getters for Password Field
	public WebElement getPassWord_Field() {
		return passWord_Field;
	}
	
}