package Introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String name = "rahul";
		System.setProperty("webdriver.chrome.driver", "/Users/dshru/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		Thread.sleep(5000);
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahualshettyacadamy' to Login.
		String[] passwordArray = passwordText.split("'");
		//0th index - Please use temporary password
		//1st index - rahualshettyacademy' to Login.
		//String[] passwordArray2 = passwordArray[1].split("'");
		//passwordArrray[0];                                          insted of this 2 line
		String password = passwordArray[1].split("'")[0];
		return password;
		//0th index - rahualshettyacademy
		//1st index - to Login.
		
	}

}
