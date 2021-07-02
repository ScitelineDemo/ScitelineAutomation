package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Screenshot;

public class Patients {
	WebDriver driver;
	PageModel page;
	@Given("^website is Launching through url on browser$")
	public void website_is_Launching_through_url_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		String actual = driver.getTitle();
		String expected = "Sciteline";
		if (actual.equals(expected)) {
			Assert.assertEquals(actual, expected);

			System.out.println("pass");

		} else {
			System.out.println("fail");
		}
	}

	@Then("^click on patients menu bar to validate user is able to click on patients or not$")
	public void click_on_patients_menu_bar_to_validate_user_is_able_to_click_on_patients_or_not() throws Throwable {
	   page.Patients.click();
	   Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,900)");
	}

	@Then("^validate user is able to show steps of how it works$")
	public void validate_user_is_able_to_show_steps_of_how_it_works() throws Throwable {
		
	Thread.sleep(2000);
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.value-prop > div:nth-child(2) > div.text-container > p.value-prop-title")).getText();
	System.out.println("actual text is=" +actual);
		String expected="Find clinical trials right for you";
	if(actual.equals(expected)) {
		System.out.println("pass");
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	}
	else {
		
		System.out.println("fail");
	}
	Thread.sleep(2000);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(900,980)");
	  String actual1=driver.findElement(By.
	  cssSelector("#root > div > div > main > section.container.value-prop > div:nth-child(3) > div.text-container > p.value-prop-title"
	  )).getText();
	  String expected1="Review list of personalized results";
	 if(actual1.equals(expected1)) {
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  
	  } 
	 Thread.sleep(2000);
	 JavascriptExecutor jsee = (JavascriptExecutor) driver;
	  jsee.executeScript("window.scrollBy(980,1000)");
	 String actual2=driver.findElement(By.
	  cssSelector("#root > div > div > main > section.container.value-prop > div:nth-child(4) > div.text-container > p.value-prop-title"
	  )).getText(); String expected2="Get in contact";
	  if(actual2.equals(expected2)) {
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  
	  }
	 
	}

	@Then("^verify user is able to view related studies or not$")
	public void verify_user_is_able_to_view_related_studies_or_not() throws Throwable {
		Thread.sleep(2000);
	  String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.pb-5 > div.row.related-study-grid > div.related-study-heading.col-md-12")).getText();
	String expected="Popular studies";
	if(actual.equals(expected)) {
		Assert.assertEquals(actual, expected);
	System.out.println("pass");
		
	
	}
	else {
		
		System.out.println("fail");
	}
	
}

	@Then("^click on any popular study and verify user should be able to view related study detail information or not$")
	public void click_on_any_popular_study_and_verify_user_should_be_able_to_view_related_study_detail_information_or_not() throws Throwable {
	   
		
	
		WebElement e=driver.findElement(By.cssSelector("#root > div > div > main > section.container.pb-5 > div.row.related-study-grid > div.desktop > div > div:nth-child(1) > div > div.card-body > a > h4"));
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		String actual=e.getText();
	System.out.println("actual text is=" +actual);
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", e);
	Thread.sleep(4000);
	  String expected=driver.findElement(By.cssSelector("#root > div > div > main > section:nth-child(1) > div > div > div > div > div.col-md-8.col-12.banner_content_items > div > div.banner_head > h1")).getText(); 
	    
	  if(actual.equals(expected)) {
		  Assert.assertEquals(actual, expected);
	  System.out.println("pass");
	}
	else {
		
		System.out.println("fail");
	}
	  
	  JavascriptExecutor jse = (JavascriptExecutor) driver;
	  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
}
	@Then("^click on back arrow and verify it should be navigate on patients page or not$")
	public void click_on_back_arrow_and_verify_it_should_be_navigate_on_patients_page_or_not() throws Throwable {
	Thread.sleep(3000);
		WebElement e=page.Back;
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", e);
	Thread.sleep(2000);
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(6000);
	}

	@Then("^Click on Browse studies and verify it should be able to navigate on  browse studies page$")
	public void click_on_Browse_studies_and_verify_it_should_be_able_to_navigate_on_browse_studies_page() throws Throwable {
		
		  Thread.sleep(4000);
		  WebElement e=page.Browseallstudies;
		 
		 
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("arguments[0].click();", e); 
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			Thread.sleep(1000);
			  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(4000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 
	}
	@Then("^Click on signup button and verify it should be able to navigate on signup page$")
	public void click_on_signup_button_and_verify_it_should_be_able_to_navigate_on_signup_page() throws Throwable {
		
		  Thread.sleep(3000);
		  WebElement e=page.SignUp; JavascriptExecutor js =
		  (JavascriptExecutor) driver; js.executeScript("arguments[0].click();", e);
		  Thread.sleep(1000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 driver.close();
	}


}
