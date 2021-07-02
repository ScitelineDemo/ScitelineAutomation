package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Screenshot;

public class ConcomitantTab {
	WebDriver driver;
	PageModel page;
	@Given("^user is open participants page and click on any participants$")
	public void user_is_open_participants_page_and_click_on_any_participants() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	}
	
	@Then("^click on concomitant$")
	public void click_on_concomitant() throws Throwable {
	  Thread.sleep(2000);
		page.cocomitant.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}


	@Then("^click on Medication / Non-drug therapy header menu$")
	public void click_on_Medication_Non_drug_therapy_header_menu() throws Throwable {
	WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[1]/span/button/span[1]/div/div[1]"));
e.click();
Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
Thread.sleep(2000);
e.click();
Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on indication header menu$")
	public void click_on_indication_header_menu() throws Throwable {
	
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[2]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Dose, route, frequency header menu$")
	public void click_on_Dose_route_frequency_header_menu() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[3]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on start date header menu$")
	public void click_on_start_date_header_menu() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[4]/span/button"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on date added header menu$")
	public void click_on_date_added_header_menu() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[5]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Baseline med header menu$")
	public void click_on_Baseline_med_header_menu() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[6]/span/button"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Continuing post-studyheader menu$")
	public void click_on_Continuing_post_studyheader_menu() throws Throwable {
		WebElement e= driver.findElement(By.xpath("//*[@id=\"simple-tabpanel-2\"]/div/div[2]/div[2]/table/thead/tr/th[7]/span/button/span[1]/div/div[1]"));
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		e.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}


	
	
	
	
	
	
	
	@Given("^user is click on any participants of participants page$")
	public void user_is_click_on_any_participants_of_participants_page() throws Throwable {
	  
		
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			driver = new ChromeDriver();
			PageModel page = new PageModel(driver);
			driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
			driver.manage().window().maximize();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(2000);
	page.newParticipants.click();
	Thread.sleep(2000);
	}

	@Then("^Click on concomitant tab$")
	public void click_on_concomitant_tab() throws Throwable {
	   page.cocomitant.click();
	   Thread.sleep(2000);
		
	}

	@Then("^Click on new therapy button$")
	public void click_on_new_therapy_button() throws Throwable {
	  page.newTherapy.click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^verify new therapy detail pop-up  form open$")
	public void verify_new_therapy_detail_pop_up_form_open() throws Throwable {
	  String actual=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/h2/div/div[1]/span")).getText();
	  String expected="New therapy";
	  Assert.assertEquals(actual, expected);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Therapy name \"(.*?)\"$")
	public void enter_Therapy_name(String arg1) throws Throwable {
	    page.Therapy.sendKeys(arg1);
	    Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter indication \"(.*?)\"$")
	public void enter_indication(String arg1) throws Throwable {
	  page.TherapyIndication.sendKeys(arg1);
	  Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^enter Dose \"(.*?)\"$")
	public void enter_Dose(String arg1) throws Throwable {
	    page.Dose.sendKeys(arg1);
	    Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^select Route of administration \"(.*?)\"$")
	public void select_Route_of_administration(String arg1) throws Throwable {
	    WebElement e=driver.findElement(By.id("routeOfAdministration"));
	   e.click();
	   driver.findElement(By.xpath("//*[@id='menu-']/div[3]/ul/li[1]")).click();
	   Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^select Dose from \"(.*?)\"$")
	public void select_Dose_from(String arg1) throws Throwable {
	
		 WebElement e=driver.findElement(By.id("doseForm"));
		   e.click();
		   driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
		   Thread.sleep(1000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^select Schedule/frequency \"(.*?)\"$")
	public void select_Schedule_frequency(String arg1) throws Throwable {
		 WebElement e=driver.findElement(By.id("frequency"));
		   e.click();
		   driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[1]")).click();
		   Thread.sleep(1000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^enter Start date of therapy \"(.*?)\"$")
	public void enter_Start_date_of_therapy(String arg1) throws Throwable {
	
		WebElement e=page.TherapyStartdate;
		e.click();
		e.clear();
		Thread.sleep(2000);
		e.sendKeys(arg1);
		
	
	}

	@Then("^enter End Date \"(.*?)\"$")
	public void enter_End_Date(String arg1) throws Throwable {
		WebElement e=page.TherapyEnddate;
		e.click();
		e.clear();
		Thread.sleep(2000);
		e.sendKeys(arg1);
	}



	@Then("^select option of Baseline medication$")
	public void select_option_of_Baseline_medication() throws Throwable {
	  
	
	 WebElement e=  driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/form/div[6]/div[2]/div/label[1]"));
	 e.click();
	 Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^select option of continuing at enf of study$")
	public void select_option_of_continuing_at_enf_of_study() throws Throwable {
	  
		 WebElement e=  driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/form/div[7]/div[2]/div/label[2]"));
		 e.click();
		 Thread.sleep(1000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^Click on Add Therapy button$")
	public void click_on_Add_Therapy_button() throws Throwable {
	  page.addTherapy.click();
	  Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	

	@Then("^open url and Click on participate menu$")
	public void open_url_and_Click_on_participate_menu() throws Throwable {
	  
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/participants");
		Thread.sleep(1000)	;	driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		

		
		
	}

	@Then("^click on any participant and click on concomitant tab$")
	public void click_on_any_participant_and_click_on_concomitant_tab() throws Throwable {
	   

		Thread.sleep(2000);
		page.newParticipants.click();
		Thread.sleep(2000);
		page.cocomitant.click();
		 Thread.sleep(1000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^Click on any Therapy detail and verify therapy details pop up is open or not$")
	public void click_on_any_Therapy_detail_and_verify_therapy_details_pop_up_is_open_or_not() throws Throwable {
		 Thread.sleep(1000);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));


	    WebElement e=driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-2\"]/td[1]"));
	    
	    String actual=e.getText();
	    Thread.sleep(1000);
	    e.click();
	    String expected=driver.findElement(By.xpath("/html/body/div[5]/div[3]/div/div/h2/div/div[1]/span")).getText();
	    Assert.assertEquals(actual, expected);
	    Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}


	@Then("^edit therapy name \"(.*?)\"$")
	public void edit_therapy_name(String arg1) throws Throwable {
	    page.Therapy.sendKeys(arg1);
	    Thread.sleep(2000);
	
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on add therapy button$")
	public void click_on_add_therapy_button() throws Throwable {
	    page.addTherapy.click();
	    Thread.sleep(1000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}


}
