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

public class Login {
	WebDriver driver;
	PageModel page;
	String emailInvalid="Email format is invalid";
	String emptyEmail="Email is required";
	String passwordInvalid="Password must have at least 8 characters";
	String emptyPassword="Password is required";
	@Given("^url is open on browser$")
	public void url_is_open_on_browser() throws Throwable {
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
	

	@Then("^click on login menu$")
	public void click_on_login_menu() throws Throwable {
	   
		page.Login.click();
	}

	@Then("^enter email \"(.*?)\" password \"(.*?)\"$")
	public void enter_email_password(String arg1, String arg2) throws Throwable {
	 Thread.sleep(2000);
		
		WebElement e=page.email;
		e.click();
		 Thread.sleep(1000);
		e.sendKeys(arg1);
	    
	    Thread.sleep(2000);
	    WebElement e1=page.password;
	    e1.click();
		 Thread.sleep(1000);
	   e1.sendKeys(arg2);
	}
	

	@Then("^select remember me checkbox$")
	public void select_remember_me_checkbox() throws Throwable {
	  
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[1]/form/label/span[1]/span[1]/input")).click();
	}

	@Then("^click on login button$")
	public void click_on_login_button() throws Throwable {
		Thread.sleep(1000);
	  WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/section/div/div[1]/form/button"));
	  JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
		
	}


}
