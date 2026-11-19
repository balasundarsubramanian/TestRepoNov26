package com.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\balas\\eclipse-workspace-new26\\Selenium6pmjan26\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		WebElement mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Actions a = new Actions(driver);
		a.contextClick(mobiles).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
		
		Thread.sleep(5000);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
	     for (String str : windowHandles) {
	    	 driver.switchTo().window(str);
			
		}
		
		
	}
}
