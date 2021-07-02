package com.sciteline.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.Adminpanel;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Screenshot;

public class AdminStudies {
	
	WebDriver driver;
	Adminpanel page;
	PageModel pages;
	@Given("^Admin is open application through url$")
	public void admin_is_open_application_through_url() throws Throwable {
	   
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

	@Then("^click on login$")
	public void click_on_login() throws Throwable {
	 Thread.sleep(2000);
		pages.Login.click();
	  Thread.sleep(1000);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^enter valid credentials \"(.*?)\" and \"(.*?)\" for Admin login$")
	public void enter_valid_credentials_and_for_Admin_login(String arg1, String arg2) throws Throwable {
		WebElement e=pages.email;
		e.click();
		 Thread.sleep(1000);
		e.sendKeys(arg1);
	    
	    Thread.sleep(2000);
	    WebElement e1=pages.password;
	    e1.click();
		 Thread.sleep(1000);
	   e1.sendKeys(arg2);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on login button and verify user is redirect to admin panel or not$")
	public void click_on_login_button_and_verify_user_is_redirect_to_admin_panel_or_not() throws Throwable {
		Thread.sleep(1000);
		  WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[1]/form/button/span[1]"));
		  JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", e);
			Thread.sleep(1000);
			Boolean logo=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/div[2]/div/div/div/div[1]/img")).isDisplayed();
			Assert.assertTrue(logo);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^click on studies menu and verify it should be redirect to studies page or not$")
	public void click_on_studies_menu_and_verify_it_should_be_redirect_to_studies_page_or_not() throws Throwable {
	   
	}


	@Then("^click on trialname check box and verify user is able to select trial name check box or not$")
	public void click_on_trialname_check_box_and_verify_user_is_able_to_select_trial_name_check_box_or_not() throws Throwable {
	    
	WebElement e=	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[1]/div/span/span[1]/input"));
	e.click();
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	Thread.sleep(1000);
	Boolean select=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[1]/div/span/span[1]/input")).isSelected();
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	Assert.assertTrue(select);
	e.click();
	
	}

	@Then("^click on particular study and verify user is able to select particular study checkbox$")
	public void click_on_particular_study_and_verify_user_is_able_to_select_particular_study_checkbox() throws Throwable {
	   Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[@id='MUIDataTableSelectCell-0']"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		if(e.isSelected()==true) {
			
			e.click();
			
		}
	}

	@Then("^verify user is able show status, indication,study type for filter studies$")
	public void verify_user_is_able_show_status_indication_study_type_for_filter_studies() throws Throwable {
	Thread.sleep(2000);
		String actual=page.Adminstatus.getText();
	String expected="Status  " ;
	  System.out.println(actual);	
	Assert.assertEquals(actual, expected);
	  Thread.sleep(1000);
	  String actual1=page.Adminindication.getText();
	 String expected1="Indication  ";
	 System.out.println(actual1);	
	  Assert.assertEquals(actual1, expected1);
	 Thread.sleep(1000);
	  String actual2=page.AdminstudyType.getText();
	String expected2="Study Type  ";
	System.out.println(actual2);
	Assert.assertEquals(actual2, expected2);
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
		
	
	
	}

	@Then("^click on new trial button and verify it should be redirect to new trial page$")
	public void click_on_new_trial_button_and_verify_it_should_be_redirect_to_new_trial_page() throws Throwable {
	 Thread.sleep(1000);
		WebElement e=page.AdminnewTrial;
	   e.click();
	   Thread.sleep(2000);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	   String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/h6")).getText();
	String expected="New Trial";
	Assert.assertEquals(actual, expected);
	driver.close();
	}


	@When("^Admin is Login on application through url$")
	public void admin_is_Login_on_application_through_url() throws Throwable {
	   

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk:3000/admin/studies");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	}

	@Then("^click on studies menu bar$")
	public void click_on_studies_menu_bar() throws Throwable {
	    
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^enter the study name in search box \"(.*?)\" and verify display studies is as per searched study or not$")
	public void enter_the_study_name_in_search_box_and_verify_display_studies_is_as_per_searched_study_or_not(String arg1) throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys(arg1);
		
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		driver.close();
	}


//filter
	@When("^Admin is Login on application via url$")
	public void admin_is_Login_on_application_via_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk:3000/admin/studies");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	
	}

	@Then("^click on studies$")
	public void click_on_studies() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));

	
	}

	@Then("^click on Status drop down$")
	public void click_on_Status_drop_down() throws Throwable {
		/*
		 * WebElement e=page.Adminstatus; e.click(); Thread.sleep(1000); e.click();
		 */
	
	}

	@Then("^select status options and verify trial should be dipaly as per selected options of status$")
	public void select_status_options_and_verify_trial_should_be_dipaly_as_per_selected_options_of_status() throws Throwable {
	    
	}

	@Then("^click on Indication drop down$")
	public void click_on_Indication_drop_down() throws Throwable {
		 Thread.sleep(1000);
		WebElement e=page.Adminindication;
	 e.click();
	}

	@Then("^Select indication options and verify trial should be display as per selected options of indications$")
	public void select_indication_options_and_verify_trial_should_be_display_as_per_selected_options_of_indications() throws Throwable {
		 Thread.sleep(1000);
		List<WebElement> e=driver.findElements(By.xpath("//input[starts-with(@type,'checkbox')]"));
	 System.out.println(e.size());
		for(int i=0;i<e.size();i++) {
		 
		 e=driver.findElements(By.xpath("//input[starts-with(@type,'checkbox')]"));
		Thread.sleep(1000);
		 e.get(i).click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));

		 Thread.sleep(1000);
		 
		e.get(i).click();
	 }
	
	
	}

	@Then("^click on study type drop down$")
	public void click_on_study_type_drop_down() throws Throwable {
	 WebElement e=  page.AdminstudyType;
	 e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));

	}

	@Then("^select study type options and verify trial should be display as per selected options of study type$")
	public void select_study_type_options_and_verify_trial_should_be_display_as_per_selected_options_of_study_type() throws Throwable {
		 List<WebElement> e=driver.findElements(By.xpath("//input[@type='checkbox']"));
		 for(int i=0;i<e.size();i++) {
			 
			 e=driver.findElements(By.xpath("//input[@type='checkbox']"));
			 e.get(i).click();
				Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));

			 Thread.sleep(1000);
			 
			e.get(i).click();
	}

	}
