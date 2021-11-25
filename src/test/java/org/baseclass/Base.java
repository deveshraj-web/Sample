package org.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
    public static WebDriver driver;  
	
	public static WebDriver launchBrowser(String browsername) {
		switch (browsername) {
		case "chrome":
		    WebDriverManager.chromedriver().setup();
		    driver =new ChromeDriver();
		    break;
		case"firefox":
			WebDriverManager.firefoxdriver().setup();
		    driver =new FirefoxDriver();
		    break;
		case"Edge":
			WebDriverManager.edgedriver().setup();
		    driver =new EdgeDriver();
		    break;
		    
		default:
			System.out.println("invalid browser name");
			break;
		}
		
		
		return driver;
		
		
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	}

