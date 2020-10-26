package com.pom.PageObjetModel;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.testng.annotations.AfterTest;

public class Pom_002 extends BaseTest
{
 
  
  @BeforeTest
  public void startProcess() throws IOException {
	  init();
	  launch("chromebrowser");
	  navigateurl("automationurl");
  }
  
 

  @AfterTest
  public void endProcess() {
	  
  }

}
