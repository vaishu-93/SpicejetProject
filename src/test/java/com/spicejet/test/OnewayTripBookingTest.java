package com.spicejet.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.PassengerDetailsPage;
import com.spicejet.objects.BookingPage;

public class OnewayTripBookingTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC007_onewaytripbookingTest";
		testDescription = "Booking a flight for oneway trip by providing passenger and payment details";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC007_onewaytripbookingTest() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.oneWayTripBooking();
		PassengerDetailsPage details = new PassengerDetailsPage();
		details.bookFlight();
		Assert.assertEquals(details.paymenterrorText(), "Please enter a valid card");
		takeScreenshot("TC007_onewaytripbookingTest");
		if (details.paymenterrorText().contains("Please enter a valid card")) {
			test.pass("Flight booking test passed");
		} else
			test.fail("Flight Booking test failed");
	}
}
