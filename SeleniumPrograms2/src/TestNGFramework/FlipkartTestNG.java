package TestNGFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartTestNG {
	WebDriver driver;
	
	//MOBILE SERACHING
	@Test
	public void a_mobileSerach() {
	    	System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
	    	driver.get("https://www.flipkart.com/");
	    	driver.manage().window().maximize();
	    	driver.findElement(By.xpath("//span[contains(text(),'Forgot?')]/preceding::button[1]")).click();
	    	driver.findElement(By.xpath("//span[contains(text(),'Plus')]/following::input[1]")).sendKeys("Redmi");
	    	driver.findElement(By.xpath("//a[contains(text(),'Login')]/preceding::button")).click();
	    	
	    }
	    
	    //Switching into another stab
       @Test
       public void b_printValue() throws InterruptedException {
    	   Thread.sleep(3000);
    	   driver.findElement(By.xpath("//div[contains(text(),'Price -- High to Low')]/following::div[16]")).click();
   		   ArrayList <String> win = new ArrayList <String> (driver.getWindowHandles());
    	   driver.switchTo().window(win.get(1));
    	   String title=driver.getTitle();
    	   System.out.println(title);
    	   String url=driver.getCurrentUrl();
    	   System.out.println(url);
    	   String pdnm= driver.findElement(By.xpath("//a[contains(text(),'REDMI Headphones')]/following::span[5]")).getText();
    	   System.out.println(pdnm);
    	   String amt = driver.findElement(By.xpath("//span[contains(text(),'Special price')]/following::div[4]")).getText();
    	   System.out.println(amt);
    			   
    	   
       }

}
