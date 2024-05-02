package com.spicejet.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.BookingPage;
import com.spicejet.objects.PassengerDetailsPage;

public class RoundTripBookingTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC008_roundtripbookingTest";
		testDescription = "Booking a flight for oneway trip by providing passenger and payment details";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC008_roundtripbookingTest() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.roundtripBooking();
		PassengerDetailsPage details = new PassengerDetailsPage();
		details.passengerDetails();
		Assert.assertEquals(details.paymenterrorText(), "Please enter a valid card");
		takeScreenshot("TC008_roundtripbookingTest");
		if (details.paymenterrorText().contains("Please enter a valid card")) {
			test.pass("Flight booking test passed");
		} else
			test.fail("Flight Booking test failed");
	}

}
