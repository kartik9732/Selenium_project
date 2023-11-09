package Project_selinium_on_actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Actitime_project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverDecorator driver=new WebDriverDecorator();
		 driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=amstnt25ha3s8");
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.className("sizer")).click();
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		driver.findElement(By.xpath("//*[@id=\"customersProjectsForm\"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		driver.findElement(By.name("name")).sendKeys("Ahasanul8");
		driver.findElement(By.name("description")).sendKeys("Ahasanul is a very good boy");
		driver.findElement(By.id("pre_fill_import_from_existing")).click();
		WebElement dt=driver.findElement(By.xpath("//select[contains(@name,'customerImportFromId')]"));
		Select select=new Select(dt);
		select.selectByIndex(1);
//		driver.findElement(By.id("project_assignments")).click();
		driver.findElement(By.id("add_project_action")).click();
		driver.findElement(By.name("createCustomerSubmit")).click();
		driver.findElement(By.name("name")).sendKeys("Project 1");
		driver.findElement(By.name("description")).sendKeys("This is my first project");
		driver.findElement(By.id("add_tasks_action")).click();
		driver.findElement(By.name("createProjectSubmit")).click();
		driver.findElement(By.name("task[0].name")).sendKeys("Task1");
		driver.findElement(By.name("task[0].deadline")).sendKeys("29-10-2023");
		WebElement d2=driver.findElement(By.xpath("//select[contains(@name,'task[0].billingType')]"));
		Select sl=new Select(d2);
		sl.selectByIndex(1);
		driver.findElement(By.name("task[0].markedToBeAddedToUserTasks")).click();
		driver.findElement(By.xpath("//input[@value='Create Tasks']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"customerNameCell8\"]/table/tbody/tr/td[2]/a/img")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Hi i am Ahasanul");
		System.out.println("text of the alert is:"+alert.getText());
		alert.accept();
		Thread.sleep(2000);
//		alert.dismiss();
				


	}

}
