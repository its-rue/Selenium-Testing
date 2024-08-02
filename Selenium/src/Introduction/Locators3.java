package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/dshru/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Sibling - Child to parent traverse
		//header/div/button[1]/following-sibling::button[1]
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		Thread.sleep(5000);
		driver.close();
		
	}

}
