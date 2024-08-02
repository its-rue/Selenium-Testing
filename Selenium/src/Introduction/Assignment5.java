package Introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		System.out.println(driver.findElements(By.cssSelector("frameset[frameborder='1']")).size());
		driver.switchTo().frame(driver.findElement(By.name("frame-top")));
		System.out.println(driver.findElements(By.cssSelector("frameset[name='frameset-middle']")).size());
		System.out.println(driver.findElements(By.cssSelector("frame[name='frame-middle']")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("frame[name='frame-middle']")));
		System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		driver.switchTo().defaultContent();

	}

}
