package TestNGFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakingScreenshot {
	public WebDriver driver;
	@Test
    public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
    }
	@Test
	public void b_login() throws IOException {
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
        getscreenshot();
        
	}
	private void getscreenshot() throws IOException  {
		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); //copy and paste
		//FileUtils.copyFile(scrfile,new File("D:\\Selenium Notes\\screenshot\\screenshot" +System.currentTimeMillis()+ ".png"));
		//FileUtils.copyFile(scrfile,new File("D:\\Selenium Notes\\screenshot\\screenshot" +System.currentTimeMillis()+ ".png"));
		FileUtils.copyFile(scrfile,new File("D:\\Selenium Notes\\screenshot\\screenshot.png"));
		

	}
}
