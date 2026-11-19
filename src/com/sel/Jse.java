package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)"); //scrollDown
//		
//		Thread.sleep(3000);
//		
//		js.executeScript("window.scrollBy(0,-1000)");  //scrollUp
		
		WebElement top = driver.findElement(By.xpath("//div[text()='Back to top']"));
		js.executeScript("arguments[0].scrollIntoView();", top);
		
		
	}

}
