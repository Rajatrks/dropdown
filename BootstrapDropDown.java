package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("menu1")).click();
		
		Thread.sleep(3000);

		List<WebElement> ele = driver.findElements(By.xpath("//a[@role='menuitem']"));

		for (WebElement data : ele) {
			String res1 = data.getAttribute("innerHTML");
			System.out.println(res1);

			if (res1.equalsIgnoreCase("JavaScript")) {
				data.click();
			}

		}
		driver.close();

	}

}
