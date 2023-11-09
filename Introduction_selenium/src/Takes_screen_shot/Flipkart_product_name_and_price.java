package Takes_screen_shot;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_product_name_and_price {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(2000);
		 //action method use
		 Actions action = new Actions(driver);

		 action.contextClick(driver.findElement(By.linkText("Mobile"))).perform();
		 
		 Thread.sleep(2000);
		 String parentWindowId=driver.getWindowHandle();
		 Set<String> allwindwoId=driver.getWindowHandles();
		 System.out.println(parentWindowId);
		 allwindwoId.remove(parentWindowId);
		 for(String i:allwindwoId) {
			 driver.switchTo().window(i);
			 Thread.sleep(2000);
			 
			 String title=driver.getTitle();
			 System.out.println(title);
			 Thread.sleep(2000);
			
			 


		 

	}

}
