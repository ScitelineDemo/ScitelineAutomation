package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminpanel {
	
	//Adminnavigation
	
	@FindBy(xpath="//*[@id='root']/div/div[1]/div/nav/div[2]/div/div/div/div[2]/ul[1]/div[3]/div/span")
	public static WebElement studiesMenu;
	
	//Admin panel(studies)
	  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[3]/button/span[1]")
	  public static WebElement Adminindication;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[2]/button/span[1]")
	  public static WebElement Adminstatus;
	  

	  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[4]/button/span[1]")
	  public static WebElement AdminstudyType;

	  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[4]/button/span[1]")
	  public static WebElement AdminnewTrial;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/main/div[2]/div[1]/div/div/button[1]/span")
	  public static WebElement newTrialDetails;

	  @FindBy(xpath="//*[@id='root']/div/div/div/main/div[2]/div[1]/div/div/button[2]/span")
	  public static WebElement newTrialLocations;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/main/div[2]/div[1]/div/div/button[3]/span")
	  public static WebElement newTrialeligibility;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/main/div[2]/div[1]/div/div/button[4]/span")
	  public static WebElement newTrialprescreeningQuestions;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/main/div[2]/div[1]/div/div/button[5]/span")
	  public static WebElement newTrialMember;
	  
	  @FindBy(name="trialId")
	  public static WebElement trialId;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div/input")
	  public static WebElement TrialName;
	  
	  @FindBy(name="leadSponser")
	  public static WebElement leadSponser;
	  
	  @FindBy(name="introduction")
	  public static WebElement introduction;
	  
	  @FindBy(name="description")
	  public static WebElement description;
	  
	  @FindBy(name="medicalCondition")
	  public static WebElement medicalcondition;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[7]/div[1]/div/div/input")
	  public static WebElement duration;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[7]/div[2]/div/div/input")
	  public static WebElement participantsnumber;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[8]/div/div/div/input")
	  public static WebElement intervention;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[9]/div/div/div/input")
	  public static WebElement startdate;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[11]/div/div/div/input")
	  public static WebElement principalinvestigator;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[12]/div[1]/div/div/input")
	  public static WebElement studycontactphone;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[12]/div[2]/div/div/input")
	  public static WebElement studycontactEmail;
	  
	  @FindBy(xpath="//*[@id='simple-tabpanel-0']/div/div/div/form/div[1]/div/div[1]/div/div[13]/div/div/div/div[1]")
	  public static WebElement tags;
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[1]/button/span[1]")
	  public static WebElement preview;

	  @FindBy(xpath="//*[@id=\"simple-tabpanel-0\"]/div/div/div/form/div[1]/div/div[1]/div/div[1]/div[2]/button/span[1]")
	  public static WebElement pulldata;

	  
	  @FindBy(xpath="//*[@id=\"simple-tabpanel-0\"]/div/div/div/form/div/div/div[2]/div/div/div[1]/div/div/div/div/div/div/div/button[1]/span[1]")
	  public static WebElement addImage;
	  //people
	  

	  
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/nav/div[2]/div/div/div/div[2]/ul[1]/div[4]/div/span")
	  public static WebElement people;
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[2]/button/span[1]")
	  public static WebElement newPerson;

	 
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/button[1]/span")
	  public static WebElement Account;
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/button[2]/span")
	  public static WebElement sites;
	  
	  @FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/button[3]/span")
	  public static WebElement studies;
	  
	  //Sites page
	  
	  @FindBy(xpath="//*[@id='root']/div/div/div/nav/div[2]/div/div/div/div[2]/ul[1]/div[3]/div/span")
	  public static WebElement sitesMenu;

	@FindBy(xpath="//*[@id='root']/div/div/div/header/div/div/div/div[2]/div/div[2]/button/span[1]")
	public static WebElement newSite;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[1]/div/div/div/input")
	public static WebElement siteName;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[4]/div/div/div/input")
	public static WebElement streetAddress;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[5]/div[3]/div/div/input")
	public static WebElement postalCode;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/main/div[2]/div/div/div/form/div[8]/div[2]/div/div/input")
	public static WebElement phoneno;

	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/header/div/div/div/div[2]/div[2]/button/span[1]")
	public static WebElement createSite;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div/main/div[2]/div[1]/div/div/button[2]/span")
	public static WebElement SiteTab;

	@FindBy(xpath="//*[@id=\"simple-tabpanel-1\"]/div/div/div[1]/div[2]/button/span[1]")
	public static WebElement Addsite;

	@FindBy(xpath="/html/body/div[5]/div[3]/div/div[2]/div[3]/div/button[2]/span[1]")
	public static WebElement DialogAddsite;

	@FindBy(xpath="/html/body/div[5]/div[3]/div/div[2]/div[1]/div[2]/input")
	public static WebElement DialogSearchsite;
	
	@FindBy(xpath="//*[@id=\"MUIDataTableBodyRow-0\"]/td[4]/div/span")
	public static WebElement MainContact;
	
	@FindBy(xpath="//*[@id=\"MUIDataTableBodyRow-0\"]/td[5]/div/i")
	public static WebElement Removesite;
	
	@FindBy(xpath="//*[@id=\"simple-tabpanel-1\"]/div/div/div[1]/div[1]/div[2]/input")
	public static WebElement searchsites;
	
	
	
	
	
	
	
}
