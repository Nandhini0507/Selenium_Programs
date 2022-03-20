package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String tagname=driver.findElement(By.id("searchTerm")).getTagName();
		System.out.println(tagname);
		String name=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getTagName();
		System.out.println(name);
		String tagvalue=driver.findElement(By.id("signin_button")).getAttribute("class");
		System.out.println(tagvalue);
		String fontsize=driver.findElement(By.id("searchTerm")).getCssValue("font-size");
		System.out.println(fontsize);
		String text=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		System.out.println(text);
		String paragraph=driver.findElement(By.xpath("(//p[starts-with(text(),'Use Zero ')])[1]")).getText();
		System.out.println(paragraph);
		
		
		
	}

}
