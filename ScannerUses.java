package java_Program;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScannerUses {
	static WebDriver driver;

	protected static void calCustom(String Exp_month, String Exp_year, String Exp_day) throws Throwable {
		/*
		 * String Exp_month = "March"; String Exp_year = "2025";
		 * 
		 * String Exp_day = "11";
		 */

		// driver.findElement(By.xpath("//span[@class='ng-tns-c58-10
		// ui-calendar']")).click();

		while (true) {
			String Act_month = driver
					.findElement(By.xpath("//span[@class='ui-datepicker-month ng-tns-c58-10 ng-star-inserted']"))
					.getText();
			String Act_year = driver
					.findElement(By.xpath("//span[@class='ui-datepicker-year ng-tns-c58-10 ng-star-inserted']"))
					.getText();

			if (Act_month.equals(Exp_month) && Act_year.equals(Exp_year)) {

				List<WebElement> daylist = driver.findElements(By.xpath("//table/tbody/tr/td"));

				for (WebElement e : daylist) {
					String calanderDay = e.getText();
					if (calanderDay.equals(Exp_day)) {
						Thread.sleep(3000);
						e.click();
						break;

					}
				}
				break;
			}

			else {
				driver.findElement(
						By.xpath("//span[@class='ui-datepicker-next-icon pi pi-chevron-right ng-tns-c58-10']")).click();

			}

		}

	}

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.irctc.co.in/nget/");

		WebElement from = driver.findElement(By.xpath("//span[@class='ng-tns-c58-10 ui-calendar']"));
		from.click();
		calCustom("March", "2025", "10");

		driver.quit();
       
		
	}
}
