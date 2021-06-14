package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableWithExamples {
	WebDriver driver;

	@Given("she is on webpage")
	public void she_is_on_webpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell 7570\\OneDrive\\Documents\\Suren\\Java\\Testing_library\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.jobsportal.com/en-Jobseekers.html";
		driver.manage().window().maximize(); // this is to maximize the browser window when it opens up
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@And("she clicks the Login tab")
	public void she_clicks_the_login_tab() {
		driver.findElement(By.xpath("//a[@class='nav-link login-trigger']")).click();
	}

	@When("she enter the {} and {}")
	public void she_enter_the_below_credentials(String arg0, String arg1) {
		//
		driver.findElement(By.id("login-email")).sendKeys(arg0);
		driver.findElement(By.id("login-password")).sendKeys(arg1);
	}

	@And("she clicks the Login tab again")
	public void she_clicks_the_login_tab_again() {
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary custom-back-color']")).click();
		driver.quit();
	}

}
