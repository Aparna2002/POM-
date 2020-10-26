package com.pom.PageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SignInPage {
	
	
	
	@FindBy(xpath="//a[@class='login']")
	public  WebElement signin;
	@FindBy(xpath="//input[@id='email']")
	public WebElement userEmail;
	@FindBy(id="passwd")
	public WebElement userPassword;
	@FindBy(xpath="//p[@class='submit']//span[1]")
	public WebElement submitlogin;
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	public WebElement geterrorMessage;
	
	public SignInPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void login() {
		
		signin.click();
		userEmail.sendKeys("galazy007@gamil.com");
		userPassword.sendKeys("galaxy007");
		submitlogin.click();
	}
	public  String errorMessage() {
		
		return geterrorMessage.getText();
		
	}

	/*
	 * public static void main(String[] args) { WebDriver driver;
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe"
	 * );
	 * 
	 * driver=new ChromeDriver();
	 * driver.get("http://automationpractice.com/index.php");
	 * driver.manage().window().maximize();
	 * 
	 * driver.findElement(By.xpath("//a[@class='login']")).click();
	 * 
	 * 
	 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
	 * "galazy007@gamil.com");;
	 * 
	 * driver.findElement(By.id("passwd")).sendKeys("galaxy007");
	 * driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
	 * 
	 * String actualerror =
	 * driver.findElement(By.xpath("//li[contains(text(),'Authentication failed.')]"
	 * )).getText(); String expectederror="Authentication failed.";
	 * Assert.assertEquals(expectederror, actualerror);
	 * 
	 * }
	 */

}
