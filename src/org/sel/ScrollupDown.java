package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollupDown {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		//Question8
	    WebElement scrl = driver.findElement(By.xpath("//div[@class='card-headerdd d-flex align-items-center justify-content-between']"));
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", scrl);
        Actions a = new Actions(driver);
		WebElement f = driver.findElement(By.xpath("//div[@class='card-headercore-java d-flex align-items-center justify-content-between']"));
		a.click(f).perform();
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\corejava.png");
		FileUtils.copyFile(source, des);
		
		
		
		
		
		
		
		
		//Question7
		//WebElement scrl = driver.findElement(By.xpath("//span[text()='Certification']"));
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("arguments[0].scrollIntoView()", scrl);
		//Actions a = new Actions(driver);
		//WebElement f = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		//a.click(f).perform();
		
	
		
		
		
		
		
		
		
		
		
		
		
		//Question6
		//WebElement scroldown = driver.findElement(By.xpath("//a[@data-label='Sales Force Training']"));
		//JavascriptExecutor j=(JavascriptExecutor) driver;
		//j.executeScript("arguments[0].scrollIntoView()", scroldown);
		//TakesScreenshot t = (TakesScreenshot) driver;
		///File source = t.getScreenshotAs(OutputType.FILE);
		//File des= new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\strend.png");
		//FileUtils.copyFile(source, des);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Question 5
		//WebElement scroll = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
		//JavascriptExecutor j = (JavascriptExecutor) driver;
		//j.executeScript("arguments[0].scrollIntoView()", scroll);
		//TakesScreenshot t = (TakesScreenshot) driver;
		//File source = t.getScreenshotAs(OutputType.FILE);
		//File des= new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\greens.png");
		//FileUtils.copyFile(source, des);
		//WebElement scrollup = driver.findElement(By.xpath("//a[text()='Book a free demo']"));
		//j.executeScript("arguments[0].scrollIntoView()", scrollup);
	}

}
