package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkTest {
	WebDriver driver;
	int tot=0;

	@BeforeTest
	public void setUp() {	
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://auth.hollandandbarrett.com");
		driver.manage().window().maximize();

}
	@Test
	public void partialLT() throws Exception {
		driver.get("https://hollandandbarrett.com/");
		driver.findElement(By.xpath("//*[@id=\"onetrust-reject-all-handler\"]")).click();
		driver.findElement(By.linkText("Vitamins & Supplements")).click();
		
		
		
	}
}
