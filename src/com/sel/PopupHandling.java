package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	
	
		WebElement simple = driver.findElement(By.id("alertButton"));
		simple.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
//		driver.switchTo().alert().sendKeys(string val);
//		driver.switchTo().alert().accept();
		
		
		
	
	}
	
	
}
