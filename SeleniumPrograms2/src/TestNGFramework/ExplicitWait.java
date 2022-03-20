package TestNGFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
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
		//WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpextedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")));
	   driver.findElement(By.xpath("//h3[contains(text(),'Sachin Tendulkar - Wikipedia')]")).click();
		
	}
}