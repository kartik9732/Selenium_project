package lerning_pop_up;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_with_other_web_site {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.hyrtutorials.com/p/alert/alertsdemo.html/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.findElement(By.xpath("//button[text()='//*[@id=/div/div[1]")).click();
		 Alert alert=driver.switchTo().alert();
		 System.out.println("text of the elert is :"+alert.getText());
		 alert.accept();
		 

	}

}
