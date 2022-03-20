package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Jpetstore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//td[contains(text(),'User ID:')]/following::input[1]")).sendKeys("NandhiniM");
	    driver.findElement(By.xpath("//td[contains(text(),'New password:')]/following::input[1]")).sendKeys("Password1");
	    driver.findElement(By.xpath("//td[contains(text(),'Repeat password:')]/following::input[1]")).sendKeys("Password1");
	    driver.findElement(By.xpath("//td[contains(text(),'First name:')]/following::input[1]")).sendKeys("Nandhini");
	    driver.findElement(By.xpath("//td[contains(text(),'Last name:')]/following::input[1]")).sendKeys("Murugesan");
	    driver.findElement(By.xpath("//td[contains(text(),'Email:')]/following::input[1]")).sendKeys("nandhini1232@gmail.com");
	    driver.findElement(By.xpath("//td[contains(text(),'Phone:')]/following::input[1]")).sendKeys("9988776655");
	    driver.findElement(By.xpath("//td[contains(text(),'Address 1:')]/following::input[1]")).sendKeys("xxx");
	    driver.findElement(By.xpath("//td[contains(text(),'Address 2:')]/following::input[1]")).sendKeys("yyy");
	    driver.findElement(By.xpath("//td[contains(text(),'City:')]/following::input[1]")).sendKeys("zzz");
	    driver.findElement(By.xpath("//td[contains(text(),'State:')]/following::input[1]")).sendKeys("tamilnadu");
	    driver.findElement(By.xpath("//td[contains(text(),'Zip:')]/following::input[1]")).sendKeys("765675");
	    driver.findElement(By.xpath("//td[contains(text(),'Country:')]/following::input[1]")).sendKeys("India");
	    Select lang=new Select(driver.findElement((By.xpath("//td[contains(text(),'Language Preference:')]/following::select[1]"))));
		lang.selectByVisibleText("japanese");
		Select fav=new Select(driver.findElement((By.xpath("//td[contains(text(),'Favourite Category:')]/following::select[1]"))));
		fav.selectByVisibleText("BIRDS");
		driver.findElement(By.xpath("//td[contains(text(),'Enable MyList')]/following::input[1]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[1]")).click();
		driver.findElement(By.xpath("//td[contains(text(),'Enable MyBanner')]/following::input[2]")).click();
	    driver.close();

	
	}

}
