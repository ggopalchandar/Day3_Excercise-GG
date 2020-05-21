package com.training.sanity.tests;


import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.training.generics.ScreenShot;


public class RealPOM {
	private WebDriver driver; 
	public RealPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="formLogin_submitAuth")
	private WebElement loginBtn; 
	
	/*
	 * // Test case RETC_010 "New Launch"
	 */	
	@FindBy(xpath="//a[contains(text(),'New Launch')]")
    private WebElement New_Launch;
	
	@FindBy(xpath="//div[@id='wpmm-megamenu']//div[@class='wpmm-post post-4505']//a[contains(text(),'prestige')]")
    private WebElement prestige1;
	
	@FindBy(xpath="//input[@name='your-name']")
	public WebElement Your_Name;
	
	@FindBy(xpath="//input[@name='your-email']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@name='your-subject']")
	public WebElement subject;
	
	@FindBy(xpath="//textarea[@name='your-message']")
	public WebElement your_message;
	
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-submit']")
	public WebElement Send;
	
	@FindBy(xpath="//div[@class='wpcf7-response-output wpcf7-display-none wpcf7-mail-sent-ng']")
	public WebElement ErrorSendingyourmessage;
	
	/*
	 * // Test case RETC_011 "LOG IN/REGISTER button"
	 */	
	@FindBy(xpath="//a[@class='sign-in']")
	public WebElement Login_Register;
	
	@FindBy(xpath="//input[@id='user_login']")
	public WebElement Username;
	
	@FindBy(xpath="//input[@id='user_pass']")
	public WebElement Password;
	
	@FindBy(xpath="//input[@name='login']")
	public WebElement Sign_In;
	
	@FindBy(xpath="//div[contains(text(),'Dashboard')]")
	public WebElement AdminDashboard;
	
	@FindBy(xpath="//img[contains(@class,'avatar avatar-26 photo')]")
	public WebElement OptionLogout;
	
	@FindBy(xpath="//a[contains(@class,'ab-item')][contains(text(),'Log Out')]")
	public WebElement Logout;
	
	/*
	 * // Test case RETC-012 "LOG IN/REGISTER button"
	 */
	
	@FindBy(xpath="//a[contains(text(),'Lost Your Password?')]")
	public WebElement Lostyourpassword;
	
	@FindBy(xpath="//input[@id='user_login']")
	public WebElement Email_Address_Textbox;
	
	@FindBy(xpath="//input[@name='submit']")
	public WebElement ResetPassword;
	
	@FindBy(xpath="//p[contains(text(),'The email could not be sent.')]")
	public WebElement ErrorMessage;
	
	/*
	 * // End of variable declaration for test cases"
	 */
	
	/*
	 * // Test case RETC_046 "Click on Property Tab and Publish"
	 */
	
	@FindBy(xpath="//div[contains(text(),'Properties')]")
	public WebElement Properties_Tab;
	
	@FindBy(xpath="//a[@class='page-title-action']")
	public WebElement Add_New; //Add New next to Properties heading//
	
	@FindBy(xpath="//input[@id='title']")
	public WebElement Enter_Title_Here;
	
	@FindBy(xpath="//textarea[@id='content']")
	public WebElement Valid_Credential_Textbox;
	
	@FindBy(xpath="//input[@id='in-property_feature-431']")
	public WebElement Features_AllFeatures_Best;
	
	@FindBy(xpath="//li[@id='region-57']//label[@class='selectit'][contains(text(),'Central Bangalore')]")
	public WebElement AllRegions_CentralBangalore_Checkbox;
 
	
	@FindBy(xpath="//input[@id='in-region-802']")
	public WebElement AllRegions_BTM_Checkbox;
	
	@FindBy(xpath="//input[@id='publish']")
	public WebElement Publish;
	
	@FindBy(xpath="//p[contains(text(),'Post published.')]")
	public WebElement Postpublished_ViewPost;
	
	
	/****TC_047 Elements*******/ 
	@FindBy(xpath="//a[@id='property_feature-add-toggle']")
	public WebElement AddNewFeature;
 
	@FindBy(xpath="//input[@id='newproperty_feature']")
	public WebElement AddNewFeature_Textbox;

	@FindBy(xpath="//select[@id='newproperty_feature_parent']")
	public WebElement ParentFeature_Listbox;
 
	@FindBy (xpath="//a[@id='property_feature-add-toggle']")
	public WebElement AddNewNewFeature;
	
	@FindBy(xpath="/input[@id='property_feature-add-submit']")
	public WebElement AddNewFeature_Submit; 
	
	@FindBy(xpath = "//input[@id='title']")
	public WebElement title;	
	
	@FindBy(xpath = "//textarea[@id='content']")
	public WebElement content;
	
	@FindBy(xpath = "//a[contains(text(),'View post')]")
	public WebElement link;
	
		
		public void RealEstate() throws InterruptedException {
			
				
				    this.Login_Register.click();
				    this.Username.sendKeys("admin");
				    this.Password.sendKeys("admin@123");
				    this.Sign_In.click();
				    this.Properties_Tab.click();
				    this.Add_New.click();
				    //this.AddNewFeature.click();
				    //this.AddNewFeature_Textbox.sendKeys("BestSrini");
				    
				    this.AddNewNewFeature.click();
				    Thread.sleep(1000);
				    
				    Select sel1 = new Select(ParentFeature_Listbox);  
				    sel1.selectByValue("435");
				    this.AddNewFeature_Textbox.sendKeys("Best500");
				    driver.findElement(By.id("property_feature-add-submit")).click();
				    //this.AddNewFeature_Submit.click();
				    driver.navigate().refresh();	
				    this.Enter_Title_Here.sendKeys("prestige");
				    this.Valid_Credential_Textbox.sendKeys("home town");
				    this.Publish.click();
				    this.link.click();
				    String url = this.driver.getCurrentUrl();
				    System.out.println("Value of url:" + url);
				    if(url == "http://realty-real-estate.upskills.in/wp-admin/post.php?post=5315&action=edit")
				    	System.out.println("Not Successful");
				    else
				    	System.out.println("Successful");

		
	}
	
}


