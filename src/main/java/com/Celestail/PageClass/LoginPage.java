package com.Celestail.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Celestail.BaseScript.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement login_link;
	@FindBy(id="exampleInputEmail1")
	private WebElement username;
	@FindBy(id="exampleInputPassword1")
	private WebElement password;
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit_Btn;
	@FindBy(xpath="//a[text()='Mahantesh Kumbar (Admin)']")
	private WebElement adminName;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginLink() {
		login_link.click();
	}
	
	public void VerifyCredentials(String user,String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		}
	
	public void clickOnSubmitBtn() {
		submit_Btn.click();
	}
	
	public boolean verifyadminInHomePage() {
		return adminName.isDisplayed();
	}
	
	
	

}
