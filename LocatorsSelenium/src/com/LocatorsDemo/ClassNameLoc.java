package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameLoc {
	@Test
	public void CkDis() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/basket");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		boolean displayed=driver.findElement(By.className("ProductCard-module_productImage__7VPgE")).isDisplayed();
		System.out.println(displayed);
		driver.quit();
	}

}
