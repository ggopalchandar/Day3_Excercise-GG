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
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

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
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test(priority=1, enabled = false)
	/**
	 * TC_01 TO verify whether application allows Teacher to Add a new course User
	 * should Launch the Application User should get logged in as Teacher 1. Create
	 * a Course Link 2. Valid Credential in Course name textbox 3. Click on Advanced
	 * Settings Button 4. Select Valid Credentials from in Course code checkbox 5.
	 * Enter Valid credential in Course code textbox 6. Select Valid credential from
	 * language List box 7. Click on Create this Course button 8. Click on Add an
	 * Introduction icon 9. Enter Valid credentials in Textbox 10.Click on Save
	 * Intro text
	 */
	
	public void validLoginTest() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC01_Loginsuccess");
        loginPOM.createCourse();
	}
	
	@Test(priority=2, enabled=false)
	/*
	 * To verify whether application allows teacher to enter course description 1.
	 * click on Course created Click on Course description icon 3. Click on
	 * Description icon 4. Enter valid credentials in Title text box 5. Enter valid
	 * credentials in Content text box 6. Click on Save button
	 */
	public void Test2() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC02_Loginsuccess");
		loginPOM.createDescription();       
	}
	
	@Test(priority=3, enabled=false)
	/*
	 * 1. User should have launched the application 1. click on Course created 2.
	 * Click on Users icon 3. Click on checkbox beside the learner details 4. Click
	 * on Unsubscribe button 5. Click on OK button of pop up window
	 */
	public void Test3() throws AWTException {
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword("admin@123");
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("TC03_Loginsuccess");
		loginPOM.courseUnsubscribe();       
	}
	
	
}
