package com.cheap.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightSelectLocators extends  FlightSearchLocate {
	public FlightSelectLocators()
	{
	     PageFactory.initElements(driver, this);
	}
@FindBy(xpath = "//div[@class=\"sc-fnGiBr kCVmbb\"]") private WebElement popup;
public WebElement getPopup() {
	return popup;
}
@FindBy(xpath ="//span[@class=\\\"sc-kJHwSc boyEss\\")private WebElement flightname;
public WebElement getFlightname() {
	return flightname;
}
@FindBy(xpath = "//span[@class=\\\"sc-fdCYqt dzCpuK\\\"]")private WebElement flightrates;

public WebElement getFlightrates() {
	return flightrates;
}
@FindBy(xpath = "//*[text()='$257']") private WebElement flightClk;
public WebElement getFlightClk() {
	return flightClk;
}
@FindBy(xpath = "(//*[text()='$257'])[2]") private WebElement flight2Clk;
public WebElement getFlight2Clk() {
	return flight2Clk;
}

}


