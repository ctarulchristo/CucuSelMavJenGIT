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
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}

	@Given("^User enters URL$")
	public void user_enters_URL() throws Throwable {
		System.out.println("user_enters_URL");
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
	}

	@And("^he enters user name$")
	public void he_enters_user_name() throws Throwable {
		System.out.println("he_enters_user_name");
		driver.findElement(By.id("Email")).sendKeys("vishnu@vmail.com");
	}

	@When("^he enters password$")
	public void he_enters_password() throws Throwable {
		System.out.println("he_enters_password");
		driver.findElement(By.id("Password")).sendKeys("123456");
	}

	@Then("^home page is discpalyed$")
	public void home_page_is_discpalyed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("home_page_is_discpalyed");
		// driver.findElement(By.xpath("//*[@value='Log in'])")).click();
		driver.findElement(
				By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"))
				.click();
	}
}
