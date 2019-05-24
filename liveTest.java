package webTest;


import static org.testng.Assert.assertEquals;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class liveTest
{

	WebDriver driver;

	private final String username = "email"+new Random().nextInt(10000000)+"@email.com";
	private final String password = "123456";
	private final String company_name = new Random().nextInt(10000000)+" Company";
	private final String contact_person = new Random().nextInt(10000000)+ " dummy person";
	private final String designation = new Random().nextInt(10000000)+" SEME";
	private final String email = "email"+new Random().nextInt(10000000)+"@email.com";
	private final String phone = new Random().nextInt(10000000)+"8";
	private final String select_country = "India";
	private final String COMP_USERNAME = "laddu";
	private final String COMP_PWD = "123456";
	private final String select_emp_for_work="Piklu";
	private final String Date="30";
	private final String user_for_activity="Piklu";
	private final String new_user="Name"+ RandomStringUtils.randomAlphabetic(3);
	private final String user_for_authorization="NameIFs";
	private final String auth_username="Name-Test-AZB894@gmail.com";
	private final String auth_pwd="123456";
	private final String NEW_COMP_PWD = "654321";

	private final String select_year="2019";
	private final String select_month="Jan";
	
	
	////////////////select branch////////////////
	private final String select_branch_for_employee="Branch 365";
	
	///***lead***///
	
		private final String lead_name= "test lead"+ RandomStringUtils.randomAlphabetic(3);
		private final String lead_contact_person= "person"+ RandomStringUtils.randomAlphabetic(3);
		private final String lead_company= "test company"+ RandomStringUtils.randomAlphabetic(3);
		private final String lead_email=  "email"+new Random().nextInt(10000000)+"@email.com";
		private final String lead_phone= "7556756765";
		private final String lead_address=  "email"+new Random().nextInt(10000000)+"@email.com";

		private final String select_lead_stage="Prospecting 10%";
		private final String select_value="1"; /// 0=no 1=yes
		private final String select_value2="0";
		
	
	
	@BeforeTest
	public void launchTwib()
	{

		 

		System.setProperty("webdriver.gecko.driver","D:\\testing tools\\selenium work\\gecko driver\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.get("https://web.twib.online/company");

		String currentURL=driver.getCurrentUrl();
		
		driver.manage().window().maximize();
		
		
		
	}
	

 
	
	@Test
	public void twibTests()
	{
		registration();System.out.println("Registration tested");
//		login(); waitForLoad(driver);
//		statusCheck();waitForLoad(driver);
//		ManageUser(); waitForLoad(driver);System.out.println("Manage user report tested");
//		ManageWork();waitForLoad(driver);System.out.println("Manage work report tested");
//		checkinReport();waitForLoad(driver);System.out.println("Checkin report tested");
//		expenseReport();waitForLoad(driver);System.out.println("Expense report tested");
//		gpsReport();waitForLoad(driver);System.out.println("gps report tested");
//		attendanceReport();waitForLoad(driver);System.out.println("attendance report tested");
//		manageClient();waitForLoad(driver);System.out.println("Manage Client tested");
//		add_Branch();
//		assign_user_under_branch();
//		delete_branch();
//		authorize_user();waitForLoad(driver);System.out.println("authorize user  tested");
//		lead();
//		checkin_to_lead();
//		change_password();waitForLoad(driver);System.out.println("change pwd  tested");
//		packages();	waitForLoad(driver);System.out.println("Expense reported tested");
//		settings();waitForLoad(driver);System.out.println("settings  tested");
//		logout();System.out.println("logout tested");
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////registration/////////////////////
	
	public void registration()
	{
		driver.findElement(By.linkText("Don't have an account?")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		String Username=driver.findElement(By.name("username")).getText();
		
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.id("nextbtn1")).click();
		
		WebDriverWait wait3= new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.name("company_name"))).sendKeys(company_name);

		
		driver.findElement(By.name("company_name")).sendKeys(phone);
		driver.findElement(By.name("contact_person")).sendKeys(contact_person);
		driver.findElement(By.name("designation")).sendKeys(designation);
		
		driver.findElement(By.id("email_id")).clear();
	   //System.out.println("Email is: " +email2);
//		if(username.equals(driver.findElement(By.name("email"))))
//		{ 
//			System.out.println("username matches with email id");
//			driver.findElement(By.name("phone")).sendKeys(phone);
//		}
//		
//		else
//			System.out.println("no email entered");
			driver.findElement(By.name("email")).sendKeys(email);
//		
//		
//		String phone_num=driver.findElement(By.name("phone")).getText();
//		
//		if(phone_num.contains(username))
//		{
//			System.out.println("phone number matches with email id");
//			
//			Select country=new Select(driver.findElement(By.id("country")));
//			country.selectByVisibleText(select_country);
//
//		}
//		
//		else
//			System.out.println("no phone entered");
			driver.findElement(By.name("phone")).sendKeys(phone);
//		
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByVisibleText(select_country);
		
		driver.findElement(By.name("register")).click();
		
		WebDriverWait home= new WebDriverWait(driver,20);
		home.until(ExpectedConditions.visibilityOfElementLocated(By.name("no"))).click();
		
		
//		driver.findElement(By.name("yes")).click();
		
		System.out.println("Title of the page is: " +driver.getTitle());
		
		driver.findElement(By.id("sidebarCollapse")).click();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Edit Company")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,1500)");
		
		//driver.findElement(By.id("delete_immediately")).click();
		
		driver.findElement(By.id("myBtn_3")).click();
		driver.findElement(By.name("yes")).click();
		
		
		

	}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys(COMP_USERNAME);
		driver.findElement(By.name("password")).sendKeys(COMP_PWD);
		driver.findElement(By.id("login")).click();
		
		Assert.assertTrue(driver.getTitle().contains("Company Panel"), "User is unable to login due to invalid credentials");
		
		System.out.println("Page Verified- user is now able to login");
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		// findbrokenLink();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,100)");
		
		statusCheck();
		
	/**	
		JavascriptExecutor je=(JavascriptExecutor) driver;
		WebElement element=driver.findElement(By.linkText("Sankhya"));
		
		je.executeScript("argument[0].scrollIntoView(true);", element);
		
		System.out.println(element.getText());
	
**/	
	
	}


	
