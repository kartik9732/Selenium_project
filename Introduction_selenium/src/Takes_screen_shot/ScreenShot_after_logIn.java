package Takes_screen_shot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_after_logIn {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(2000);
		 //for date along with name 
		 Date  date=new Date();
		  String date2=date.toString().replace(' ','_').replace(':','_');
		  
		 WebElement logIn=driver.findElement(By.xpath("//div[text()='Login ']"));
		 logIn.click();
		 driver.findElement(By.cssSelector("[type='Email:']")).sendKeys("kartikmanna721140@gmail.com");
		 //use for the type casting
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 //use to take the screen the screen shot and store into the local ram
		 
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 //setting the path where we want to store the screen shot
		 File dest=new File("./ScreenShot/"+date2+"actitime.png");
		 //copying screenshot from Ram to system memory
		 FileHandler.copy(src,dest);
		 Thread.sleep(2000);
		 driver.quit();
		 
		 
	}

}
