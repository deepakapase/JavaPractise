package com.exercise;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebTable {

	public static  WebDriver driver;
	public static WebElement name;

	
	public static WebDriver getDriver(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver(capabilities);
		return driver;
	}
	
	public static void getWebPage(){
	//	driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19158/rsa-vs-ind-2nd-test-india-tour-of-south-africa-2017-18");
		driver.get("https://www.amazon.com/");
		System.out.println("Title"+driver.getTitle());
	}
	
	public static void getTableData(){
		WebElement table=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		List<WebElement> rows=table.findElements(By.xpath("//*[@id='innings_1']/div[1]/div"));
		System.out.println("NUmber of rows in table "+rows.size());
		List<WebElement> cols=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3)"));
		System.out.println("NUmber of cols in table "+cols.size());
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("")));
		action.contextClick().build().perform();
		
	}
	
	public static void rightClickInput(){
		Actions builder =new Actions(driver);
		//builder.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")));
		builder.contextClick(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();
	}
	
	public static void getAllFrames(){
		List<WebElement>  noFrames = new ArrayList<WebElement>(); 
		noFrames = driver.findElements(By.tagName("iframe"));
		System.out.println(noFrames.size());
		driver.switchTo().frame(2);
	}
	public static void main(String[] args) {
		getDriver();
		getWebPage();
		//rightClickInput();
		getAllFrames();
	}
}
