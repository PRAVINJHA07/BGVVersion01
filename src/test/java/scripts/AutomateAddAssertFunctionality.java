package scripts;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateAddAssertFunctionality{

	public static void main(String[] args) throws InterruptedException {

		//Disable the popup
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);
		prefs.put("profile.password_manager_leak_detection", false);
		options.setExperimentalOption("prefs", prefs);
		options.addArguments("--start-maximized");
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*"); 

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://cabtalk.gxinetworks.in/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tester@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@123");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement assetsDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Assets')]")));
		assetsDiv.click();
		Thread.sleep(3000);



		WebElement addAssetButton = wait.until(
				ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Add Asset']")));
		addAssetButton.click();
		Thread.sleep(1000);
		
 
		driver.findElement(By.xpath("//select[@name=\"driverId\"]")).click();
		Thread.sleep(1000);
		
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//input[@placeholder='Capacity']")).sendKeys("4");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[text()='Add Asset'])[2]")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
