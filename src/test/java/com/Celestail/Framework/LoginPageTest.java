package com.Celestail.Framework;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Celestail.BaseScript.BaseClass;
import com.Celestail.PageClass.LoginPage;
import com.Celestail.PropertyFile.PropertyFile;

public class LoginPageTest extends BaseClass {

	LoginPage loginpage;
	PropertyFile pro;
	@Test
	public void verifyUserCredentials() {
		loginpage=new LoginPage();
		pro=new PropertyFile();
		loginpage.clickOnLoginLink();
		loginpage.VerifyCredentials(pro.getProperties("username"),pro.getProperties("password"));
		loginpage.clickOnSubmitBtn();

     boolean adminname = loginpage.verifyadminInHomePage();
     Assert.assertTrue(adminname);
     System.out.println("user is successfully landed on homepage");
    





	}












}
