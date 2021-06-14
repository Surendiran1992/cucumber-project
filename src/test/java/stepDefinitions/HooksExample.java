package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksExample {
	@Given("BruceWayne is a Batman")
	public void bruce_wayne_is_a_batman() {
	    System.out.println("BruceWayne becomes the Batman");
	}

	@And("he saves gotham city from badguys")
	public void he_saves_gotham_city_from_badguys() {
		System.out.println("Batman saves the city from badguys");
	}

	@When("joker tries to ruin the city")
	public void joker_tries_to_ruin_the_city() {
		System.out.println("joker tries to ruin the city");
	}

	@And("batman fights with joker")
	public void batman_fights_with_joker() {
		System.out.println("batman fights with joker");
	}

	@Then("batman saves the city")
	public void batman_saves_the_city() {
		System.out.println("batman saves the gotham city from joker");
	}
}
