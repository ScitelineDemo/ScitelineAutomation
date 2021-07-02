package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Screenshot;

public class FileTab {
WebDriver driver;
PageModel page;

	//new file
		@Given("^Launching website through url on browser and open participants$")
		public void launching_website_through_url_on_browser_and_open_participants() throws Throwable {
		   
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			Thread.sleep(1000)	;	driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			
			
		}

		@Then("^Click on new participate button$")
		public void click_on_new_participate_button() throws Throwable {
		Thread.sleep(2000);
			WebElement e=page.newParticipants;
		 e.click();
		}

		@Then("^Click on FileandNotes tab$")
		public void click_on_FileandNotes_tab() throws Throwable {
		Thread.sleep(2000);
			WebElement e=page.notesAndFile;
			  e.click();
			  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		@Then("^select Any fileName checkbox and verify checkbox should be selected or not$")
		public void select_Any_fileName_checkbox_and_verify_checkbox_should_be_selected_or_not() throws Throwable {
		   driver.findElement(By.xpath("//*[@id=\"MUIDataTableSelectCell-0\"]")).click();
		   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		@Then("^click on file name and verify it should be sorted or not$")
		public void click_on_file_name_and_verify_it_should_be_sorted_or_not() throws Throwable {
		    WebElement e=driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-4\"]/div/div/div[2]/div[2]/table/thead/tr/th[2]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
		}

		@Then("^click on date added and verify date should be sorted or not$")
		public void click_on_date_added_and_verify_date_should_be_sorted_or_not() throws Throwable {
			  WebElement e=driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-4\"]/div/div/div[2]/div[2]/table/thead/tr/th[3]/span/button/span[1]/div/div[1]"));
				e.click();
				Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
				Thread.sleep(1000);
				e.click();
				Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		driver.close();
		
		}

	//search file
		@Given("^website is open and click on participants$")
		public void website_is_open_and_click_on_participants() throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			Thread.sleep(1000)	;	driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		@Then("^click on add participants button and click on notes and files tab$")
		public void click_on_add_participants_button_and_click_on_notes_and_files_tab() throws Throwable {
			Thread.sleep(1000)	;
			WebElement e=page.newParticipants;
			e.click();
			Thread.sleep(1000)	;
			WebElement e1=page.notesAndFile;
			e1.click();
			Thread.sleep(1000)	;
		}

		@Then("^search file name \"(.*?)\" from the search box and verify file name should be display as per searched file name$")
		public void search_file_name_from_the_search_box_and_verify_file_name_should_be_display_as_per_searched_file_name(String arg1) throws Throwable {
		  
			driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-4\"]/div/div/div[1]/div/div/div[1]/div/div[2]/input")).sendKeys(arg1);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
		}
		@Given("^url is open and click on new participants button$")
		public void url_is_open_and_click_on_new_participants_button() throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			Thread.sleep(1000)	;	driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		@Then("^click on file and notes tab of participants$")
		public void click_on_file_and_notes_tab_of_participants() throws Throwable {
		 WebElement e1=page.newParticipants;
		 e1.click();
		 Thread.sleep(2000);
			WebElement e=page.notesAndFile;
			e.click();
		}

		@Then("^click on upload file button and verify file should be uploaded or not$")
		public void click_on_upload_file_button_and_verify_file_should_be_uploaded_or_not() throws Throwable {
		   Thread.sleep(2000);
	page.uploadFile.sendKeys("C:\\Users\\nteam\\Downloads\\Jenkins CICD.pdf");
		
		
		}
		@When("^participants page is open$")
		public void participants_page_is_open() throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			Thread.sleep(1000)	;	driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		@Then("^click on new participants button and notes and files tab$")
		public void click_on_new_participants_button_and_notes_and_files_tab() throws Throwable {
			 WebElement e1=page.newParticipants;
			 e1.click();
			 Thread.sleep(2000);
				WebElement e=page.notesAndFile;
				e.click();
		
		
		}

		@Then("^click on link url button$")
		public void click_on_link_url_button() throws Throwable {
		Thread.sleep(2000);
			WebElement e= page.Linkurl;
		 e.click();
		}

		@Then("^enter url name \"(.*?)\"$")
		public void enter_url_name(String arg1) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/form/div[1]/div/div/div/input")).sendKeys(arg1);
		}

		@Then("^enter File Name \"(.*?)\"$")
		public void enter_File_Name(String arg1) throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/form/div[2]/div/div/div/input")).sendKeys(arg1);
		}

		@Then("^click on add url button$")
		public void click_on_add_url_button() throws Throwable {
		 WebElement e=driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/form/div[3]/button[2]/span[1]"));
		 e.click();
		}

		@Then("^click on linkurl and click on cancel and verify popup should be closed or not$")
		public void click_on_linkurl_and_click_on_cancel_and_verify_popup_should_be_closed_or_not() throws Throwable {
			Thread.sleep(2000);
			WebElement e= page.Linkurl;
		 e.click();
	WebElement e1=	driver.findElement(By.xpath("/html/body/div[9]/div[3]/div/form/div[3]/button[1]/span[1]"));
	e1.click();
	driver.close();
		
		}

		@When("^url is open then click on new participants$")
		public void url_is_open_then_click_on_new_participants() throws Throwable {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			Thread.sleep(1000)	;	driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		}

		
			 
			
		

		@Then("^click on files and notes tab of new participants$")
		public void click_on_files_and_notes_tab_of_new_participants() throws Throwable {
		
			Thread.sleep(2000);
			WebElement e1=page.newParticipants;
			 e1.click();
			 Thread.sleep(2000);
				WebElement e=page.notesAndFile;
				e.click();
		
		
		
		}

		@Then("^click on action button and verify rename and delete file options should be display or not$")
		public void click_on_action_button_and_verify_rename_and_delete_file_options_should_be_display_or_not() throws Throwable {
		   Thread.sleep(2000);
			
			WebElement e=driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-0\"]/td[4]/div/div/button/span[1]/svg"));
			e.click();
			Thread.sleep(2000);
		String actual =driver.findElement(By.xpath("//*[@id=\"action-menu\"]/div[3]/ul/li[1]")).getText();
		
		System.out.println("actual value is=" +actual);
		
		}

		@Then("^click on rename file option of particular file$")
		public void click_on_rename_file_option_of_particular_file() throws Throwable {
		 
		}

		@Then("^enter name that user wants to rename$")
		public void enter_name_that_user_wants_to_rename() throws Throwable {
		   
		}

		@Then("^click on save changes button and verify that file name should be renamed or not$")
		public void click_on_save_changes_button_and_verify_that_file_name_should_be_renamed_or_not() throws Throwable {
		   
		}

		@Then("^click on delete option for delete file$")
		public void click_on_delete_option_for_delete_file() throws Throwable {
		  
		}


}
