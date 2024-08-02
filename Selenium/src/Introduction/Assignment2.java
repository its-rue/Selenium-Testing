package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
								
		driver.get("https://rahulshettyacademy.com/angularpractice/");                 //url
		driver.findElement(By.name("name")).sendKeys("Rahul Shetty");                  //name
		driver.findElement(By.name("email")).sendKeys("rahulshetty@email.com");        //email
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("shettyacademy");  //password
		driver.findElement(By.id("exampleCheck1")).click();                            //checkbox
		driver.findElement(By.id("exampleFormControlSelect1")).click();                //gender dropdown box
		driver.findElement(By.xpath("//select/option[text()='Male']")).click();
		WebElement radiobtn = driver.findElement(By.id("inlineRadio1"));               //radio button
		radiobtn.click();
		driver.findElement(By.name("bday")).sendKeys("05/11/1980");                    //date of birth
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[class='alert alert-success alert-dismissible'] strong")).getText());
		
		System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
		
		Thread.sleep(2000);
		driver.close();        

	}

}
