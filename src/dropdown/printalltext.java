package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class printalltext {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dDnmonth=driver.findElement(By.id("month"));
		Select s =new Select(dDnmonth);
		List<WebElement> emp=s.getOptions();
		for(int i=0;i<emp.size();i++) {
			WebElement element=emp.get(i);
			String name= element.getText();
			System.out.println(name);
		}
		
	}
}
