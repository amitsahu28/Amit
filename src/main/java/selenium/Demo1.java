package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void test() throws InterruptedException {
WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:/NexGen Testing Stream NEW/Selenium/chromedriver_win32 (1)/chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
Thread.sleep(2000);
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/a/span"))).perform();
a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/a/span"))).perform();
a.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[3]/ul/li/ul/li[1]/a/span"))).click().perform();
}
}
