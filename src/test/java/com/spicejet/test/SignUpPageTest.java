package com.spicejet.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.SignUpPage;

public class SignUpPageTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC003_SignUpPageTest";
		testDescription = "Creating an account to SignUp to Spicejet website";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC003_SignUpPageTest() throws InterruptedException, IOException {
		SignUpPage signup = new SignUpPage();
		signup.signUp();
		Assert.assertEquals(signup.signInText(), "OTP Verification");
		takeScreenshot("TC003_SignUpPageTest");
		if (signup.signInText().contains("OTP Verification")) {
			test.pass("SignUp test passed");
		} else
			test.fail("SignUp test failed");

	}

}