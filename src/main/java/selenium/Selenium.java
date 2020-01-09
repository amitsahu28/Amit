package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium {

	@Test
	 public void f() throws InterruptedException
	 {
		  WebDriver driver;
	         
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "C:/NexGen Testing Stream NEW/Selenium/chromedriver_win32 (1)/chromedriver.exe");
	        
	     
	        //Instantiating driver object
	        driver = new ChromeDriver();
	        driver.get("http://demowebshop.tricentis.com");
	        driver.findElement(By.linkText("Log in")).click();
//	        driver.findElement(By.id("Email")).sendKeys("askmail@email.com");
	        driver.findElement(By.cssSelector("input#Email")).sendKeys("askmail@email.com");
//	        driver.findElement(By.name("Password")).sendKeys("abc123");
	        driver.findElement(By.cssSelector("input#Password")).sendKeys("abc123");
	        driver.findElement(By.className("login-button")).click();
	        driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
//	        driver.findElement(By.partialLinkText("Log  out")).click();
//	        driver.findElement(By.linkText("Log out")).click();
	        Thread.sleep(5000);
//	        driver.navigate().to("http://10.232.237.143:443/TestMeApp/login.htm");
//	        driver.findElement(By.id("userName")).sendKeys("lalitha");
//	        driver.findElement(By.id("password")).sendKeys("Password123");
//	        driver.findElement(By.className("btn-lg")).submit();
//	        driver.findElement(By.linkText("AboutUs")).click();
//	        driver.findElement(By.className("subfirst")).click();
//	        driver.findElement(By.className("sublast")).click();
//	        Thread.sleep(5000);
//	        driver.getWindowHandles();
//	        driver.switchTo().window("Home");
//	  
	       }
	  	}
 