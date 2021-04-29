package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {

	
	
	public static WebDriver driver;
	
	@Before
	public void beforeScenario() {
		String home = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", home+"\\target\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@After
	public void afterScenario() {
		driver.quit();
	}
	
}
