package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JpetTestNG {
    WebDriver driver;
	//JPETSTORE REGISTRATION
    
    //USER INFORMATION
	@Test (priority=1)
    public void loginPage() {
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("NandhiniMM");
	driver.findElement(By.xpath("//td[contains(text(),'New password:')]/following::input[1]")).sendKeys("passwrd1243");
	driver.findElement(By.xpath("//td[contains(text(),'Repeat password:')]/following::input[1]")).sendKeys("passwrd1243");
	}
	
    //ACCOUNT INFORMATION
	
	@Test (priority=2)
	public void accountInfo() {
	driver.findElement(By.xpath("//td[contains(text(),'First')]/following::input[1]")).sendKeys("NandhiniJAN");
	driver.findElement(By.xpath("//td[contains(text(),'Last')]/following::input[1]")).sendKeys("Murugesan");
	driver.findElement(By.xpath("//td[contains(text(),'Email')]/following::input[1]")).sendKeys("nakkhu@gmail.com");
	driver.findElement(By.xpath("//td[contains(text(),'Phone:')]/following::input[1]")).sendKeys("8855443322");
	driver.findElement(By.xpath("//td[contains(text(),'Address 1:')]/following::input[1]")).sendKeys("11/3,vinayagam street");
	driver.findElement(By.xpath("//td[contains(text(),'Address 2:')]/following::input[1]")).sendKeys("vadapalani");
	driver.findElement(By.xpath("//td[contains(text(),'City:')]/following::input[1]")).sendKeys("Chennai");
	driver.findElement(By.xpath("//td[contains(text(),'State:')]/following::input[1]")).sendKeys("TamilNadu");
	driver.findElement(By.xpath("//td[contains(text(),'Zip:')]/following::input[1]")).sendKeys("600123");
	driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[1]")).sendKeys("India");
	}
	
	//PROFILE INFORMATION
	
	@Test (priority=3)
	public void profileInfo() {
    Select lang= new Select(driver.findElement(By.xpath("//td[contains(text(),'Language Preference:')]/following::select[1]")));
    lang.selectByVisibleText("japanese");
    Select bir= new Select(driver.findElement(By.xpath("//td[contains(text(),'Language Preference:')]/following::select[2]")));
    bir.selectByVisibleText("BIRDS");
    driver.findElement(By.xpath("//td[contains(text(),'Enable MyList')]/following::input[1]")).click();
    driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[1]")).click();
	driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[2]")).click();
    
	}
    
    
		
		
    }
