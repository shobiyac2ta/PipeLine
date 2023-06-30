package com.ReusableFunctions;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Baseclass.Library;

import io.cucumber.java.Scenario;

public class SeleniumReusable extends Library {
	Actions act;
	public SeleniumReusable(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void EnterValue(WebElement element,String Text)
	{
		try
		{
			element.sendKeys(Text);
			logger.info("****************Entered value*****");
		}
		catch(Exception e)
		{
			System.out.println("No such element Exception");
		}
		
		
	}
	
	public void click(WebElement elemnt)
	{
		
		try {
			
			elemnt.click();
			logger.info("****************Clicked Button*****");
		}
		
		catch(Exception e)
		{
			System.out.println("Nosuchelement Exception");
		}
	}
	

	public void gettitle() {

		try
		{
			System.out.println(driver.getTitle());
		}
		catch(Exception e)
		{
			System.out.println("Couldnt get the Title");
		}
		
	}
	
	
	public void MultipleGettext(List<WebElement> element)
	{
		
		
		List<WebElement> text=element;
		System.out.println(text.size());
		
		for(WebElement textcount:text)
		{
			String Totallist=textcount.getText();
			System.out.println("***************************************************");
			System.out.println(Totallist);
			
		}
	}
	
	public void Getvalue(WebElement element)
	{
		
		String Text=element.getText();
		System.out.println(Text);
		
	}
	public void dropdown(WebElement element, String Text) {

Select drp=new Select(element);
drp.selectByValue(Text);
	}
	
	public void Scrolldown(WebElement eleemnt) {

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", eleemnt);
		
	}
	
	public void waits() throws InterruptedException
	{
		Thread.sleep(2000);
	}

	
	public void mousehover(WebElement element) {

act=new Actions(driver);
act.moveToElement(element).build().perform();
	}
	
	public void movelement(WebElement element) {
		act.moveToElement(element).click().build().perform();
	}
	
	public void screenshot(String path) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		try
		{
			FileUtils.copyFile(source, new File(path));
		}
		catch(Exception e)
		{
			System.out.println("Couldnt take screenshot");
		}

	}
	
	public void windowhandling(WebElement element) {
		String parrentwindow=driver.getWindowHandle();
		element.click();
		System.out.println(parrentwindow);
		
		Set<String>allwindow=driver.getWindowHandles();
		System.out.println(allwindow.size());
		for(String Childwindow:allwindow)
		{
			driver.switchTo().window(Childwindow);
			System.out.println(Childwindow);
		}


	}
	
	public void attachscreenshot(Scenario CucumberScenario) {
		
		
		final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		CucumberScenario.attach(screenshot, "image/png", "FlipkartAutomation");

		
	}
	
	public void closeapp() {

driver.close();
System.out.println("Browser closed");
	}

public void navigateback() {

driver.navigate().back();
}
}