//new trial
	@When("^Admin is open url on browser$")
	public void admin_is_open_url_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk:3000/admin/studies");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
	}

	@Then("^click on Studies menu$")
	public void click_on_Studies_menu() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on new Trial button$")
	public void click_on_new_Trial_button() throws Throwable {
	
		Thread.sleep(2000);
		WebElement e=page.AdminnewTrial;
		e.click();
	}

	@Then("^verify user is able to show details,locations,eligibility crieteria,screening questions and member$")
	public void verify_user_is_able_to_show_details_locations_eligibility_crieteria_screening_questions_and_member() throws Throwable {
	   Thread.sleep(2000);
		String actual=page.newTrialDetails.getText();
	 String expected="Details";
	 Assert.assertEquals(actual, expected);
	 Thread.sleep(2000);
	   String actual1=page.newTrialLocations.getText();
	   String expected1="Locations";
	   Assert.assertEquals(actual1, expected1);
	   Thread.sleep(2000);
	   String actual2=page.newTrialeligibility.getText();
	   String expected2="Eligibility criteria";
	   Assert.assertEquals(actual2, expected2);
	   Thread.sleep(2000);
	   String actual3=page.newTrialprescreeningQuestions.getText();
	   String expected3="Screening questions";
	   Assert.assertEquals(actual3, expected3);
	   Thread.sleep(2000);
	   String actual4=page.newTrialMember.getText();
	   String expected4="Members";
	   Assert.assertEquals(actual4, expected4);
	}

	@Then("^click on Details$")
	public void click_on_Details() throws Throwable {
		/*
		 * Thread.sleep(1000); page.newTrialDetails.click();
		 */
		
		
	}

	@Then("^enter Trial Id \"(.*?)\" and Trial name \"(.*?)\"$")
	public void enter_Trial_Id_and_Trial_name(String arg1, String arg2) throws Throwable {
		Thread.sleep(1000);
	page.trialId.sendKeys(arg1);
	Thread.sleep(1000);
	page.TrialName.sendKeys(arg2);
	}

	@Then("^enter introduction \"(.*?)\"$")
	public void enter_introduction(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.introduction.sendKeys(arg1);
	}

	@Then("^enter Description \"(.*?)\"$")
	public void enter_Description(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.description.sendKeys(arg1);
	}

	@Then("^Medical condition \"(.*?)\"$")
	public void medical_condition(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.medicalcondition.sendKeys(arg1);
	}

	@Then("^select Study type \"(.*?)\"$")
	public void select_Study_type(String arg1) throws Throwable {
	  driver.findElement(By.xpath("//*[@id='demo-simple-select-outlined']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//*[@id='menu-studyType']/div[3]/ul/li[1]")).click();
	}

	@Then("^enter Duration \"(.*?)\"$")
	public void enter_Duration(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.duration.sendKeys(arg1);
	}

	@Then("^enter of participants  \"(.*?)\"$")
	public void enter_of_participants(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.participantsnumber.sendKeys(arg1);
	}

	@Then("^select Phase \"(.*?)\"$")
	public void select_Phase(String arg1) throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/main/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/div/div[7]/div[3]/div/div/div")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id='menu-phase']/div[3]/ul/li[2]")).click();
	}

	@Then("^enter Intervention \"(.*?)\"$")
	public void enter_Intervention(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.intervention.sendKeys(arg1);
	}

	@Then("^enter Start date \"(.*?)\"$")
	public void enter_Start_date(String arg1) throws Throwable {
		Thread.sleep(1000);
	WebElement e=	page.startdate;
	e.clear();
	e.sendKeys(arg1);
	}

	@Then("^enter Lead sponsors \"(.*?)\"$")
	public void enter_Lead_sponsors(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.leadSponser.sendKeys(arg1);
	}

	@Then("^enter Principal investigator \"(.*?)\"$")
	public void enter_Principal_investigator(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.principalinvestigator.sendKeys(arg1);
	}

	@Then("^enter Study contact phone \"(.*?)\"$")
	public void enter_Study_contact_phone(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.studycontactphone.sendKeys(arg1);
	}

	@Then("^enter Study contact email \"(.*?)\"$")
	public void enter_Study_contact_email(String arg1) throws Throwable {
		Thread.sleep(1000);
		page.studycontactEmail.sendKeys(arg1);
	}

	@Then("^enter Tags \"(.*?)\"$")
	public void enter_Tags(String arg1) throws Throwable {
		/*
		 * Thread.sleep(1000); WebElement e=page.tags; e.click(); e.sendKeys(arg1);
		 * e.sendKeys(Keys.ENTER); Thread.sleep(1000);
		 */
	}

	@Then("^Add image or video link$")
	public void add_image_or_video_link() throws Throwable {
	    
	}

	@Then("^click on preview button to show preview of added trial$")
	public void click_on_preview_button_to_show_preview_of_added_trial() throws Throwable {
	 Thread.sleep(1000);
		page.preview.click();
		Thread.sleep(2000);
	}

	@Then("^click on publish button and verify this added trial is display at browse studies page or not$")
	public void click_on_publish_button_and_verify_this_added_trial_is_display_at_browse_studies_page_or_not() throws Throwable {
	  driver.close();
	}

