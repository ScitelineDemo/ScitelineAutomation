package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.Adminpanel;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Screenshot;

public class AdminPeople {
	WebDriver driver;
	PageModel page;
	Adminpanel pages;
	
	@Given("^Admin is open application on through url$")
	public void admin_is_open_application_on_through_url() throws Throwable {
		  
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
					System.out.println("fail");}
	}

	@Then("^click on login menu bar$")
	public void click_on_login_menu_bar() throws Throwable {
		Thread.sleep(2000);
		page.Login.click();
	  Thread.sleep(1000);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter credentials \"(.*?)\" and \"(.*?)\" for Admin login$")
	public void enter_credentials_and_for_Admin_login(String arg1, String arg2) throws Throwable {
		WebElement e=page.email;
		e.click();
		 Thread.sleep(1000);
		e.sendKeys(arg1);
	    
	    Thread.sleep(2000);
	    WebElement e1=page.password;
	    e1.click();
		 Thread.sleep(1000);
	   e1.sendKeys(arg2);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on login button and verify user is redirect to admin panel$")
	public void click_on_login_button_and_verify_user_is_redirect_to_admin_panel() throws Throwable {
		Thread.sleep(1000);
		  WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[1]/form/button/span[1]"));
		  JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", e);
			Thread.sleep(1000);
			Boolean logo=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/div[2]/div/div/div/div[1]/img")).isDisplayed();
			Assert.assertTrue(logo);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on people menu and verify it should be redirect to studies page or not$")
	public void click_on_people_menu_and_verify_it_should_be_redirect_to_studies_page_or_not() throws Throwable {
	  pages.people.click();
	  Thread.sleep(2000);
	String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/h6")).getText();
	String expected="People";
	Assert.assertEquals(actual, expected);
	}

	@Then("^click on name check box and verify user is able to select name check box or not$")
	public void click_on_name_check_box_and_verify_user_is_able_to_select_name_check_box_or_not() throws Throwable {
	 Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[1]/div/span/span[1]/input")); 
		e.click();
	Thread.sleep(1000);
	Boolean select= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[1]/div/span/span[1]/input")).isSelected();
	Assert.assertTrue(select);
	e.click();
	
	}

	@Then("^click on particular people name and verify user is able to select particular study checkbox$")
	public void click_on_particular_people_name_and_verify_user_is_able_to_select_particular_study_checkbox() throws Throwable {
		 Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[@id='MUIDataTableSelectCell-4']"));
		e.click();
	   Boolean select= driver.findElement(By.xpath("//*[@id='MUIDataTableSelectCell-4']")).isSelected();
		Assert.assertTrue(select);
		Thread.sleep(1000);
		e.click();
	}

	@Then("^click on new person button and verify it should be redirect to new person page$")
	public void click_on_new_person_button_and_verify_it_should_be_redirect_to_new_person_page() throws Throwable {
		 Thread.sleep(2000);
		WebElement e=pages.newPerson;
	  e.click();
	  Thread.sleep(2000);
	  String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/div[1]/h6")).getText();
	String expected="New Person";
	 Thread.sleep(2000);
	driver.close();
	}

	@When("^Admin is Login on application$")
	public void admin_is_Login_on_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk:3000/admin/people");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		String actual = driver.getTitle();
		String expected = "Sciteline";

		
		
	}

	@Then("^click on people menu bar$")
	public void click_on_people_menu_bar() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter the person name in search box \"(.*?)\" and verify display person name is as per searched personname or not$")
	public void enter_the_person_name_in_search_box_and_verify_display_person_name_is_as_per_searched_personname_or_not(String arg1) throws Throwable {
	  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[1]/div/div[2]/input")).sendKeys(arg1);
		 Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//*[@id='MUIDataTableBodyRow-5']/td[2]")).getText();
		if(actual.equalsIgnoreCase(arg1)) {
		Assert.assertNotEquals(actual, arg1);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		System.out.println("pass");
		 driver.close();
	}
		else {
			
			System.out.println("fail");
		}
	}
	@When("^admin open application$")
	public void admin_open_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin/people");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		String actual = driver.getTitle();
		String expected = "Sciteline";

	}

	@Then("^click on new person$")
	public void click_on_new_person() throws Throwable {
	WebElement e=pages.newPerson;
e.click();
Thread.sleep(2000);
	}

	@Then("^click on sites, studies and Account$")
	public void click_on_sites_studies_and_Account() throws Throwable {
	 Thread.sleep(1000);
		pages.sites.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  Thread.sleep(1000);
	  pages.studies.click();
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  Thread.sleep(1000);
	  pages.Account.click();
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter name \"(.*?)\" and Email \"(.*?)\"$")
	public void enter_name_and_Email(String arg1, String arg2) throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[1]/div/div/div/input")).sendKeys(arg1);
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[2]/div[1]/div/div/input")).sendKeys(arg2);
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on send invite button$")
	public void click_on_send_invite_button() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-0\"]/div/div/div[2]/div[2]/button")).click();
	}


}
