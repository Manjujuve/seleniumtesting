package org.sel;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MoveElement {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement f = driver.findElement(By.xpath("//span[text()='Fashion']"));
		a.moveToElement(f).build().perform();
		driver.get("https://www.flipkart.com/clothing-and-accessories/pr?sid=clo&otracker=categorytree&p%5B%5D=facets.ideal_for%255B%255D%3DGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBoys%2B%2526%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys%2B%2526%2BBaby%2BGirls&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BBoys&p%5B%5D=facets.ideal_for%255B%255D%3DBaby%2BGirls&otracker=nmenu_sub_Baby%20%26%20Kids_0_Kids%27%20Clothing&fm=neo%2Fmerchandising&iid=M_3d08f79b-54c7-4924-b7ae-7257a408466a_1_372UD5BXDFYS_MC.0QYFBACHTZGW&otracker=hp_rich_navigation_9_1.navigationCard.RICH_NAVIGATION_Fashion~Kids_0QYFBACHTZGW&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_9_L1_view-all&cid=0QYFBACHTZGW");
		WebElement e = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		a.moveToElement(e).perform();
		Thread.sleep(3000);
		TakesScreenshot t = (TakesScreenshot) driver;
		File source = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\kids.png");
		FileUtils.copyFile(source, des);
		
		
		
		
		
		
		
		
		
		//Question11
		//driver.get("https://www.flipkart.com/clothing-and-accessories/~cs-aerg0b0afc/pr?sid=clo&collection-tab-name=KK%2CSets%2CDM%2CSarees&fm=neo%2Fmerchandising&iid=M_3d08f79b-54c7-4924-b7ae-7257a408466a_1_372UD5BXDFYS_MC.HQXTE43PO8HC&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Fashion~Women%2BEthnic_HQXTE43PO8HC&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L1_view-all&cid=HQXTE43PO8HC");
		//WebElement e = driver.findElement(By.xpath("//span[text()='Women']"));
		//a.moveToElement(e).build().perform();
		//Thread.sleep(3000);
		//TakesScreenshot t = (TakesScreenshot) driver;
		//File source = t.getScreenshotAs(OutputType.FILE);
		//File des = new File("C:\\Users\\manju\\eclipse-workspace\\SeleniumProject\\Screensht\\women.png");
		//FileUtils.copyFile(source, des);
		
	}

}
