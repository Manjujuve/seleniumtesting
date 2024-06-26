package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondDay {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement f = driver.findElement(By.xpath("//input[@type='text']"));
		f.sendKeys("Manju");
		a.doubleClick(f).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		WebElement fl = driver.findElement(By.xpath("//input[@type='password']"));
		//a.click(fl).perform();
		//r.keyPress(KeyEvent.VK_CONTROL);
		//r.keyPress(KeyEvent.VK_V);
		//r.keyRelease(KeyEvent.VK_CONTROL);
		//r.keyRelease(KeyEvent.VK_V);
		a.contextClick(fl).perform();
		for (int i = 0; i <=6; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
