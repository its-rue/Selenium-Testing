package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/dshru/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
										
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
		checkbox.click();
		checkbox.isSelected();
		
		if(checkbox.isSelected()==true) {
			
			System.out.println("Option1 Is Selected");
			
		}
		
		else {
			
			System.out.println("Option1 Is Not Selected");
			
		}
		
		Thread.sleep(2000);
		
        //checkbox.click();
        checkbox.isSelected();
        
        if (checkbox.isSelected()) {
        	
        	checkbox.click();
        	System.out.println("Option1 Deselected");
        	
        }
        
        else {
        	
        	System.out.println("Option1 Is Not Deselected");
        	
        }
        
        System.out.println("The checkbox count is "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		Thread.sleep(5000);
		driver.close();

	}

}


