package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TutorialTestNG {
    WebDriver driver;
	
    //ITEM SELECTION
	@Test 
    public void a_loginPage() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	driver.manage().window().maximize();
	WebElement web=driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]"));
	Actions act = new Actions(driver);
	act.moveToElement(web).build().perform();
	driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]/following::a[2]")).click();
	}
	
	//ADD TO CART
	@Test
	public void b_addCart() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Add to Cart')]")).click();
		Thread.sleep(3000);
		String str= driver.findElement(By.xpath("//div[contains(text(),'Success: You have added')]")).getText();
		System.out.println(str);
	}
	//REMOVE FROM CART
	@Test
	public void c_removerCart() throws InterruptedException {
		driver.findElement(By.id("cart-total")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[contains(text(),'Sub-Total')]/preceding::button[1]")).click();
		
	}
		

	
}
