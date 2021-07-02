package com.sciteline.pages;

import java.util.List;

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
import cucumber.api.java.en.When;
import utils.Screenshot;

public class Participants {
WebDriver driver;
PageModel page;
	@When("^application is open on browser via url name$")
	public void application_is_open_on_browser_via_url_name() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/trial-board");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		  String actual = driver.getTitle();
		  System.out.println("actual title is=" +actual);
		  String expected="Sciteline | Recruitment Product";
			
			  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
			  
			  System.out.println("pass");
			  
			  } else { System.out.println("fail"); }
	}

	@Then("^click on participants menu bar and verify it should be redirect on participants page$")
	public void click_on_participants_menu_bar_and_verify_it_should_be_redirect_on_participants_page() throws Throwable {
	Thread.sleep(2000);
		page.participants.click();
		Thread.sleep(2000);
		
	}

	@Then("^click on filter and verify filter popup is open or not$")
	public void click_on_filter_and_verify_filter_popup_is_open_or_not() throws Throwable {
	Thread.sleep(3000);
	WebElement e=	page.participantfilter;
	  JavascriptExecutor executer = (JavascriptExecutor) driver; 
	  executer.executeScript("arguments[0].click();", e);
		Thread.sleep(1000);
		
		String actual=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[1]/p")).getText();
		String expected="Filters";
		if(actual.equals(expected))
		{
			Assert.assertEquals(actual, expected);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 System.out.println("pass");
		}
		else {
			
			System.out.println("fail");
		}
		
		page.participantsFilterCancel.click();
	
	}

	@Then("^click on new participant form and verify participant form is open or not$")
	public void click_on_new_participant_form_and_verify_participant_form_is_open_or_not() throws Throwable {
	 Thread.sleep(3000);
		page.newParticipants.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	page.participantsformcancel.click();
	}

	@Then("^click on individual participant check box and verify delete participants and assign trial buttons are display or not$")
	public void click_on_individual_participant_check_box_and_verify_delete_participants_and_assign_trial_buttons_are_display_or_not() throws Throwable {
	  Thread.sleep(4000);
	List <WebElement> element=driver.findElements(By.xpath(("//input[starts-with(@id,'MUIDataTableSelectCell-')]")));
	for(int i=0;i< element.size();i++) {
		element=driver.findElements(By.xpath(("//input[starts-with(@id,'MUIDataTableSelectCell-')]")));
		element.get(i).click();
		Thread.sleep(2000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		element.get(i).click();
		Thread.sleep(2000);
		
	}
	driver.close();
	}
	//sorting
	@When("^open participnats page$")
	public void open_participnats_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	}

	@Then("^click on firstname and verify firstname should be display in ascending and descending order$")
	public void click_on_firstname_and_verify_firstname_should_be_display_in_ascending_and_descending_order() throws Throwable {
	  
Thread.sleep(1000);
WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[2]/span/button/span[1]/div/div[1]"));
e.click();
Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	Thread.sleep(1000);
	e.click();
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
}
	
	

	@Then("^click on lastname and verify lastname should be display in ascending and descending order$")
	public void click_on_lastname_and_verify_lastname_should_be_display_in_ascending_and_descending_order() throws Throwable {
		
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[3]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			
	
	}

	@Then("^click on sex and verify gender details should be display in ascending and descending order$")
	public void click_on_sex_and_verify_gender_details_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[3]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on dob and verify dob should be display in ascending and descending order$")
	public void click_on_dob_and_verify_dob_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[4]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on phone and verify phone no should be display in ascending and descending order$")
	public void click_on_phone_and_verify_phone_no_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[5]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on email and verify email should be display in ascending and descending order$")
	public void click_on_email_and_verify_email_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[6]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on currently enrollred and verify details should be display in ascending and descending order$")
	public void click_on_currently_enrollred_and_verify_details_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[7]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on trials and verify trials should be display in ascending and descending order$")
	public void click_on_trials_and_verify_trials_should_be_display_in_ascending_and_descending_order() throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div[2]/table/thead/tr/th[8]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			e.click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	driver.close();
	}


	//new participant
	
	@When("^browser is open$")
	public void browser_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	}

	@Then("^click on new participants button$")
	public void click_on_new_participants_button() throws Throwable {
	   page.newParticipants.click();
	   Thread.sleep(1000);
	}

	@Then("^click on cancel button verify participant form should be closed or not$")
	public void click_on_cancel_button_verify_participant_form_should_be_closed_or_not() throws Throwable {
	   page.participantsformcancel.click();
	   Thread.sleep(4000);
	   page.newParticipants.click();
	}

	@Then("^enter FirstName \"(.*?)\"$")
	public void enter_FirstName(String arg1) throws Throwable {
		driver.findElement(By.name("firstName")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^enter LastName \"(.*?)\"$")
	public void enter_LastName(String arg1) throws Throwable {
		  driver.findElement(By.name("lastName")).sendKeys(arg1);
		  Thread.sleep(1000);
	}

	@Then("^enter EmailAddress \"(.*?)\"$")
	public void enter_EmailAddress(String arg1) throws Throwable {
		  driver.findElement(By.name("email")).sendKeys(arg1);
		  Thread.sleep(1000);
	}

	@Then("^enter PrimaryContactNumber \"(.*?)\"$")
	public void enter_PrimaryContactNumber(String arg1) throws Throwable {
		  driver.findElement(By.name("phone")).sendKeys(arg1);
		   Thread.sleep(1000);
	}

	@Then("^select Sex \"(.*?)\"$")
	public void select_Sex(String arg1) throws Throwable {
		/*
		 * Thread.sleep(1000); WebElement e=driver.findElement(By.xpath(
		 * "/html/body/div[5]/div[3]/div/div[2]/form/div[2]/div[4]/div[1]/div/div/input"
		 * )); //e.click();
		 * 
		 * Select s=new Select(e);
		 * 
		 * s.selectByVisibleText(arg1);
		 */
	}

	@Then("^enter  DateofBirth \"(.*?)\"$")
	public void enter_DateofBirth(String arg1) throws Throwable {
		driver.findElement(By.name("dob")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^enter Primarycarephysician \"(.*?)\"$")
	public void enter_Primarycarephysician(String arg1) throws Throwable {
		driver.findElement(By.name("primaryCarePhysician")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^enter Physician's phone \"(.*?)\"$")
	public void enter_Physician_s_phone(String arg1) throws Throwable {
		driver.findElement(By.name("physicianPhone")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^enter StreetAddress \"(.*?)\"$")
	public void enter_StreetAddress(String arg1) throws Throwable {
		driver.findElement(By.name("streetAddress")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^select Country \"(.*?)\"$")
	public void select_Country(String arg1) throws Throwable {
		driver.findElement(By.name("country")).click();
		  Select s=new Select(driver.findElement(By.className("MuiButtonBase-root MuiListItem-root MuiMenuItem-root Mui-selected MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button Mui-selected")));
		  s.selectByVisibleText(arg1);
	}

	@Then("^select Province \"(.*?)\"$")
	public void select_Province(String arg1) throws Throwable {
		/*
		 * Select s=new Select(driver.findElement(By.name("province")));
		 * s.selectByVisibleText(arg1);
		 */
	}

	@Then("^enter PostalCode \"(.*?)\"$")
	public void enter_PostalCode(String arg1) throws Throwable {
		driver.findElement(By.name("postalCode")).sendKeys(arg1);
		Thread.sleep(1000);
	}

	@Then("^enter Height  \"(.*?)\"$")
	public void enter_Height(String arg1) throws Throwable {
		  driver.findElement(By.name("height")).sendKeys(arg1);
		  Thread.sleep(1000);
	}

	@Then("^enter Weight  \"(.*?)\"$")
	public void enter_Weight(String arg1) throws Throwable {
		 driver.findElement(By.name("weight")).sendKeys(arg1);
		 Thread.sleep(1000);
	}

	@Then("^enter the Allergies \"(.*?)\"$")
	public void enter_the_Allergies(String arg1) throws Throwable {
		 driver.findElement(By.name("allergies")).sendKeys(arg1);
		   Thread.sleep(1000);
	}

	@Then("^enter YearsOfdiagnosis \"(.*?)\"$")
	public void enter_YearsOfdiagnosis(String arg1) throws Throwable {
		 driver.findElement(By.name("yearOfDiagnosis")).sendKeys(arg1);
		 Thread.sleep(1000);
	}

	@Then("^enter BSA details \"(.*?)\"$")
	public void enter_BSA_details(String arg1) throws Throwable {
		 driver.findElement(By.name("bsa")).sendKeys(arg1);
		 Thread.sleep(1000);
	}

	@Then("^enter ReferringPhysician \"(.*?)\"$")
	public void enter_ReferringPhysician(String arg1) throws Throwable {
		driver.findElement(By.name("referringPhysician")).sendKeys(arg1);
		 Thread.sleep(1000);
	}

	@Then("^enter treatmentIinitiatedOn date \"(.*?)\"$")
	public void enter_treatmentIinitiatedOn_date(String arg1) throws Throwable {
		 driver.findElement(By.name("treatmentOn")).sendKeys(arg1);
		 Thread.sleep(1000);
	}

	@Then("^select Indications \"(.*?)\"$")
	public void select_Indications(String arg1) throws Throwable {
		/*
		 * Select s=new Select(driver.findElement(By.name("indications")));
		 * s.selectByVisibleText(arg1);
		 */
	}

	@Then("^verify mouse hover effect on save changes button and click on button and verify participants should be added$")
	public void verify_mouse_hover_effect_on_save_changes_button_and_click_on_button_and_verify_participants_should_be_added() throws Throwable {
	 WebElement e= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[2]/button/span[1]"));
	Actions action=new Actions(driver);
	action.moveToElement(e).build().perform();
	Thread.sleep(1000);
	action.moveToElement(e).click();
	}

	@When("^click on filter button on participant page$")
	public void click_on_filter_button_on_participant_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		page.participantfilter.click();
		
	}

	@Then("^Verify trials,trial tags,indications,source,patient tags,age,sex,location options should display for the filter or not$")
	public void verify_trials_trial_tags_indications_source_patient_tags_age_sex_location_options_should_display_for_the_filter_or_not() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		List<WebElement> e=driver.findElements(By.className("MuiAccordionSummary-content"));
	for(int i=0;i<e.size();i++) {
		
		System.out.println("filters are=" +e.get(i).getText());
		 e.get(i).click();
		 Thread.sleep(2000);
	}
	   page.participantsFilterCancel.click();	}

	@Then("^select trials filter options and verify participants details should be display based on the selected options$")
	public void select_trials_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
		Thread.sleep(1000);
		page.participantfilter.click();
		Thread.sleep(1000);
		
		page.Trialfilter.click();
		Thread.sleep(2000);
	List<WebElement> e=driver.findElements(By.className("PrivateSwitchBase-input-98"));
	System.out.println(e.size());
	for(int i=0;i<e.size();i++) {
		 e=driver.findElements(By.className("PrivateSwitchBase-input-98"));
		 e.get(i).click();
		 Thread.sleep(2000);
		 e.get(i).click();
		
	}
	
	}

	@Then("^select trials tags filter options and verify participants details should be display based on the selected options$")
	public void select_trials_tags_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
	   page.trialTags.click();
	}

	@Then("^select indication filter options and verify participants details should be display based on the selected options$")
	public void select_indication_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
	   page.indicationfilter.click();
	}

	@Then("^select source filter options and verify participants details should be display based on the selected options$")
	public void select_source_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
	  page.sourceFilter.click();
	}

	@Then("^search patients tag and verify participants should be display based on the searched tags$")
	public void search_patients_tag_and_verify_participants_should_be_display_based_on_the_searched_tags() throws Throwable {
	   
	}

	@Then("^select age and verify participants details should be display based on the selected age$")
	public void select_age_and_verify_participants_details_should_be_display_based_on_the_selected_age() throws Throwable {
	  
	}

	@Then("^select sex filter options and verify participants details should be display based on the selected options$")
	public void select_sex_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
	   page.SexFilter.click();
	}

	@Then("^select location filter options and verify participants details should be display based on the selected options$")
	public void select_location_filter_options_and_verify_participants_details_should_be_display_based_on_the_selected_options() throws Throwable {
	    page.Locationfilter.click();
	}

	@Then("^click on cancel button and verify filter side bar should be closed or not$")
	public void click_on_cancel_button_and_verify_filter_side_bar_should_be_closed_or_not() throws Throwable {
	    
	}

	@When("^open participants page$")
	public void open_participants_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	}

	@When("^search participants name \"(.*?)\" on search bar$")
	public void search_participants_name_on_search_bar(String arg1) throws Throwable {
	 Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys(arg1);
	}

	@Then("^verify participants details should be display based on search participants$")
	public void verify_participants_details_should_be_display_based_on_search_participants() throws Throwable {
	   Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div/div[1]/div/div[2]/input")).getAttribute("value");
		System.out.println("pass1" +actual);
		String expected=driver.findElement(By.className("MUIDataTableBodyCell-root-120")).getText();
		System.out.println("pass2" +expected);
		if(actual.equalsIgnoreCase(expected)) {
			Assert.assertEquals(actual, expected);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			System.out.println("pass");
			
		}
		else {
			
			System.out.println("fail");
		}
	}

	



}




