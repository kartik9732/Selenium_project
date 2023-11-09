package lerning_pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promt_checking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		 Alert alert=driver.switchTo().alert();
		 alert.sendKeys("hii i am kartik");
		 System.out.println("text of the elert is :"+alert.getText());
		 alert.accept();
		Thread.sleep(2000);
		alert.dismiss();
	}

}
