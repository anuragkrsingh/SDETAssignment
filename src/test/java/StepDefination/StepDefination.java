package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.hooks;

public class StepDefination {
	private WebDriver driver=hooks.driver;
	/*
	 * waiting for element explicitly
	 */
			public boolean waitForElementToBeLoad(String xpath){ 
			boolean status = false;
			try {
				WebDriverWait waitObj = new WebDriverWait(driver, 60);
				waitObj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			} catch (Exception e) {
				status = true;
				System.out.println("NO element found with Xpath : "+xpath);
			}
			return status;
		}
			
	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get(url);
	}
	@When("^Click Sign up$")
	public void click_Sign_up() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElementToBeLoad("//a[contains(text(),' Sign up')]");
		driver.findElement(By.xpath("//a[contains(text(),' Sign up')]")).click();
	}

	@When("^Register by filling mandatory fields \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void register_by_filling_mandatory_fields_and(String firstname, String lastname, String email, String username, String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete action
		waitForElementToBeLoad("//input[@name='firstname']");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='pass1']")).sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pass2']")).sendKeys(pass);
		Thread.sleep(1000);
	}

	@When("^click register$")
	public void click_register() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@name='submit']")).click();
	}

	@Then("^Validate registration confirmation message$")
	public void validate_registration_confirmation_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElementToBeLoad("//p[contains(text(),'An e-mail has been sent to remind you of your login and password')]");
		driver.findElement(By.xpath("//p[contains(text(),'An e-mail has been sent to remind you of your login and password')]")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//p[contains(text(),'An e-mail has been sent to remind you of your login and password')]/..")).getText());
	}

	@When("^Click on top rigth corner$")
	public void click_on_top_rigth_corner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
	}

	@When("^Validate \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void validate_and(String firstname, String lastName, String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElementToBeLoad("//p[@class='name']/../following-sibling::p");
		String concat=firstname+" "+lastName;
		String name=driver.findElement(By.xpath("//p[@class='name']")).getText();
		String em=driver.findElement(By.xpath("//p[@class='name']/../following-sibling::p")).getText();
		if(name.equals(concat))
			System.out.println("\n first name last name matched");
		else
			System.out.println("\n first name last name not matched "+name+":"+concat);
		if(email.equals(em))
			System.out.println("\n email matched");
		else
			System.out.println("\n email not matched "+email+":"+em);
	}

	@When("^Click inbox$")
	public void click_inbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[@title='Inbox']")).click();
	}

	@When("^Compose a message \"([^\"]*)\"and send it to \"([^\"]*)\"$")
	public void compose_a_message_and_send_it_to(String message, String recipent) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		waitForElementToBeLoad("//img[@title='Compose message']");
		driver.findElement(By.xpath("//img[@title='Compose message']")).click();
		waitForElementToBeLoad("//label[contains(text(),'Send to')]/following::input[1]");
		driver.findElement(By.xpath("//label[contains(text(),'Send to')]/following::input[1]")).sendKeys(recipent);
		waitForElementToBeLoad("//li[contains(text(),'virat kohli')]");	
		driver.findElement(By.xpath("//li[contains(text(),'virat kohli')]")).click();
		driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys("Subject");
		waitForElementToBeLoad("//iframe[@class='cke_wysiwyg_frame cke_reset']");
		Thread.sleep(4000);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
				driver.switchTo().frame(frame);
				waitForElementToBeLoad("//body");
				
				driver.findElement(By.xpath("//body")).click();
				waitForElementToBeLoad("//body/p");
		driver.findElement(By.xpath("//body/p")).sendKeys(message);	
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();		
				
	}

	@Then("^Validate the message sent acknowledgement message$")
	public void validate_the_message_sent_acknowledgement_message() throws Throwable {
	    waitForElementToBeLoad("//div[contains(text(),'The message has been sent to')]");
	    if(driver.findElement(By.xpath("//div[contains(text(),'The message has been sent to')]")).isDisplayed())
	    	System.out.println("\n Message Sent and Validated");
	    else
	    	System.out.println("\n Failed to send message");
	}

}
