package com.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Baseclass.Library;
import com.ReusableFunctions.SeleniumReusable;

import com.Utilities.Excelutility;

public class Searchpage extends Library{
	SeleniumReusable se;
	Excelutility excel;
	
	public Searchpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@name='q']")
	WebElement Search;
	
	
	@FindBy(xpath="//html[@lang='en']")
	WebElement Homepage;
	
	
	@FindBy(xpath="//html[@class=' fonts-loaded']")
	WebElement Searchresult;
	
	@FindBy(xpath="/html/body/div[2]/div/div/button")
	WebElement Popup;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div/div/div/div/a/div[2]/div[1]")
	List<WebElement> Entireresult;
	
	@FindBy(xpath="//*[@id='container']/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]")
	WebElement ThirdResult;
	
	
	public void handlepopup()
	{
		se=new SeleniumReusable(driver);
		se.click(Popup);
	}
	
	/*
	 * public void EnterSearch(String searchtext) throws IOException
	 * 
	 * {
	 * 
	 * se.EnterValue(Search,searchtext );
	 * 
	 * }
	 */
	
	
	
	/*
	 * public void Clicksearch() { Search.sendKeys(Keys.ENTER); }
	 */
	
public void homscreen()
{
	System.out.println(Homepage.isDisplayed());
}
	

public void Result()
{
	System.out.println(Searchresult.isDisplayed());
	System.out.println(driver.getTitle());
}

public void printentireresult()
{
	se.MultipleGettext(Entireresult);
}

public void Print3rdresult()
{
	se.Getvalue(ThirdResult);
}



	
}



