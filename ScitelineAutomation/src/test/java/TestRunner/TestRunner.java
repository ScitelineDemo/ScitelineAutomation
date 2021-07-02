package TestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html "},
 features = "Features"
 ,glue={"com.sciteline.pages"},
 
tags={"@SiteTab"}
		
 )
public class TestRunner {
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("C:\\Users\\nteam\\eclipse-workspace\\ScitelineAutomation/config/extent-config.xml"));

	
	Reporter.setSystemInfo("User Name", "sciteline");
	Reporter.setSystemInfo("Application Name", "Sciteline");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Sciteline Report");


	}

}
