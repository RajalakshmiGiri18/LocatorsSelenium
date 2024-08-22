package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IDTestDemo {
	
	@Test
	public void ExampleID()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		//locators ID,Name and path
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com"); //id
		driver.findElement(By.name("password")).sendKeys("raghuBN@123"); //name
		driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
		driver.quit();
		
	}
	@Test
	public void WebElementsEnabled() throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		Boolean enabled=driver.findElement(By.id("username")).isEnabled();
		System.out.println(enabled);
		Thread.sleep(4000);
		driver.quit();
		
	}
	@Test
	public void WebElementsSelected() throws Exception 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com");
		Boolean selected=driver.findElement(By.id("username")).isSelected();
		System.out.println(selected);
		Thread.sleep(4000);
		driver.quit();
		
	}

}
