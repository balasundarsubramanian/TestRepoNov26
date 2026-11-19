package com.sel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		WebElement car = driver.findElement(By.id("cars"));
		Select s = new Select(car);
		s.selectByIndex(0);
		s.selectByValue("saab");
		s.selectByVisibleText("Audi");
		
		Thread.sleep(2000);
		s.deselectByIndex(0);
		
		List<WebElement> options = s.getOptions();
		
		for (WebElement web : options) {
			System.out.println(web.getText());
			
			
		}
		
	
		
		
	
		
	}
	
	

}
