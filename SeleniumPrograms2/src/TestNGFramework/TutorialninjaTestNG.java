package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TutorialninjaTestNG {
	  WebDriver driver;
		//Your Store
	    
	    //Your Personal Details
		@Test (priority=1)
	    public void loginPage() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
        driver.findElement(By.id("input-firstname")).sendKeys("NandhiniM");
        driver.findElement(By.id("input-lastname")).sendKeys("Murugesan");
        driver.findElement(By.id("input-email")).sendKeys("nanhn543@gmail.com");
        driver.findElement(By.id("input-telephone")).sendKeys("9944228844");
		}
		
		//Your password
		
		@Test (priority=2)
		public void passWord() {
	    driver.findElement(By.id("input-password")).sendKeys("passw123");
	    driver.findElement(By.id("input-confirm")).sendKeys("passw123");
		}
		
		//Newletters
		
		@Test (priority=3)
		public void newLetter() {
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[3]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[4]")).click();
		}
}
