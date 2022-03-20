package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FormyTestNG {
	WebDriver driver;
	@Test
	public void a_loginScript() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Nandhini");
		driver.findElement(By.id("last-name")).sendKeys("Murugesan");
		driver.findElement(By.id("job-title")).sendKeys("Tester");
		WebElement gra=driver.findElement(By.id("radio-button-2"));
		gra.click();
		WebElement gen=driver.findElement(By.id("checkbox-2"));
		gen.click();
		Select exp=new Select(driver.findElement(By.id("select-menu")));
		exp.selectByVisibleText("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("02/03/2020");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
	}		
}
