package com.exercise;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert {

	public static WebDriver driver;
	public static WebElement homeButton;
	
	public static void openBrowser(){
		driver.get("http://www.qaclickacademy.com/");
	}
	
	public static void handleAlert(){
		
		try{
		System.out.println(driver.switchTo().alert().getText());
		}catch(NoSuchElementException exc){
			exc.printStackTrace();
		}
		
		driver.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.pollingEvery(10, TimeUnit.MICROSECONDS);
		wait.until(ExpectedConditions.elementToBeClickable(homeButton));
		wait.ignoring(NoSuchElementException.class);
		
	}
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		openBrowser();
		handleAlert();
		
	}
}
