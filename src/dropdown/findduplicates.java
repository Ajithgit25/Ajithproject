package dropdown;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class findduplicates {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ajith\\workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement dDnmonth = driver.findElement(By.id("month"));
		Select s=new Select(dDnmonth);
		List<WebElement> emp = s.getOptions();
		for(int i=0;i<emp.size();i++) {
			WebElement element = emp.get(i);
			String name = element.getText();
			System.out.println(name);
		}
		int s1 = emp.size();
		System.out.println("size of list :"+s1);
		Set<WebElement> emp1=new HashSet();
		emp1.addAll(emp);
		int s2 = emp1.size();
		System.out.println("size of set :"+s2);
	    System.out.println(emp.size()-emp1.size());
		
		
		
	}

}
