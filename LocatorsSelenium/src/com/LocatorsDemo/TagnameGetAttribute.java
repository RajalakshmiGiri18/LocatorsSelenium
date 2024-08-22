package com.LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnameGetAttribute {
	public void tagname() {	
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://auth.hollandandbarrett.com/u/login");
		driver.manage().window().maximize();
		String tag=driver.findElement(By.tagName("img")).getAttribute("src");
		System.out.println(tag);
		driver.quit();

}
}
