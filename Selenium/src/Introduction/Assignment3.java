package Introduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Wait<WebDriver> w = new WebDriverWait(driver, Duration.ofSeconds(5));

		String[] mobiles = { "iphone", "Samsung", "Nokia", "Blackberry" };

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > form:nth-child(1) > div:nth-child(4) > div:nth-child(1) > label:nth-child(2) > span:nth-child(3)"))
				.click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		driver.findElement(By.cssSelector("select.form-control")).click();
		driver.findElement(By.xpath("//option[text()='Consultant']")).click();
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		addItems(driver, mobiles);
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	}

	public static void addItems(WebDriver driver, String[] mobiles) throws InterruptedException {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("img.card-img-top"));


		for (int i = 0; i < 4; i++) {

			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		
				if (j == mobiles.length) {

					break;

				}

		}

	
	}
}
