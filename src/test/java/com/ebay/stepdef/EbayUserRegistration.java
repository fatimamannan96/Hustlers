package com.ebay.stepdef;

import com.ebay.common.ebaybase;
import com.ebay.pages.Signinpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayUserRegistration extends ebaybase {
	
	Signinpage sp;

	@Given("^I am on  homepage$")
	public void i_am_on_homepage(){
		LaunchBrowser ();
	    
	}

	@When("^I click on Register$")
	public void i_click_on_Register() {
	    
	}

	@When("^enter my \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void enter_my(String arg1, String arg2, String arg3, String arg4)  {
	   
	}

	@Then("^I can see a successfully account created message$")
	public void i_can_see_a_successfully_account_created_message() {
	    
	}

	
}
