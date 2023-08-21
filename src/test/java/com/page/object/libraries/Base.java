package com.page.object.libraries;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public WebDriver driver;
	String URL = "http://lls.org/";
	
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException {  
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get(URL);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String webSiteTitle = driver.getTitle();
	    System.out.println("WebSite title : " + webSiteTitle);
	   
		
		
	}

	@AfterMethod
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
}
