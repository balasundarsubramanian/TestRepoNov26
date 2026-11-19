package com.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		//property setting
//		 System -- class
//		setProperty -- method
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
//		WebElement user = driver.findElement(By.id("email"));
		
		WebElement user = driver.findElement(By.xpath("//input[@type='text']"));
		user.sendKeys("abc@gmail.com");
		
//		WebElement pword = driver.findElement(By.id("pass"));
		WebElement pword = driver.findElement(By.xpath("//input[@name='pass']"));
		pword.sendKeys("vjvjvgafdf");
		Thread.sleep(3000);
		pword.clear();
		
		
		
		
//		WebElement loginbtn = driver.findElement(By.name("login"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@data-testid='royal-login-button']"));
		loginbtn.click();
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;  //narrowing
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		File  des = new File("C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Screenshot\\fb.png");
		
		FileUtils.copyFile(src, des);
		
		
		
	
		
		
		

		
		
		
		
		
		
		
		
	}

}
