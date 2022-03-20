package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parabank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("customer.firstName")).sendKeys("Nandhini");
		driver.findElement(By.id("customer.lastName")).sendKeys("Murugesan");
		driver.findElement(By.id("customer.address.street")).sendKeys("22,south street,Trichy");
		driver.findElement(By.id("customer.address.city")).sendKeys("Chennai");
		driver.findElement(By.id("customer.address.state")).sendKeys("Tamilnadu");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("8976567854");
		driver.findElement(By.id("customer.ssn")).sendKeys("8899");
		driver.findElement(By.id("customer.username")).sendKeys("Nandhini");
		driver.findElement(By.id("customer.password")).sendKeys("password");
		driver.findElement(By.id("repeatedPassword")).sendKeys("password");
		driver.findElement(By.className("button")).click();
		
		
	}

}
