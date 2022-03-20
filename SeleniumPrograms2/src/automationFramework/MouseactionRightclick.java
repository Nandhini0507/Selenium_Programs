package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionRightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement rigclk= driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		Actions act= new Actions(driver);
		act.contextClick(rigclk).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		Alert ale = driver.switchTo().alert();
		String str=ale.getText();
		System.out.println(str);
		Thread.sleep(3000);
		ale.accept();
			
		
		

	}

}
