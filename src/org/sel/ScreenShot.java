package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		TakesScreenshot t= (TakesScreenshot) driver;
		File a = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\snap.png");
		FileUtils.copyFile(a, des);
		
		
		
		
		
		
	}

}
