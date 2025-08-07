package com.cheap.baseClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
public static WebDriver driver;
public static Select s;
public static JavascriptExecutor js;
public static WebElement ele;

public static void launchBrowser(String drivername,String path) {
	System.setProperty(drivername, path);
	driver = new ChromeDriver();
}
public static void browser() 
{
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
}
public static void url(String url) {
	driver.get(url);
}
public static  void windowsMax() {
	driver.manage().window().maximize();
}
public static void byID(String id) {
	ele=driver.findElement(By.id(id));
}
public static void byXpath(String xpath) {
	ele=driver.findElement(By.xpath(xpath));
}
public static List<WebElement> byXpaths(String value) {
	List<WebElement> ele=driver.findElements(By.xpath(value));
	return ele;
}
public static void byTag(String tag) {
	ele=driver.findElement(By.id(tag));
}
public static WebElement sendKeys(WebElement ele,String keys) {
	ele.sendKeys(keys);
	return ele;
}

public static WebElement clk(WebElement ele) {
	ele.click();
	return ele;
}
public static void selectText(WebElement ele, String data) {
	Select s =new Select(ele);
	s.selectByVisibleText(data);
}
public static void selectindex(WebElement ele, int i) {
	Select s =new Select(ele);
	s.selectByIndex(i);
}
public static void byclass(By by) {
	ele= driver.findElement(by);
	}
public static void scroll(String scrol) {
	js=(JavascriptExecutor) driver;
	js.executeScript(scrol,ele);
	
	
}
public static String readProp(String Key) {
	String value=null;
	try {
		
		FileReader fil=new FileReader("C:\\Users\\HP\\eclipse-workspace\\Sel\\files\\data.properities");
		Properties prop=new Properties();
			prop.load(fil);
			value=prop.getProperty(Key);
					} catch (FileNotFoundException e) {
						
						e.printStackTrace();}
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return value;
	}
	
public static String readValueForExcel(int r,int c,String sh) {
	String value=null;
	try {

		String path = "C:\\Users\\HP\\eclipse-workspace\\MavenCheapAir\\src\\test\\resources\\test data\\Book2.xlsx";
		File f = new File(path);
		
		FileInputStream fls = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fls);
		Sheet sht =wb.getSheet(sh);
		Row rr = sht.getRow(r);
		Cell cc = rr.getCell(c);
		int cellType=cc.getCellType();
		if(cellType==1) {
			value=cc.getStringCellValue();
			}
		else {
			double num=cc.getNumericCellValue();
			long a=(long) num;
			value=String.valueOf(a);
		}
	}
		
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	return value;


	
}
public static void excelWriteValue(String sh,int r,int c,String val) {
	try {
		String path="C:\\Users\\HP\\eclipse-workspace\\MavenCheapAir\\src\\test\\resources\\test data\\Book2.xlsx";
	    File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sht =wb.createSheet(sh);
		Row rr = sht.createRow(r);
		Cell cc = rr.createCell(c);
		cc.setCellValue(val);
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
				
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	
public static void waitIMP(long a) {
	driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
}
public static String getAttribute(String id) {
	WebElement textData = driver.findElement(By.id(id));
	return textData.getAttribute("value");

}
public static String tittle() {
	String s=driver.getTitle();
	return s;
	}
public static void windowTab() {
	for(String secondtab:driver.getWindowHandles()) {
    	driver.switchTo().window(secondtab);
    }
}

}

