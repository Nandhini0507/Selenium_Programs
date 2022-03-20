package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSSelectorExample {
	WebDriver driver;
	@Test
    public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		
    }
	@Test
	public void  b_signin()
	{
		//driver.findElement(By.className("signin btn btn-info")).click();
		driver.findElement(By.cssSelector(".signin btn btn-info")).click();
		//css excution time will reuduce
		//driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.cssSelector("#user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.name("submit")).click();
	}
}

