package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		
		for (WebElement webElement : findElements) {
		
			String text = webElement.getText();
			System.out.println(text);
		}
		
		
		
	}

}
