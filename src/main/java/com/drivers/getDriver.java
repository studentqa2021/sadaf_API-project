package com.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getDriver {
	static WebDriver driver;
	public static WebDriver getdriver(String browserName) {
		if(browserName.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(browserName.contains("safari")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}else if(browserName.contains("edge")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		return driver;
	}
}

