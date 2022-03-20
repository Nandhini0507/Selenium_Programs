package TestNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	WebDriver driver;
	@Test
    public void a_PageLoad() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
    }
	 @Test
	 public void b_assert() 
	 {
		 String str= driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		 System.out.println(str);
		 Assert.assertEquals(str,"ONLINE BANKING");
		 System.out.println(" AssertionEquals Pass - If assertion is failed then it wont print this line");
		  
	 }

	 @Test
	 public void c_assert() 
	 {
		 String str= driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		 System.out.println(str);
		 Assert.assertNotEquals(str,"online element");
		 System.out.println(" AssertionNotEquals Pass - If assertion is failed then it wont print this line");
		  
	 }
	 
	 @Test
	 public void d_assert() {
		 Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		 System.out.println("AssertionTrue Passes");
		 
	 }
		 @Test
		 public void e_asset() {
			 
			 String str=driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
			 Assert.assertFalse("Online Banking".equals(str));
			 System.out.println("AssertFalse passed");
			 
		 }
		 
		 @Test
		 public void f_assert()
		 {
			 Object obj=driver.getTitle();
			 Assert.assertNotNull(obj);//expect result no need to write becoz by default it will take null
			 System.out.println("AssertNotNull is passed");
			 
		 }
		 @Test
		 public void g_assert()
		 {
			 Object obj= null;
			 Assert.assertNull(obj);//expect result no need to write becoz by default it will take null
			 System.out.println("AssertNull is passed");
			 
			 
		 }
		 }
	 
		
