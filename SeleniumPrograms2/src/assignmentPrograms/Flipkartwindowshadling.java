package assignmentPrograms;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartwindowshadling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Plus')]/following::input[1]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//span[contains(text(),'Plus')]/following::button[1]")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'POCO M3 (Cool Blue, 64 GB')]/following::ul")).click();
		ArrayList <String> screen = new ArrayList <String>(driver.getWindowHandles());
		driver.switchTo().window(screen.get(1));
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String mbname=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]/following::span[5]")).getText();
		System.out.println(mbname);
		String price=driver.findElement(By.xpath("(//a[contains(text(),'Mobiles')]/following::div[21])[3]")).getText();
		System.out.println(price);
		driver.findElement(By.id("pincodeInputId")).sendKeys("612105");
		driver.findElement(By.xpath("(//div[contains(text(),'Delivery')])[1]/following::span[1]")).click();
		Thread.sleep(3000);
	}

}
