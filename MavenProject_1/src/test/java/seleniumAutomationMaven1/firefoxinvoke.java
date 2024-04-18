package seleniumAutomationMaven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxinvoke {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://login.salesforce.com/");
		

	}

}
