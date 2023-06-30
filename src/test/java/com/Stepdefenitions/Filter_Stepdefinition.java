package com.Stepdefenitions;

import org.openqa.selenium.By;

import com.Baseclass.Library;
import com.Pages.Filter_page;
import com.ReusableFunctions.SeleniumReusable;

import io.cucumber.java.en.Then;

public class Filter_Stepdefinition extends Library{
	Filter_page fp;
	SeleniumReusable se;
	
	@Then("Select Minimum and Maximum Amount")
	public void select_Minimum_and_Maximum_Amount() throws InterruptedException {
		fp=new Filter_page(driver);
		String BeforeFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
		System.out.println("BEFORE FILTER :"+BeforeFilter);
		
		fp.Min();
		se=new SeleniumReusable(driver);
		se.waits();
		fp.max();
		se.waits();
	    
	}

	@Then("Select the Brand")
	public void select_the_Brand() throws InterruptedException {
		
		fp.brand();
		se.waits();
	    
	}

	@Then("Select the Ram")
	public void select_the_Ram() throws InterruptedException {
		fp.ram();
		se.waits();
	    
	}

	@Then("Select the Battery Capacity")
	public void select_the_Battery_Capacity() throws InterruptedException {
		
		fp.clickbattery();
		se.waits();
	}

	@Then("It should display the Relevant result")
	public void it_should_display_the_Relevant_result() {
		System.out.println("***************************");
		String AfterFilter=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div/div[2]/div[2]/div/div/div/a/div[2]/div[1]")).getText();
		System.out.println("After FILTER :"+AfterFilter);
		
	    
	}

}
