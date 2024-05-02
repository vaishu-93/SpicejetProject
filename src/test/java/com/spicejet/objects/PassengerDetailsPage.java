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

	@FindBy(xpath = "//div[contains(.,'Continue')]")
	private WebElement continuetopayment;

	@FindBy(xpath = "//input[@data-testid='common-proceed-to-pay']")
	private WebElement proceedtopay;

	@FindBy(xpath = "//div[@id='payment_form_card_number_error']")
	private WebElement paymenterror;

	@FindBy(id = "at_addon_close_icon")
	private WebElement closebutton;

	@FindBy(xpath = "//div[@id='pax-item-MSFBRFQ-']")
	private WebElement passenger2;

	@FindBy(xpath = "//input[@data-testid='traveller-1-first-traveller-info-input-box']")
	private WebElement NamePassenger2;
	
	@FindBy(xpath = "//input[@data-testid='traveller-1-last-traveller-info-input-box']")
	private WebElement lastNamePassenger2;
	
	@FindBy(xpath = "//input[@data-testid='sc-member-mobile-number-input-box']")
	private WebElement phonePassenger2;
	
	@FindBy(xpath = "//div[@id='pax-item-MiFDSEQ-']")
	private WebElement Passenger3;
	
	@FindBy(xpath = "//div[@data-testid='traveller-2-title-field']")
	private WebElement Passenger3Title;
	
	@FindBy(xpath = "(//div[contains(text(),'Miss')])[3]")
	private WebElement Passenger3TitleSelect;

	@FindBy(xpath = "//input[@data-testid='traveller-2-first-traveller-info-input-box']")
	private WebElement Passenger3Name;
	
	@FindBy(xpath = "//input[@data-testid='traveller-2-last-traveller-info-input-box']")
	private WebElement Passenger3LastName;
	
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
		wait(continuetopayment);
		scroll();
		scrolltoLast();
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


	public void passengerDetails() throws InterruptedException {
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
		passenger2.click();
		NamePassenger2.sendKeys("Dheena");
		lastNamePassenger2.sendKeys("Kumar");
		phonePassenger2.sendKeys("9876555442");
		scroll();
		Passenger3.click();
		Passenger3Title.click();
		Passenger3TitleSelect.click();
		Passenger3Name.sendKeys("Liya");
		Passenger3LastName.sendKeys("Dheena");
		scroll();
		continueBooking.click();
		wait(continuetopayment);
		//scroll();
		scrolltoLast();
		//scrollToElement(continuetopayment);
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
