package com.spicejet.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.base.SpicejetBase;

public class SignUpPage extends SpicejetBase {

	@FindBy(xpath = "//div[contains(text(),'Signup')]")
	private WebElement signUpLink;

	@FindBy(xpath = "(//select[contains(@class,'form-control form-select')])[1]")
	private WebElement title;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(css = "select[class='form-control form-select']")
	private WebElement country;

	@FindBy(xpath = "//img[@alt='date']")
	private WebElement calender;

	@FindBy(xpath = "(//select[@class='react-datepicker__month-select'])[1]")
	private WebElement month;

	@FindBy(xpath = "(//select[@class='react-datepicker__year-select'])[1]")
	private WebElement year;

	@FindBy(xpath = "(//div[@aria-label='Choose Monday, March 12th, 1990'])[1]")
	private WebElement date;

	@FindBy(css = "input[type='tel']")
	private WebElement phone;

	@FindBy(xpath = "//input[@id='email_id']")
	private WebElement email;

	@FindBy(id = "new-password")
	private WebElement password;

	@FindBy(id = "c-password")
	private WebElement confirmpassword;

	@FindBy(xpath = "//input[@class='defaultCheck1']")
	private WebElement checkbox;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement submitBtn;

	@FindBy(xpath = "//label[contains(text(),'OTP Verification')]")
	private WebElement signInText;

	@FindBy(xpath = "(//div[@class='font-13 mt-10 inlineErrors'])[1]")
	private WebElement errorText;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String signInText() {
		return signInText.getText();

	}

	public String errorText() {
		return errorText.getText();

	}

	public void signUp() throws InterruptedException {

		signUpLink.click();
		switchtochildwindow();
		wait(title);
		selectFromDropdown(title, "Miss");
		firstName.sendKeys("Vinu");
		lastName.sendKeys("Raj");
		// selectFromDropdown(country,"India");
		// scrollToElement(calender);
		scroll();
		Thread.sleep(2000);
		calender.click();
		selectFromDropdown(month, "March");
		selectFromDropdown(year, "1990");
		date.click();
		phone.sendKeys("9008905433");
		Thread.sleep(3000);
		email.click();
		email.sendKeys("bluebirds02@gmail.com");
		Thread.sleep(2000);
		wait(password);
		password.sendKeys("Rules@12345");
		confirmpassword.sendKeys("Rules@12345");
		email.click();
		email.sendKeys("bluebirds02@gmail.com");
		checkbox.click();
		submitBtn.click();
		Thread.sleep(2000);
	}

	public void SignUpInvalid() {

		signUpLink.click();
		switchtochildwindow();
		wait(title);
		selectFromDropdown(title, "Miss");
		firstName.sendKeys("Asha");
		lastName.sendKeys("Prem");
		phone.sendKeys("9000212233");
		email.sendKeys("ashaprem09@gmail.com");
		wait(submitBtn);
		submitBtn.click();
	}
}
