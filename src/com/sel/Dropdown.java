package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	
	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByIndex(2);
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select s1 = new Select(month);
		s1.selectByValue("3");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2020");
		
		
		
	}
}
