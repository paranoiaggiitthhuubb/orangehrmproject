package addemployee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Employeeadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Launch Orangehrm page");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/orangehrm/orangehrm-5.7/web/index.php/auth/login");
driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.name("username")).sendKeys("admin321");
driver.findElement(By.name("password")).sendKeys("admin@321ADMIN");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
driver.findElement(By.name("firstName")).sendKeys("Vedhanth");
driver.findElement(By.name("middleName")).sendKeys("M");
driver.findElement(By.name("lastName")).sendKeys("Vishwajith");
driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();	
	
//Thread.sleep(3000);
	}
	

}
