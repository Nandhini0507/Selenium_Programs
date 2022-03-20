package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PharmacyTestNG {
     WebDriver driver;
	 //Login script
	
	@Test
	public void a_loginScript() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.id("Pharmacy")).click();
		driver.findElement(By.id("loginButton")).click();
	}
	
	//select Register patient process
	@Test
	public void b_selectRegister() {
		driver.findElement(By.xpath("//h4[contains(text(),'Logged ')]/following::a[3]")).click();
	}
	
	//Register patient details
	
	@Test
	public void c_registerPatien() throws InterruptedException {
		driver.findElement(By.xpath("//label[contains(text(),'Given')]/following::input[1]")).sendKeys("Nandhini");
		driver.findElement(By.xpath("//label[contains(text(),'Given')]/following::input[2]")).sendKeys("SREE");
		driver.findElement(By.xpath("//label[contains(text(),'Given')]/following::input[3]")).sendKeys("murugesan");
		driver.findElement(By.xpath("//label[contains(text(),'Given ')]/following::button[2]")).click();
		Select gender=new Select(driver.findElement(By.id("gender-field")));
	    gender.selectByVisibleText("Female");
	    driver.findElement(By.id("next-button")).click();
	    driver.findElement(By.id("birthdateDay-field")).sendKeys("10");
	    Select month=new Select(driver.findElement(By.id("birthdateMonth-field")));
	    month.selectByVisibleText("July");
		driver.findElement(By.id("birthdateYear-field")).sendKeys("1996");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.id("address1")).sendKeys("vinayam street");
		driver.findElement(By.id("address2")).sendKeys("vadapalani");
		driver.findElement(By.id("cityVillage")).sendKeys("Chennai");
		driver.findElement(By.id("stateProvince")).sendKeys("Tamil nadu");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("postalCode")).sendKeys("612262");
		driver.findElement(By.id("next-button")).click();
		driver.findElement(By.xpath("//label[contains(text(),'number')]/following::input[1]")).sendKeys("9988776655");
		driver.findElement(By.id("next-button")).click();
		Select type=new Select(driver.findElement(By.id("relationship_type")));
	    type.selectByVisibleText("Parent");
        driver.findElement(By.xpath("//h2[contains(text(),'patient')]/following::input[19]")).sendKeys("Murugesan");
        driver.findElement(By.id("next-button")).click();
        driver.findElement(By.id("submit")).click();
        	}
	

	
	
}
