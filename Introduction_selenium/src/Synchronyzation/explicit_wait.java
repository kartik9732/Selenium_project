package Synchronyzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 driver.findElement(By.id("username")).sendKeys("admin" ,Keys.TAB,"manager",Keys.ENTER);
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		 //wait.until(ExpectedConditions.visibilityOf((By.id("logoutLink")));
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		 driver.findElement(By.id("logoutLink")).click();

		 

	}

}
