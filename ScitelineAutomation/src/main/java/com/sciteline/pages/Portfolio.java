package com.sciteline.pages;

import java.util.List;

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
import cucumber.api.java.en.When;
import utils.Screenshot;

public class Portfolio {
	
	WebDriver driver;
	PageModel page;
	
	@Given("^Launching website through url on browser\\.$")
	public void launching_website_through_url_on_browser() throws Throwable {
	    
	}

	@Then("^click on Login menu$")
	public void click_on_Login_menu() throws Throwable {
	    
	}

	@Then("^Enter valid data on email id and password$")
	public void enter_valid_data_on_email_id_and_password() throws Throwable {
	   
	}

	@Then("^click on Login button$")
	public void click_on_Login_button() throws Throwable {
	    
	}

	@Then("^verify Portfolio page open$")
	public void verify_Portfolio_page_open() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/portfolio/");
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
	
	@Then("^Click on trial name and verify site details are display related trial name$")
	public void click_on_trial_name_and_verify_site_details_are_display_related_trial_name() throws Throwable {
	    Thread.sleep(3000);		
	    List <WebElement> e=driver.findElements(By.id("expandable-button"));
		 int numofelements=e.size();
		 System.out.println(numofelements);
		 for(int i=0;i<numofelements;i++) {
			e= driver.findElements(By.id("expandable-button"));
			    e.get(i).click();
			    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			    Thread.sleep(2000);
			   
		 }
	}


	
		

	@Then("^Click on site name and verify side bar is display with site related details or not$")
	public void click_on_site_name_and_verify_side_bar_is_display_with_site_related_details_or_not() throws Throwable {
		Thread.sleep(2000);
		List <WebElement> e=driver.findElements(By.id("expandable-button"));
		 int numofelements=e.size();
		 System.out.println("trials number" +numofelements);
		 for(int i=0;i<numofelements;i++) {
			 e=driver.findElements(By.id("expandable-button"));
			 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			    e.get(i).click();
			    Thread.sleep(1000);
			   List <WebElement> element= driver.findElements(By.xpath("//p[@style='padding-left: 10px;']"));
			   int num=element.size();
				 System.out.println("sites number" +num);
				 for(int j=0;j<numofelements;j++) {
					 
				 element=driver.findElements(By.xpath("//p[@style='padding-left: 10px;']"));
					    element.get(j).click();
					    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
					    Thread.sleep(1000);
			    Thread.sleep(2000);
			    WebElement e1=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[1]/div/div[1]/div[2]/div[2]/div/i"));
				e1.click();
			Thread.sleep(1000);
			   
			   
		 }
				 
	}
driver.close();
}
	@Given("^application url is open in browser$")
	public void application_url_is_open_in_browser() throws Throwable {
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
		  String expected="Sciteline | Recruitment Product";
			
			  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
			  
			  System.out.println("pass");
			  
			  } else { System.out.println("fail"); }
	}


@Then("^click on filter button and verify filter pop up is open or not$")
public void click_on_filter_button_and_verify_filter_pop_up_is_open_or_not() throws Throwable {
  Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[2]/button/span[1]")).click();
	}

@Then("^select status and phase option and verify trials are display based on the selection of status and phase$")
public void select_status_and_phase_option_and_verify_trials_are_display_based_on_the_selection_of_status_and_phase() throws Throwable {
  
Thread.sleep(2000);
		List <WebElement> element=driver.findElements(By.xpath(("//input[@class='PrivateSwitchBase-input-142']")));
		 int numofelements=element.size();
		 System.out.println(numofelements);
		 for(int i=0;i<numofelements;i++) {
			element= driver.findElements(By.xpath(("//input[@class='PrivateSwitchBase-input-142']")));
			if( driver.findElement(By.xpath(("//input[@class='PrivateSwitchBase-input-142']"))).isSelected()==true)
			{
			List <WebElement> e=driver.findElements(By.xpath(("//input[starts-with(@name,'Phase')]")));
			 int num=e.size();
			 System.out.println(num);
			 for(int j=0;j<num;j++) {
				 e= driver.findElements(By.xpath(("//input[starts-with(@name,'Phase')]")));
				    element.get(j).click();
				   
				    Thread.sleep(2000);
		}
	}
			else {
				 element.get(i).click();
				    
				    Thread.sleep(2000);
			}
			}
		 }
	

	@Then("^verify count functionality on filter$")
	public void verify_count_functionality_on_filter() throws Throwable {
	   
	//WebElement e=	driver.findElement(By.xpath(("//input[@class='PrivateSwitchBase-input-142']")))
	
	}
	@Given("^application is open on browser$")
	public void application_is_open_on_browser() throws Throwable {
	  
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
	  String expected="Sciteline | Recruitment Product";
		
		  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
		  
		  System.out.println("pass");
		  
		  } else { System.out.println("fail"); }
	}

	@Then("^enter data in search field \"(.*?)\"$")
	public void enter_data_in_search_field(String arg1) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div/div/div/div[2]/div[1]/div/div[2]/input")).sendKeys(arg1);
	    Thread.sleep(1000);
		

	}

	@Then("^verify search related data display or not$")
	public void verify_search_related_data_display_or_not() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	
	@When("^open application$")
	public void open_application() throws Throwable {
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
				  String expected="Sciteline | Recruitment Product";
					
					  if(actual.equals(expected)) { Assert.assertEquals(actual, expected);
					  
					  System.out.println("pass");
					  
					  } else { System.out.println("fail"); }
	}



	@Then("^click on all heading and verify arrow should be display for ascending and descending order$")
	public void click_on_all_heading_and_verify_arrow_should_be_display_for_ascending_and_descending_order() throws Throwable {
	   
	List<WebElement> element=driver.findElements(By.className("MUIDataTableHeadCell-data-101"));
	int num=element.size();
	     for(int i=0;i<num;i++) {
	    	 
	    	 element=driver.findElements(By.className("MUIDataTableHeadCell-data-101"));
	    	 element.get(i).click();
	    	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    	 Thread.sleep(1000);
	     }
	    
	}

	
	@Then("^click on pagination dropdown$")
	public void click_on_pagination_dropdown() throws Throwable {
	   
	}


}
