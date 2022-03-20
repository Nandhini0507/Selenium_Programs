package automationFramework;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionTabEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("nandhini@gmaill.com");
		Actions act=new Actions(driver);// switch the control from driver to actions class ref-variable
		act.sendKeys(Keys.TAB,"pawd").build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		
				

	}

}
