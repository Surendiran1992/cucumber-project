package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataTableWithoutHeader {
	WebDriver driver;
	
	@Given("he is on webpage")
	public void he_is_on_webpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell 7570\\OneDrive\\Documents\\Suren\\Java\\Testing_library\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.jobsportal.com/en-Jobseekers.html";
		driver.manage().window().maximize(); // this is to maximize the browser window when it opens up
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@And("he clicks the Login tab")
	public void he_clicks_the_login_tab() {
		driver.findElement(By.xpath("//a[@class='nav-link login-trigger']")).click();
	}

	@When("he enter the below credentials")
	public void he_enter_the_below_credentials(DataTable dataTable) {
	   
		//we r getting the parameters in datatable to list and it stores in as indexes
		//and we r giving it as a index.
	    List<String> list = dataTable.asList();
	    driver.findElement(By.id("login-email")).sendKeys(list.get(0));
		driver.findElement(By.id("login-password")).sendKeys(list.get(1));
	    
	}

	@When("he clicks the Login tab again")
	public void he_clicks_the_login_tab_again() {
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary custom-back-color']")).click();
	}

}
