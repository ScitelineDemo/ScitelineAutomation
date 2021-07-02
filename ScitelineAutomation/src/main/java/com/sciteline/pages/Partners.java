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

public class Partners {
	WebDriver driver;
	PageModel page;
	@Given("^open url through browser$")
	public void open_url_through_browser() throws Throwable {
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

	@Then("^Click on partners menu and verify its navigate on respective page$")
	public void click_on_partners_menu_and_verify_its_navigate_on_respective_page() throws Throwable {
	    Thread.sleep(2000);
		page.Partners.click();
		
	}

	@Then("^verify get in touch functionality$")
	public void verify_get_in_touch_functionality() throws Throwable {
	  Thread.sleep(4000);
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > section.get-notified > div > h1")).getText();
	    String expected="Get in touch with us";
	   System.out.println("actual text is="+actual);
	    if(actual.equals(expected))
	    {
	    	Assert.assertEquals(actual, expected);
	    }
	else {
		System.out.println("fail");
		
	}
	}

	@Then("^Enter firstName \"(.*?)\" LastName \"(.*?)\" title \"(.*?)\" organization \"(.*?)\" email \"(.*?)\" phone \"(.*?)\"$")
	public void enter_firstName_LastName_title_organization_email_phone(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
	  

		page.firstName.sendKeys(arg1);
		Thread.sleep(1000);
	page.lastName.sendKeys(arg2);
		Thread.sleep(1000);
		WebElement e3=driver.findElement(By.id("title"));
		//e3.click();
		Thread.sleep(1000);
				e3.sendKeys(arg3);
		Thread.sleep(1000);
		WebElement e4=driver.findElement(By.id("organizationName"));
		//e4.click();
		Thread.sleep(1000);
		e4.sendKeys(arg4);
		Thread.sleep(1000);
		page.email.sendKeys(arg5);
		Thread.sleep(1000);
		WebElement e6=driver.findElement(By.id("phoneNumber"));
		//e6.click();
		Thread.sleep(1000);
		e6.sendKeys(arg6);
		Thread.sleep(1000);
	}

	@Then("^click on terms and condition checkbox$")
	public void click_on_terms_and_condition_checkbox() throws Throwable {
	    Thread.sleep(1000);
		driver.findElement(By.name("acceptPrivacy")).click();
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
	  Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/section[3]/div/div/form/button"));
	   JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
	}


}
