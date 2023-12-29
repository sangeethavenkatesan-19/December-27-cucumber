package Phase2_27_Wednesday.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reset_passwordSteps {
	@Given("user should be on the logged In")
	public void user_should_be_on_the_logged_in() {
		System.out.println("This step : user should be on the logged In.");
	}

	@Given("user navigate to reset password page {string}")
	public void user_navigate_to_reset_password_page(String string) {
		System.out.println("This step : .");	    
	}

	@When("user ask to reset my password")
	public void user_ask_to_reset_my_password() {
		System.out.println("This step : user navigate to reset password page {string}.");
	}

	@Then("user should review an email with:")
	public void user_should_review_an_email_with(String docString) {
		System.out.println("This step : user should review an email with:.");
	}

	@When("user check for {string} and {string} fields")
	public void user_check_for_and_fields(String string, String string2) {
		System.out.println("This step : user check for {string} and {string} fields.");
	}
}
