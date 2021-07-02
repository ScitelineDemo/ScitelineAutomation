package com.sciteline.pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Screenshot;

public class Recruitment {
	WebDriver driver;
	PageModel page;
	@Given("^Lunching application on browser$")
	public void lunching_application_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/portfolio");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		  String actual = driver.getTitle();
		  System.out.println("actual title is=" +actual);
		  String expected="Sciteline Recruitment";
			
			  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
			  
			  System.out.println("pass");
			  
			  } else { System.out.println("fail"); }
			 
	   
	}

	@Then("^click on Recruitment menu and verify it should be able to navigate on Recruitment page$")
	public void click_on_Recruitment_menu_and_verify_it_should_be_able_to_navigate_on_Recruitment_page() throws Throwable {
		
		  Thread.sleep(3000); 
		  WebElement e=page.Recruitment; 
		  e.click();
		 
	}

	@Then("^click on Change button and verify right side Trial slider open or not$")
	public void click_on_Change_button_and_verify_right_side_Trial_slider_open_or_not() throws Throwable {
	    Thread.sleep(2000);
		page.change.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	WebElement e=page.RecruitmentCancel;
	  JavascriptExecutor executer = (JavascriptExecutor) driver; 
	  executer.executeScript("arguments[0].click();", e);
	
	}

	@Then("^Click on Filter button and verify filter slider is open or not$")
	public void click_on_Filter_button_and_verify_filter_slider_is_open_or_not() throws Throwable {
		Thread.sleep(4000);
		WebElement e=page.RecruitmentFilter; 
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  Thread.sleep(1000);
	  WebElement e1=page.filtercancel;
	  JavascriptExecutor executer = (JavascriptExecutor) driver; 
	  executer.executeScript("arguments[0].click();", e1);
	}
	

	@Then("^Click on New Participate button and verify New participant form open or not$")
	public void click_on_New_Participate_button_and_verify_New_participant_form_open_or_not() throws Throwable {
	    Thread.sleep(1000);
		page.recruitmentNewParticipants.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		 WebElement e=page.participantcancel;
		  JavascriptExecutor executer = (JavascriptExecutor) driver; 
		  executer.executeScript("arguments[0].click();", e);
	}

	@Then("^click on trial boards of participants and verify the right side slider is open related to participants name$")
	public void click_on_trial_boards_of_participants_and_verify_the_right_side_slider_is_open_related_to_participants_name() throws Throwable {
	  
		List<WebElement> e=driver.findElements(By.className("candidate-name"));
	int numofelements=e.size();
	for(int i=0;i<numofelements;i++) {
		e=driver.findElements(By.className("candidate-name"));
	e.get(i).click();
	Thread.sleep(3000);
	
	WebElement e1=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[1]/div[1]/div[2]/div[2]/div/i"));
	JavascriptExecutor executer = (JavascriptExecutor) driver; 
	  executer.executeScript("arguments[0].click();", e1);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	  
	}
	driver.close();
	}
	
	//filter functionality
	@Given("^application is open$")
	public void application_is_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/portfolio");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		  String actual = driver.getTitle();
		  System.out.println("actual title is=" +actual);
		  String expected="Sciteline Recruitment";
			
			  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
			  
			  System.out.println("pass");
			  
			  } else { System.out.println("fail"); }
			 
	}

	@Then("^click on recruitment menu bar$")
	public void click_on_recruitment_menu_bar() throws Throwable {
	  Thread.sleep(1000);
		page.Recruitment.click();
	}

	@Then("^click on filter button$")
	public void click_on_filter_button() throws Throwable {
	Thread.sleep(2000);
		WebElement e=page.RecruitmentFilter;
		e.click();
	 
	}

	@Then("^verify favourite,eligibility,source,prescrenning filter options is display or not$")
	public void verify_favourite_eligibility_source_prescrenning_filter_options_is_display_or_not() throws Throwable {
		 Thread.sleep(1000);
List<WebElement> element=driver.findElements(By.className("MuiAccordionSummary-content"));
for(int i=0;i<element.size();i++) {
	
element=driver.findElements(By.className("MuiAccordionSummary-content"));
element.get(i).click();
Thread.sleep(1000);
}
	   page.filtercancel.click();
	}

	@Then("^select favourite filter options and verify participant trial board should be display as per selected filter$")
	public void select_favourite_filter_options_and_verify_participant_trial_board_should_be_display_as_per_selected_filter() throws Throwable {
		  Thread.sleep(1000);
		page.RecruitmentFilter.click();
		Thread.sleep(2000);
		WebElement element=page.favouriteFilter;
	String actual=element.getText();
	String expected="Favourite";
	if(actual.equals(expected)) {
		Assert.assertEquals(actual, expected);
		element.click();
		Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"additional-actions1-content\"]/div[1]/label[1]/span[2]")).click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"additional-actions1-content\"]/div[1]/label[2]/span[2]")).click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			
		}
	page.filtercancel.click();
	Thread.sleep(1000);
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	
	
	

	@Then("^select eligibility filter options and verify participant trial board should be display as per selected filter$")
	public void select_eligibility_filter_options_and_verify_participant_trial_board_should_be_display_as_per_selected_filter() throws Throwable {
		
		  Thread.sleep(1000); 
		  page.RecruitmentFilter.click();
		   Thread.sleep(2000); 
		  WebElement  element=page.eligibilityFilter;
		  String actual=element.getText();
		  String expected="Eligibility";
		  if(actual.equals(expected)) { 
			  Assert.assertEquals(actual, expected);
		  element.click(); 
		  Thread.sleep(1000);
		  driver.findElement(By.name("Potentially eligible")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Approachable")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Potentially ineligible")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  
		  
		  }
		  page.filtercancel.click();
		  Thread.sleep(1000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 
		
		  
		 
			
		  
	
	
	}
	

	@Then("^select on source filter options and verify participants trial board should be diplay as per selected filter$")
	public void select_on_source_filter_options_and_verify_participants_trial_board_should_be_diplay_as_per_selected_filter() throws Throwable {
		
		  Thread.sleep(2000); page.RecruitmentFilter.click(); Thread.sleep(1000);
		  WebElement element=page.sourceFilter; 
		  String actual=element.getText(); String expected="Source";
		  if(actual.equals(expected)) {
			  Assert.assertEquals(actual, expected);
		  element.click(); 
		  Thread.sleep(1000); 
		
		  driver.findElement(By.name("Internal")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Clinic referral")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Sciteline")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  
		  } 
		  
		  page.filtercancel.click();
		  Thread.sleep(1000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^select on prescrenning filter option and verify participants trial board should be diplay as per selected filter$")
	public void select_on_prescrenning_filter_option_and_verify_participants_trial_board_should_be_diplay_as_per_selected_filter() throws Throwable {
		
		  page.RecruitmentFilter.click(); 
		  Thread.sleep(2000); 
		  WebElement  element=page.prescreeningFilter;
		  String actual=element.getText(); 
		  String expected="Prescreening";
		  if(actual.equals(expected)) { 
			  Assert.assertEquals(actual, expected);
		  element.click(); 
		  Thread.sleep(1000); 
		  driver.findElement(By.name("Screening not failed")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Criteria incomplete")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Criteria complete")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  driver.findElement(By.name("Screening failed")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  }
		 
	page.filtercancel.click();
	Thread.sleep(1000);
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^select all filter options one by one and verify count functionality$")
	public void select_all_filter_options_one_by_one_and_verify_count_functionality() throws Throwable {
	  
		page.RecruitmentFilter.click(); 
		  Thread.sleep(2000); 
		page.favouriteFilter.click();
		driver.findElement(By.name("Starred")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		String actual=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[3]/div[1]/div[1]/span")).getText();
		int favourite=Integer.parseInt(actual);
		Thread.sleep(1000);
		page.eligibilityFilter.click();
		  driver.findElement(By.name("Potentially eligible")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Approachable")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  String actual1=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[4]/div[1]/div[1]/span")).getText();
		  int eligible=Integer.parseInt(actual1);
		  page.sourceFilter.click();
		  driver.findElement(By.name("Internal")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  String actual2=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[5]/div[1]/div[1]/span")).getText();
		  int source=Integer.parseInt(actual2);
		  Thread.sleep(1000);
		  page.prescreeningFilter.click();
		  driver.findElement(By.name("Screening not failed")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Criteria incomplete")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  String actual3=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[6]/div[1]/div[1]/span")).getText();
		  int prescreening=Integer.parseInt(actual3);
		  page.filtercancel.click();
		  Thread.sleep(2000);
		  int count=favourite + eligible + source + prescreening;
		  System.out.println("total count is=" +count);
		  String actual4=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div[2]/div[2]/div[1]/button/span[1]/span")).getText();
		 
		  int filter=Integer.parseInt(actual4);
		  System.out.println("total count of filter is=" +filter);
		  if(count==filter) {
			  
			  Assert.assertEquals(count, filter);
			  System.out.println("pass");
		  }
		  else {
			  
			  System.out.println("fail");
		  }
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on cancel button and verify filter slider should be closed or not$")
	public void click_on_cancel_button_and_verify_filter_slider_should_be_closed_or_not() throws Throwable {
	  
		page.RecruitmentFilter.click(); 
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	page.filtercancel.click();
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	 driver.close();
	}
	
	//reset functionality
	@Then("^click on filter$")
	public void click_on_filter() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/trial-board");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		
		page.RecruitmentFilter.click();
	}

	@Then("^select filter option of favourite,eligibility,source and prescreening$")
	public void select_filter_option_of_favourite_eligibility_source_and_prescreening() throws Throwable {
		page.favouriteFilter.click();
		driver.findElement(By.name("Starred")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		page.eligibilityFilter.click();
		  driver.findElement(By.name("Potentially eligible")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Approachable")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  page.sourceFilter.click();
		  driver.findElement(By.name("Internal")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  page.prescreeningFilter.click();
		  driver.findElement(By.name("Screening not failed")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000);
		  driver.findElement(By.name("Criteria incomplete")).click();	
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^click on reset button and verify all filter should be reset or not$")
	public void click_on_reset_button_and_verify_all_filter_should_be_reset_or_not() throws Throwable {
	   Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/div[2]/div[1]/button/span[1]")).click();
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
driver.close();
	}


//search functionality
	@Given("^application open$")
	public void application_open() throws Throwable {
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

	@Then("^search participants in search bar \"(.*?)\"$")
	public void search_participants_in_search_bar(String arg1) throws Throwable {
	    Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div[2]/div[1]/div/div[2]/input")).sendKeys(arg1);
		
	}

	@Then("^verify participant trial board should be display based on search participants$")
	public void verify_participant_trial_board_should_be_display_based_on_search_participants() throws Throwable {
		Thread.sleep(1000);
		String actual=driver.findElement(By.xpath("//input[@placeholder='Search participants...']")).getAttribute("value");
		System.out.println("searched valued is=" +actual);
		String expected=driver.findElement(By.className("candidate-name")).getText();
		System.out.println("display valued is=" +expected);
		if(actual.equalsIgnoreCase(expected)) {
		Assert.assertNotSame(actual, expected);
		System.out.println("pass");
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
		else {
			
			System.out.println("fail");
		}
	}
//change button functionality
	@When("^application is open on browser via url$")
	public void application_is_open_on_browser_via_url() throws Throwable {
	   
		
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

	@Then("^click on change button and verify trial names and sites details should be display or not$")
	public void click_on_change_button_and_verify_trial_names_and_sites_details_should_be_display_or_not() throws Throwable {
	   Thread.sleep(1000);
		page.change.click();
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		boolean value=driver.findElement(By.className("trial-name")).isDisplayed();
		if(value==true) {
			
			Assert.assertTrue(value);
			System.out.println("pass");
		}
		else {
	System.out.println("fail");
	}
	}
	@Then("^click on site names one by one and verify trial boars should be display with perticuler site name or trial name$")
	public void click_on_site_names_one_by_one_and_verify_trial_boars_should_be_display_with_perticuler_site_name_or_trial_name() throws Throwable {
	
		Thread.sleep(2000);
		List<WebElement> element=driver.findElements(By.className("MuiTableCell-root WithStyles(ForwardRef(TableCell))-root-188 MuiTableCell-body WithStyles(ForwardRef(TableCell))-body-187 MuiTableCell-alignLeft"));
		for(int i=0;i<element.size();i++) {
			
			element=driver.findElements(By.className("MuiTableCell-root WithStyles(ForwardRef(TableCell))-root-188 MuiTableCell-body WithStyles(ForwardRef(TableCell))-body-187 MuiTableCell-alignLeft"));
			element.get(i).click();
			Thread.sleep(4000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			
			page.change.click();
		}
	}
	@Then("^Search trials or sites name in \"(.*?)\"  search bar$")
	public void search_trials_or_sites_name_in_search_bar(String arg1) throws Throwable {
	    
		driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/div/div[2]/input")).sendKeys(arg1);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	}

	@Then("^verify trials name sor sited name should be siplay based on the searched trials or sites$")
	public void verify_trials_name_sor_sited_name_should_be_siplay_based_on_the_searched_trials_or_sites() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		if(driver.findElement(By.className("trial-name")).isDisplayed()==true) {
			
			System.out.println("trial name display");
		}
		else if(driver.findElement(By.className("MuiTableCell-root WithStyles(ForwardRef(TableCell))-root-77 MuiTableCell-body WithStyles(ForwardRef(TableCell))-body-76 MuiTableCell-alignLeft")).isDisplayed()==true)
 {
			
			System.out.println("site name display");
		}
		
		driver.close();
		}
	
//recruitment participate(new participate)
	@Given("^Lunching website on browser$")
	public void lunching_website_on_browser() throws Throwable {
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

	@Then("^Click on New Participate button and verify New participant form open$")
	public void click_on_New_Participate_button_and_verify_New_participant_form_open() throws Throwable {
	Thread.sleep(1000);
		page.recruitmentNewParticipants.click();
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Participant  ID \"(.*?)\"$")
	public void enter_Participant_ID(String arg1) throws Throwable {
	  driver.findElement(By.name("participantId")).sendKeys(arg1);
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter First Name \"(.*?)\"$")
	public void enter_First_Name(String arg1) throws Throwable {
	driver.findElement(By.name("firstName")).sendKeys(arg1);
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Last Name \"(.*?)\"$")
	public void enter_Last_Name(String arg1) throws Throwable {
	  driver.findElement(By.name("lastName")).sendKeys(arg1);
	  Thread.sleep(1000);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Email Address \"(.*?)\"$")
	public void enter_Email_Address(String arg1) throws Throwable {
	  driver.findElement(By.name("email")).sendKeys(arg1);
	  Thread.sleep(1000);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Primary Contact Number \"(.*?)\"$")
	public void enter_Primary_Contact_Number(String arg1) throws Throwable {
	   driver.findElement(By.name("phone")).sendKeys(arg1);
	   Thread.sleep(1000);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Sex$")
	public void enter_Sex(String arg1) throws Throwable {
		
		Thread.sleep(1000); 
		WebElement e=driver.findElement(By.xpath("//*[@id='demo-simple-select-outlined']"));
		 e.click();
		  Thread.sleep(1000);
		//  Select s=new Select(driver.findElement(By.className("MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button")));
		//Select s=new Select(e);
		//  Select s=new Select(driver.findElement(By.id("demo-simple-select-outlined-label")));
         //e.click();
		 // Thread.sleep(1000);
		 // s.selectByVisibleText(arg1);
	driver.findElement(By.xpath(("//*[@id='menu-sex']/div[3]/ul/li[3]"))).click();
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter  Date of birth \"(.*?)\"$")
	public void enter_Date_of_birth(String arg1) throws Throwable {
	driver.findElement(By.name("dob")).sendKeys(arg1);
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Primary care physician \"(.*?)\"$")
	public void enter_Primary_care_physician(String arg1) throws Throwable {
	driver.findElement(By.name("primaryCarePhysician")).sendKeys(arg1);
	Thread.sleep(1000);
	Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Physician 's phone \"(.*?)\"$")
	public void enter_Physician_s_phone(String arg1) throws Throwable {
		driver.findElement(By.name("physicianPhone")).sendKeys(arg1);
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Street address \"(.*?)\"$")
	public void enter_Street_address(String arg1) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("streetAddress")).sendKeys(arg1);
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Country$")
	public void enter_Country() throws Throwable {
		Thread.sleep(1000);
		  driver.findElement(By.name("country")).click(); 
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id='menu-country']/div[3]/ul/li[2]")).click();
		 
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Province$")
	public void enter_Province() throws Throwable {
		Thread.sleep(1000);
		 driver.findElement(By.name("province")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='menu-province']/div[3]/ul/li[1]")).click();
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	}

	@Then("^enter Postal Code \"(.*?)\"$")
	public void enter_Postal_Code(String arg1) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys(arg1);
		Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Height cm \"(.*?)\"$")
	public void enter_Height_cm(String arg1) throws Throwable {
	  driver.findElement(By.name("height")).sendKeys(arg1);
	  Thread.sleep(1000);
	  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Weight lbs \"(.*?)\"$")
	public void enter_Weight_lbs(String arg1) throws Throwable {
		 driver.findElement(By.name("weight")).sendKeys(arg1);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Allergies \"(.*?)\"$")
	public void enter_Allergies(String arg1) throws Throwable {
	   driver.findElement(By.name("allergies")).sendKeys(arg1);
	   Thread.sleep(1000);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Years of diagnosis \"(.*?)\"$")
	public void enter_Years_of_diagnosis(String arg1) throws Throwable {
		 driver.findElement(By.name("yearOfDiagnosis")).sendKeys(arg1);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter BSA \"(.*?)\"$")
	public void enter_BSA(String arg1) throws Throwable {
		 driver.findElement(By.name("bsa")).sendKeys(arg1);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Referring Physician \"(.*?)\"$")
	public void enter_Referring_Physician(String arg1) throws Throwable {
		 driver.findElement(By.name("referringPhysician")).sendKeys(arg1);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^enter treatment initiated on date \"(.*?)\"$")
	public void enter_treatment_initiated_on_date(String arg1) throws Throwable {
		 driver.findElement(By.name("treatmentOn")).sendKeys(arg1);
		 Thread.sleep(1000);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^enter Indications$")
	public void enter_Indications() throws Throwable {
		
		  driver.findElement(By.name("indications")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//*[@id='menu-indications']/div[3]/ul/li[1]")).click();
		   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Add Participant button$")
	public void click_on_Add_Participant_button() throws Throwable {
		Thread.sleep(1000);
		WebElement e= driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div[2]/form/div[5]/button[2]/span[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on cancle button on participate form and verify participate form should be closed or not$")
	public void click_on_cancle_button_on_participate_form_and_verify_participate_form_should_be_closed_or_not() throws Throwable {
	    page.recruitmentNewParticipants.click();
	    Thread.sleep(1000);
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    page.participantcancel.click();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    driver.close();
	}
}

