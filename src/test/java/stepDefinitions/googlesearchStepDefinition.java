package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class googlesearchStepDefinition {
	WebDriver dvr;

	@Given("^User is on google page$")
	public void launchGoogle() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\dell 7570\\OneDrive\\Documents\\Suren\\Java\\Testing_library\\drivers\\geckodriver.exe");
		String URL = "https://www.google.com/";
		dvr = new FirefoxDriver();
		dvr.get(URL);
		dvr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("enter the desired input")
	public void enter_the_desired_input() {
		WebElement ele =dvr.findElement(By.name("q"));
		ele.sendKeys("cricket");
		String text = ele.getAttribute("value");
		System.out.println("The Entered test is : " + text);
	}

	@And("clicks the search button")
	public void clicksearchbutton() {
		dvr.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user must see the search result")
	public void user_result() {
		boolean status = dvr
				.findElement(By.xpath("//h3[contains(text(),'IPL 2021 Live Cricket Score | Scorecard | Live Com')]"))
				.isDisplayed();
		System.out.println("Search Result displayed? :" + status);
	}

}
