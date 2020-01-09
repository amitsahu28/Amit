package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver;
@Test
public void test() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/NexGen Testing Stream NEW/Selenium/chromedriver_win32 (1)/chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("Password456");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	String d=driver.getTitle();
	Assert.assertEquals("Admin Home",d);	
	String g=driver.findElement(By.xpath("//*[contains(text(),'Hi, Admin')]")).getText();
	Assert.assertEquals("Hi, Admin    SignOut", g);
	System.out.println(g);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[contains(text(),'Add Category')]")).click();
//	Thread.sleep(2000);
	driver.findElement(By.name("catgName")).sendKeys("Holidays");
	driver.findElement(By.name("catgDesc")).sendKeys("Bag");
	driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div/div[3]/center/div[1]/input")).click();
	driver.close();
}
}
