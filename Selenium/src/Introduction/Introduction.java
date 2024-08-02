package Introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {

	public WebDriver driver;
	
	public static void main(String[] args) {
		
		//invoking browser
		//Chrome  - ChromeDriver  ->Methods close
		//Friefox - FirefoxDriver ->Methods close
		//Safari  - SaariDriver   ->Methods close
		//WebDriver close
		//WebDriver methods + class methods
		
		
		//Chromedriver.exe -> Chrome browser Selenium Manager
        System.setProperty("webdriver.chrome.driver","/Users/dshru/OneDrive/Documents/chromedriver.exe");      //middle proxy
        
        //webdriver.chrome.driver -> value of path
        WebDriver driver = new ChromeDriver();
        
        //Firefox Launch (geckodriver)
        //webdriver.gecko.driver                                   //path
        //System.setProperty("webdriver.gecko.driver","/Users/dshru/OneDrive/Documents/gecko.exe");            //middle proxy
        //WebDriver driver = new FirefoxDriver();
        
        //Microsoft Edge
        //webdriver.edge.driver                                   //path
        //System.setProperty("webdriver.edge.driver","/Users/dshru/OneDrive/Documents/edge.exe");              //middle proxy
        //WebDriver driver = new EdgeDriver();
        
        
		driver.get("https://rahulshettyacademy.com/");             //get -> to fetch the url
		System.out.println(driver.getTitle());                     //conformation
		System.out.println(driver.getCurrentUrl());                //shows current url
		driver.close();

	}

}

