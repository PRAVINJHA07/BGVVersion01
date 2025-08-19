package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import liabraies.BaseClass;
import pom.CreateUserPage;
import pom.LoginPage;
import pom.ManagerUserPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;
import pom.UserDetailsPage;

public class CreateUser extends BaseClass {
	
	
	@Test(priority = 4)
	public void tc4() throws FileNotFoundException, IOException, InterruptedException {
		
		LoginPage l=new LoginPage(driver);
		l.enterEmail(p.getPropertyFile("userName"));
		l.enterPassword(p.getPropertyFile("password"));
		l.clickLogin();	
		Thread.sleep(2000);
		MyProfilePage m=new MyProfilePage(driver);
		m.settingBtn();
		Thread.sleep(2000);
		ManualSettingPage ms=new ManualSettingPage(driver);
		ms.userBtn();
		Thread.sleep(2000);
		
		ManagerUserPage mup=new ManagerUserPage(driver);
		mup.createUser();
		
		CreateUserPage cup=new CreateUserPage(driver);
		cup.userName(p.getPropertyFile("UserName"));
		utilities.dropdown(cup.getGender(), p.getPropertyFile("Gender"));
		cup.dateOfBirth();
		Thread.sleep(5000);
		utilities.calendar(driver, 2025, 2000, "May", "10");
		cup.emailIdtext(p.getPropertyFile("email"));
		cup.alternateEmailId(p.getPropertyFile("altemail"));
		cup.mobileNumber(p.getPropertyFile("mobile"));
		cup.alterNetmobileNumber(p.getPropertyFile("altmob"));
		cup.add1(p.getPropertyFile("add1"));
		cup.add2(p.getPropertyFile("add2"));
		//country
        cup.countryDropdown();
        cup.dropDownSeachText(p.getPropertyFile("Country"));
        utilities.enterThroughActions(driver);
        Thread.sleep(5000);
        //state
        cup.stateDropDown();
        cup.dropDownSeachText(p.getPropertyFile("State"));
        utilities.enterThroughActions(driver);
        Thread.sleep(5000);
        //city
        cup.cityDropDown();
        cup.dropDownSeachText(p.getPropertyFile("City"));
        utilities.enterThroughActions(driver);
        //pincode
		cup.pineCode(p.getPropertyFile("pinCode"));
		Thread.sleep(2000);
		cup.NextBtn();
		Thread.sleep(5000);

		UserDetailsPage udp=new UserDetailsPage(driver);
		udp.roleDropdown();
		udp.dropDownSeachText(p.getPropertyFile("role"));
		//utilities.enterThroughActions(driver);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.ARROW_DOWN).perform();
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		udp.depDropdown();
		udp.dropDownSeachText(p.getPropertyFile("dept"));
		utilities.enterThroughActions(driver);
		Thread.sleep(2000);
		udp.subDeptmentDropdown();
		udp.dropDownSeachText(p.getPropertyFile("subDept"));
		utilities.enterThroughActions(driver);
		Thread.sleep(2000);
		udp.designationDropdown();
		udp.dropDownSeachText(p.getPropertyFile("Designation"));
		utilities.enterThroughActions(driver);
		Thread.sleep(2000);
		udp.passwordText(p.getPropertyFile("Password"));
		Thread.sleep(2000);
		utilities.dropdown(udp.getIsEnabledDropdown(), p.getPropertyFile("isEnable"));
		Thread.sleep(5000);
		udp.createUserBtn();
		Thread.sleep(5000);
		SoftAssert s=new SoftAssert();
		s.assertEquals("Welcome Vishal Sharma | (Admin)", driver.getTitle());
		s.assertAll();
	}

}
