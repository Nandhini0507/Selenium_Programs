package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class similarelemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Sachin_Tendulkar");
		driver.manage().window().maximize();
        int countlink=driver.findElements(By.tagName("a")).size();
        System.out.println(countlink);
	    int imagecount=driver.findElements(By.tagName("img")).size();
	    System.out.println(imagecount);
	    
	}
	

}
