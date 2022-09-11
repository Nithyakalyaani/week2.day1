package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kalyaani");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithya.palani1965@gmail.com");
		 WebElement ele =driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		 Select el=new Select(ele);
		 el.selectByVisibleText("New York");
		 driver.findElement(By.className("smallSubmit")).click();
		 driver.findElement(By.linkText("Duplicate Lead")).click();
		 driver.findElement(By.id("createLeadForm_companyName")).clear();
		 Thread.sleep(3000);
		 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		 driver.findElement(By.id("createLeadForm_firstName")).clear();
		 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithyapalani");
		 driver.findElement(By.className("smallSubmit")).click();
		 System.out.println("The title is" + driver.getTitle());
		
	}

}
