package seleniumAutomationMaven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testNG_test1 {
	@Test
	
	public void firefoxinvoketest()
	{
        WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/");
	}

}
