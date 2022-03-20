package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload= driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("C:\\Users\\new\\Pictures\\Screenshots\\Screen.png");
		WebElement loc= driver.findElement(By.id("terms"));
		loc.click();
		WebElement loc1= driver.findElement(By.id("submitbutton"));
		loc1.click();
		//driver.close();
		/*driver.switchTo().frame("emailframe");
        String str = driver.findElement(By.id("res")).getText();
		System.out.println(str);
				*/
		

	}

}
