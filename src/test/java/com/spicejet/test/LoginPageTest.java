package com.spicejet.test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spicejet.base.SpicejetBase;
import com.spicejet.objects.LoginPage;

public class LoginPageTest extends SpicejetBase {

	@BeforeTest
	public void testDetails() {
		testName = "TC001_LoginTest";
		testDescription = "Login to Spicejet website with valid credentials";
		testAuthor = "Vaishali";
	}

	@Test
	public void TC001_LoginTest() throws Exception {
		LoginPage login = new LoginPage();
		login.login();
		Assert.assertEquals(login.loginText(), "Hi Vaishali");
		
		if (login.loginText().contains(testAuthor)) {
			test.pass("Login test passed");
		} else
			test.fail("Login test failed");
		takeScreenshot("TC001_LoginTest");
	}

}
