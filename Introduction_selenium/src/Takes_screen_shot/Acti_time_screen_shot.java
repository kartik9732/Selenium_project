package Takes_screen_shot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Acti_time_screen_shot {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.actitime.com/login.do");
		 Thread.sleep(2000);
		 //for type casting driver control to takes screen shot interface
		 TakesScreenshot ts=(TakesScreenshot) driver;
		 //use to take the screen the screen shot and store into the local ram
		 
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 //setting the path where we want to store the screen shot
		 File dest=new File("./ScreenShot/actitime.png");
		 //copying screenshot from Ram to system memory
		 FileHandler.copy(src,dest);
		 
		 
		 

	}

}
