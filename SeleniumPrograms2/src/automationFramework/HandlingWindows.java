package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		ArrayList <String> names=new ArrayList <String> (driver.getWindowHandles());//here we storing all the windows into arraylist
		for(String output:names)
		{
			System.out.println(output);
		}
		String Mainwindowtitle= driver.getTitle();
		System.out.println(Mainwindowtitle);
		driver.switchTo().window(names.get(1));//here we switching control into subwindow from mainwindow
		String subwindowstitle=driver.getTitle();
		System.out.println(subwindowstitle);
		driver.close();
	}

}
