package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
//		driver.switchTo().frame(0);
		driver.switchTo().frame("singleframe");
		
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    
		WebDriverWait wait = new WebDriverWait (driver,10);

		wait.until(ExpectedConditions.visibilityOf(text));
		
		text.sendKeys("java");
		
		Wait wait1 = new FluentWait(driver)

			    .withTimeout(30, TimeUnit.SECONDS)

			    .pollingEvery(5, TimeUnit.SECONDS)

			    .ignoring(Exception.class);
	
		
		
	}

}
