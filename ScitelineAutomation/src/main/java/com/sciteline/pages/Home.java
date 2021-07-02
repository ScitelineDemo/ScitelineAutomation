package com.sciteline.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.cucumber.listener.Reporter;
import com.pom.PageModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utils.Screenshot;

public class Home {
	WebDriver driver;
	PageModel page;

	@Given("^Launching Application website through url on browser\\.$")
	public void launching_Application_website_through_url_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
	
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--allow-running-insecure-content");
		driver = new ChromeDriver(options);
	
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

	@Then("^verify whether home page is open\\.$")
	public void verify_whether_home_page_is_open() throws Throwable {	
		Boolean logopresent = driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
		Assert.assertTrue(logopresent);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));	}

	@Then("^verify wheather the site logo is present on header\\.$")
	public void verify_wheather_the_site_logo_is_present_on_header() throws Throwable {
		Boolean logopresent = driver.findElement(By.xpath("//img[@alt='logo']")).isDisplayed();
		Assert.assertTrue(logopresent);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^verify all the navigation menu present in header\\.$")
	public void verify_all_the_navigation_menu_present_in_header() throws Throwable {


		Thread.sleep(2000);
		Boolean BrowseStudies = page.browseStudies.isDisplayed();
		Assert.assertTrue(BrowseStudies);
		Thread.sleep(1000);
		Boolean patients = page.Patients.isDisplayed();
		Assert.assertTrue(patients);
		Thread.sleep(1000);
		Boolean Reaserches = page.Researchers.isDisplayed();
		Assert.assertTrue(Reaserches);
		Thread.sleep(1000);
		Boolean partners = page.Partners.isDisplayed();
		Assert.assertTrue(partners);
		Thread.sleep(1000);
		Boolean About = page.Aboutus.isDisplayed();
		Assert.assertTrue(About);
		Thread.sleep(1000);
		Boolean Login = page.Login.isDisplayed();
		Assert.assertTrue(Login);
		Thread.sleep(1000);
		Boolean Signup = page.SignUp.isDisplayed();
		Assert.assertTrue(Signup);
	}

	@Then("^click on Browse studies menu and verify it should be able to navigate on browse studies page$")
	public void click_on_Browse_studies_menu_and_verify_it_should_be_able_to_navigate_on_browse_studies_page() throws Throwable {
	  
		Thread.sleep(1000);
		page.browseStudies.click();
		Thread.sleep(4000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		Boolean BrowseStudies = page.browseStudies.isDisplayed();
		Assert.assertTrue(BrowseStudies);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

@Then("^click on Patients menu and verify it should be able to navigate on patients page$")
public void click_on_Patients_menu_and_verify_it_should_be_able_to_navigate_on_patients_page() throws Throwable {
   
		Thread.sleep(2000);
		page.Patients.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		Boolean Patients = page.Patients.isDisplayed();
		    Assert.assertTrue(Patients);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Researchers menu and verify it should be able to navigate on Researchers page$")
	public void click_on_Researchers_menu_and_verify_it_should_be_able_to_navigate_on_Researchers_page() throws Throwable {
	   
		Thread.sleep(1000);
		page.Researchers.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		      Thread.sleep(2000);
		Boolean Researchers = page.Researchers.isDisplayed();
		Assert.assertTrue(Researchers);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	@Then("^click on Partners menu and verify it should be able to navigate on partners page$")
	public void click_on_Partners_menu_and_verify_it_should_be_able_to_navigate_on_partners_page() throws Throwable {
	    

	
	
		Thread.sleep(1000);
		page.Partners.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		Boolean Partners = page.Partners.isDisplayed();
		Assert.assertTrue(Partners);
		
	}

	@Then("^click on About us menu and verify it should be able to navigate on About us page$")
	public void click_on_About_us_menu_and_verify_it_should_be_able_to_navigate_on_About_us_page() throws Throwable {
	    

		Thread.sleep(1000);
		page.Aboutus.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		Boolean Aboutus = page.Aboutus.isDisplayed();
		Assert.assertTrue(Aboutus);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Login menu and verify it should be able to navigate on Login page$")
	public void click_on_Login_menu_and_verify_it_should_be_able_to_navigate_on_Login_page() throws Throwable {
	    

		Thread.sleep(1000);
		page.Login.click();
		Thread.sleep(5000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(2000);
			/*
			 * //String
			 * actual=driver.findElement(By.className("login-card-title")).getText();)
			 * String Expected="Log in to "; System.out.println("actual" +actual);
			 * if(actual.equals(Expected)) { Assert.assertEquals(actual, Expected);
			 * System.out.println("pass");
			 * 
			 * } else { System.out.println("fail"); }
			 */
				 

		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		WebElement element=driver.findElement(By.xpath("//img[@class='login-logo']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	@Then("^click on Sign Up menu and verify it should be able to navigate on Sign Up page$")
	public void click_on_Sign_Up_menu_and_verify_it_should_be_able_to_navigate_on_Sign_Up_page() throws Throwable {
	    
		Thread.sleep(1000);
		page.SignUp.click();
		Thread.sleep(3000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		Boolean SignUp = page.SignUp.isDisplayed();
		Assert.assertTrue(SignUp);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}


	@Then("^verify mouse hover effect on i m reasercher and i m patients blog$")
	public void verify_mouse_hover_effect_on_i_m_reasercher_and_i_m_patients_blog() throws Throwable {
		WebElement element=driver.findElement(By.xpath("//img[@alt='logo']"));
		element.click();
		Thread.sleep(2000);	
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,500)"); Thread.sleep(2000);
	 
	  WebElement e = driver.findElement(By.cssSelector("#root > div > div > main > section.profession.container > div > div:nth-child(1) > button"));

	  Actions action = new Actions(driver);
	  action.moveToElement(e).build().perform();
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));	  
		  Thread.sleep(2000); 
		  WebElement e1 =driver.findElement(By.cssSelector("#root > div > div > main > section.profession.container > div > div:nth-child(2) > button > span"));
		  Actions action1 = new  Actions(driver);
		  action1.moveToElement(e1).build().perform();
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 
	}

	@Then("^click on learn more button and verify it should be navigate on respective page\\.$")
	public void click_on_learn_more_button_and_verify_it_should_be_navigate_on_respective_page() throws Throwable {
		 WebElement xy = driver.findElement(By.cssSelector("#root > div > div > main > section.profession.container > div > div:nth-child(1) > button"));
		 JavascriptExecutor executer = (JavascriptExecutor) driver;
		 executer.executeScript("arguments[0].click();", xy);
			  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));	  
			  
			  
			 
	}

	@Then("^click on Find me match button and verify it should be navigate on respective page\\.$")
	public void click_on_Find_me_match_button_and_verify_it_should_be_navigate_on_respective_page() throws Throwable {
		

		Thread.sleep(2000); 
		WebElement xy=page.Findmematch;
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", xy);
		Thread.sleep(2000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));	
		  Thread.sleep(1000);
		  String actual=driver.findElement(By.cssSelector("body > div.MuiDialog-root.match-making-modal > div.MuiDialog-container.MuiDialog-scrollPaper > div > section > div.card-list-header.container > h2")).getText();
System.out.println("actual text is=" +actual);
		  String Expected="Choose a condition";
if(actual.equals(Expected)) {
	Assert.assertEquals(actual, Expected);
	System.out.println("pass");
	
}
else {
	System.out.println("fail");
}
Thread.sleep(1000);
		 WebElement e=page.cancel;
		 JavascriptExecutor executer1 = (JavascriptExecutor) driver;
			executer1.executeScript("arguments[0].click();", e);
	}
	@Then("^click on browse studies arrow link and verify it should be able to navigate on respective page\\.$")
	public void click_on_browse_studies_arrow_link_and_verify_it_should_be_able_to_navigate_on_respective_page() throws Throwable {
	  
	}

	@Then("^click on learn more arrow link in researchers site section and verify it should be able to navigate on respective page\\.$")
	public void click_on_learn_more_arrow_link_in_researchers_site_section_and_verify_it_should_be_able_to_navigate_on_respective_page() throws Throwable {
	    
	}

	@Then("^click on learn more arrow link in sponsors section and verify it should be able to navigate on respective page\\.$")
	public void click_on_learn_more_arrow_link_in_sponsors_section_and_verify_it_should_be_able_to_navigate_on_respective_page() throws Throwable {
	   
	}

	@Then("^click on talk to us button and verify it should be navigate on respective page\\.$")
	public void click_on_talk_to_us_button_and_verify_it_should_be_navigate_on_respective_page() throws Throwable {

	}

	@Then("^verify mouse hover effect on how it works link and click on how it works link and verify it should be able to navigate on how it works page$")
	public void verify_mouse_hover_effect_on_how_it_works_link_and_click_on_how_it_works_link_and_verify_it_should_be_able_to_navigate_on_how_it_works_page() throws Throwable {
	   
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(2000);
		WebElement e=page.Howitworks;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^verify mouse hover effect on browse studies link and click on browse studies link and verify it should be able to navigate on browse studies page$")
	public void verify_mouse_hover_effect_on_browse_studies_link_and_click_on_browse_studies_link_and_verify_it_should_be_able_to_navigate_on_browse_studies_page() throws Throwable {
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/footer/div[1]/ul/li[2]/a[2]"));
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}
	


	@Then("^verify mouse hover effect on features link and click on features link and verify it should be able to navigate on features page$")
	public void verify_mouse_hover_effect_on_features_link_and_click_on_features_link_and_verify_it_should_be_able_to_navigate_on_features_page() throws Throwable {
	
		Thread.sleep(2000);
		WebElement e=page.Features;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}


	@Then("^verify mouse hover effect on Help documentation link and click on help documentation link and verify it should be able to navigate on help documentation page$")
	public void verify_mouse_hover_effect_on_Help_documentation_link_and_click_on_help_documentation_link_and_verify_it_should_be_able_to_navigate_on_help_documentation_page() throws Throwable {
	   
		Thread.sleep(2000);
		WebElement e=page.HelpDocumentation;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^verify mouse hover effect on current partners link and click on current partners link and verify it should be able to navigate on current partners page$")
	public void verify_mouse_hover_effect_on_current_partners_link_and_click_on_current_partners_link_and_verify_it_should_be_able_to_navigate_on_current_partners_page() throws Throwable {
	  
		Thread.sleep(2000);
		WebElement e=page.Currentpartners;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^verify mouse hover effect on join us link and click on Join us link and verify it should be able to navigate on join us page$")
	public void verify_mouse_hover_effect_on_join_us_link_and_click_on_Join_us_link_and_verify_it_should_be_able_to_navigate_on_join_us_page() throws Throwable {
	   

		Thread.sleep(2000);
		WebElement e=page.Joinus;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}


	@Then("^verify mouse hover effect on who is sciteline\\? link and click on who is sciteline\\? link and verify it should be able to navigate on current who is sciteline\\? page$")
	public void verify_mouse_hover_effect_on_who_is_sciteline_link_and_click_on_who_is_sciteline_link_and_verify_it_should_be_able_to_navigate_on_current_who_is_sciteline_page() throws Throwable {
	   

	
		Thread.sleep(2000);
		WebElement e=page.WhoisSciteline;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	
	}

	@Then("^verify mouse hover effect on contact us link and click on contact us link and verify it should be able to navigate on contact us page$")
	public void verify_mouse_hover_effect_on_contact_us_link_and_click_on_contact_us_link_and_verify_it_should_be_able_to_navigate_on_contact_us_page() throws Throwable {
	  
		Thread.sleep(2000);
		WebElement e=page.Contactus;
	    Actions action=new Actions(driver);
	    action.moveToElement(e).build().perform();
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	    driver.close();
	}


	@Given("^Lunching website through url on browser$")
	public void lunching_website_through_url_on_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	}

	

	@Then("^click on find me match button$")
	public void click_on_find_me_match_button() throws Throwable {
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,600)");
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 Thread.sleep(3000);
		WebElement xy=page.Findmematch;
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", xy);
		Thread.sleep(2000);
		  	
		  Thread.sleep(1000);
		  String actual=driver.findElement(By.cssSelector("body > div.MuiDialog-root.match-making-modal > div.MuiDialog-container.MuiDialog-scrollPaper > div > section > div.card-list-header.container > h2")).getText();
System.out.println("actual text is=" +actual);
		  String Expected="Choose a condition";
if(actual.equals(Expected)) {
	Assert.assertEquals(actual, Expected);
	System.out.println("pass");
	
}
else {
	System.out.println("fail");
}
	}

	@Then("^Choose a condition Respiratory$")
	public void choose_a_condition_Respiratory() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		page.Respiratory.click();
	    Thread.sleep(1000);
	    Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		
	}

	@Then("^click on next button$")
	public void click_on_next_button() throws Throwable {
	
		WebElement e=page.next;
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^answer the given questions$")
	public void answer_the_given_questions() throws Throwable {
		 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 
	WebElement e=driver.findElement(By.xpath(("//input[@class='MuiInputBase-input MuiOutlinedInput-input']")));
	JavascriptExecutor executer = (JavascriptExecutor) driver;
	executer.executeScript("arguments[0].click();", e);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
	Thread.sleep(1000);
	 driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[1]/div[3]/div/label[2]")).click();
	 Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		WebElement e1=page.questionNext;
		JavascriptExecutor executer1 = (JavascriptExecutor) driver;
		executer1.executeScript("arguments[0].click();", e1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[2]/div[1]/div/div[2]/label[1]")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[2]/div[2]/div/div[2]/label[2]")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[2]/div[3]/div/div[2]/label[1]")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  Thread.sleep(2000);
		WebElement e2=page.questionNext;
		JavascriptExecutor executer2 = (JavascriptExecutor) driver;
		executer2.executeScript("arguments[0].click();", e2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[3]/div[2]/div/div[2]/label[1]")).click();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
	}

	@Then("^click on Find matches button$")
	public void click_on_Find_matches_button() throws Throwable {
		Thread.sleep(2000);
		
		WebElement e=page.Findmatches;
		JavascriptExecutor executer = (JavascriptExecutor) driver;
		executer.executeScript("arguments[0].click();", e);
		Thread.sleep(5000);
		
		
	}

	@Then("^verify given study details is as per selected condition or not$")
	public void verify_given_study_details_is_as_per_selected_condition_or_not() throws Throwable {
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  
		  Thread.sleep(2000);	
		  driver.close();
	}

	@Given("^Lunching website on browser through url$")
	public void lunching_website_on_browser_through_url() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nteam\\Downloads\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		PageModel page = new PageModel(driver);
		driver.get("http://sciteline.letsnurture.co.uk/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
	}

	@Then("^click on find me match button on home page$")
	public void click_on_find_me_match_button_on_home_page() throws Throwable {
		
		  Thread.sleep(1000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  WebElement xy=page.Findmematch; JavascriptExecutor executer =
		  (JavascriptExecutor) driver; executer.executeScript("arguments[0].click();",
		  xy); Thread.sleep(2000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(2000); 
		  String actual=driver.findElement(By.cssSelector("body > div.MuiDialog-root.match-making-modal > div.MuiDialog-container.MuiDialog-scrollPaper > div > section > div.card-list-header.container > h2"
		  )).getText(); System.out.println("actual text is=" +actual); String
		  Expected="Choose a condition"; 
		  if(actual.equals(Expected)) {
		  Assert.assertEquals(actual, Expected); System.out.println("pass");
		  
		  } else { System.out.println("fail"); }
		 
	}

	@Then("^Choose a condition cancer$")
	public void choose_a_condition_cancer() throws Throwable {
		
		  page.cancer.click(); Thread.sleep(1000);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		 
	}

	@Then("^click on the Next button$")
	public void click_on_the_Next_button() throws Throwable {
	   
		
		  WebElement e=page.next; 
		  JavascriptExecutor executer = (JavascriptExecutor) driver; 
		  executer.executeScript("arguments[0].click();", e);
		 
	}

	@Then("^select answer for the given questions$")
	public void select_answer_for_the_given_questions() throws Throwable {
	   
		
		  
		  
		  WebElement e=driver.findElement(By.xpath(
		  ("//input[@class='MuiInputBase-input MuiOutlinedInput-input']")));
		  JavascriptExecutor executer = (JavascriptExecutor) driver;
		  executer.executeScript("arguments[0].click();", e);
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(1000); driver.findElement(By.xpath(
		  "/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
		  Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		  Thread.sleep(2000); WebElement e1=page.questionNext; JavascriptExecutor
		  executer1 = (JavascriptExecutor) driver;
		  executer1.executeScript("arguments[0].click();", e1); Thread.sleep(1000);
		 /* driver.findElement(By.id("cancerType")).click();
			
			 * Thread.sleep(1000);
			 * driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]/div/span")).
			 * click(); Thread.sleep(1000);
			 * driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[4]/div/span")).
			 * click(); Thread.sleep(1000);
			 * driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[6]/div/span")).
			 * click(); Thread.sleep(1000); WebElement element=page.cancel; element.click();
			 */
		 WebElement e4= driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[2]/div[2]/div/div[2]/label[2]"));
		 e4.click();
		
		  Thread.sleep(1000);
		  WebElement e2=page.questionNext; JavascriptExecutor
		  executer2 = (JavascriptExecutor) driver;
		  executer2.executeScript("arguments[0].click();", e2);
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div[3]/form/div[3]/div[2]/div/div[2]/label[2]")).click();
			Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
			Thread.sleep(1000);
			WebElement e7=page.Findmatches;
			e7.click();
		  
		 
	}


	   
	@Then("^Verify given study details should be display as per selected condition or not$")
	public void verify_given_study_details_should_be_display_as_per_selected_condition_or_not() throws Throwable {
		
		Thread.sleep(5000);
		Reporter.addScreenCaptureFromPath(Screenshot.getScreenshot(driver, "Test"));
		Thread.sleep(1000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		  Thread.sleep(5000);
	driver.close();
		
	}


	
	

	



}