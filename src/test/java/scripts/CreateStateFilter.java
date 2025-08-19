package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import liabraies.BaseClass;
import pom.LoginPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;
import pom.StatePage;

public class CreateStateFilter  extends BaseClass{
	
	
	@Test(priority = 2)
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
		ms.stateBtn();
		Thread.sleep(2000);
		
		StatePage sp=new StatePage(driver);
		sp.filterBtn();
		sp.enterCountryName(p.getPropertyFile("countryName"));
		sp.enterStateName(p.getPropertyFile("StateName"));
		utilities.dropdown(sp.getIsEnabledDropdown(), p.getPropertyFile("isEnable"));
		Thread.sleep(2000);
		sp.applyBtn();
		Thread.sleep(2000);
		SoftAssert s=new SoftAssert();
		s.assertEquals("Welcome Vishal Sharma | (Admin)", driver.getTitle());
		s.assertAll();
		
	}
	
	

}
