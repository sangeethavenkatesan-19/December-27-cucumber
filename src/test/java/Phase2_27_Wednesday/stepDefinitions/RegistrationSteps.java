package Phase2_27_Wednesday.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	@Given("user on the hompage")
	public void user_on_the_hompage() {
		System.out.println("This step : user on the hompage.");
	}

	@Given("user follows {string} button")
	public void user_follows_button(String string) {
		System.out.println("This step : user follows {string} button.");
	}

	@Given("user should be on the registration page")
	public void user_should_be_on_the_registration_page() {
		System.out.println("This step : user should be on the registration page.");
	}

	@Given("user fills registration {string} with {string}")
	public void user_fills_registration_with(String string, String string2) {
		System.out.println("This step : user fills registration {string} with {string}.");
	}

	@Given("user clicks {string} button")
	public void user_clicks_button(String string) {
		System.out.println("This step : user clicks {string} button.");
	}
	
	@Then("User is created Successfully")
	public void user_is_created_successfully() {
		System.out.println("This step : User is created Successfully.");
	}
	
	@Then("user return back on registration page")
	public void user_return_back_on_registration_page() {
		System.out.println("This step : user return back on registration page.");
	}
	
	@When("user enters wrong characters")
	public void user_enters_wrong_characters() {
		System.out.println("This step : user enters wrong characters.");
	}
	
	@Then("error message displayed with invalid password")
	public void error_message_displayed_with_invalid_password() {
		System.out.println("This step : error message displayed with invalid password.");
	}
}	