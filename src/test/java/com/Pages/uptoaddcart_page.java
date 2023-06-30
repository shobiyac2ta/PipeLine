package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

public class uptoaddcart_page extends Library {
	
	SeleniumReusable se;
	public uptoaddcart_page(WebDriver driver) {

this.driver=driver;
PageFactory.initElements(driver, this);
}
	
	@FindBy(linkText="Login")
	WebElement Loginlink;
	
	@FindBy(xpath="//div[text()='Flipkart Plus Zone']")
	WebElement Flipkartpluszone;
	
	@FindBy(xpath="//span[text()='Home & Furniture']")
	WebElement Homefurniturelink;
	
	@FindBy(linkText="Wall Lamp")
	WebElement Walllamplink;
	
	@FindBy(xpath="//div[@data-id='WLMGGY4KJA8S27YP']/div")
	WebElement clickonelamp;
	
	@FindBy(id="pincodeInputIdd")
	WebElement Pincode;
	
	@FindBy(xpath="//span[text()='Check']")
	WebElement checklink;
	
	
	public void Moveloginlink() {
		se=new SeleniumReusable(driver);
		se.mousehover(Loginlink);
	}
	public void Moveflipkartplus()
	{
		se.movelement(Flipkartpluszone);
	}
	
	public void movehomefurniture() {

se.mousehover(Homefurniturelink);
	}

	
	public void clickwalllamp() {
se.movelement(Walllamplink);
	}
	
	public void clickoneresult() {
		se.Scrolldown(clickonelamp);

	}
	public void enterpincode() {
		
		se.windowhandling(clickonelamp);
		Pincode.sendKeys("600083");

	}
	
	public void Clickchecklink() {
se.click(checklink);
	}
	
	
}
