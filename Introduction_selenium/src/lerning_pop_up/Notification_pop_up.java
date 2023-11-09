package lerning_pop_up;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_pop_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object of chrome options class
		ChromeOptions option=new ChromeOptions();
		//call the argument method
		option.addArguments("--disable-notifications");
		//pass the option varriable into chrome Driver
		
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=CjwKCAjwv-2pBhB-EiwAtsQZFDgGUGYt7-M0FWBNOVZnQZoUEWTknFuUP6H5tO7AtL1TA15X4231NBoCfrEQAvD_BwE");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

}
