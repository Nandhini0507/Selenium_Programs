package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orderpalcement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Products')]/preceding::a[1]")).click();
		Thread.sleep(3000);
		for(int i=1;i<=3;i++)
		{
			driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
			Thread.sleep(1000);
		}
		
		driver.findElement(By.id("continue-shopping")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Products')]/preceding::a[1]")).click();
		
		driver.findElement(By.xpath("//button[@id='continue-shopping']/following::button")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Nandhini");
		driver.findElement(By.id("last-name")).sendKeys("Murugesan");
		driver.findElement(By.id("postal-code")).sendKeys("887766");
		driver.findElement(By.xpath("//button[contains(text(),'Cancel')]/following::input")).click();
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Cancel')]/preceding::input[3]")).sendKeys("xxxx");
		Thread.sleep(3000);
		Actions act=new Actions(driver);// switch the control from driver to actions class ref-variable
		act.sendKeys(Keys.TAB,"Murugesan").build().perform();
		act.sendKeys(Keys.TAB,"886655").build().perform();
		

		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(text(),'Cancel')]/preceding::input[2]")).sendKeys("yyyy");
      //  driver.findElement(By.xpath("//button[contains(text(),'Cancel')]/preceding::input[1]")).sendKeys("998877");
       // driver.findElement(By.xpath("//button[contains(text(),'Cancel')]/following::input")).click();*/
	
		
	
		
		
	}

}
