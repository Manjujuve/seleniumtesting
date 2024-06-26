package org.sel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSnap {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement scroll = driver.findElement(By.xpath("//span[text()='Greens technology Perumbakkam']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", scroll);
		TakesScreenshot s = (TakesScreenshot) driver;
		File source = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\perumbakkam.png");
		FileUtils.copyFile(source, dest);
	}

}