//pull data
	@When("^Admin should open url on browser$")
	public void admin_should_open_url_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin/studies");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
	}

	@Then("^click onStudies menu$")
	public void click_onStudies_menu() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on newTrial button$")
	public void click_on_newTrial_button() throws Throwable {
	 Thread.sleep(3000);
		WebElement e=page.AdminnewTrial;
		e.click();
		
	}

	@Then("^click enter trial id \"(.*?)\"$")
	public void click_enter_trial_id(String arg1) throws Throwable {
	 Thread.sleep(3000);
		page.trialId.sendKeys(arg1);
	}

	@Then("^click on pull data button and verify all data should be fill automatically or not$")
	public void click_on_pull_data_button_and_verify_all_data_should_be_fill_automatically_or_not() throws Throwable {
		Thread.sleep(3000);
		page.pulldata.click();
		Thread.sleep(1000);

	}

	@Then("^click on add image button and select one image$")
	public void click_on_add_image_button_and_select_one_image() throws Throwable {
	   Thread.sleep(1000);
	page.addImage.sendKeys("C:\\Users\\nteam\\Downloads\\health.jpg");
	}

	@Then("^if user wants to change that image then mouse hover on added image section$")
	public void if_user_wants_to_change_that_image_then_mouse_hover_on_added_image_section() throws Throwable {
	   
		WebElement e=driver.findElement(By.className("changeImage"));
		Actions a=new Actions(driver);
		a.moveToElement(e).build().perform();
		
	}

	@Then("^click on change button$")
	public void click_on_change_button() throws Throwable {
	  Thread.sleep(3000);
		WebElement e=driver.findElement(By.className("changeImage"));
e.sendKeys("C:\\Users\\nteam\\Downloads\\health.jpg");

	}

	@When("^Admin is open application and click on new study$")
	public void admin_is_open_application_and_click_on_new_study() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin/studies");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Then("^enter trial id \"(.*?)\"$")
	public void enter_trial_id(String arg1) throws Throwable {
	   
		Thread.sleep(3000);
	WebElement e=driver.findElement(By.name("trialId"));
	e.click();
	e.sendKeys(arg1);
	}

	@Then("^click on pull data button$")
	public void click_on_pull_data_button() throws Throwable {
	Thread.sleep(1000);
		page.pulldata.click();
	}

	@Then("^verify all data should be fill automatically and click on preview button and verify details$")
	public void verify_all_data_should_be_fill_automatically_and_click_on_preview_button_and_verify_details() throws Throwable {
	   
		Thread.sleep(3000);
		String trialName=page.TrialName.getAttribute("value");
		String Introduction=page.introduction.getAttribute("value");
		String description=page.description.getAttribute("value");
		String leadsponsors=page.leadSponser.getAttribute("value");
		String principalInvestigator=page.principalinvestigator.getAttribute("value");
		Thread.sleep(2000);
		WebElement e=page.preview;
		e.click();
		Thread.sleep(7000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			/*
			 * String PreviewTitlename=driver.findElement(By.
			 * cssSelector("#root > div > div > section:nth-child(1) > div.banner > div > div > div > div.col-md-8.col-12.banner_content_items > div > div.banner_head.mt-4 > h1"
			 * )).getText(); if(trialName.equals(PreviewTitlename)) {
			 * 
			 * Assert.assertEquals(trialName, PreviewTitlename); }
			 * 
			 * String PreviewIntroduction=driver.findElement(By.xpath(
			 * "//*[@id='root']/div/div/section[1]/div[2]/div/div/div/div[1]/div/div[2]/p"))
			 * .getText(); if(Introduction.equals(PreviewIntroduction)) {
			 * 
			 * Assert.assertEquals(Introduction, PreviewIntroduction); }
			 * 
			 * String PreviewDescription=driver.findElement(By.xpath(
			 * "//*[@id='root']/div/div/section[2]/div/div/div/div/div[1]/div[1]/div/p")).
			 * getText();
			 * 
			 * if(description.equals(PreviewDescription)) {
			 * 
			 * Assert.assertEquals(description, PreviewDescription); } String
			 * PreviewLeadsponsors=driver.findElement(By.xpath(
			 * "//*[@id='root']/div/div/section[2]/div/div/div/div/div[2]/div/div/div[1]/span"
			 * )).getText(); if(leadsponsors.equals(PreviewLeadsponsors)) {
			 * 
			 * Assert.assertEquals(leadsponsors, PreviewLeadsponsors); } String
			 * Previewprincipal=driver.findElement(By.xpath(
			 * "//*[@id='root']/div/div/section[2]/div/div/div/div/div[2]/div/div/div[3]/span"
			 * )).getText(); if(principalInvestigator.equals(Previewprincipal)) {
			 * 
			 * Assert.assertEquals(principalInvestigator, Previewprincipal); }
			 */


driver.close();
	}
}





