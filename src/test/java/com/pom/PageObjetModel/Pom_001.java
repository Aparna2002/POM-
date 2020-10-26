package com.pom.PageObjetModel;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class Pom_001 extends BaseTest {
	
 
  
  @BeforeTest
  public void startProcess() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("automationurl");
  }
  
  @Test(priority=0)
  public void loginTest() {
	  
	 
	SignInPage page=new SignInPage(driver);
	    page.login();
	    Assert.assertEquals(page.errorMessage(), "Authentication failed.");
	  
  }
  @Test(priority=1)
  public void registerUserAccount() throws InterruptedException {
	  UserRegistration userreg=new UserRegistration(driver);
	  userreg.registerAccount();
  }

  @AfterTest
  public void endProcess() {
	  
	  driver.quit();
  }

}
