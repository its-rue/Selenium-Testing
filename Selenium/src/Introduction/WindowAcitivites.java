package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAcitivites {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/dshru/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.navigate().to("https:rahulshettyacademy.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();

	}

}
