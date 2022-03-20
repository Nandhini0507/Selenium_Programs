package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificaionCommands {
	WebDriver driver;
	@Test
    public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
    }
    
    @Test
    public void b_roundTrip() {
    	
        WebElement round= driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
        round.click();
        System.out.println(round.isEnabled());
		
    }
    public void c_check() {
    	WebElement check= driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
    	System.out.println(check.isSelected());
    }
    public void d_display() {
    	System.out.println(driver.findElement(By.id("ctl00_HyperLinkLogin")).isDisplayed());
    	
    }
    
}
