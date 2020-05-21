package com.training.sanity.tests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.*;
import com.training.sanity.tests.RealPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests2 {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private RealPOM realPOM;
	private static Properties properties;
	private ScreenShot screenShot;
	private Object String;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
		realPOM = new RealPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test(priority=1, enabled = false)
	/**
	 * Pre-Requisite = Login as Teacher
	 * TC_041_To verify whether application allows student to subscribe for the course & take the authored test
	 * click on Course catalog
	 * Enter course name to register in search textbox
	 * click on search button
	 * Click on Subscribe button of the course to get registered
	 * Click on Tests icon
	 * Click on Test name link
	 * click on Start Test button
	 * Answer the questions
	 * Click on End Test button
	 */
	
	public void validLoginTest() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC041_Loginsuccess");
        loginPOM.coursesubscribe();
	}
	
	@Test(priority=2, enabled=false)
	/**
	 * Pre-Requisite Login as Student 
     * TC_042_To verify whether application allows student to subscribe for the course & take the authored assessment
     * click on Course catalog
     * Enter course name to register in search textbox
     * click on search button
     * Click on Subscribe button of the course to get registered
     * Click on Assignments icon
     * Click on Assignments link
     * click on Upload my assignments button
     * perform manual uploading of file
     * click on page containing assignment name link
	 */
	public void Test2() throws AWTException {
		loginPOM.sendUserName("kkboys");
		loginPOM.sendPassword("roops@1234");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC042_Loginsuccess");
        loginPOM.courseassessment();
	}
	
	@Test(priority=3, enabled= false)
	/** Pre-requisite Login as a student 
     * TC_043_TO verify whether application allows student to discuss in the forum
     * click on Course catalog
     * Enter course name to register in search textbox
     * click on search button
     * Click on Subscribe button of the course to get registered
     * Click on Assignments icon
     * Click on Assignments link
     * click on Upload my assignments button
     * perform manual uploading of file
     * click on page containing assignment name link
	 */
	public void Test3() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC043_Loginsuccess");
        loginPOM.discussforum();
	}
     @Test(priority=4, enabled= false)
        public void Test4() throws AWTException, InterruptedException 
        {	 
    	 //realPOM.RealEstate();
    	 loginPOM.sendUserName("admin");
 		 loginPOM.sendPassword("admin@123");
 		 loginPOM.clickLoginBtn(); 
 		 screenShot.captureScreenShot("TC041_Loginsuccess");
    	 
        }        
	}
	

