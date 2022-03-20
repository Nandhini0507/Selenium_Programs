package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("input-firstname")).sendKeys("Nandhini");
		driver.findElement(By.id("input-lastname")).sendKeys("Murugesan");
		driver.findElement(By.id("input-email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8877665544");
		driver.findElement(By.id("input-password")).sendKeys("password2");
		driver.findElement(By.id("input-confirm")).sendKeys("password2");
		driver.findElement(By.xpath("//label[contains(text(),'Subscribe')]/following::input[1]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Privacy Policy')]/following::input[1]")).click();
		driver.findElement(By.xpath("//b[contains(text(),'Privacy Policy')]/following::input[2]")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
