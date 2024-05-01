package com.spicejet.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.BookingPage;

public class SearchforFlightOneWayTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC005_searchFlightforOneWayTrip";
		testDescription = "Searching for flight on Spicejet website for one way trip";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC005_searchFlightforOneWayTrip() throws IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.oneWayTripBooking();
		Assert.assertTrue(bookingpage.onewaytripText().contains("Delhi to Bengaluru"));
		takeScreenshot("TC005_searchFlightforOneWayTrip");
		if (bookingpage.onewaytripText().contains("Delhi to Bengaluru")) {
			test.pass("Oneway Flight search test passed");
		} else
			test.fail("Oneway Flight search test failed");
	}

}
