package wiki.hooks;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import wiki.basepage.Wikipedia_BasePage;

public class Wikipedia_Hook extends Wikipedia_BasePage
{
	//Import from io.cucumber
	@Before
	public static void initialize() throws InterruptedException, IOException
	{
		Wikipedia_BasePage.setUp();
	}
	
	//Import from io.cucumber
	@After
	public static void tearDown()
	{
		driver.quit();
	}
}