///////////////////////////////////////////////////////////////////////////////////////////////
	
	public void statusCheck()

	{

		String status=driver.findElement(By.className("package_Title")).getText();
		String count=driver.findElement(By.className("user_count")).getText(); 
		
		 
		 System.out.println("Your current package is : " +status);
		System.out.println("Your total user is : " +count);
		
		
	
	
}
	
//////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void ClickMenu()
	{
		driver.findElement(By.id("sidebarCollapse")).click();
	}

/////////////////////////////////////////////////////////////////////////////////////////////////

	public void ManageUser()
	{
		
		ClickMenu();
		driver.findElement(By.linkText("Manage Users")).click();
		
		System.out.println("Title of the page is: " +driver.getTitle());
		driver.findElement(By.className("Button08")).click();
		
		
		
		

		
		((WebDriver) driver).manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		driver.findElement(By.id("emp_name")).sendKeys(new_user);
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("mobile")).sendKeys("1234567890");
		driver.findElement(By.id("designation")).sendKeys("xyz");
		driver.findElement(By.id("username")).sendKeys("Name"+"-"+"Test"+"-"+ RandomStringUtils.randomAlphabetic(3) + RandomStringUtils.randomNumeric(3)+"@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		scroll();
		scroll();
		((WebDriver) driver).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		scroll();
		
		WebDriverWait wait3= new WebDriverWait(driver,20);
		wait3.until(ExpectedConditions.visibilityOfElementLocated(By.id("register"))).click();

		
		((WebDriver) driver).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		waitForLoad(driver);
		((WebDriver) driver).manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("User added successfully");
	}
	

