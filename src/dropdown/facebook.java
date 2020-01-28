package dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {


	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dDnmonth=driver.findElement(By.id("month"));
		Select s =new Select(dDnmonth);
		s.selectByValue("8");
		
		
	}
		}



