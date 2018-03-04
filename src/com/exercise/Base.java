package com.exercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver;

public static void init(String browserName){
	if(browserName.equalsIgnoreCase("Firefox")){
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		 driver=new FirefoxDriver();
	
	} else if(browserName.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		 driver=new ChromeDriver();
	
	}
}
}
