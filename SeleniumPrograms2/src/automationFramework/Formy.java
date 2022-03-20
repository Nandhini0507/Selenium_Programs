package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		driver.findElement(By.id("first-name")).sendKeys("Nandhini");
		driver.findElement(By.id("last-name")).sendKeys("Murugesan");
		driver.findElement(By.id("job-title")).sendKeys("Tester");
		WebElement gender=driver.findElement(By.id("radio-button-2"));
        gender.click();
        WebElement exp=driver.findElement(By.id("radio-button-2"));
		exp.click();
        Select experience=new Select(driver.findElement(By.id("select-menu")));
		experience.selectByVisibleText("0-1");
		driver.findElement(By.id("datepicker")).sendKeys("05/12/2021");
		driver.findElement(By.xpath("//a[contains(text(),'Submit')]")).click();
		
	}

}
