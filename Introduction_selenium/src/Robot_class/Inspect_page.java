package Robot_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Inspect_page {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demowebshop.tricentis.com/");
		 Thread.sleep(2000);
		 Actions action = new Actions(driver);

		 action.contextClick(driver.findElement(By.linkText("Register"))).perform();
		 
		 Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_UP);
		 robot.keyRelease(KeyEvent.VK_UP);
		 Thread.sleep(2000);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2000);
		 driver.quit();
		 
		 

	}

}
