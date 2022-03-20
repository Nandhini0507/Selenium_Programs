package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YourLogo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.findElement(By.className("login")).click();
	            driver.findElement(By.id("email_create")).sendKeys("mm1nandhini@gmail.com");
	            driver.findElement(By.id("SubmitCreate")).click();
	            Thread.sleep(5000);
	            WebElement gender=driver.findElement(By.id("id_gender2"));
	            gender.click();
	            driver.findElement(By.id("customer_firstname")).sendKeys("nandhini");
	            driver.findElement(By.id("customer_lastname")).sendKeys("murugesan");
				driver.findElement(By.id("passwd")).sendKeys("passwod@123");
				Select date=new Select(driver.findElement(By.id("days")));
				date.selectByVisibleText("10  ");
				Select months=new Select(driver.findElement(By.id("months")));
				months.selectByVisibleText("June ");
				Select years=new Select(driver.findElement(By.id("years")));
				years.selectByVisibleText("2017  ");
				WebElement newletter=driver.findElement(By.id("uniform-newsletter"));
				newletter.click();
				driver.findElement(By.id("firstname")).sendKeys("Nandhini");
				driver.findElement(By.id("lastname")).sendKeys("Murugesan");
				driver.findElement(By.id("address1")).sendKeys("Kumbakonam");
				driver.findElement(By.id("city")).sendKeys("Thanjavur");
				Select state=new Select(driver.findElement(By.id("id_state")));
				state.selectByVisibleText("Florida");
				driver.findElement(By.id("postcode")).sendKeys("12345");
				driver.findElement(By.id("phone_mobile")).sendKeys("8234567890");
				driver.findElement(By.id("submitAccount")).click();
				
				
				
					}

}
