package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balas\\eclipse-workspace-new26\\Selenium5pmjan26\\Driver\\chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Thread.sleep(5000);
		
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions a = new Actions(driver);
		a.contextClick(mobiles).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String string : windowHandles) {
			
			String title = driver.switchTo().window(string).getTitle();
			System.out.println(title);
		}
		
		
	}
}


