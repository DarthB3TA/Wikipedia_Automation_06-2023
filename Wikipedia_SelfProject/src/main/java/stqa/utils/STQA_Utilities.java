package stqa.utils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import wiki.basepage.Wikipedia_BasePage;

public class STQA_Utilities extends Wikipedia_BasePage
{
	//Clicking Challenges/Scrolling Utilities
	
	//Action Class. It is from Selenium
	public static void actionClick(WebElement element)
	{
		Actions action = new Actions(driver);
		action.click(element).build().perform();
	}
	
	//JavaScript Click (From JavaScript Executer)
	public static void jsClick(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("arguments[0].click", element);
	}
	
	//JavaScript Scrolling (From JavaScript Executer)
	public static void elemrntScroll(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("arguments[0].scrollIntoView()", element);
	}
	
	//JavaScript Scroll To Bottom (From JavaScript Executer)
	public static void ScreollToBottomPage()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//JavaScript Scroll To Top (From JavaScript Executer)
	public static void ScreollToTopPage()
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("window.scrollTo(0,0)");
	}
	
	//***************************************************************************************************************************
	//Error Utilities
	
	//Screenshots
	public static void takeScreenshot() throws IOException
	{
		Date currentDate = new Date();
		System.out.println(currentDate);
		String screenshotfilename = currentDate.toString().replace(" ", "-").replace(":", "-");
		
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir") + ".//Screenshots//" + screenshotfilename + ".png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
	}
	
	//Highlight
	public static void getHighligterRed(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("arguments[0].setAttribute('style','background: Pink; border: 4px solid PaleVioletRed;');", element);
	}
	
	public static void getHighligterGreen(WebElement element)
	{
		JavascriptExecutor executor = (JavascriptExecutor) driver; //Casting - changing
		executor.executeScript("arguments[0].setAttribute('style','background: LightGreen; border: 4px solid SeaGreen;');", element);
	}
	
	//***************************************************************************************************************************
	
	//Waits
	
	//Explicit Wait
	public static WebElement getExplicitWait(WebElement element, long time)
	{
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement elem = wait.until(ExpectedConditions.elementToBeClickable(element));
		return elem;
	}
	
	//***************************************************************************************************************************

}
