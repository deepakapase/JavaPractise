package com.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locations {

	public static WebDriver driver;
	
	
	public static void getDriver(){
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void getBrowser(){
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.navigate().refresh();		
	}
	
	public static void getallLocations(){
		WebElement search =driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("7 eleven locations");
		search.submit();
		//driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver; 
        js.executeScript("window.scrollBy(0,100)");
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div[2]/div/div[4]/div[2]/div/div/a")).click();
		List<WebElement> allLocations = new ArrayList<WebElement>();
		allLocations = driver.findElements(By.xpath("//div[@class='cXedhc']"));
		System.out.println("Locations list size "+allLocations.size());
		WebElement closePopup = driver.findElement(By.xpath("//div[@class='QU77pf']"));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		for(int i =0 ;i<allLocations.size();i++){
			allLocations.get(i).click();
			//System.out.println(driver.findElement("//*[@id='akp_uid_0']/div/div/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div/div[3]/div/div/span[2]")).getText());
			System.out.println(driver.findElement(By.xpath("//a[@class='LJOFid ab_button']")).getText()+" "+i);
			wait.until(ExpectedConditions.elementToBeClickable(closePopup));
			//wait.ignoring(ElementNo)
			closePopup.click();
	        js.executeScript("window.scrollBy(0,100)");

		}
		
	}
	public static void main(String[] args) {
			getDriver();
			getBrowser();
			getallLocations();
	}
}
