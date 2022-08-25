package com.naveenautomation.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomation.Base.TestBase;

public class Utils extends TestBase {

	public static final int PAGE_LOAD_WAIT = 30;

	public static final int IMPLICIT_WAIT = 10;

	public static void takeFailedTestsScreenshots(String testCaseName) {
		// get the current date and time
		String time = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		// save the screenshot in a file
		File screenshotFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

		// save
		try {
			FileUtils.copyFile(screenshotFile, new File("./FailedScreenshot\\" + testCaseName + "_" + time + ".jpeg"));
		} catch (IOException e) {
			System.out.println("Unable to take or save screenshot of failed test" + testCaseName);
		}
	}

	public static String generateRandomEmail() {

		String email = RandomStringUtils.randomNumeric(3);

		String emailID = "GurmeenK" + email + "@gmail.com";

		return emailID;

	}

	public static String generateRandomPassword() {

		String randomStringForPassword = RandomStringUtils.randomNumeric(3);

		String password = "Manager@" + randomStringForPassword;

		return password;

	}
}
