package Default;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class DemoCbr {
		
	@Given("^Jeff has brought microware for \\$(\\d+)$")
	public void jeff_has_brought_microware_for_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		System.out.println("Jeff brought microwave for "+arg1);
	}

	@Given("^Jeff has a receipt$")
	public void jeff_has_a_receipt() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jeff has receipt ");
	}

	@When("^Jeff returns the faulty microware$")
	public void jeff_returns_the_faulty_microware() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Jeff returning faulty product");
	}

	@Then("^Jeff should get refund of \\$(\\d+)$")
	public void jeff_should_get_refund_of_$(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Refund amount shoudl be "+arg1);
	}
	
}
