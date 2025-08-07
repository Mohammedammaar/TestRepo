package com.cheap.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cheap.baseClass.BaseClass;

public class FlightSearchLocate extends BaseClass{
public FlightSearchLocate() 
{
	PageFactory.initElements(driver, this);
}
@FindBy(id ="from1") private WebElement getfromplace;
public WebElement getGetfromplace() {
	return getfromplace;
}
@FindBy(id="to1") private WebElement gettoplace;
public WebElement getToPlace()
{
	return gettoplace;
}
@FindBy(id="departs") private WebElement departdate;
public WebElement getDepartDate()
{
	return departdate;
}

@FindBy(id="returns") private WebElement returndate;
public WebElement getReturnDate()
{
	return returndate;
}
@FindBy(id="options") private WebElement travel;
public WebElement getTravel()
{
	return travel;
}
@FindBy(xpath = "(//button[@type=\"button\"])[2]") private WebElement adult;
public WebElement getAdult() {
	return adult;
}
@FindBy(xpath = "(//button[@type=\"button\"])[4]") private WebElement senior;
public WebElement getSenior() {
	return senior;
}
@FindBy(xpath = "(//button[@type=\"button\"])[6]") private WebElement child;
public WebElement getChild() {
	return child;
}
@FindBy(xpath = "(//button[@type=\"button\"])[8]") private WebElement infant;
public WebElement getInfant() {
	return infant;
}
@FindBy(xpath="//button[text()='Search Flights']") private WebElement search;
public WebElement getSearch()
{
	return search;
}

}
