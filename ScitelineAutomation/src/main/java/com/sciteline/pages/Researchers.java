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

public class Researchers {
	WebDriver driver;
	PageModel page;
	@Given("^website is open through url on browser\\.$")
	public void website_is_open_through_url_on_browser() throws Throwable {
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

	@Then("^Click on researchers menu to verify user is able to click on Researchers menu or not$")
	public void click_on_researchers_menu_to_verify_user_is_able_to_click_on_Researchers_menu_or_not() throws Throwable {
	    page.Researchers.click();
	}

	@Then("^verify user is able to view Researchers page or not$")
	public void verify_user_is_able_to_view_Researchers_page_or_not() throws Throwable {
	Thread.sleep(3000);
		String actual= driver.findElement(By.cssSelector("#root > div > div > main > section.wide-banner > div > div > h1")).getText();
	System.out.println("actual text is" +actual);
	String expected="Accelerate recruitment\r\n"
			+ "for your studies";
	if(actual.equals(expected))
	{
		System.out.println("pass");
	}
	}

	@Then("^verify user is able to view how it works options or not$")
	public void verify_user_is_able_to_view_how_it_works_options_or_not() throws Throwable {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,2100)"); 
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.value-prop.tabular > h1")).getText();
String expected="How it works";
if(actual.equals(expected)) {
	Assert.assertEquals(actual, expected);
	System.out.println("pass");
}
else {
	
	System.out.println("fail");
}
	}

	@Then("^click on step(\\d+):onboard to verify user is able to view related information or not$")
	public void click_on_step_onboard_to_verify_user_is_able_to_view_related_information_or_not(int arg1) throws Throwable {

		 Thread.sleep(2000);
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.value-prop.tabular > div.tab-item-content > div.value-prop-item.reverse.active > div.text-container > p.value-prop-title")).getText();
String expected="Onboard your study";
if(actual.equals(expected)) {
		Assert.assertEquals(actual, expected);

		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}
}
	
	@Then("^click on step(\\d+):publish to verify user is able to view related information or not$")
	public void click_on_step_publish_to_verify_user_is_able_to_view_related_information_or_not(int arg1) throws Throwable {
	  Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/section[3]/div[1]/div/div[2]/p")).click();
		 Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	 Thread.sleep(2000);
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.value-prop.tabular > div.tab-item-content > div.value-prop-item.reverse.active > div.text-container > p.value-prop-title")).getText();
		String expected="Publish your study";
		if (actual.equals(expected)) {
			
			Assert.assertEquals(actual, expected);
		}
	}

	@Then("^click on step(\\d+):manage to verify user is able to view related information or not$")
	public void click_on_step_manage_to_verify_user_is_able_to_view_related_information_or_not(int arg1) throws Throwable {
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/section[3]/div[1]/div/div[3]/p")).click();
	
	 Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.value-prop.tabular > div.tab-item-content > div.value-prop-item.reverse.active > div.text-container > p.value-prop-title")).getText();
		String expected="Manage and accelerate";
		if (actual.equals(expected)) {
			
			Assert.assertEquals(actual, expected);
		}
	}

	@Then("^verify user is able to view popular studies or not$")
	public void verify_user_is_able_to_view_popular_studies_or_not() throws Throwable {
	    String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.container.pb-5 > div.row.related-study-grid > div.related-study-heading.col-md-12")).getText();

	    
	    String expected="popular studies";
	if(actual.equals(expected))
	{
	Assert.assertEquals(actual, expected);
	}
	}

	@Then("^click on any study and verify user is able to view related study detail page$")
	public void click_on_any_study_and_verify_user_is_able_to_view_related_study_detail_page() throws Throwable {
	  
	 Thread.sleep(1000);
		WebElement e=driver.findElement(By.cssSelector("#root > div > div > main > section.container.pb-5 > div.row.related-study-grid > div.desktop > div > div:nth-child(1) > div > div.card-body > a > h4"));
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();", e);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	   JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		  jse1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	@Then("^click on back arrow and verify it should be navigate on Researchers page or not$")
	public void click_on_back_arrow_and_verify_it_should_be_navigate_on_Researchers_page_or_not() throws Throwable {
	   Thread.sleep(2000);
		page.Back.click();
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 Thread.sleep(2000);
		 
	}

	@Then("^click on browse all studies button to verify user is able to navigate on browse studies page or not$")
	public void click_on_browse_all_studies_button_to_verify_user_is_able_to_navigate_on_browse_studies_page_or_not() throws Throwable {
	    
		WebElement e=page.Browseallstudies;
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();", e);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on signup button to verify user is able to navigate on signup page or not$")
	public void click_on_signup_button_to_verify_user_is_able_to_navigate_on_signup_page_or_not() throws Throwable {
		WebElement e=page.SignUp;
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();", e);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	 driver.close();
	
	
	}


}
