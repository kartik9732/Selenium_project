package Project_in_selinium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project_selinium {
	WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://127.0.0.1/login.do;jsessionid=2lwl5xvtrfajr");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

