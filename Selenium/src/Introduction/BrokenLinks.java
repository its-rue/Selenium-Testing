package Introduction;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Broken URL
		//Step 1 - Is to get all URL tied up to the links using Selenium
		//Java Method will call URL's and get you the status code
		//If the status code >400 then that URL is not working -> link which tied to URL is broken
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] "));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link : links) {
			
			//working link
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			
			a.assertTrue( respCode<400 , "\"The Link with Text\" + link.getText() + \"is Broken with code\" + respCode" );
			
		}
		
		a.assertAll();
		
		//broken link 404
		/*String urls = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");
		HttpURLConnection conn1 = (HttpURLConnection) new URL(urls).openConnection();
		conn1.setRequestMethod("HEAD");
		conn1.connect();
		int respCode1 = conn1.getResponseCode();
		System.out.println(respCode1); */

	}

}
