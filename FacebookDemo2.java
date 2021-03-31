package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get(
				"https://www.facebook.com/campaign/landing.php?caent=&creative=355887219764&keyword=facebook%20create%20new%20account&partner_id=googlesem&extra_2=campaignid%3D1653993517%26adgroupid%3D63066386563%26matchtype%3De%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311595197486%26loc_physical_ms%3D20465%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMIh9mr6MXN7wIVRMEWBR0eDgxGEAAYASAAEgIc-_D_BwE");

		driver.manage().window().maximize();

		WebElement dd = driver.findElement(By.id("day"));

		Select date = new Select(dd);

		date.selectByIndex(13);

		WebElement select_date = date.getFirstSelectedOption();

		System.out.println(select_date.getText());

		WebElement mon = driver.findElement(By.id("month"));

		Select month = new Select(mon);

		month.selectByVisibleText("May");

		WebElement select_month = month.getFirstSelectedOption();

		System.out.println(select_month.getText());
		
		WebElement yr = driver.findElement(By.id("year"));

		Select year = new Select(yr);

		year.selectByValue("2016");

		WebElement select_year = year.getFirstSelectedOption();

		System.out.println(select_year.getText());
		
		driver.close();

	}

}
