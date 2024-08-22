package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class TagNameLocator {
	public void tagname() {	
	System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://auth.hollandandbarrett.com/u/login");
	driver.manage().window().maximize();
	String tag=driver.findElement(By.id("username")).getTagName();
	System.out.println(tag);
	driver.quit();
	
	}
	
	
	

}
