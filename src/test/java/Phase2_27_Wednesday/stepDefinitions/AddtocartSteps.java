package Phase2_27_Wednesday.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddtocartSteps {
	@Given("User search for a product {string}")
	public void user_search_for_a_product(String string) {
		System.out.println("This step : User search for a product {string}.");
	}

	@When("Add the first laptop that apears in the search results to the basket")
	public void add_the_first_laptop_that_apears_in_the_search_results_to_the_basket() {
		System.out.println("This step : Add the first laptop that apears in the search results to the basket.");
	}

	@When("User clicks on {string} link")
	public void user_clicks_on_link(String string) {
		System.out.println("This step : User clicks on {string} link.");
	}

	@Then("User basket should display added {int} items")
	public void user_basket_should_display_added_items(Integer int1) {
		System.out.println("This step : User basket should display added {int} items.");
	}

}
