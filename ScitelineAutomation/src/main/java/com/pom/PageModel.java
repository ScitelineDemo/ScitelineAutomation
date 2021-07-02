package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageModel {
	public WebDriver driver;
	public PageModel (WebDriver driver) {
		this.driver = driver;
		// This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText ="Home")
	public static WebElement Home;

	@FindBy(linkText ="Browse Studies")
	public static WebElement browseStudies;
	
	@FindBy(linkText ="Patients")
	public static WebElement Patients;
	
	@FindBy(linkText ="Researchers")
	public static WebElement Researchers;
	
	@FindBy(linkText ="Partners")
	public static WebElement Partners;
	
	@FindBy(linkText ="About us")
	public static WebElement Aboutus;
	
	@FindBy(linkText ="Login")
	public static WebElement Login;
	
	@FindBy(linkText ="Sign Up")
	public static WebElement SignUp;
	
	@FindBy(linkText ="How it works")
	public static WebElement Howitworks;
	
	@FindBy(linkText ="Features")
	public static WebElement Features;
	
	@FindBy(linkText ="Pricing")
	public static WebElement Pricing;

	@FindBy(linkText ="Help documentation")
	public static WebElement HelpDocumentation;
	
	@FindBy(linkText ="Current partners")
	public static WebElement Currentpartners;
	
	@FindBy(linkText ="Join us")
	public static WebElement Joinus;
	
	@FindBy(linkText ="Who is Sciteline?")
	public static WebElement WhoisSciteline;
	
	@FindBy(linkText ="Contact us")
	public static WebElement Contactus;
	
	@FindBy(css="body > div.MuiDialog-root.match-making-modal > div.MuiDialog-container.MuiDialog-scrollPaper > div > section > div.card-list-header.container > img")
	public static WebElement cancel;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/section/div[2]/div[1]")
	public static WebElement Respiratory;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/main/div/div[2]/div[1]/div[1]/div/div[1]/button")
	public static WebElement quickView;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/section/div[2]/div[2]")
	public static WebElement cancer;
	//condition next
	@FindBy(xpath="/html/body/div[2]/div[3]/div/section/button")
	public static WebElement next;
	//questions next
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[3]/form/div[4]/button")
	public static WebElement questionNext;
			
    @FindBy(xpath=" //*[@id='root']/div/main/section[2]/div/div[2]/button/span")
    public static WebElement Findmematch;
 
   
   @FindBy(css="#root > div > div > main > section:nth-child(1) > div > div > div > div > div.col-md-8.col-12.banner_content_items > div > div.back_btn > a")
   public static WebElement Back;

  @FindBy(xpath="//*[@id=\"root\"]/div/div/main/section[6]/div[2]/button")
  public static WebElement Browseallstudies;
 
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[3]/form/div[4]/button/span")
  public static WebElement Findmatches;
 
  @FindBy(xpath="//*[@id=\"root\"]/div/div/main/section[1]/div/div/div/div/div[1]/div/div[4]/button")
  public static WebElement Apply;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[4]/button")
  public static WebElement submit;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[3]/div/button")
  public static WebElement Done;

  //eligible next
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[4]/button")
  public static  WebElement eligiblenext;

  @FindBy(name="terms")
  public static WebElement terms;
  //login
  @FindBy(name="email")
  public static WebElement email; 
  
  @FindBy(name="password")
  public static WebElement password;
  
  @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/section/div/div[1]/form/button/span[1]")
  public static WebElement LoginButton;
  
  //eligible
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[1]/div[1]/div/div/input")
  public static WebElement firstname;
 
  @FindBy(id="firstName")
  public static WebElement firstName;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[1]/div[2]/div/div/input")
  public static WebElement lastname;
  
  @FindBy(id="lastName")
  public static WebElement lastName;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div/div[2]/form/div[2]/div/div[2]/div/div/div/input")
  public static WebElement Email;
  
  @FindBy(name="phoneNumber")
  public static WebElement phone;
  
  @FindBy(xpath="//i[@class='fas fa-share-alt share-icon']")
  public static WebElement share;
  
  @FindBy(xpath="/html/body/div[2]/div[3]/div/div[2]/div/form/button")
  public static WebElement sendEmail;
  
  @FindBy(className="btn btn-yellow btn-get-notified")
  public static WebElement Submit;
 
//Recruitment pageModel
  
  @FindBy(xpath="//*[@id='root']/div/div/div/nav/div[2]/div/div/div/div[2]/ul[1]/div[2]/div/span")
  public static WebElement Recruitment;			
  
  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div[2]/div[2]/div[1]/button/span[1]")
  public static WebElement RecruitmentFilter;
  
  @FindBy(className="MuiAccordionSummary-content")
  public static WebElement filterOptions;
  
  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div[1]/div[2]/button/span[1]")
  public static WebElement change;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div[1]/div/div[2]/div/div/i")
  public static WebElement RecruitmentCancel;
  
  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div[2]/div[2]/div[3]/button/span[1]")
  public static WebElement recruitmentNewParticipants;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[2]/div[2]/div/i")
  public static WebElement filtercancel;
  
  @FindBy(xpath=" /html/body/div[5]/div[3]/div/div[2]/form/div[5]/button[1]/span[1]")
  public static WebElement participantcancel;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[3]/div[1]/div[1]")
  public static WebElement favouriteFilter ;
 
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[4]/div[1]/div[1]")
  public static WebElement eligibilityFilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[5]/div[1]/div[1]")
  public static WebElement sourceFilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[6]/div[1]/div[1]")
  public static WebElement prescreeningFilter;
  
  
  
 
  //participants

  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/nav/div[2]/div/div/div/div[2]/ul[1]/div[3]")
public static WebElement participants;
  
  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div/div[2]/button/span[1]")
  public static WebElement participantfilter;
    
  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div/div[3]/button[2]/span[1]")
  public static WebElement newParticipants;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[3]/div[1]/div[1]")
  public static WebElement Trialfilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[4]/div[1]/div[1]")
  public static WebElement trialTags;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[5]/div[1]/div[1]")
  public static WebElement indicationfilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[6]/div[1]/div[1]")
  public static WebElement participantsourceFilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[7]/div[1]/div[1]")
  public static WebElement patienttags;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[8]/div[1]/div[1]")
  public static WebElement Agefilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[9]/div[1]/div[1]")
  public static WebElement SexFilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[10]/div[1]/div[1]")
  public static WebElement Locationfilter;
  
  @FindBy(xpath="/html/body/div[5]/div[3]/div/div/div[2]/div[2]/div/i")
  public static WebElement participantsFilterCancel;
  

  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[1]/button/span[1]")
  public static WebElement participantsformcancel;



//participant Cocomitant

@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div[1]/div/div/button[3]/span")
public static WebElement cocomitant;



@FindBy(xpath="//*[@id=\"simple-tabpanel-2\"]/div/div[1]/div[2]/button")
public static WebElement newTherapy;

@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[1]/div/div/div/input")
public static WebElement Therapy;

@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[2]/div/div/div/input")
public static WebElement TherapyIndication;


@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[3]/div[1]/div[1]/div/div/input")
public static WebElement Dose;


@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[5]/div[1]/div/div/input")
public static WebElement TherapyStartdate;

@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[5]/div[2]/div/div/input")
public static WebElement TherapyEnddate;

		@FindBy(xpath="/html/body/div[5]/div[3]/div/form/div[8]/div/div[2]/button[2]/span[1]")
		public static WebElement addTherapy;
//participants notes and file
		
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div[1]/div/div/button[5]/span")
		public static WebElement notesAndFile;

	
	@FindBy(xpath="//*[@id=\"simple-tabpanel-4\"]/div/div/div[1]/div/div/div[2]/div/div[1]/button/span[1]")
	public static WebElement Linkurl;
	
	@FindBy(xpath="//*[@id=\"simple-tabpanel-4\"]/div/div/div[1]/div/div/div[2]/div/div[2]/button/span[1]")
	public static WebElement uploadFile;


}

