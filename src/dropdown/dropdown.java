package dropdown;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajith\\workspace\\selenium\\driver\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	WebElement singleormultiple = driver.findElement(By.id("multi-select"));
	Select s=new Select(singleormultiple);
	boolean multiple = s.isMultiple();
	System.out.println(multiple);
	//select by index
	s.selectByIndex(0);
	//selectbyvisibletext
	s.selectByVisibleText("New York");
	//select by value
	s.selectByValue("Texas");
	//get all selected Optios using normal for loop
	System.out.println("Get all selected option");
	
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	for (int i = 0; i < allSelectedOptions.size(); i++) {
		WebElement webElement = allSelectedOptions.get(i);
		String text = webElement.getText();
		System.out.println(text);
		
	}
	
	//getallselectedoption using enhanced for loop
	//for (WebElement webElement : allSelectedOptions) {
		//String text = webElement.getText();
	//	System.out.println(text);
		
//}
	
	System.out.println("get first selected option");
	//get first selected option
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	//deselect
	//s.deselectByIndex(0);
	
	System.out.println("after deselected option");
	//after deselect by index
	List<WebElement> allSelectedOptions2 = s.getAllSelectedOptions();
	for (int i = 0; i <allSelectedOptions2.size(); i++) {
		WebElement webElement = allSelectedOptions2.get(i);
			String text = webElement.getText();
			System.out.println(text);
		}	
		s.deselectAll();
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