////////////////////////////////////////////////////////////////////////////////////////////////////	


	public void ManageWork()
	{
		ClickMenu();

		driver.findElement(By.linkText("Manage Works")).click();
		waitForLoad(driver);

		System.out.println("Title of the page is: " +driver.getTitle());
		driver.findElement(By.className("Button08")).click();
		driver.findElement(By.id("title")).sendKeys("dummy work");
		
		
		driver.findElement(By.id("details")).sendKeys("dummy details");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		Select employee_for_work= new Select(driver.findElement(By.name("ref_emp_id")));
		employee_for_work.selectByVisibleText(select_emp_for_work);
		
		List<WebElement>type = driver.findElements(By.name("work_priority"));
		
		 System.out.println("total priority types: " +type.size());
		 
		 driver.findElement(By.name("work_priority")).click();
//		 
//		 if(type.size()>0)
//			 {
//				 for(int i=0;i<=type.size();i++)
//				 {
//			 	
//					 WebElement button=type.get(i);
//					String button_name= button.getAttribute("value");
//				
//					System.out.println(button_name);
//					
//					if(button_name.equalsIgnoreCase("2"))
//					{
//						button.click();
//					}
//				 }
//			 }
//		
//		
	              
		
		driver.findElement(By.name("submit")).click();
	
	
		waitForLoad(driver);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void search_work()
	{
		 WebElement status1=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div[2]/div[11]/div[1]/div/span[2]"));
		 WebElement status2=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div[2]/div[12]/div[1]/div/span[2]"));
		 WebElement status3=driver.findElement(By.xpath("/html/body/div/div[3]/div[2]/div/div/div/div/div[2]/div[13]/div[1]/div/span[2]"));		 
	
		 List<WebElement> list= driver.findElements(By.xpath("//"));
	
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////scroll//////////////
	
	public void scroll()
	{
		((JavascriptExecutor)driver).executeScript("scroll(0,900)");

	}
	
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////	

	
	public void checkinReport()
	
	{
		
		ClickMenu();
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.linkText("Check-in Report")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement emp_dd=driver.findElement(By.className("dropdown-display"));
		emp_dd.click();
		
//		WebElement dropdown = driver.findElement(By.className("dropdown-display"));
		
		
		List<WebElement> dropDowns =driver.findElements(By.className("dropdown-main"));
		Actions actions = new Actions(driver);		
		WebElement select =driver.findElement(By.className("dropdown-main"));		
			    actions.moveToElement(select).click().build().perform();
		
		driver.findElement(By.id("checkin_date")).click();
		Select year= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")));
		year.selectByVisibleText(select_year);
		Select month= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[1]")));
		month.selectByVisibleText(select_month);
		select_date();
		
		
		
		
		driver.findElement(By.name("submit")).click();
		
		((WebDriver) driver).manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

		
	
	}

	
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public void expenseReport()
	{
		ClickMenu();
		driver.findElement(By.linkText("Reports")).click();
		
		driver.findElement(By.linkText("Expense Report")).click();
		System.out.println("Title of the page is: " +driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement emp_dd=driver.findElement(By.className("dropdown-display"));
		emp_dd.click();
		
//		WebElement dropdown = driver.findElement(By.className("dropdown-display"));
		
		
		List<WebElement> dropDowns =driver.findElements(By.className("dropdown-main"));
		Actions actions = new Actions(driver);		
		WebElement select =driver.findElement(By.className("dropdown-main"));		
			    actions.moveToElement(select).click().build().perform();
		driver.findElement(By.id("from_date")).click();
		Select year= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")));
		year.selectByVisibleText(select_year);
		Select month= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[1]")));
		month.selectByVisibleText(select_month);
		select_date();
		
		driver.findElement(By.name("submit")).click();		
		

		
		
	
	}

////////////////////////////////////////////////////////////////////////////////////////////////////	

	public void gpsReport()
	{
		ClickMenu();
		driver.findElement(By.linkText("Reports")).click();
		
		driver.findElement(By.linkText("GPS Report")).click();
		System.out.println("Title of the page is: " +driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement emp_dd=driver.findElement(By.className("dropdown-display"));
		emp_dd.click();
		
//		WebElement dropdown = driver.findElement(By.className("dropdown-display"));
		
		List<WebElement> dropDowns =driver.findElements(By.className("dropdown-main"));
		Actions actions = new Actions(driver);		
		WebElement select =driver.findElement(By.className("dropdown-main"));		
		actions.moveToElement(select).click().build().perform();
		
		driver.findElement(By.id("report_date")).click();
		///select date////		
		Select year= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")));
		year.selectByVisibleText(select_year);
		Select month= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[1]")));
		month.selectByVisibleText(select_month);
		select_date();
		
		driver.findElement(By.name("submit")).click();
		
	}

	

//////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void attendanceReport()
	{
		ClickMenu();
		
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.linkText("Attendance Report")).click();
		System.out.println("Title of the page is: " +driver.getTitle());
		WebDriverWait wait = new WebDriverWait(driver, 10);

		
		//(driver.findElement(By.className("dropdown-option "))).click();
//		WebElement dropdown = wait.until(ExpectedConditions.presenceOfElementLocated(By.className("dropdown-display")));
//		dropdown.click();

		//Now find desired option and click 
//		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Piklu"))).click();
		
		driver.findElement(By.id("from_date")).click();
		
		Select year= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[2]")));
		year.selectByVisibleText(select_year);
		Select month= new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/select[1]")));
		month.selectByVisibleText(select_month);
		select_date();
		driver.findElement(By.name("submit")).click();
		
		
		
	}


/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void packages()
	{

	ClickMenu();
	
	driver.findElement(By.xpath("/html/body/div/div[3]/nav/ul/li[9]/a")).click();;
	 
	 driver.findElement(By.xpath("//a[contains(text(),'Add/Remove Users')]")).click();
	
	//((JavascriptExecutor)driver).executeScript("scroll(0,100)");
	
	WebElement button=driver.findElement(By.xpath("//a[@class='lp-button02 lp-button03']"));
	
	button.click();
	
	System.out.println("Company is trying to add users");
	
	//driver.findElement(By.className("lp-button")).click();
	
	((JavascriptExecutor)driver).executeScript("scroll(0,100)");
	
	driver.findElement(By.id("register")).click();
	
	Select payment=new Select(driver.findElement(By.id("payment_gateway")));
		
	
	payment.selectByVisibleText("Subscription (Credit Card Only)");
	
	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	
	driver.findElement(By.id("button_submit")).click();
	
    driver.findElement(By.name("yes")).click();	

	
	//driver.findElement(By.name("yes")).click();
	
	((WebDriver) driver).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
}


//////////////////////////////////////////////////////////////////////////////////////////////////////
/////client manage/////////////////////
	
	public void manageClient()
	{
		
		
		ClickMenu();
		
		driver.findElement(By.linkText("Manage Clients")).click();
		((WebDriver) driver).manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);		
		System.out.println("Title of the page is: " +driver.getTitle());
		
		String client_num1=driver.findElement(By.className("Heading03")).getText();
		
		System.out.println("Before adding the total no. client: " +client_num1);
		
		
		
		driver.findElement(By.className("Button08")).click();
		driver.findElement(By.id("first_name")).sendKeys("happy");
		driver.findElement(By.id("last_name")).sendKeys("customers");
		driver.findElement(By.id("organization")).sendKeys("alls good test");
		driver.findElement(By.id("phone1")).sendKeys("9832776530");
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.name("details")).sendKeys("dummy details");
		driver.findElement(By.id("register")).click();
		((WebDriver) driver).manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		
		String client_num2=driver.findElement(By.className("Heading03")).getText();
		
		System.out.println("After adding the total no. client: " +client_num2);
	
		
		driver.findElement(By.className("deleteIcon")).click();
		driver.findElement(By.name("yes")).click();
		

		String msg=driver.findElement(By.className("s_message")).getText();
    	String client_num3=driver.findElement(By.className("Heading03")).getText();

    	
		try {	 
	    	assertEquals(client_num2, client_num2);
		    } catch (Exception e) {
		    	e.printStackTrace();	    	
		    }	
	}
	
////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////
//////Branch Management /////////////////////

	public void add_Branch()
	{
		ClickMenu();

		driver.findElement(By.linkText("Admin Settings")).click();
		driver.findElement(By.linkText("Manage Branches")).click();


		System.out.println("Title of the page is: " +driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"content1\"]/div/div/div/div[1]/div[2]/div[1]/a")).click();

		driver.findElement(By.id("branch_name")).sendKeys("Dummy Branch " +new Random().nextInt(1000));


		//Random random = new Random();
		//int value = random.nextInt();  // It will give a range between 0 to 4
		//System.out.println("Index is "+value);
		WebElement managers=driver.findElement(By.id("branch_managers")); //Weblist for number
		Select list = new Select(managers);
		list.selectByIndex(new Random().nextInt(3));

		driver.findElement(By.name("submit")).click();

	}
