package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static void main(String[] args) throws AWTException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		
		
		
		
		
		//Question10
		//WebElement f = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		//f.sendKeys("motorolo");
	//	Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);;
		//r.keyRelease(KeyEvent.VK_ENTER);
		//TakesScreenshot t = (TakesScreenshot) driver;
		//File source = t.getScreenshotAs(OutputType.FILE);
	//	File des= new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\moto.png");
	//	FileUtils.copyFile(source, des);
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Question9
		//WebElement f = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		//f.sendKeys("iphone");
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);;
		//r.keyRelease(KeyEvent.VK_ENTER);
		//TakesScreenshot t = (TakesScreenshot) driver;
		//File source = t.getScreenshotAs(OutputType.FILE);
		//File des= new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\iphone.png");
		//FileUtils.copyFile(source, des);
	
		
	}

}
