package com.pom.PageObjetModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatAccount {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver;
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\GOPALAKRISHNA\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe"
				  );
				  
				  driver=new ChromeDriver();
		
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
		driver.manage().window().maximize();
		  driver.findElement(By.xpath("//a[@class='login']")).click();
		  driver.findElement(By.id("email_create")).sendKeys("galazy007@gamil.com");;
		  driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		
		/*
		 * WebElement radio1=driver.findElement(By.xpath("//input[@id='id_gender2']"));
		 * radio1.click(); Thread.sleep(3000);
		 */
		 
		  driver.findElement(By.id("customer_firstname")).sendKeys("Appu");
		  Thread.sleep(4000);


	}

}
