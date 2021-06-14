package stepDefinitions;
//below are the regular expressions to be used in Junit test cases but the 1st defined is a testNG type wxwcution 

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class regex_stepDef {
	
	@Given("I have {int} apples")
	public void i_have_apples(int int1) {
	   System.out.println("Apples I have" + int1);
	}

	@When("my friends wants (\\d+\\.\\d+) apples")
	public void my_friends_wants_apples(float double1) {
		System.out.println("Apples my firends want" + double1);
	}

	@And("my frineds name are \"(.*?)\" and \"(.*?)\"")
	public void my_frineds_name_are_and(String string, String string2) {
		System.out.println("My friends are" + string +" and "+ string2);
	}

	@Then("I split (\\d+) apple")
	public void i_split_apple(int int1) {
		System.out.println("How many apple i split? " + int1);
	}
}
