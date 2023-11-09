package lerning_pop_up;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Hidden_pop_up {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//it is date but hidden in ahasual
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 driver.findElement(By.id("first_date_picker")).click();
		 while(true) {
			 if(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"))).getText().equals("may 2020");
			 driver.findElements("//a[@class='ui-state-default']").get(24).click();
			 break;
		 }
		 else {
			 driver.findElement(By.xpath("//span[text]()='prev']")).click();
			 Thread.sleep(1000);
		 }
		 
		
	}

}
