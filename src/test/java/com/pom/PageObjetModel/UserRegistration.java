package com.pom.PageObjetModel;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


 public class UserRegistration extends BaseTest {
	

	
	  @FindBy(id="email_create") 
	  public WebElement email;
	  
	  @FindBy(xpath="//form[@id='create-account_form']//span[1]")
	  public WebElement createaccount;
	  
	  @FindBy(xpath="//input[@id='id_gender2']")
	  public WebElement radiobuttonMrs;
	  
	  @FindBy(id="customer_firstname")
	  public WebElement firstname;
	  
	  @FindBy(id="customer_lastname")
	  public WebElement lastname;
	  
	  @FindBy(id="email")
	  public WebElement useremail;
	  
	  @FindBy(id="passwd")
	  public WebElement userpassword;
	  
	  @FindBy(xpath="//select[@id='days']")
	  public WebElement datepickfordays;
	  
	  @FindBy(xpath="//select[@id='months']")
	  public WebElement datepickformonths;
	  
	  @FindBy(xpath="//select[@id='years']")
	  public WebElement datepickforyears;
	  
	  @FindBy(id="newsletter")
	  public WebElement checkbox1;

	  
	  
	  public UserRegistration(WebDriver driver) 
	  {

        PageFactory.initElements(driver, this);
	}

	public void registerAccount() throws InterruptedException 
	  {
		
		
		
	  email.sendKeys("galazy007@gamil.com");
	  createaccount.click();
	  Thread.sleep(3000);
	  radiobuttonMrs.click();
	  firstname.sendKeys("Aparna");
	  lastname.sendKeys("M"); 
	  useremail.sendKeys("galazy007@gamil.com");
	  userpassword.sendKeys("galaxy007");
	  datepickfordays.sendKeys("19");
	  datepickformonths.sendKeys("may");
	  datepickforyears.sendKeys("2002");
	  checkbox1.click();
	  
	  
	  }
	 
	
	
	
	

	/*
	 * public static void main(String[] args) throws InterruptedException {
	 * 
	 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver(); driver.get(
	 * "http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation"
	 * ); driver.manage().window().maximize();
	 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 * 
	 * 
	 * 
	 * 
	 * driver.findElement(By.id("email_create")).sendKeys("galazy007@gamil.com");;
	 * driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).
	 * click();
	 * 
	 * 
	 * WebElement radio1=driver.findElement(By.xpath(" //input[@id='id_gender2']"));
	 * radio1.click(); Thread.sleep(2000);
	 * 
	 * 
	 * driver.findElement(By.id("customer_firstname")).sendKeys("Appu");
	 * driver.findElement(By.id("customer_lastname")).sendKeys("M");
	 * driver.findElement(By.id("email")).sendKeys("galazy125@gamil.com");
	 * driver.findElement(By.id("passwd")).sendKeys("galaxy125");
	 * driver.findElement(By.xpath("//select[@id='days']")).click(); //date picker
	 * Select sel=new Select(driver.findElement(By.xpath(" //select[@id='days']")));
	 * sel.selectByIndex(6);
	 * 
	 * Select sel1=new
	 * Select(driver.findElement(By.xpath("//select[@id='months']")));
	 * sel1.selectByIndex(4);
	 * 
	 * Select sel2=new
	 * Select(driver.findElement(By.xpath(" //select[@id='years']")));
	 * sel.selectByIndex(10); driver.findElement(By.id("newsletter")).click();
	 * driver.findElement(By.xpath(" //input[@id='firstname']")).sendKeys("Gopal");
	 * driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("G");
	 * driver.findElement(By.xpath("//input[@id='company']")).sendKeys("moonstar");
	 * driver.findElement(By.xpath(" //input[@id='address1']")).sendKeys("WAYNE");
	 * driver.findElement(By.xpath(" //input[@id='city']")).sendKeys("WAYNE");
	 * Select sel3=new
	 * Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	 * sel3.selectByIndex(10);
	 * driver.findElement(By.xpath(" //input[@id='postcode']")).sendKeys("48184");
	 * Select sel4=new
	 * Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	 * sel4.selectByVisibleText("United States");
	 * driver.findElement(By.xpath(" //textarea[@id='other']")).
	 * sendKeys("Additional information");
	 * driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(
	 * "4844328377"); driver.findElement(By.xpath("//input[@id='alias']")).sendKeys(
	 * "vallyforgeschool");
	 * driver.findElement(By.xpath("//span[contains(text(),'Register')]")).click();
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
}


