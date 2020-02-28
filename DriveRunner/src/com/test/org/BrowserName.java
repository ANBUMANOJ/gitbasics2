package com.test.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserName {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ammu\\eclipse-workspace\\DriveRunner\\Drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.visitvictoria.com/playmelbourne/");
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.getBrowserName();
		System.out.println(d);
	}

}
