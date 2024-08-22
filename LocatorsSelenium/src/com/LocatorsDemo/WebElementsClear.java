package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators ID,Name and path
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).clear();
		Thread.sleep(1000);
		driver.quit();

	}

}
