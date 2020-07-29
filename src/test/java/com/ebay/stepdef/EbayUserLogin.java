package com.ebay.stepdef;

import com.ebay.common.ebaybase;
import com.ebay.pages.Homepage;
import com.ebay.pages.Signinpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EbayUserLogin extends ebaybase {
	
	Homepage hp;
	Signinpage sp;
	
	
	@Given("^I am on ebay homepage\\]$")
	public void i_am_on_ebay_homepage() { 
		LaunchBrowser ();
	}

	@When("^I click on Sign in button$")
	public void i_click_on_Sign_in_button() {
	  hp= new Homepage (driver);
	  hp.clickSignin();
	}

	@When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_my_and(String email, String pass)  {
		sp = new Signinpage(driver);
		sp.enterEmail(email);
		sp.enterPassword(pass);
    
	   }

	@Then("^I can see a succefully signed in message$")
	public void i_can_see_a_succefully_signed_in_message(){
	    
	}


}
