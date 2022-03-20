package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentPractice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[1]")).click();
		Select contact=new Select(driver.findElement(By.id("id_contact")));
		contact.selectByVisibleText("Webmaster");
		driver.findElement(By.id("email")).sendKeys("nandhininandhini831@gmail.com");
		driver.findElement(By.id("id_order")).sendKeys("orders");
		WebElement upload =driver.findElement(By.id("fileUpload"));
		upload.sendKeys("C:\\Users\\new\\Pictures\\Screenshots\\Screen.png");
		driver.findElement(By.id("message")).sendKeys("Perfoming automation testing in automationpractice site");
		driver.findElement(By.xpath("//span[contains(text(),'Send')]")).click();
	    Thread.sleep(5000);
	    driver.close();

	}

}
