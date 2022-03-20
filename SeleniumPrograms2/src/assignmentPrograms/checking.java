package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=laptop&rh=n%3A26330441031&ref=nb_sb_noss");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'Select your address')]/following::input[4]")).sendKeys("LAPTOP");
		
	
		

	}

}
