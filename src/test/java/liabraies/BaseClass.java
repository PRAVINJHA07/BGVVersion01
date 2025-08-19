package liabraies;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
	public FileUtilies p=new FileUtilies();
	public WebDriverutilites utilities=new WebDriverutilites();
	
	
	@Parameters("browser")
    @BeforeMethod
    public void openApp(String browser) throws IOException {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        driver.get(p.getPropertyFile("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
	
	@AfterMethod
	public void closeApp(ITestResult res) throws IOException {
		int result = res.getStatus();
		if(result==ITestResult.FAILURE) {
		
		String name = res.getName();
		if(result==2) {
			Photo p=new Photo();
			p.screenshot(driver, name);
		}
		
		
	}
		driver.quit();
}
	
	}