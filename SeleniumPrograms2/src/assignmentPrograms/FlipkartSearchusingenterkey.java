package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSearchusingenterkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Plus')]/following::input[1]")).sendKeys("Mobiles");
		Actions act=new Actions(driver);// switch the control from driver to actions class ref-variable
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'POCO M3 (Cool Blue, 64 GB')]/following::ul")).click();
		
		
	}

}
