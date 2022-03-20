package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActiondoubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
        WebElement ele =driver.findElement(By.xpath("//button[contains(text(),'Double')]"));
        Actions act=new Actions(driver);
        act.doubleClick(ele).build().perform();
        Alert aler = driver.switchTo().alert();
        String str=aler.getText();
        System.out.println(str);
        Thread.sleep(3000);
        aler.accept();
        
        
        }

}
