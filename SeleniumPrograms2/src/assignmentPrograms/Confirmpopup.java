package assignmentPrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Cancel ')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Cancel ')]/following::button[2]")).click();
		Alert ale=driver.switchTo().alert();
		String msg=ale.getText();
		System.out.println(msg);
		ale.accept();
		driver.close();
		
		

	}

}
