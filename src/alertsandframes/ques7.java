package alertsandframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques7 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9600327233");
		driver.findElement(By.xpath("(//img[@alt='continue'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("fldPassword")).sendKeys("327233");
		
		
	}

}
