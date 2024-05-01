package com.spicejet.test;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.BookingPage;

public class BookingPageNavigationTabsTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC010_checkNavigationTabs";
		testDescription = "Checking the tand on the booking page";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC010_checkNavigationTabs() throws IOException {
		BookingPage bookingpage = new BookingPage();
		bookingpage.checkNavigationTabs();
		takeScreenshot("TC010_checkNavigationTabs");
		if (bookingpage.managebookingtext().contains("Manage Booking")) {
			test.pass("Navigation tabs test passed");
		} else
			test.fail("Navigation tabs test failed");
	}

}
