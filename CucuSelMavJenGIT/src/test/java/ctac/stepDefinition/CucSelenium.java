package ctac.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucSelenium {

	WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("User enters url")
	public void user_enters_url() {
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	}

	@And("He enters userName")
	public void he_enters_userName() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Email")).sendKeys("vishnu@vmail.com");
	}

	@When("He enters password")
	public void he_enters_password() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Password")).sendKeys("123456");
	}

	@Then("Home page is displayed")
	public void home_page_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("home page");
		// driver.findElement(By.xpath("//*[@value='Log in'])")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
	}
}
