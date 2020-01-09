package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3 {
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
		Thread.sleep(2020);
		driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/h4")).click();
		
}
}
