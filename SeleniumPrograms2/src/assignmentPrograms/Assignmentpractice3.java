
package assignmentPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignmentpractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement electronic=driver.findElement(By.xpath("(//a[contains(text(),'Women')])[1]/following::a[8]"));
		Actions act=new Actions(driver);
		act.moveToElement(electronic).build().perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Women')])[1]/following::a[11]")).click();
		Select sel= new Select(driver.findElement(By.id("selectProductSort")));
		sel.selectByVisibleText("In stock");
		String title= driver.getCurrentUrl();
		String val = driver.getTitle();
		System.out.println(title);
		System.out.println(val);
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
