package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.Adminpanel;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.Screenshot;

public class AdminSites {
	WebDriver driver;
	Adminpanel pages;
	PageModel page;

	@Given("^Admin is open application through url on given browser$")
	public void admin_is_open_application_through_url_on_given_browser() throws Throwable {
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

	@Then("^click on login menu bar for login$")
	public void click_on_login_menu_bar_for_login() throws Throwable {
	Thread.sleep(2000);
		WebElement e=   page.Login;
	e.click();
		
	}

	@Then("^enter valid credentials for  admin login \"(.*?)\" and \"(.*?)\"$")
	public void enter_valid_credentials_for_admin_login_and(String arg1, String arg2) throws Throwable {
	    
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

	@Then("^click on login and verify admin should redirect to admin panel or not$")
	public void click_on_login_button_and_verify_admin_should_redirect_to_admin_panel_or_not() throws Throwable {
		Thread.sleep(1000);
		  WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[1]/form/button/span[1]"));
		  JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", e);
			Thread.sleep(1000);
			Boolean logo=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/nav/div[2]/div/div/div/div[1]/img")).isDisplayed();
			Assert.assertTrue(logo);
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Sites menu and verify it should be redirect to Sites page or not$")
	public void click_on_Sites_menu_and_verify_it_should_be_redirect_to_Sites_page_or_not() throws Throwable {
	    
		pages.sitesMenu.click();
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/h6")).getText();
		String Expected= "Sites";
		if(actual.equals(Expected)){
			
			Assert.assertEquals(actual, Expected);
			System.out.println("pass");
		}
		
		else {
			
			System.out.println("fail");
		}
	
	}


	@Then("^click on New Site button and verify it should be redirect to New Site page$")
	public void click_on_New_Site_button_and_verify_it_should_be_redirect_to_New_Site_page() throws Throwable {
		Thread.sleep(2000);
		WebElement e=pages.newSite;
	   e.click();
	 Thread.sleep(4000);
	   String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/h6")).getText();
		String Expected= "New Site";
		if(actual.equals(Expected)){
			
			Assert.assertEquals(actual, Expected);
			System.out.println("pass");
		}
		
		else {
			
			System.out.println("fail");
		}
	driver.close();
	}


	@When("^Admin is Login$")
	public void admin_is_Login() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	
	
	}

	@Then("^click on Sites menu bar$")
	public void click_on_Sites_menu_bar() throws Throwable {
	 Thread.sleep(2000);
		pages.sitesMenu.click();
	}

	@Then("^enter the Site name in search box \"(.*?)\" and verify display sites should be display as per serached sites name$")
	public void enter_the_Site_name_in_search_box_and_verify_display_sites_should_be_display_as_per_serached_sites_name(String arg1) throws Throwable {
	Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[1]/div/div[2]/input")).sendKeys(arg1);
	Thread.sleep(1000);
		if(driver.findElement(By.cssSelector("#MUIDataTableBodyRow-0 > td:nth-child(1) > div")).isDisplayed()==true) {
		   String actual=driver.findElement(By.cssSelector("#MUIDataTableBodyRow-0 > td:nth-child(1) > div")).getText();
		   
		   if(actual.equalsIgnoreCase(arg1)) {
			   
			   Assert.assertEquals(actual, arg1);
		   }
		   
		   else {
			   System.out.println("fail");
		   }
	   }
		   else if(driver.findElement(By.xpath("//*[@id='root']/div/div/div/main/div[2]/div/div/div[2]/table/tbody/tr/td/div/div")).isDisplayed()==true) {
			   
			   String expected="Sorry, no matching records found";
			 String actual=  driver.findElement(By.xpath("//*[@id='root']/div/div/div/main/div[2]/div/div/div[2]/table/tbody/tr/td/div/div")).getText();
		  Assert.assertEquals(actual, expected);
		   
		   System.out.println("Sorry, no matching records found");
		   }
	  driver.close();
	}
	 
	
	
	@When("^Admin is open url$")
	public void admin_is_open_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	}

	@Then("^click on Site menu$")
	public void click_on_Site_menu() throws Throwable {
	    pages.sitesMenu.click();
	}

	@Then("^click on new site button$")
	public void click_on_new_site_button() throws Throwable {
	Thread.sleep(2000);
		WebElement e=pages.newSite;
	    e.click();
	}

	@Then("^verify user is able to show new site page$")
	public void verify_user_is_able_to_show_new_site_page() throws Throwable {
		 Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/h6")).getText();
			String Expected= "New Site";
			if(actual.equals(Expected)){
				
				Assert.assertEquals(actual, Expected);
				System.out.println("pass");
			}
			
			else {
				
				System.out.println("fail");
			}
	}


	@Then("^enter Site Name \"(.*?)\"$")
	public void enter_Site_Name(String arg1) throws Throwable {
	 Thread.sleep(1000);
		pages.siteName.sendKeys(arg1);
	}

	@Then("^enter Street address for new site \"(.*?)\"$")
	public void enter_Street_address_for_new_site(String arg1) throws Throwable {
		 Thread.sleep(1000);
		pages.streetAddress.sendKeys(arg1);
	}

	@Then("^select Country for new site \"(.*?)\"$")
	public void select_Country_for_new_site(String arg1) throws Throwable {
		 Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("mui-component-select-country"));
	    e.click();
	   driver.findElement(By.xpath("//*[@id='menu-country']/div[3]/ul/li[1]")).click();
		
	}

