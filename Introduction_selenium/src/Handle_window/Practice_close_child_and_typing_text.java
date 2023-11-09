package Handle_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_close_child_and_typing_text {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		 Thread.sleep(2000);
		 String parentWindowId=driver.getWindowHandle();
		 Set<String> allwindwoId=driver.getWindowHandles();
		 System.out.println(parentWindowId);
		 allwindwoId.remove(parentWindowId);
		 for(String i:allwindwoId) {
			 driver.switchTo().window(i);
			 Thread.sleep(2000);
			 Thread.sleep(2000);
			 
			 driver.close();
			 //no such windows exception so handle
			 
			 driver.switchTo().window(parentWindowId);
			 driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Kartik");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"name\"]")).clear();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
			 
			 
			 
	}

}
	}
