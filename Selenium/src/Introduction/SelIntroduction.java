package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//Chrome - ChromeDriver Extention -> Method close get
		//Firefox - Firefox -> Method close get
		//Safari SaariDriver -> Method close get
		//WebDriver close get
		//WebDriver Methods + Class Method
		
		//Chrome
		
		//SeleniumManager
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(5000);
		driver.close();

	}

}
