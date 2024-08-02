package Introduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCartAdd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "/Users/dshru/OneDrive/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);

		addItems(driver, itemsNeeded);

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException {

		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim(); // trim white spaces
			// format it to get actual vegetable name

			// check whether name you extracted is present in array or not
			// convert array into array list for easy search

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) {

				j++;

				// click on Add To Cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == itemsNeeded.length) {

					break;

				}

			}

		}

		Thread.sleep(5000);
		driver.close();

	}

}
