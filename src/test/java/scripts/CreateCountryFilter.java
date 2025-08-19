package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import liabraies.BaseClass;
import pom.CountryPage;
import pom.LoginPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;

public class CreateCountryFilter  extends BaseClass{
	
	@Test(priority = 1)
	public void tc1() throws FileNotFoundException, IOException, InterruptedException {
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
		
		//dropdown
		utilities.dropdown(cp.getIsEnabledDropdown(), p.getPropertyFile("isEnable"));
		Thread.sleep(2000);
		cp.applyBtn();
		Thread.sleep(5000);
		
		SoftAssert s=new SoftAssert();
		s.assertEquals("Welcome Vishal Sharma | (Admin)", driver.getTitle());
		s.assertAll();
	}
	
}
