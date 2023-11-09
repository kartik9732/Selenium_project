package lerning_pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_class_authontication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://admin:admin@the-internet.herokuapp.com/besic_auth");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
