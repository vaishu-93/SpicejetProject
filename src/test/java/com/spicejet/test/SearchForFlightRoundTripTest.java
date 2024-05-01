package com.spicejet.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.BookingPage;

public class SearchForFlightRoundTripTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC006_searchFlightforRoundTrip";
		testDescription = "Searching for flight on Spicejet website for round trip";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC006_searchFlightforRoundTripTest() throws InterruptedException, IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.roundtripBooking();
		Assert.assertTrue(bookingpage.roundtripText().contains("Delhi to Bengaluru"));
		takeScreenshot("TC006_searchFlightforRoundTripTest");
		if (bookingpage.roundtripText().contains("Delhi to Bengaluru")) {
			test.pass("Round trip flight search test passed");
		} else
			test.fail("Round trip flight search test failed");

	}

}
