package java_Program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.easemytrip.com/");
		WebElement cabs = driver.findElement(By.xpath("//span[normalize-space()='Cabs']"));
		cabs.isDisplayed();
		cabs.click();
		driver.findElement(By.id("airport")).click();

		driver.findElement(By.id("pickup")).click();

		WebElement from = driver.findElement(By.xpath("//div[@id='hrlysrc']"));

		from.click();

		driver.findElement(By.xpath("//input[@id='a_FromSector_show']")).sendKeys("Delhi");

		driver.findElement(By.xpath(
				"//div[@id='citiesForAirprtPickup']//div[@class='auto_sugg_tttl_nw'][normalize-space()='Indira Gandhi International Airport, Terminal 3']"))
				.click();

		
		
	}

}
