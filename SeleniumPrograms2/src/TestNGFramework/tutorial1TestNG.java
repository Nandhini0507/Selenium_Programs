package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tutorial1TestNG {
	WebDriver driver;
	
	//search script
	@Test 
    public void a_serachLap() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//span[contains(text(),'Checkout')]/following::input[1]")).sendKeys("Laptops");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.ENTER).build().perform();
	}
	
	//Printing into Console
	@Test
	public void b_printConsole() {
		String title= driver.getTitle();
		System.out.println(title);
		String url= driver.getCurrentUrl();
		System.out.println(url);
		String msg=driver.findElement(By.xpath("//h1[contains(text(),'Search ')]")).getText();
		System.out.println(msg);
		String tag= driver.findElement(By.xpath("//h1[contains(text(),'Search ')]")).getTagName();
		System.out.println(tag);
		String attrval= driver.findElement(By.xpath("//label[contains(text(),'Search Criteria')]/following::select")).getAttribute("class");
		System.out.println(attrval);
		String css = driver.findElement(By.xpath("//label[contains(text(),'Search Criteria')]/following::select")).getCssValue("height");
		System.out.println(css);
		
	}
		
				

}
