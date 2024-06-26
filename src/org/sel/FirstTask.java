package org.sel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		//driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert alert = driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		alert.sendKeys("Hi this is Manju");
		alert.accept();
		
		
		
		
		
		
		
	}

}
