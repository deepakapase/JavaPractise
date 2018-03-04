package com.exercise;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionTest1 extends Base{

	
	public static void main(String[] args) {
		init("Chrome");
		driver.get("https://www.amazon.com/");
		Actions action=new Actions(driver);
		WebElement move=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement inputText= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		action.moveToElement(move).build().perform();
		action.click(inputText).keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		action.doubleClick(inputText).build().perform();
		
	}
}