/////////////////////////////////////////////////////////////////////////////////////////
/////user assign under branch////////////////////////////


	public void assign_user_under_branch()
	{
		ClickMenu();
		driver.findElement(By.linkText("Manage Users")).click();
		
		
		
	
		 List <WebElement> listings = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[1]/div/a"));
		 
		 
		
			for(int i=1;i<=listings.size();i++)
			{
			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[1]/div/a")).getAttribute("title");
			 Random r = new Random();
			 int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
			 listings.get(randomValue).click();
			 
			}
			
			
		 
			
			 

		
		

		((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		
		Select branch=new Select(driver.findElement(By.id("branch_id")));
		branch.selectByVisibleText(select_branch_for_employee);

		driver.findElement(By.name("save")).click();



		//		Select list = new Select(users);
		//list.selectByIndex(new Random().nextInt(3));
		//list.selectByVisibleText(new Random().toString());
		//selectByIndex(new Random().nextInt(4));

	}
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////delete branch/////////////////////////////////
	
	public void delete_branch()
	{
		ClickMenu();
		driver.findElement(By.linkText("Admin Settings")).click();
		driver.findElement(By.linkText("Manage Branches")).click();

		driver.findElement(By.xpath("//*[@id=\"content1\"]/div/div/div/div[2]/div[3]/div[2]/div/span/a")).click();
		driver.findElement(By.name("yes")).click();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////authorize user///////////
	
	public void authorize_user()
	{
		ClickMenu();
		driver.findElement(By.linkText("Manage Users")).click();
		driver.findElement(By.linkText(user_for_authorization)).click();

		
//		 List <WebElement> listings = driver.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[1]/div/a"));
//		 
//		 
//			
//			for(int i=1;i<=listings.size();i++)
//			{
//			 driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[4]/div[1]/div[1]/div[1]/div/a")).getAttribute("title");
//			 Random r = new Random();
//			 int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
//			 listings.get(randomValue).click();
//			 
//			}
//		
		
		
		
		
//		 List<WebElement>users = driver.findElements(By.className("manage_user_content"));
//				 
//		 for(int i=0;i<users.size();i++) {					//////selecting users from list
//	            WebElement user_list=users.get(i);
//	            
//	          String user_name= user_list.getText();
//	            
//	          System.out.println("Names of user is: "+user_name);
//	          
//	          if(user_name.equalsIgnoreCase(user_for_authorization))
//	          {
//	        	  driver.findElement(By.linkText(user_for_authorization)).click();
//	        	 
//	          }
//	        } 
//		
		 //String username=driver.findElement(By.className("Heading02 Heading99")).getText();
		 
			
			String username=driver.findElement(By.id("email")).getAttribute("value");
			System.out.println(username);
			((JavascriptExecutor)driver).executeScript("scroll(0,800)");	
		
		driver.findElement(By.id("myBtn_auth")).click();
		driver.findElement(By.name("yes")).click();
		
/////////validating
		
		ClickMenu();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(auth_pwd);
		driver.findElement(By.id("login")).click();
		ClickMenu();
		
		driver.findElement(By.linkText("Manage Users")).click();
		
		driver.findElement(By.linkText(user_for_authorization)).click();
		ClickMenu();
		
		driver.findElement(By.linkText("Logout")).click();
		login();
		ClickMenu();
		driver.findElement(By.linkText("Manage Users")).click();
		
		driver.findElement(By.linkText(user_for_authorization)).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");	
		
		driver.findElement(By.id("myBtn_unauth")).click();
		driver.findElement(By.name("yes")).click();
		System.out.println("User been Authorised and again unauthorised");
		
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////Manage Lead and Convert checkin to lead//////////////////////////


	public void lead()
	{

		ClickMenu();
		driver.findElement(By.linkText("Manage Leads")).click();
		
		driver.findElement(By.xpath("//*[@id=\"manage_user_content\"]/div/div/div[1]/div[2]/div[1]/a")).click();

		driver.findElement(By.name("lead_name")).sendKeys(lead_name);
		driver.findElement(By.name("contact_person")).sendKeys(lead_contact_person);
		driver.findElement(By.name("company")).sendKeys(lead_company);
		driver.findElement(By.name("email")).sendKeys(lead_email);
		driver.findElement(By.name("phone")).sendKeys(lead_phone);
		driver.findElement(By.name("address")).sendKeys(lead_address);	

		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		Select lead_stage=new Select(driver.findElement(By.name("lead_stages")));
		lead_stage.selectByVisibleText(select_lead_stage);


		driver.findElement(By.name("lead_date")).click();
		select_date();


		Select assignee=new Select(driver.findElement(By.name("assigned_to[]")));
		assignee.selectByVisibleText(select_emp_for_work);

		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		List<WebElement> options = driver.findElements(By.name("reminder"));

			if(options.size()>0)
			{
				for(int i=0;i<options.size();i++)
				{

					WebElement button=options.get(i);
					String button_name= button.getAttribute("value");

					System.out.println("Available radio buttons:" +button_name);

					if(button_name.equalsIgnoreCase(select_value))
					{
						button.click();
					}
					else
					{
						button_name.equalsIgnoreCase(select_value2);
					}
				}
			}



			driver.findElement(By.name("followup_date")).click();
			select_date();
			driver.findElement(By.name("submit")).click();

			waitForLoad(driver);

			Assert.assertTrue(driver.findElement(By.className("s_message")).isDisplayed(),"Something went wrong");


			System.out.println("Successful in adding Lead");


	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////****convert to lead*****///////////////////////////

	public void checkin_to_lead()
	{
		ClickMenu();

		driver.findElement(By.linkText("Manage Check-ins")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/div/div[5]/div/div/div[1]/div[2]/span[1]/a")).click();
		waitForLoad(driver);
		driver.findElement(By.name("contact_person")).sendKeys(lead_contact_person);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");

		Select lead_stage=new Select(driver.findElement(By.name("lead_stages")));
		lead_stage.selectByVisibleText(select_lead_stage);

		driver.findElement(By.name("lead_date")).click();
		select_date();

		Select assign = new Select(driver.findElement(By.name("assigned_to[]")));
		WebElement option = assign.getFirstSelectedOption();
		String content = option.getText();


		Assert.assertTrue(content.contains(content), "Incorrect employee is assigned");
		System.out.println("Correct employee is assigned");

		List<WebElement> options = driver.findElements(By.name("reminder"));

		if(options.size()>0)
		{
			for(int i=0;i<options.size();i++)
			{

				WebElement button=options.get(i);
				String button_name= button.getAttribute("value");

				System.out.println("Available radio buttons:" +button_name);

				if(button_name.equalsIgnoreCase(select_value))
				{
					button.click();
				}
				else
				{
					button_name.equalsIgnoreCase(select_value2);
				}
			}
		}



		driver.findElement(By.name("followup_date")).click();
		select_date();
		driver.findElement(By.name("submit")).click();

		waitForLoad(driver);

		Assert.assertTrue(driver.findElement(By.className("s_message")).isDisplayed(),"Something went wrong");


		System.out.println("Successful in converting checkin to Lead");


	}


/////////////////////////////////////////////////////////////////////////////////////////////////
/////change password////////
	
	public void change_password()
	{
		ClickMenu();
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Change Password")).click();
		System.out.println("Title of the page is: " +driver.getTitle());
		
		driver.findElement(By.id("o_password")).sendKeys(COMP_PWD);
		driver.findElement(By.id("n_password")).sendKeys(NEW_COMP_PWD);
		driver.findElement(By.id("c_password")).sendKeys(NEW_COMP_PWD);
		driver.findElement(By.name("change_password")).click();
		waitForLoad(driver);

		ClickMenu();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.name("username")).sendKeys(COMP_USERNAME);
		driver.findElement(By.name("password")).sendKeys(COMP_PWD);
		driver.findElement(By.id("login")).click();
		
		if(driver.findElement(By.className("e_message_lr")).isDisplayed())
		{ 
			
			driver.findElement(By.name("username")).sendKeys(COMP_USERNAME);
			driver.findElement(By.name("password")).sendKeys(NEW_COMP_PWD);
			driver.findElement(By.id("login")).click();
			ClickMenu();
			driver.findElement(By.linkText("Settings")).click();
			driver.findElement(By.linkText("Change Password")).click();
			
			driver.findElement(By.id("o_password")).sendKeys(NEW_COMP_PWD);
			driver.findElement(By.id("n_password")).sendKeys(COMP_PWD);
			driver.findElement(By.id("c_password")).sendKeys(COMP_PWD);
			driver.findElement(By.name("change_password")).click();
		}
		
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
//////settings/////////////
	public void settings()
	{
		ClickMenu();
		
		driver.findElement(By.linkText("Settings")).click();
		driver.findElement(By.linkText("Notification Settings")).click();

		System.out.println("Title of the page is: " +driver.getTitle());
		Select digest_mail= new Select(driver.findElement(By.name("daily_digest_email")));
		
		digest_mail.selectByVisibleText("Send Monthly");
		driver.findElement(By.name("work_status_update")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		
		driver.findElement(By.name("save")).click();

	
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////
/////////logout//////////////////	
	
	public void logout()
	{
		ClickMenu();
		driver.findElement(By.linkText("Logout")).click();
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	public static void waitForLoad(WebDriver driver) {
	    ExpectedCondition<Boolean> pageLoadCondition = new
	            ExpectedCondition<Boolean>() {
	                public Boolean apply(WebDriver driver) {
	                    return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
	                }
	            };
	    WebDriverWait wait = new WebDriverWait(driver, 30);
	    wait.until(pageLoadCondition);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public void findbrokenLink()
	
	{
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Total links are "+links.size());
		
		for(int i=0;i<links.size();i++)
		{
			
			WebElement ele= links.get(i);
			
			String url=ele.getAttribute("href");
			
			verifyLinkActive(url);
			
		
		}
	}
	
	public static void verifyLinkActive(String linkUrl)
	{
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
           
           httpURLConnect.setConnectTimeout(3000);
           
           httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e)
        {
        	//System.out.println("test successful");  
        	
        }
    } 
	
////////////////////////////////////////////////////////////////////////////////////////////////////
/////select date////////////
	
	public void select_date()
	{
	List<WebElement> allDates=driver.findElements(By.className("ui-state-default"));

	int total_nodes=allDates.size();
	
	for(int i=0;i<total_nodes;i++)
	{
		String date=allDates.get(i).getText();
		if(date.equals(Date))
		{
			allDates.get(i).click();
		}
	}
///////////////////////////////////////////////////////////////////////////////////////
	
//	@AfterTest
//	public void teardown() {
//     driver.close();
//	}
///////////////////////////////////////////////////////////////////////////////////////////	
}
}