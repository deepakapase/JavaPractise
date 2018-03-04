package com.exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static  WebDriver driver;

	
	public static WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
	}
	
	public static void getWebPage(){
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/19158/rsa-vs-ind-2nd-test-india-tour-of-south-africa-2017-18");
		System.out.println("Title"+driver.getTitle());
	}
	
	public static void getTableData(){
		WebElement table=driver.findElement(By.xpath("//*[@id='innings_1']/div[1]"));
		List<WebElement> rows=table.findElements(By.xpath("//*[@id='innings_1']/div[1]/div"));
		System.out.println("NUmber of rows in table "+rows.size());
		List<WebElement> cols=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']  div:nth-child(3)"));
		System.out.println("NUmber of cols in table "+cols.size());
		

	}
	public static void main(String[] args) {
		getDriver();
		getWebPage();
		getTableData();
	}
}
