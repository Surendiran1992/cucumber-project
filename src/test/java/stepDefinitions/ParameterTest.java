package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParameterTest {
	WebDriver driver;
	
	@Given("user is on jobportal page")
	public void user_is_on_jobportal_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell 7570\\OneDrive\\Documents\\Suren\\Java\\Testing_library\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.jobsportal.com/en-Jobseekers.html";
		driver.manage().window().maximize(); // this is to maximize the browser window when it opens up
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@And("he enters first name {string}")
	public void he_enters_first_name(String arg0) {
		driver.findElement(By.id("first_name")).sendKeys(arg0);
	}

	@And("he enters phone number {string}")
	public void he_enters_phone_number(String string) {
		driver.findElement(By.name("phone")).sendKeys(string);
	}

	@Given("he clicks on login button")
	public void he_clicks_on_login_button1() {
		driver.findElement(By.xpath("//a[@class='nav-link login-trigger']")).click();
	}

	@And("he enter the {string} and {string}")
	public void he_enter_the_credentials(String string, String string2) {
		driver.findElement(By.id("login-email")).sendKeys(string);
		driver.findElement(By.id("login-password")).sendKeys(string2);
	}

	@When("he clicks on Login Button")
	public void he_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary custom-back-color']")).click();
	}

	@Then("he must see the welocome page")
	public void he_must_see_the_welocome_page() {
		boolean status = driver.findElement(By.xpath("//h2[contains(text(),'Welcome Surendiran,')]")).isDisplayed();
		Assert.assertTrue(status);
	}
}
