package com.example.dayone.taskfiveone;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test(groups="smoke test")
  public void TC_001() {
	  System.out.println("Smoke tests :01");
  }
  @Test(groups="Regression test")
  public void TC_002() {
	  System.out.println("Regression tests:Test case -02");
  }
  @Test(groups="Regression test")
  public void TC_003() {
	  System.out.println("Regression tests"+"Test case:03");
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
