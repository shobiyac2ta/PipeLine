package com.Stepdefenitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.Searchexcelpage;
import com.Pages.Searchpage;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchWithExcel_Stepdefinition extends Library {
	
	Searchexcelpage sp;
	//SeleniumReusable re;
	
	
	@Given("Enter Search Text In the Search Field")
	public void enter_Search_Text_In_the_Search_Field() throws IOException, InterruptedException {
		
		sp=new Searchexcelpage(driver);
		//re=new SeleniumReusable(driver);
		sp.Searchwithexcel();
		
	    
	}

	@When("Click search Icon")
	public void click_search_Icon() {
		
		
		//re.screenshot("src/test/resources/Screenshots/excelsearch.png");
	   
	}

	@Then("It Should Display The Relevent Result")
	public void it_Should_Display_The_Relevent_Result() {
		//re.gettitle();
	    
	}

}
