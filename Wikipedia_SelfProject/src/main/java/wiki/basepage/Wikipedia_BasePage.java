package wiki.basepage;

import java.io.IOException;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import stqa.utils.STQA_Utilities;

public class Wikipedia_BasePage 
{
	public static WebDriver driver;
	
	public static void setUp() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		Thread.sleep(1000);
		
		//Password: WiKi@QATest
		//UserName: QA.Test001
		
		driver.manage().deleteAllCookies();
		
//		//Selects English as the desired choice of language
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//div[@lang='en']")), 4);
//		driver.findElement(By.xpath("//div[@lang='en']")).click();
//		
//		Thread.sleep(1000);
//		
//		//Using Page Factory to get Log In button on the webpage
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//li[@id='pt-login-2']")), 4);
//		driver.findElement(By.xpath("//li[@id='pt-login-2']")).click();
//		
//		Thread.sleep(1000);
//		
//		//Username Field
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpName1']")), 4);
//		driver.findElement(By.xpath("//input[@id='wpName1']")).sendKeys("QA.Test001");
//		
//		
//		//Password Field
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//input[@id='wpPassword1']")), 4);
//		driver.findElement(By.xpath("//input[@id='wpPassword1']")).sendKeys("WiKi@QATest");
//		
//		Thread.sleep(1000);
//		
//		//logInButton_LogInPage
//		STQA_Utilities.getExplicitWait(driver.findElement(By.xpath("//button[@value='Log in']")), 4);
//		driver.findElement(By.xpath("//button[@value='Log in']")).click();
//		
//		Thread.sleep(1000);
//		
//		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Wikipedia_BasePage.setUp();
	}
}