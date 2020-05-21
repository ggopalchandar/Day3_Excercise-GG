package com.training.regression.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginExcelTest {
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
		driver.quit();
	}

	@Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class)
	/** TC067 & TC_069 -- navigation via Excel
	 * Click on Administration tab
	 * Click on Add a user link
	 * Enter valid credential in First name textbox
	 * Enter valid credential in Last name textbox
	 * Enter valid credential in e-mail textbox
	 * Enter valid credential in phone textbox
	 * Enter valid credential in Login textbox
	 * Click on Enter password radio button
	 * Enter valid credential in password textbox
	 * Select Valid credentials from profile list box
	 * Click on Add button
	 */
	
	public void loginDBTest(String firstname, String lastname, String eMail, String phone, String usrname,
			String password) {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
   	   loginPOM.sendUserName("admin");
	   loginPOM.sendPassword("admin@123");
	   loginPOM.clickLoginBtn(); 
	   screenShot.captureScreenShot("TC041_Loginsuccess");		
	   loginPOM.loadexcel(firstname, lastname, eMail, phone, usrname, password);
        
	}
	

	}
	
	

