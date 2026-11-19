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
import org.openqa.selenium.edge.EdgeDriver;

public class BasicExecution {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		WebElement userInput = driver.findElement(By.id("email"));
		WebElement userInput = driver.findElement(By.xpath("//input[@type='text']"));
		userInput.sendKeys("abc@gmail.com");
		
////		WebElement password = driver.findElement(By.id("pass"));
//		
//		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
//		password.sendKeys("aggfg");
//		
////		WebElement loginbtn = driver.findElement(By.name("login"));
//		
//		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
//		loginbtn.click();
		
//		String text = loginbtn.getText();
		
//		driver.findElement(By.className("inputtext _55r1 _6luy"));
//		driver.findElement(By.tagName("input"));
//		
//		driver.findElement(By.linkText("Forgotten password?"));
//		
//		driver.findElement(By.partialLinkText("Facebook"));
		
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Screenshot\\fb.png");
		FileUtils.copyFile(src, des);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		
////		Navigation commands
//		
//		driver.navigate().to("https://www.instagram.com/accounts/login/?hl=en");
////		Thread.sleep(3000);
//		driver.navigate().back();
////		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		
//		driver.close();
//		driver.quit();
		
		

	
	}

}
