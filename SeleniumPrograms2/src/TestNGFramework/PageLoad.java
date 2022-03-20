package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PageLoad {
	
	WebDriver driver;
	@Test
    public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
    }
	@Test
	public void b_enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Sachin Tendulkar");
		Actions act= new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		//Thread.sleep(10000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//timeunit-->is class
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
		
	}

}
