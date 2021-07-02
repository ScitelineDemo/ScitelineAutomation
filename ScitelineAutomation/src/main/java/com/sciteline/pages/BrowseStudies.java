package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Screenshot;

public class BrowseStudies {
	WebDriver driver;
	PageModel page;
	@Given("^user open url through browser$")
	public void user_open_url_through_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk/");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		  String actual = driver.getTitle(); String expected = "Sciteline"; 
		  if(actual.equals(expected)) 
		  { 
			  Assert.assertEquals(actual, expected);
		  
		  System.out.println("pass");
		  
		  } else { System.out.println("fail"); }
		 
	}

	@Then("^click on browse studies to validate user should be redirect to browse studies page$")
	public void click_on_browse_studies_to_validate_user_should_be_redirect_to_browse_studies_page() throws Throwable {
	    
		page.browseStudies.click();
		Thread.sleep(4000);
		
	}

	@Then("^validate user is able to view search and filter option$")
	public void validate_user_is_able_to_view_search_and_filter_option() throws Throwable {
		String actual=driver.findElement(By.name("keywordSearch")).getAttribute("placeholder");
	   System.out.println("actual text is=" +actual);
	String expected="Search";
	if(actual.equals(expected)) {
	Assert.assertEquals(actual, expected);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	else {
		System.out.println("fail");
	}
	}
	

	@Then("^for validate search functionality enter data on search field \"(.*?)\"$")
	public void for_validate_search_functionality_enter_data_on_search_field(String arg1) throws Throwable {
	 Thread.sleep(2000);
		WebElement e=   driver.findElement(By.name("keywordSearch"));
	 e.click();
	 e.sendKeys(arg1);
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    Thread.sleep(1000);
	}

	@Then("^Enter data on city and address field \"(.*?)\"$")
	public void enter_data_on_city_and_address_field(String arg1) throws Throwable {
	 // driver.findElement(By.)
	}

	@Then("^select trial phase \"(.*?)\"$")
	public void select_trial_phase(String arg1) throws Throwable {
	    Thread.sleep(2000);
	    WebElement e=driver.findElement(By.name("trialPhase"));
		Select s=new Select(e);
		e.click();
	    s.selectByVisibleText(arg1);
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    Thread.sleep(1000);
	}

	@Then("^select study type \"(.*?)\"$")
	public void select_study_type(String arg1) throws Throwable {
		  Thread.sleep(2000);
		 WebElement e= driver.findElement(By.name("studyType"));
		Select s=new Select(e);
		e.click();
		    s.selectByVisibleText(arg1);
		    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		    Thread.sleep(1000);
	}

	@Then("^select indication \"(.*?)\" and click on search button$")
	public void select_indication_and_click_on_search_button(String arg1) throws Throwable {
	    

		 Thread.sleep(2000);
		 WebElement e=driver.findElement(By.name("condition"));
		Select s=new Select(e);
		e.click();
		    s.selectByVisibleText(arg1);
		    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	  Thread.sleep(1000);
		WebElement e1=driver.findElement(By.cssSelector("#root > div > div > main > div > div.container.filter-container > div.filter.desktop > div.row.align-items-center > form > div.col-md-2.d-flex.justify-content-center > button"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].click();", e1);
	Thread.sleep(5000);
	}

	@Then("^verify mouse hover on any study user should be able to view quick view button$")
	public void verify_mouse_hover_on_any_study_user_should_be_able_to_view_quick_view_button() throws Throwable {
		 WebElement element=driver.findElement(By.cssSelector("#root > div > div > main > div > div:nth-child(2) > div.row.row-cols-1.row-cols-lg-3.row-cols-md-2.row-cols-sm-1 > div:nth-child(1) > div > div.card-body > a > h4"));
			if(element.isDisplayed()==true) {
			 
		                 Actions action=new Actions(driver);
		                 action.moveToElement(element).build().perform();
		                 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		                 Thread.sleep(1000);
			
		}
			else {
				System.out.println("fail");
				driver.close();
			}
	 
	}
	@Then("^click on Quick view button and verify pop up is open or not$")
	public void click_on_Quick_view_button_and_verify_pop_up_is_open_or_not() throws Throwable {

		                 WebElement e2=page.quickView;
		             	JavascriptExecutor jse=(JavascriptExecutor) driver;
		            	jse.executeScript("arguments[0].click();", e2);
		            	
		                 Thread.sleep(1000);
		                 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
				  Thread.sleep(2000);
				
			}
			
		
	@Then("^click on discover this study and verify it should be redirect to study details page or not$")
	public void click_on_discover_this_study_and_verify_it_should_be_redirect_to_study_details_page_or_not() throws Throwable {
		 driver.findElement(By.linkText("Discover this study")).click();
			Thread.sleep(3000);
	}
	
	@Then("^verify user should able to show study status$")
	public void verify_user_should_able_to_show_study_status() throws Throwable {
		Thread.sleep(1000);
	Boolean status=	driver.findElement(By.cssSelector("#root > div > div > main > section:nth-child(1) > div > div > div > div > div.col-md-8.col-12.banner_content_items > div > div.banner_link.recruiting-green > h6")).isDisplayed();
	Assert.assertTrue(status);
	
	}
	@Then("^verify User should be able to view study related details as per entered data$")
	public void verify_User_should_be_able_to_view_study_related_details_as_per_entered_data() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		//JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		  //jse1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

	@Then("^if study status is currently recruiting and user wants to apply then click on apply button$")
	public void if_study_status_is_currently_recruiting_and_user_wants_to_apply_then_click_on_apply_button() throws Throwable {
	  String actual=driver.findElement(By.cssSelector("#root > div > div > main > section:nth-child(1) > div > div > div > div > div.col-md-8.col-12.banner_content_items > div > div.banner_link.recruiting-green > h6")).getText();
	String expected="Currently Recruiting";
	if(actual.equals(expected)) {
		
		Assert.assertEquals(actual, expected);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		WebElement e=page.Apply;
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", e);
		Thread.sleep(1000);
		
	}
	else {
		
		System.out.println("status is not currently recruiting");
	}
	}

	@Then("^answer the given questions for check eligibility$")
	public void answer_the_given_questions_for_check_eligibility() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[1]/div[1]/div/div[2]/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[1]/div[2]/div/div[2]/label[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[1]/div[3]/div/div[2]/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[1]/div[4]/div/div[2]/label[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[1]/div[5]/div/div[2]/label[2]")).click();
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		WebElement e=page.eligiblenext;
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", e);
		Thread.sleep(1000);
		WebElement e1=page.firstname;
		e1.click();
		Thread.sleep(1000);
		e1.sendKeys("test");
		
		Thread.sleep(1000);
		WebElement e2=page.lastname;
		e2.click();
		Thread.sleep(1000);
		e2.sendKeys("purpose");
		Thread.sleep(1000);
		WebElement e3=page.Email;
		e3.click();
		Thread.sleep(1000);
		e3.sendKeys("test@sciteline.com");
		Thread.sleep(1000);
		page.terms.click();
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		WebElement e4=page.submit;
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", e4);
		
		
		
		
	  
	}

	@Then("^if user is eligible then click on done button else apply for notified of future study$")
	public void if_user_is_eligible_then_click_on_done_button_else_apply_for_notified_of_future_study() throws Throwable {
	Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[1]/h1")).getText();
		System.out.println("actual text is=" +actual);
	  
	String expected="Not quite a match";
	String expected1="You’re eligible!";
	   if(actual.equals(expected)) {
		   //date select
		   System.out.println("expected=" +actual);
		   WebElement e=driver.findElement(By.xpath(("//input[@class='MuiInputBase-input MuiOutlinedInput-input']")));
			JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", e);
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
			Thread.sleep(1000);
			 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[2]/form/div[3]/div/div[2]/div/label[1]")).click();
	Thread.sleep(1000);
	page.terms.click();
	Thread.sleep(2000);
	WebElement e2=page.submit;
	JavascriptExecutor executer1 = (JavascriptExecutor) driver;
	executer1.executeScript("arguments[0].click();", e2);
	
	   }
	

	else if(actual.equals(expected1)) {
		WebElement e=page.Done;
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", e);
	}
	else {
		
		System.out.println("fail");
	}
}
	
	@Then("^if user wants to share that study click on share button and verify user should able to click on share button$")
	public void if_user_wants_to_share_that_study_click_on_share_button_and_verify_user_should_able_to_click_on_share_button() throws Throwable {
	    Thread.sleep(2000);
		WebElement e=page.share;
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", e);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Email to share study on that email$")
	public void enter_Email_to_share_study_on_that_email() throws Throwable {
	    Thread.sleep(1000);
		page.email.sendKeys("test@sciteline.com");
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	}

	@Then("^click on terms and condition checkbox\\.$")
	public void click_on_terms_and_condition_checkbox() throws Throwable {
	  Thread.sleep(1000);
		page.terms.click();
	}

	@Then("^click on send email button and verify email should be sent or not$")
	public void click_on_send_email_button_and_verify_email_should_be_sent_or_not() throws Throwable {
	   Thread.sleep(1000);
		WebElement e=page.sendEmail;
	    JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", e);
	}
	@Then("^click on any location for study$")
	public void click_on_any_location_for_study() throws Throwable {
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/section[2]/div/div/div/div[1]/div[2]/div/div/div[4]/div[2]/div[2]/button/i")).click();
	}

	@Then("^click on google maps button$")
	public void click_on_google_maps_button() throws Throwable {
		Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/button")).click();
	}

	@Then("^click on any related studies$")
	public void click_on_any_related_studies() throws Throwable {
	   Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/section[2]/div/div/div/div[2]/div[2]/div/div[2]/div/div[2]/a/h4")).click();
	Thread.sleep(1000);
	
	}
	

	@Then("^fill the form of get notified of new matches by enter firstname and lastname and email and indication and postalcode and date and gender$")
	public void fill_the_form_of_get_notified_of_new_matches_by_enter_firstname_and_lastname_and_email_and_indication_and_postalcode_and_date_and_gender() throws Throwable {
	
	    page.firstname.sendKeys("test");
	    Thread.sleep(1000);
	    page.lastname.sendKeys("purpose");
	    Thread.sleep(1000);
	    page.email.sendKeys("test@sciteline.com");
	    Thread.sleep(1000);
	 
	    Select s =new Select(driver.findElement(By.name("indication")));
	    s.selectByIndex(1);
	    Thread.sleep(1000);
	    driver.findElement(By.id("postalCode")).sendKeys("658475");
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath(("//input[@class='MuiInputBase-input MuiOutlinedInput-input']")));
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		Select s1=new Select(driver.findElement(By.name("gender")));
		    s1.selectByIndex(1);
		Thread.sleep(1000);
	page.terms.click();
	}

	@Then("^click on submit button and verify$")
	public void click_on_submit_button_and_verify() throws Throwable {
	    
		WebElement e=page.Submit;
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
		
		
		
	}
	@Given("^url is open$")
	public void url_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk/");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		  String actual = driver.getTitle(); String expected = "Sciteline"; 
		  if(actual.equals(expected)) 
		  { 
			  Assert.assertEquals(actual, expected);
		  
		  System.out.println("pass");
		  
		  } else { System.out.println("fail"); }
	}

	@Then("^click on browse studies menu bar$")
	public void click_on_browse_studies_menu_bar() throws Throwable {
	 Thread.sleep(2000);
	WebElement e=	page.browseStudies;
	e.click();
	   Thread.sleep(4000);	}

	@Then("^verify get notified of new matches form is display or not$")
	public void verify_get_notified_of_new_matches_form_is_display_or_not() throws Throwable {
	    Thread.sleep(2000);
		String actual=driver.findElement(By.cssSelector("#root > div > div > main > div > section > div > h1")).getText();
		System.out.println("actual text is=" +actual);
		String expected="Get notified of new matches";
		if(actual.equals(expected)) {
			
			Assert.assertEquals(actual, expected);
			System.out.println("pass");
			
		}
		else {
			
			System.out.println("fail");
		}
	}

	@Then("^enter \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\" , \"(.*?)\"$")
	public void enter(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
	    Thread.sleep(3000);
		page.firstName.sendKeys(arg1);
		Thread.sleep(1000);
		page.lastName.sendKeys(arg2);
		Thread.sleep(1000);
		page.email.sendKeys(arg3);
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath(("//*[@id='demo-simple-select-filled']")));
		e.click();
		driver.findElement(By.xpath("//*[@id='menu-indication']/div[3]/ul/li[2]")).click();
		e.click();
		Thread.sleep(1000);
		driver.findElement(By.id("postalCode")).sendKeys(arg4);
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("dob"));
		e1.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/button[2]/span[1]")).click();
		Thread.sleep(1000);
		Select s1=new Select(driver.findElement(By.name("gender")));
		s1.selectByVisibleText(arg5);
		Thread.sleep(1000);
		
	}

	@Then("^accept terms and condition checkbox$")
	public void accept_terms_and_condition_checkbox() throws Throwable {
	    
	}

	@Then("^click on the submit button$")
	public void click_on_the_submit_button() throws Throwable {
		driver.close();
	}

	@Given("^application is open on browser through url$")
	public void application_is_open_on_browser_through_url() throws Throwable {
	   
	}

	@Then("^click on find me match button on browse studies page$")
	public void click_on_find_me_match_button_on_browse_studies_page() throws Throwable {
	    
	}

	@Then("^select a condition Respiratory$")
	public void select_a_condition_Respiratory() throws Throwable {
	   
	}

	@Then("^click on the next button$")
	public void click_on_the_next_button() throws Throwable {
	   
	}

	@Then("^answer the given questions of tell us about your self$")
	public void answer_the_given_questions_of_tell_us_about_your_self() throws Throwable {
	    
	}

	@Then("^click on the Find matches button$")
	public void click_on_the_Find_matches_button() throws Throwable {
	   
	}

	@Then("^verify displayed study details are as per selected condition or not$")
	public void verify_displayed_study_details_are_as_per_selected_condition_or_not() throws Throwable {
	   
	}

	@Then("^click on cancer condition$")
	public void click_on_cancer_condition() throws Throwable {
	    
	}

	@Then("^click on the Next$")
	public void click_on_the_Next() throws Throwable {
	    
	}

	@Then("^select answer for the given questions of tell us about your self page$")
	public void select_answer_for_the_given_questions_of_tell_us_about_your_self_page() throws Throwable {
	   
	}

	@Then("^Verify display study details are as per choosen condition or not$")
	public void verify_display_study_details_are_as_per_choosen_condition_or_not() throws Throwable {
	    
	}


	

	


	



}
