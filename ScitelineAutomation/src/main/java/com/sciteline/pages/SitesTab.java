package com.sciteline.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.pom.Adminpanel;
import com.pom.PageModel;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SitesTab {

	SoftAssert softassert;
	WebDriver driver;
	Adminpanel admin;
	PageModel page;
	
	
	@Given("^admin is login with enter valid credentials$")
	public void admin_is_login_with_enter_valid_credentials(DataTable arg1) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\nteam\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	 driver = new ChromeDriver();
	 PageModel page = new PageModel(driver);
	 driver.get("https://sciteline.letsnurture.co.uk");
	// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 driver.manage().window().maximize();
	 page.Login.click();
	 
	 List<List<String>> data=arg1.raw();
	 
	 System.out.println(data.get(0).get(0));
	 System.out.println(data.get(0).get(1));
		
		  page.email.sendKeys(data.get(0).get(0));
		  page.password.sendKeys(data.get(0).get(1));
		  page.LoginButton.click();
		 
	}	

	@Then("^click on studies navigation menu and verify it should be redirect to studies listing page$")
	public void click_on_studies_navigation_menu_and_verify_it_should_be_redirect_to_studies_listing_page() throws Throwable {
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WebElement e=admin.studiesMenu;
	e.click();
	
	}

	@Then("^click on one particular study name and verify it should be redirect to that study details page or not$")
	public void click_on_one_particular_study_name_and_verify_it_should_be_redirect_to_that_study_details_page_or_not() throws Throwable {
	   WebElement e=driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-2\"]/td[1]/div"));
		
		String actual=e.getText();
		e.click();
		String expected=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/header/div/div/div/div[1]/div/h6")).getText();
		softassert.assertEquals(actual, expected);
		
	}
	@Then("^verify user is able to view sites tab or not$")
	public void verify_user_is_able_to_view_sites_tab_or_not() throws Throwable {
	   
	
	}

	@Then("^click on Sites tab$")
	public void click_on_Sites_tab() throws Throwable {
	    
	}

	@Then("^verify user is able to view message or not if no any sites are added for that study$")
	public void verify_user_is_able_to_view_message_or_not_if_no_any_sites_are_added_for_that_study() throws Throwable {
	    
	}

	@Then("^verify user is able to view add site button or not$")
	public void verify_user_is_able_to_view_add_site_button_or_not() throws Throwable {
	  
	}

	@Then("^click on add a site button and verify add a site dialog box should be open or not$")
	public void click_on_add_a_site_button_and_verify_add_a_site_dialog_box_should_be_open_or_not() throws Throwable {
	   
	}

	@Then("^search site name \"(.*?)\" and verify site name should be display as per searched site name$")
	public void search_site_name_and_verify_site_name_should_be_display_as_per_searched_site_name(String arg1) throws Throwable {
	 
	}

	@Then("^select site name and verify site name should be select or not$")
	public void select_site_name_and_verify_site_name_should_be_select_or_not() throws Throwable {
	   
	}

	@Then("^select site name and verify count should be display on add site button as per selected site names$")
	public void select_site_name_and_verify_count_should_be_display_on_add_site_button_as_per_selected_site_names() throws Throwable {
	  
	}

	@Then("^click on add site button and verify site should be added on site tab or not as per selected site$")
	public void click_on_add_site_button_and_verify_site_should_be_added_on_site_tab_or_not_as_per_selected_site() throws Throwable {
	}    

	@Given("^admin is login with enter valid username and password$")
	public void admin_is_login_with_enter_valid_username_and_password() throws Throwable {
	   
	}

	@Then("^click on studies navigation menu$")
	public void click_on_studies_navigation_menu() throws Throwable {
	    
	}

	@Then("^click on one particular study name$")
	public void click_on_one_particular_study_name() throws Throwable {
	    
	}

	@Then("^click on Sites tab of study$")
	public void click_on_Sites_tab_of_study() throws Throwable {
	  
	}

	@Then("^verify user is able to view added site or not$")
	public void verify_user_is_able_to_view_added_site_or_not() throws Throwable {
	 
	}

	@Then("^click on sitename and verify sites should be display in ascending and descending order$")
	public void click_on_sitename_and_verify_sites_should_be_display_in_ascending_and_descending_order() throws Throwable {
	  
	}

	@Then("^click on address and verify address should be display in ascending and descending order$")
	public void click_on_address_and_verify_address_should_be_display_in_ascending_and_descending_order() throws Throwable {
	   
	}

	@Then("^click on location and verify location should be display in ascending and descending order$")
	public void click_on_location_and_verify_location_should_be_display_in_ascending_and_descending_order() throws Throwable {
	 
	}

	@Then("^click on main contact and verify contact should be display in ascending and descending order$")
	public void click_on_main_contact_and_verify_contact_should_be_display_in_ascending_and_descending_order() throws Throwable {
	  
	}

	@Then("^search site name \"(.*?)\"  from search box and verify site name should be displayed as per searched site name$")
	public void search_site_name_from_search_box_and_verify_site_name_should_be_displayed_as_per_searched_site_name(String arg1) throws Throwable {
	    
	}

	@Then("^click on add a site button$")
	public void click_on_add_a_site_button() throws Throwable {
	
	}

	@Then("^search site name \"(.*?)\" and verify site name should be display in dialog box as per searched site name$")
	public void search_site_name_and_verify_site_name_should_be_display_in_dialog_box_as_per_searched_site_name(String arg1) throws Throwable {
	    
	}

	@Then("^select one site name and verify site name should be select or not$")
	public void select_one_site_name_and_verify_site_name_should_be_select_or_not() throws Throwable {
	}

	@Then("^click on add site button for add one site and verify site should be added or not$")
	public void click_on_add_site_button_for_add_one_site_and_verify_site_should_be_added_or_not() throws Throwable {
	    
	}

	@Then("^select multiple site name and verify count should be display on add site button as per selected site names$")
	public void select_multiple_site_name_and_verify_count_should_be_display_on_add_site_button_as_per_selected_site_names() throws Throwable {
	   
	}

	@Then("^click on add site button for add multiple site and verify sites should be added on site tab or not as per selected site$")
	public void click_on_add_site_button_for_add_multiple_site_and_verify_sites_should_be_added_on_site_tab_or_not_as_per_selected_site() throws Throwable {
	   
	}

	@Then("^click on remove icon and verify user should be able to remove site from site tab$")
	public void click_on_remove_icon_and_verify_user_should_be_able_to_remove_site_from_site_tab() throws Throwable {
	   
	}

	@Given("^admin open the studies detail page$")
	public void admin_open_the_studies_detail_page() throws Throwable {
	  
	}

	@Given("^click on any study$")
	public void click_on_any_study() throws Throwable {
	   
	}

	@Then("^click on site tab and verify should be redirect to site tab screen or not$")
	public void click_on_site_tab_and_verify_should_be_redirect_to_site_tab_screen_or_not() throws Throwable {
	   
	}

	@Then("^click on particular main contact dropdown and verify change main contact dialog box should be open or not$")
	public void click_on_particular_main_contact_dropdown_and_verify_change_main_contact_dialog_box_should_be_open_or_not() throws Throwable {
	  
	}

	@Then("^enter title name$")
	public void enter_title_name() throws Throwable {
	   
	}

	@Then("^click on name field and select person name and verify email field should be fill automatically or not$")
	public void click_on_name_field_and_select_person_name_and_verify_email_field_should_be_fill_automatically_or_not() throws Throwable {
	  
	}

	@Then("^enter phone number$")
	public void enter_phone_number() throws Throwable {
	    
	}

	@Then("^click on save changes button$")
	public void click_on_save_changes_button() throws Throwable {
	   
	}

	@Then("^click on cancel button and verify dialog box should be closed or not$")
	public void click_on_cancel_button_and_verify_dialog_box_should_be_closed_or_not() throws Throwable {
	   
	}

	@Then("^for update contact click on main contact dropdown and verify change main contact dialog box should be open with filled name and email$")
	public void for_update_contact_click_on_main_contact_dropdown_and_verify_change_main_contact_dialog_box_should_be_open_with_filled_name_and_email() throws Throwable {
	}

	@Then("^Select name for change name$")
	public void select_name_for_change_name() throws Throwable {
	   
	}

	@Then("^update phone number \"(.*?)\"$")
	public void update_phone_number(String arg1) throws Throwable {
	  
	}

	@Then("^click on save changes button and verify main contact should be updated or not$")
	public void click_on_save_changes_button_and_verify_main_contact_should_be_updated_or_not() throws Throwable {
	   
	}


}
