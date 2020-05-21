package com.training.pom;

import java.util.List;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.training.generics.ScreenShot;


public class LoginPOM {
	private WebDriver driver; 
	public LoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login")
	private WebElement userName; 
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="form-login_submitAuth")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Homepage')]")
    private WebElement home;
	
	@FindBy(xpath="//a[contains(text(),'My courses')]")
    private WebElement mycourse_tc2;
		

	@FindBy(xpath="//a[contains(text(),'Create a course')]")
    private WebElement course;
	
	@FindBy(xpath="//input[@id='title']")
    private WebElement courseName;
	
	@FindBy(xpath = "//html//body[@contenteditable='true']//p")
	private WebElement frame;
	
	//xpath reference for the last successfully created course in TC01 -- Please customize the name of the course before you run the script
	@FindBy(xpath="//a[contains(text(),'CsHKCAQNwX')]")
    private WebElement courseName_tc2;
	
	@FindBy(xpath="//a[@id='istooldesc_10784']")
    private WebElement courseDescription_tc2;
	
	@FindBy(xpath="//section[@id='cm-content']//div[@class='row']//a[1]//img[1]")
    private WebElement description_tc2;
	
	@FindBy(xpath="//input[@id='course_description_title']")
    private WebElement titletxt_tc2;
	
	@FindBy(xpath="//button[@id='advanced_params']")
    private WebElement advanceSetting;
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle bs-placeholder btn-default']//div[@class='filter-option-inner']")	
	private WebElement category;
	
	@FindBy(xpath="//span[contains(text(),'Projects (PROJ)')]")
    private WebElement project;
	
	@FindBy(xpath="//input[@id='add_course_wanted_code']")
    private WebElement courseCode;
	
	@FindBy(xpath="//div[contains(text(),'English')]")
    private WebElement language;

	
	@FindBy(xpath="//button[@id='add_course_submit']")
    private WebElement submitButton;
	
	@FindBy(xpath="//div[@class='help-course']//em[@class='fa fa-file-text']")
    private WebElement AddIntro;
	
	@FindBy(xpath="//iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement iframeXPATH;
	
	@FindBy(xpath="//html")
    private WebElement bodyText;
	
	@FindBy(xpath="//button[@id='introduction_text_intro_cmdUpdate']")
    private WebElement saveButton;
	
	
	@FindBy(xpath="//button[@id='course_description_submit']")
    private WebElement save_tc2;
	
	
	@FindBy(xpath="//img[@id='toolimage_10769']")
    private WebElement users_tc3;
	
	@FindBy(xpath="//a[contains(text(),'Trainers')]")
    private WebElement teachers_tc3;
	
	@FindBy(xpath="/html[1]/body[1]/main[1]/section[1]/div[1]/div[3]/div[1]/section[1]/div[1]/div[6]/div[1]/div[4]/div[1]/div[2]/a[2]")
    private WebElement checkbox_tc3;
	
	@FindBy(xpath=" //a[@class='btn btn-small btn-danger']")
    private WebElement unsubscribe_tc3;
	
	/**
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
	@FindBy(xpath="//a[contains(text(),'Course catalog')]")
    private WebElement coursecatalog_tc41;
	
	//sendkeys "Course name" 
	@FindBy(xpath="//input[@name='search_term']")
	private WebElement searchtxt_tc41;
	
	@FindBy(xpath="//div[@class='input-group']//button[1]")
	private WebElement searchbtn_tc41;
	
	@FindBy(xpath="//a[@class='btn btn-success btn-sm']")
	private WebElement subsbtn_tc41;
	
	//div[@class='btn-group']//a[@class='btn btn-success btn-sm']
	//div[@class='btn-group']//a[2]
	
	@FindBy(xpath = "//a[contains(text(),'My courses')]")
	private WebElement mycourse_tc41;
	
	@FindBy(xpath = "//a[contains(text(),'Selenium_Learning')]")
	private WebElement clickcourse_tc41;
	
	@FindBy(xpath = "//a[@id='istooldesc_2962']")
	private WebElement coursetests_tc41;
	
	@FindBy(xpath = "//a[@id='tooltip_33']")
	private WebElement onlinequiz_tc41;
	
	//a[@class='btn btn-success btn-large']
	@FindBy(xpath = "//a[@class='btn btn-success btn-large']")
	private WebElement proceedtest_tc41;
	
	//input[@id='choice-27-1']
	@FindBy(xpath = "input[@id='choice-27-1']")
	private WebElement choicetest1_tc41;
	
	@FindBy(xpath = "//button[@name='save_now']")
	private WebElement next_tc41;
	
	@FindBy(xpath = "//input[@id='choice-28-2']")
	private WebElement choicetest2_tc41;
	
	@FindBy(xpath = "//button[@name='save_now']")
	private WebElement endtest_tc41;
	
	/**
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
	@FindBy(xpath = "//a[contains(text(),'Selenium')]")
	private WebElement clickcourse_tc42;
	//h4[@class='course-items-title']//a[contains(text(),'Selenium')]
	/**
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
	


	@FindBy(linkText = "Selenium")
	private WebElement clickcourse_tc43;
	
	@FindBy(linkText = "Assignments")
	private WebElement assignment_tc43;
	
	@FindBy(xpath = "//a[contains(text(),'hands on exercises')]")
	private WebElement assignmenttype_tc43;
	
	@FindBy(className = "btn-toolbar")
	private WebElement toolbar_tc43;
	
	@FindBy(xpath = "//input[@id='form_file']")
	private WebElement fileupload_tc43;
	
	@FindBy(name = "submit")
	private WebElement submit_tc43;
	
	
	/** TC_068
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
	@FindBy(xpath = "//a[contains(text(),'Administration')]")
	private WebElement admin_tc68;
	
	@FindBy(xpath = "//a[contains(text(),'Add a user')]")
	private WebElement adduser_tc68;
	
	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement fname_tc68;
	
	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lname_tc68;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_tc68;
	
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phone_tc68;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username_tc68;
	
	//Check button -- Password
	@FindBy(xpath = "//div[@id='password-group']//div[@class='col-sm-8']//div[2]")
	private WebElement passwordchk_tc68;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password_tc68;	
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submit_tc68;
	
	/* Function Starts from Here ***************************************************/
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void createCourse() {
		try {
		this.home.click();
		this.course.click();
		System.out.println("Create course button clicked");
		this.courseName.clear();
		String courseName = RandomStringUtils.randomAlphabetic(10);
		this.courseName.sendKeys(courseName);
		this.advanceSetting.click();
		this.category.click();
		this.project.click();
		this.courseCode.clear();
		String courseCode = RandomStringUtils.randomAlphabetic(6);
        String content = RandomStringUtils.randomAlphabetic(15);
		this.courseCode.sendKeys(courseCode);
		System.out.println("courseCode button clicked");

		this.submitButton.click();
		System.out.println("submitButton button clicked");

		this.AddIntro.click();
		System.out.println("AddIntrobutton clicked");
		
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	
		int numberOfTags = elements.size();
		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
			
			/* code for frame handling */	 
		this.driver.switchTo().frame(0);
		this.frame.click();
		this.frame.sendKeys(content);
		this.driver.switchTo().defaultContent();	
		this.saveButton.click();
		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());

		}
		
		}


	//testing
	public void createDescription() {
		// TODO Auto-generated method stub
		try
		{
			this.mycourse_tc2.click();
			System.out.println("mycourse button clicked");
			this.courseName_tc2.click();
			this.courseDescription_tc2.click();
			this.description_tc2.click();
			String title = RandomStringUtils.randomAlphabetic(5);
			this.titletxt_tc2.sendKeys(title);
			String desctxt_tc2 = RandomStringUtils.randomAlphabetic(20);
			List<WebElement> elements = driver.findElements(By.tagName("iframe"));
			
			int numberOfTags = elements.size();
			System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
				
			//code for frame handling 	 
			this.driver.switchTo().frame(0);
			this.frame.click();
			this.frame.sendKeys(desctxt_tc2);
			this.driver.switchTo().defaultContent();
			this.save_tc2.click();
		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());
		}
		}

	public void courseUnsubscribe() {
		// TODO Auto-generated method stub
		try {
			//TC2 Web Elements are reused
			this.mycourse_tc2.click();
			System.out.println("mycourse button clicked");
			this.courseName_tc2.click();
			this.users_tc3.click();
			this.teachers_tc3.click();
			this.unsubscribe_tc3.click();
			Alert alert = driver.switchTo().alert(); 
			alert.accept();

		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());
		}
	}
	
	public void coursesubscribe() {
		// TODO Auto-generated method stub
		try {
			String Coursetitle = "Selenium_Learning";
			this.coursecatalog_tc41.click();
			this.searchtxt_tc41.sendKeys(Coursetitle);
			this.searchbtn_tc41.click();
			this.subsbtn_tc41.click();
			this.mycourse_tc41.click();
			this.clickcourse_tc41.click();
			this.coursetests_tc41.click();
			this.onlinequiz_tc41.click();
			this.proceedtest_tc41.click();
			this.choicetest1_tc41.click();
			this.next_tc41.click();
			this.choicetest2_tc41.click();
			this.endtest_tc41.click();			
		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());
		}
	}
	
	public void courseassessment() {
		// TODO Auto-generated method stub
		try {
			//TC2 Web Elements are reused
			String Coursetitle = "Selenium";
			this.clickcourse_tc42.click();
			this.searchtxt_tc41.sendKeys(Coursetitle);
			this.searchbtn_tc41.click();
			this.subsbtn_tc41.click();
			this.mycourse_tc41.click();
			this.clickcourse_tc41.click();
			this.coursetests_tc41.click();
			this.onlinequiz_tc41.click();
			this.proceedtest_tc41.click();
			this.choicetest1_tc41.click();
			this.next_tc41.click();
			this.choicetest2_tc41.click();
			this.endtest_tc41.click();

		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());
		}
		
}

	public void discussforum() {
		// TODO Auto-generated method stub
		try {
			//TC2 Web Elements are reused
	
            
            this.mycourse_tc41.click();
            this.clickcourse_tc43.click();
			this.assignment_tc43.click();	
			this.assignmenttype_tc43.click();
			this.toolbar_tc43.click();
			this.fileupload_tc43.sendKeys("C:\\Users\\GowrishankarGopalcha\\Desktop\\Java Learning\\index.html");  
			Thread.sleep(5000);
			this.submit_tc43.click();	        
		}
		catch(Exception e)
		{
			System.out.println("Failed to " + e.getMessage());
		}
		
	}

	/**TC_68**/
	public void loaddatabase(String firstname, String lastname, String eMail, String phone, String usrname,
			String password) {
		// TODO Auto-generated method stub
		
	      System.out.println("First Name:\n"+firstname);
	      System.out.println("Last Name:\n"+lastname);
	      System.out.println("eMail:\n"+eMail);
	      System.out.println("phone:\n"+phone);
	      System.out.println("usrname:\n"+usrname);
	      System.out.println("password:\n"+password);
	      this.admin_tc68.click();
	      this.adduser_tc68.click();
	      this.fname_tc68.sendKeys(firstname);
	      this.lname_tc68.sendKeys(lastname);
	      this.email_tc68.sendKeys(eMail);
	      this.phone_tc68.sendKeys(phone);
	      this.username_tc68.sendKeys(usrname);
	      passwordchk_tc68.click();
	      this.password_tc68.sendKeys(password);
	      this.submit_tc68.click();
		 
	}
	/**TC_69**/
	public void loadexcel(String firstname, String lastname, String eMail, String phone, String usrname,
			String password) {
		// TODO Auto-generated method stub
		
	      System.out.println("First Name:\n"+firstname);
	      System.out.println("Last Name:\n"+lastname);
	      System.out.println("eMail:\n"+eMail);
	      System.out.println("phone:\n"+phone);
	      System.out.println("usrname:\n"+usrname);
	      System.out.println("password:\n"+password);
	      this.admin_tc68.click();
	      this.adduser_tc68.click();
	      this.fname_tc68.sendKeys(firstname);
	      this.lname_tc68.sendKeys(lastname);
	      this.email_tc68.sendKeys(eMail);
	      this.phone_tc68.sendKeys(phone);
	      this.username_tc68.sendKeys(usrname);
	      passwordchk_tc68.click();
	      this.password_tc68.sendKeys(password);
	      this.submit_tc68.click();
		 
	}
		
}

