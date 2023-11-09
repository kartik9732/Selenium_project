package Handle_window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_multiple_window {
	//close all the tab using close not quit

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/kartikmanna/Downloads/MultipleWindow.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		 Thread.sleep(2000);
		 String parentWindowId=driver.getWindowHandle();
		 Set<String> allwindwoId=driver.getWindowHandles();
		 System.out.println(parentWindowId);
		 allwindwoId.remove(parentWindowId);
		 System.out.println("++++++++++++=====");
		 for(String i:allwindwoId) {
			 driver.switchTo().window(i);
			 Thread.sleep(2000);
			 String title=driver.getTitle();
			 System.out.println(title);
			 Thread.sleep(2000);
			 
			 driver.close();
			 //we can also do with if there name match so do not close this as well
			
			 
		 }
		 
		 

	}

}
