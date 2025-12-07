package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import liabraies.BaseClass;
import pom.CountryPage;
import pom.LoginPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;

public class EditCountry extends BaseClass{

	
	@Test
	
	public void editCountry() {
		
		try {
		LoginPage l=new LoginPage(driver);
		l.enterEmail(p.getPropertyFile("userName"));
		l.enterPassword(p.getPropertyFile("password"));
		l.clickLogin();	
		Thread.sleep(2000);
		MyProfilePage m=new MyProfilePage(driver);
		m.settingBtn();
		Thread.sleep(2000);
		ManualSettingPage ms=new ManualSettingPage(driver);
		ms.countryBtn();
		Thread.sleep(2000);
		CountryPage cp=new CountryPage(driver);
		cp.filterBtn();
		cp.enterCountryName(p.getPropertyFile("countryName"));
		cp.enterCountryCode(p.getPropertyFile("countryCode"));
		cp.enterCountryMobileCode(p.getPropertyFile("countryMobileCode"));
		utilities.dropdown(cp.getIsEnabledDropdown(), p.getPropertyFile("isEnable"));
		Thread.sleep(2000);
		cp.applyBtn();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//i[@title=\"Edit\"])[1]")).click();
		
		WebElement countryele=driver.findElement(By.xpath("//input[@id='CountryName']"));
		countryele.clear();
		countryele.sendKeys(p.getPropertyFile("countryName"));
		
		WebElement countrycodeele=driver.findElement(By.xpath("//input[@id='CountryCode']"));
		countrycodeele.clear();
		countrycodeele.sendKeys(p.getPropertyFile("countryCode"));
		
		WebElement countrymobilecodeele=driver.findElement(By.xpath("//input[@id='CountryMobileCode']"));
		countrymobilecodeele.clear();
		countrymobilecodeele.sendKeys(p.getPropertyFile("countryMobileCode"));
		

		WebElement updateCountryBtn=driver.findElement(By.xpath("//button[@id='btncountry']"));
		updateCountryBtn.click();
		
		String upadteText=driver.findElement(By.xpath("//div[text()='Success ! Country Update successfully!']")).getText();
		
		Assert.assertEquals(upadteText, "Success ! Country Update successfully");
		
		Thread.sleep(5000);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
