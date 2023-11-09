package Synchronyzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.id("username")).sendKeys("admin" ,Keys.TAB,"manager",Keys.ENTER);
		 driver.findElement(By.id("logoutLink")).click();
		 driver.quit();


	}

}
