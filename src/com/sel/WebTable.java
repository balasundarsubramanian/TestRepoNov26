package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(5000);
		
		List<WebElement> all = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		for (WebElement eachDatas : all) {
			
			System.out.println(eachDatas.getText());
			
		}
		
		
		
		
		
	}
}
