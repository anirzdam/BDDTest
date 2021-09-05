package myproject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	WebDriver driver;
	
	@Given("^Open the browser and launch the webpage$")
	public void open_the_browser_and_launch_the_webpage() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\drivers\\Chrome\\chromedriver.exe");

		driver = new ChromeDriver(); 				
		driver.manage().window().maximize();			
		driver.get("https://surveymonkey.com/r/9MVSPYS");	
        System.out.println("This Step open the browser and launch the app.");

	    //throw new PendingException();
	}

	@When("^Select Good radio button$")
	public void select_Good_radio_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This step select radio button..");
	    driver.findElement(By.xpath("//span[contains(text(),'Good')]")).click();
	    //throw new PendingException();
	}

	@And("^Click Next button$")
	public void click_Next_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("This step click next button..");
	    driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
	    //throw new PendingException();
	}

	@Then("^Message is displayed$")
	public void message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
        System.out.println("This step asserting the message..");
        
	    String actualText = driver.findElement(By.xpath("//div[contains(text(),'Have a nice day.')]")).getText();
	    String expectedText = "Have a nice day.";
	    Assert.assertEquals(actualText, expectedText);
	    
	}
}
