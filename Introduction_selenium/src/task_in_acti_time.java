import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_in_acti_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://127.0.0.1/login.do;jsessionid=2lwl5xvtrfajr");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


	}

}
