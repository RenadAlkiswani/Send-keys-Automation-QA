package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.booking.com");
		Keys theKeys = Keys.ARROW_DOWN;
//		driver.findElement(By.id("my-select")).click();
//		driver.findElement(By.id("my-select")).sendKeys("S"+Keys.ENTER);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.id("ss")).click();
		Thread.sleep(4000);
    	driver.findElement(By.xpath("//*[@id=\"ss\"]")).sendKeys("amman",theKeys);
    	

   }

}
