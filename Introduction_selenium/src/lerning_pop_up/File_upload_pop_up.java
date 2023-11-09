package lerning_pop_up;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_pop_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://the-internet.herokuapp.com/upload");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  WebElement fileUpload=driver.findElement(By.id("file-upload"));
		  
		  fileUpload.sendKeys("C:\\Users\\kartikmanna\\Pictures\\Adi\\2011981230_Kartik___Manna .pdf");

	}

}
