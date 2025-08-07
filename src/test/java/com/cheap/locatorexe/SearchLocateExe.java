package com.cheap.locatorexe;

import com.cheap.baseClass.BaseClass;
import com.cheap.locators.FlightSearchLocate;
import com.cheap.locators.purchaseLocate;

public class SearchLocateExe extends purchaseLocate{
	public static void fromplace()
	{
		BaseClass.sendKeys(new FlightSearchLocate().getGetfromplace(),"Chennai, India");
	}
	public static void toplace()
	{
		BaseClass.sendKeys(new FlightSearchLocate().getToPlace(), "Delhi, India");
	}
	public static void pickupDate()
	{
		BaseClass.sendKeys(new FlightSearchLocate().getDepartDate(), "May 26");	
	}
	public static void DropDate()
	{
		BaseClass.sendKeys(new FlightSearchLocate().getReturnDate(), "May 28");	
	}
	public static void travel()
	{
		BaseClass.clk(new FlightSearchLocate().getTravel())	;
	}
	public static void adult()
	{
		BaseClass.clk(new FlightSearchLocate().getAdult())	;
	}
	public static void senior()
	{
		BaseClass.clk(new FlightSearchLocate().getSenior())	;
	}
	public static void child()
	{
		BaseClass.clk(new FlightSearchLocate().getChild())	;
		
	}
	public static void infant()
	{
		BaseClass.clk(new FlightSearchLocate().getInfant())	;
	}
	public static void search()
	{
		BaseClass.clk(new FlightSearchLocate().getSearch())	;
	}
	
}
