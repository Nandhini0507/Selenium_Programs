package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LnktextExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//a[contains(text(),'your password ?')]")).click();
        //driver.findElement(By.linkText("Forgot your password ?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
        
      }

}
