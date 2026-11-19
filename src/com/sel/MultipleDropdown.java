package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select s = new Select(cars);
		Thread.sleep(5000);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		s.deselectByIndex(1);
		
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
		
			System.out.println(webElement.getText());
		}
		
		
		
		
	}
}
