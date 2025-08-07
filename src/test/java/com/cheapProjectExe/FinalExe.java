package com.cheapProjectExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cheap.locatorexe.purchaseLocateEx;

public class FinalExe extends purchaseLocateEx {

	public static void main(String[] args) throws InterruptedException {
		browser();
		url(readProp("url"));
		waitIMP(60);
		windowsMax();
//		fromplace();
		toplace();
		pickupDate();
		DropDate();
		travel();
		adult();
		senior();
		child();
		infant();
		search();
		windowTab();
		waitIMP(90);
		popup();
	    flightNameAndFlightTickets();
	   	flightclk();
		driver.navigate().refresh();
		waitIMP(60);
	    flight2clk();
		windowTab();		
		cont();
		windowTab();
		waitIMP(60);
		first();
		middle();
		last();
		suffix();
		gender();
		dob();
		dobday();
		dobyear();
		first2();
		middle2();
		last2();
		suffix2();
		gender2();
		dob2();
		dobday2();
		dobyear2();
		first3();
		middle3();
		last3();
		suffix3();
		gender3();
		dob3();
		dobday3();
		dobyear3();
		first4();
		middle4();
		last4();
		suffix4();
		gender4();
		dob4();
		dobday4();
		dobyear4();
		first5();
		middle5();
		last5();
		suffix5();
		gender5();
		dob5();
		dobday5();
		dobyear5();
		cardno();
		month();
		year();
		ccvno();
		cardHolder();
		county();
		address1();
		address2();
		waitIMP(90);
    	city();
//		state();
//		zip();
		payment();
		email();
		password();
		confirmpassword();
		ele=driver.findElement(By.xpath("//span[@class=\"prc\"]"));
		excelWriteValue("Cheaps", 0, 0,ele.getText());
		driver.quit();
		
	}
}
