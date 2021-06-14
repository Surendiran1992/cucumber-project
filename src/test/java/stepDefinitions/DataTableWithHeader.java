package stepDefinitions;

import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.List;
import java.util.Map;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataTableWithHeader {
	WebDriver driver;
	@Given("user is on webpage")
	public void user_is_on_webpage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell 7570\\OneDrive\\Documents\\Suren\\Java\\Testing_library\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		String URL = "https://www.jobsportal.com/en-Jobseekers.html";
		driver.manage().window().maximize(); // this is to maximize the browser window when it opens up
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@And("user clicks the Login tab")
	public void user_clicks_the_login_tab() {
		driver.findElement(By.xpath("//a[@class='nav-link login-trigger']")).click();
	}

	@When("user enter the below credentials")
	public void user_enter_the_below_credentials(DataTable dataTable) {
	    
		//we r mapping the parameters in datatable using Map class
		//and storing it as a keyvalue pair in a list
		//and we r giving it as a index.
		List<Map<String,String>> list = dataTable.asMaps(String.class,String.class);
		driver.findElement(By.id("login-email")).sendKeys(list.get(0).get("UserName"));
		driver.findElement(By.id("login-password")).sendKeys(list.get(0).get("Password"));
	}

	@When("user clicks the Login tab again")
	public void user_clicks_the_login_tab_again() {
		driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary custom-back-color']")).click();
	}
}
