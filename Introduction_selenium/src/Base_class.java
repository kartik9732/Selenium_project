import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public class Base_class {
	
	WebDriver driver =new ChromeDriver();
	@BeforeClass
	public void Browser() {
		
		
	}
	@AfterClass
	public void CloseBrowser() {
		
	}

}
