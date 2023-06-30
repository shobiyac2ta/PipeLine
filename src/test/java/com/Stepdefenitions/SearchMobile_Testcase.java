package com.Stepdefenitions;

import java.io.IOException;

import com.Baseclass.Library;
import com.Pages.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMobile_Testcase extends Library {
	 public static Searchpage sp;
	@Given("Launch the Flipkart Application")
	public void launch_the_Flipkart_Application() throws IOException {
		//launchapplication();
		
	}

	@When("Close the popup")
	public void close_the_popup() {
		 sp=new Searchpage(driver);
		  sp.handlepopup();
		System.out.println(driver.getTitle());
	    
	}

	@Then("It should Navigate to the Home page")
	public void it_should_Navigate_to_the_Home_page() {
	 
	  sp.homscreen();
		
	}

	@Given("User enter the Text in the Search field")
	public void user_enter_the_Text_in_the_Search_field(String searchtext) throws IOException {
		
		//sp.EnterSearch(searchtext);
	 
	}

	@When("Click the search button")
	public void click_the_search_button() {
		//sp.Clicksearch();
	    
	}

	@Then("It should navigate to the search result page and display the relevent details")
	public void it_should_navigate_to_the_search_result_page_and_display_the_relevent_details() {
		sp.Result();
		System.out.println(driver.getTitle());
	     
	}
	
	@Then("Extract the Results and print in console")
	public void extract_the_Results_and_print_in_console() {
		sp.printentireresult();
		System.out.println("*********************************************");
	    
	}

	@Then("Print the Third result and keep it in the console")
	public void print_the_Third_result_and_keep_it_in_the_console() {
		
		sp.Print3rdresult();
	    
	}

	

}
