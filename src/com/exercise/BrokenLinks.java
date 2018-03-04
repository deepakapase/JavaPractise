package com.exercise;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver = getDriver();
		driver.get("http://store.demoqa.com/");
		List<String> strurls = new ArrayList<>();
		strurls = getAllLinks(driver);
		for (String str : strurls) {
			boolean response = isLinkBroken(str);
			System.out.println("Response : " + response);
		}
	}

	public static WebDriver getDriver() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public static List<String> getAllLinks(WebDriver driver) {
		List<WebElement> links = new ArrayList<WebElement>();
		links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		List<String> paths = new ArrayList<>();
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
			String strurl = link.getAttribute("href");
			paths.add(strurl);
		}
		return paths;
	}

	public static boolean isLinkBroken(String strurl) throws Exception

	{
		if (strurl == null) {
			return true;
		}

		try

		{
			URL url = new URL(strurl);

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();

			connection.connect();

			String response = connection.getResponseMessage();

			connection.disconnect();
			return !response.equals("OK");

		}

		catch (Exception exp)

		{

			return false;

		}

	}
}
