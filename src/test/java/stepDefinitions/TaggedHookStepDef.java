package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaggedHookStepDef {
	@Given("I am from first step")
	public void i_am_from_first_step() {
	    System.out.println("I am from first step");
	}

	@When("I am from second step")
	public void i_am_from_second_step() {
		 System.out.println("I am from second step");
	}

	@Then("I am from third step")
	public void i_am_from_third_step() {
		 System.out.println("I am from third step");
	}
}
