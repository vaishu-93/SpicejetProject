package com.spicejet.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spicejet.base.SpicejetBase;

public class PassengerDetailsPage extends SpicejetBase {

	@FindBy(xpath = "//div[@data-testid='continue-search-page-cta']")
	private WebElement continueBtn;

	@FindBy(xpath = "//div[@data-testid='title-contact-detail-card']")
	private WebElement title;

	@FindBy(xpath = "//div[contains(text(),'Miss')]")
	private WebElement titleSelect;

	@FindBy(xpath = "//input[@data-testid='first-inputbox-contact-details']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@data-testid='last-inputbox-contact-details']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@data-testid='contact-number-input-box']")
	private WebElement phone;

	@FindBy(xpath = "//input[@data-testid='emailAddress-inputbox-contact-details']")
	private WebElement email;

	@FindBy(xpath = "//input[@data-testid='city-inputbox-contact-details']")
	private WebElement city;

	@FindBy(xpath = "//div[contains(text(),'I am flying as the primary passenger')]")
	private WebElement primarycustomerCheckbox;

	@FindBy(xpath = "//div[@data-testid='traveller-info-continue-cta']")
	private WebElement continueBooking;

	@FindBy(xpath = "//input[@id='card_number']")
	private WebElement cardNumber;

	@FindBy(xpath = "//input[@id='name_on_card']")
	private WebElement nameoncard;

	@FindBy(xpath = "//input[@id='card_exp_month']")
	private WebElement expMonth;

	@FindBy(xpath = "//input[@id='card_exp_year']")
	private WebElement expYear;

	@FindBy(xpath = "//input[@id='security_code']")
	private WebElement cvv;

	@FindBy(xpath = "//*[@id='main-container']/div/div[5]/div/div/div[2]/div/div/div[4]")
	private WebElement continuetopayment;

	@FindBy(xpath = "//input[@data-testid='common-proceed-to-pay']")
	private WebElement proceedtopay;

	@FindBy(xpath = "//div[@id='payment_form_card_number_error']")
	private WebElement paymenterror;

	@FindBy(id = "at_addon_close_icon")
	private WebElement closebutton;

	public PassengerDetailsPage() {
		PageFactory.initElements(driver, this);
	}

	public void bookFlight() throws InterruptedException {
		wait(continueBtn);
		continueBtn.click();
		wait(title);
		title.click();
		titleSelect.click();
		firstName.sendKeys("Vinu");
		lastname.sendKeys("raj");
		phone.sendKeys("9008765432");
		email.sendKeys("vinuraj@gmail.com");
		city.sendKeys("Bangalore");
		primarycustomerCheckbox.click();
		scroll();
		continueBooking.click();

		// ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1800)");
		wait(continuetopayment);
		// scroll();
		scrollToElement(continuetopayment);
		// closebutton.click();
		continuetopayment.click();
		/*
		 * Actions action = new Actions(driver);
		 * action.moveToElement(continuetopayment).click().perform();
		 */

		// Thread.sleep(2000);

		cardNumber.sendKeys("4000 9876 3214 5622");
		nameoncard.sendKeys("vinu");
		expMonth.sendKeys("02");
		expYear.sendKeys("27");
		cvv.sendKeys("346");
		proceedtopay.click();
		implicitWait();

	}

	public String paymenterrorText() {
		return paymenterror.getText();
	}
}