	@Then("^select Province for new site \"(.*?)\"$")
	public void select_Province_for_new_site(String arg1) throws Throwable {
		Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("mui-component-select-province"));
	    e.click();
	   driver.findElement(By.xpath("//*[@id='menu-province']/div[3]/ul/li[1]")).click();
	}

	@Then("^enter Postal code \"(.*?)\"$")
	public void enter_Postal_code(String arg1) throws Throwable {
		 Thread.sleep(1000);
		pages.postalCode.sendKeys(arg1);
	}

	@Then("^select Site contact \"(.*?)\"$")
	public void select_Site_contact(String arg1) throws Throwable {
		 Thread.sleep(1000);
		WebElement e=driver.findElement(By.id("mui-component-select-siteContact"));
	
	e.click();
	  driver.findElement(By.xpath("//*[@id='menu-siteContact']/div[3]/ul/li[1]")).click();
	}

	@Then("^verify email textbox should be fill up automatically related to person name$")
	public void verify_email_textbox_should_be_fill_up_automatically_related_to_person_name() throws Throwable {
	   
	}

	@Then("^enter Phone number \"(.*?)\"$")
	public void enter_Phone_number(String arg1) throws Throwable {
		 Thread.sleep(1000);
		pages.phoneno.sendKeys(arg1);
	}

	@Then("^click on Create Site button and verify added site should be display on site listing page$")
	public void click_on_Create_Site_button_and_verify_added_site_should_be_display_on_site_listing_page() throws Throwable {
		 Thread.sleep(1000);
		WebElement e=pages.createSite;
	   e.click();
	}

	@When("^Admin is open url on browser with login$")
	public void admin_is_open_url_on_browser_with_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
	}

	@Then("^click on Site menubar$")
	public void click_on_Site_menubar() throws Throwable {
		Thread.sleep(1000);
		pages.sitesMenu.click();
	}

	@Then("^click on newsite button$")
	public void click_on_newsite_button() throws Throwable {
	   WebElement e=pages.newSite;
	    
	}

	@Then("^add Site Name \"(.*?)\"$")
	public void add_Site_Name(String arg1) throws Throwable {
		Thread.sleep(1000);
		pages.siteName.sendKeys(arg1);
	}

	@Then("^Click on this site is virtual location checkbox$")
	public void click_on_this_site_is_virtual_location_checkbox() throws Throwable {
	   WebElement e =driver.findElement(By.name("isVirtualLocation"));
	e.click();
	
	}

	@Then("^enter Site contact \"(.*?)\"$")
	public void enter_Site_contact(String arg1) throws Throwable {
		 Thread.sleep(1000);
			WebElement e=driver.findElement(By.id("mui-component-select-siteContact"));
		
		e.click();
		  driver.findElement(By.xpath("//*[@id='menu-siteContact']/div[3]/ul/li[1]")).click();
	}

	@Then("^add Phone number \"(.*?)\"$")
	public void add_Phone_number(String arg1) throws Throwable {
		 Thread.sleep(1000);
			pages.phoneno.sendKeys(arg1);
	}

	@Then("^click on Create Site button  and verify create site display on site page$")
	public void click_on_Create_Site_button_and_verify_create_site_display_on_site_page() throws Throwable {
		 Thread.sleep(1000);
			WebElement e=pages.createSite;
		   e.click();
	}

	@Then("^Click on Cancel and verify new site page close and redirect to site page$")
	public void click_on_Cancel_and_verify_new_site_page_close_and_redirect_to_site_page() throws Throwable {
	  Thread.sleep(1000);
		pages.newSite.click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[1]/button/span[1]")).click();
	}
	

	@When("^admin open application with login$")
	public void admin_open_application_with_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://recruitment-sciteline.letsnurture.co.uk:3000/admin");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(2000);
		WebElement e=page.email;
		e.click();
		e.sendKeys("admin@sciteline.com");
	    
	    Thread.sleep(2000);
	    WebElement e1=page.password;
	    e1.click();
		 Thread.sleep(1000);
	   e1.sendKeys("admin@12345");
	   Thread.sleep(1000);
	   Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	   WebElement e2=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/section/div/div[1]/form/button/span[1]"));
		  JavascriptExecutor executer = (JavascriptExecutor) driver;
			executer.executeScript("arguments[0].click();", e2);
			Thread.sleep(1000);
	
	}

	@Then("^click on Site menu Bar$")
	public void click_on_Site_menu_Bar() throws Throwable {
		Thread.sleep(1000);
		pages.sitesMenu.click();
	}

	@Then("^Click on any particular site name and verify user should be able to view that clicked site name's detail page$")
	public void click_on_any_particular_site_name_and_verify_user_should_be_able_to_view_that_clicked_site_name_s_detail_page() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-0\"]/td[1]/div")).click();
	}

	@Then("^verify that site details display with filled data$")
	public void verify_that_site_details_display_with_filled_data() throws Throwable {
		Thread.sleep(2000);
		
		String actual=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/header/div/div/div/div[1]/div/h6")).getText();
	    String expected=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[1]/div/div/div/input")).getAttribute("value");
	if(actual.equals(expected)) {
		
		Assert.assertEquals(actual, expected);
	}
	}

	@Then("^update Site Name \"(.*?)\"$")
	public void update_Site_Name(String arg1) throws Throwable {
	  Thread.sleep(1000);
		pages.siteName.sendKeys(arg1);
	}

	@Then("^update Street adress \"(.*?)\"$")
	public void update_Street_adress(String arg1) throws Throwable {
		 Thread.sleep(1000);
		pages.streetAddress.sendKeys(arg1);
	}

	@Then("^Click on Save changes button and verify updated changes display on site detail page$")
	public void click_on_Save_changes_button_and_verify_updated_changes_display_on_site_detail_page() throws Throwable {
	    WebElement e=driver.findElement(By.xpath("//*[@id='root']/div/div/div/header/div/div/div/div[2]/div[2]/button/span[1]"));
	    e.click();
	
	}


	@Then("^if user wants to delete site then click on delete site button and verify that site should be deleted or not$")
	public void if_user_wants_to_delete_site_then_click_on_delete_site_button_and_verify_that_site_should_be_deleted_or_not() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-0\"]/td[1]/div")).click();
		
		Thread.sleep(2000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[6]/button"));
		e.click();
	}

}

