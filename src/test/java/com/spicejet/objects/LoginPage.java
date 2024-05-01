package com.spicejet.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.base.SpicejetBase;

public class LoginPage extends SpicejetBase{

	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	private WebElement loginBtn;
	
	@FindBy(xpath="(//div[contains(text(),'Email')])[1]")
	private WebElement emailCheckbox;
	
	@FindBy(xpath="//div[contains(text(),'Hi Vaishali')]")
	private WebElement loginText;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	private WebElement loginLink;
	
	@FindBy(xpath="//div[contains(text(),'Please enter a valid email address')]")
	private WebElement loginErrortext;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String loginText() {
		return loginText.getText();
		
	}
	
	public String loginErrortext() {
		return loginErrortext.getText();
		
	}
	
	public void login() throws Exception {
		wait(loginLink);	
		loginLink.click();
		emailCheckbox.click();
		email.sendKeys(readProperty("email"));
		password.sendKeys(readProperty("password"));
		loginBtn.click();
	}
	
	public void loginInvalid() throws Exception {
		wait(loginLink);	
		loginLink.click();
		emailCheckbox.click();
		email.sendKeys("abcd");
		password.sendKeys(readProperty("password"));
		loginBtn.click();
	}
}
