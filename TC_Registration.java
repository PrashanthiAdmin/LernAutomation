package com.fpix.tests.Lern;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.fpix.BusinessFunctions.Lern.BusinessFunctions;
import com.fpix.base.Lern.TestBase;
import com.fpix.objectrepository.lernwise.LearnPath;
import com.fpix.utilities.Lern.ExcelReader;
import com.fpix.utilities.Lern.TestUtilities;

import junit.framework.Assert;

public class TC_Registration extends BusinessFunctions {

	
/* @Test(dataProviderClass = TestUtilities.class, dataProvider = "newdata")
	 public void testData(String register,String phone, String FirstName, String LastName, String Password,
	 String Email) {
	 
	  
	  System.out.println(register+phone + FirstName + " - " + LastName + " - " + Password +
	  Email); }*/
	 
/*
	@Test(dataProviderClass = TestUtilities.class, dataProvider = "newdata")
	public void registration(String register, String phNo,String FirstName, String LastName, String Password, String Email) throws Throwable {

		if (!(TestUtilities.isTestRunnable("registration", excel))) {

			throw new SkipException("Skipping the test " + "registration".toUpperCase() + "as the Run mode is NO");
		}
		// HashMap<String,String> data = new HashMap<String,String>();
		registerOrLogin(register,phNo,  FirstName, LastName, Password, Email);
		Assert.assertTrue(isElementPresent(LearnPath.txtDashboard, "dashboard"));
		//assert.assertTrue(condition);

	}*/
	

	@Test
	public void test2(){
		System.out.println("test2");
		Assert.assertTrue("Welcome".equals("Welcome"));
	}
	
	
	
	@Parameters("browser")
	@Test
	public void test1(String browser){
		
		if(browser.equals("firefox")){
			 System.out.println("Open Firefox Driver");
		 }else if(browser.equals("chrome")){
		 System.out.println("Open Chrome Driver");
		 }
	/*	System.out.println("test");
		SoftAssert dr = new SoftAssert();
		dr.assertTrue("Welcome".equals("welcomeeee"));
		System.out.println("After test");
		dr.assertAll();*/
	}
	}

