package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement scroll = driver.findElement(By.xpath("//div[@class='col-12 col-sm-auto']"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].scrollIntoView()", scroll);
		
	}

}
