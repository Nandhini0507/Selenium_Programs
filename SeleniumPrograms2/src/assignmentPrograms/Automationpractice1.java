package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automationpractice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
		driver.findElement(By.id("email")).sendKeys("nandhininandhini831@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password123");
	    driver.findElement(By.id("SubmitLogin")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[contains(text(),'out')])[1]")).click();
	    Thread.sleep(1000);
	    driver.close();
		

	}

}
