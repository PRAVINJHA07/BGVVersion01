package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import liabraies.BaseClass;
import pom.CityPage;
import pom.LoginPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;

public class CreateCityFilter extends BaseClass {
	
	@Test(priority = 3)
	public void tc2() throws FileNotFoundException, IOException, InterruptedException {
		LoginPage l=new LoginPage(driver);
		l.enterEmail(p.getPropertyFile("userName"));
		l.enterPassword(p.getPropertyFile("password"));
		l.clickLogin();	
		Thread.sleep(2000);
		MyProfilePage m=new MyProfilePage(driver);
		m.settingBtn();
		Thread.sleep(2000);
		ManualSettingPage ms=new ManualSettingPage(driver);
		ms.cityBtn();
		Thread.sleep(2000);
		
		CityPage cp=new CityPage(driver);
		cp.filterBtn();
		cp.enterCountryName(p.getPropertyFile("countryName"));
		cp.enterStateName(p.getPropertyFile("StateName"));
		cp.enterCityName(p.getPropertyFile("cityName"));
		utilities.dropdown(cp.getIsEnabledDropdown(), p.getPropertyFile("isEnable"));
		Thread.sleep(2000);
		cp.applyBtn();
		Thread.sleep(2000);
		SoftAssert s=new SoftAssert();
		s.assertEquals("Welcome Vishal Sharma | (Admin)", driver.getTitle());
		s.assertAll();
	}

}
