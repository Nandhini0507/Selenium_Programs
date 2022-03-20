package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/gmail/about/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		ArrayList <String> Gmailtab= new ArrayList <String> (driver.getWindowHandles());
		driver.switchTo().window(Gmailtab.get(1));
		driver.findElement(By.id("firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("lastName")).sendKeys("Murugesan");
		driver.findElement(By.id("username")).sendKeys("jananisree3669");
		driver.findElement(By.name("Passwd")).sendKeys("janani@123");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("janani@123");
		WebElement ele= driver.findElement(By.xpath("//div[contains(text(),'Show password')]/preceding::input[1]"));
		ele.click();
		driver.findElement(By.xpath("//div[contains(text(),'Show password')]/following::span[1]")).click();
		


	}

}
