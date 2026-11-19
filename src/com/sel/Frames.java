package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	
	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		driver.switchTo().frame(0);
		driver.switchTo().frame("singleframe");
		WebElement frame = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame.sendKeys("java");
	
		driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
	}
}
