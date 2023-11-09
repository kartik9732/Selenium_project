package IFRAME;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_by_index {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/kartikmanna/Downloads/iframe.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.switchTo().frame(0);
		 
		// driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("small-searchterms")).sendKeys("car");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.linkText("Google")).click();
		 Thread.sleep(2000);
		 
		 
		 

	}

}
