package com.cheap.locatorexe;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cheap.baseClass.BaseClass;
import com.cheap.locators.FlightSelectLocators;

public class SelectLocExe extends SearchLocateExe{
	public static void popup()
	{
		BaseClass.clk( new FlightSelectLocators().getPopup());
	}
	public static void flightNameAndFlightTickets() throws InterruptedException {
		List<WebElement> keys = driver.findElements(By.xpath("//span[@class=\"sc-kJHwSc boyEss\"]"));
		String flightna= keys.get(0).getText();
		System.out.println(flightna);
//		int keysize =keys.size();
		List<WebElement> value = driver.findElements(By.xpath("//span[@class=\"sc-fdCYqt dzCpuK\"]"));
		String flightri= value.get(0).getText();
	}
//        Map<String, String> map = new LinkedHashMap ();
//         for(int i=1;i<=keys.size();i++)
//        {
//        	map.put(keys.get(i).getText(),value.get(i).getText());
//        }
//       Set<Entry<String, String>> setEntry=map.entrySet();
//       for(Entry<String, String> m:setEntry) {
//    	  System.out.println("flight name is : " +m.getKey()+" = "+m.getValue());
//       }
//	}
	public static void flightclk()
	{
		BaseClass.clk( new FlightSelectLocators().getFlightClk());
	}
	public static void flight2clk()
	{
		BaseClass.clk( new FlightSelectLocators().getFlight2Clk());
	}
	}

