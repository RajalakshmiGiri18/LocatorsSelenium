package com.LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SameClsMultipleElements {
	@Test
	public void clsdemo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/basket");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List <WebElement> elements = driver.findElements(By.className("ProductCard-module_productImage__7VPgE"));
		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		driver.quit();
	}

}
