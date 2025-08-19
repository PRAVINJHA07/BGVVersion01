package scripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import liabraies.BaseClass;
import pom.LoginPage;
import pom.ManagerUserPage;
import pom.ManualSettingPage;
import pom.MyProfilePage;

public class DOB  extends BaseClass{

	@Test
	public void cal() throws FileNotFoundException, IOException, InterruptedException {

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
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='DateOfBirth']")).click();

		Thread.sleep(2000);
		int currentyear=2025;
		int dateofBirth=2000;
		int year=currentyear-dateofBirth;

		String month="May";
		String day="1";

		for(int i=year;i>0;i--) {

			driver.findElement(By.xpath("//span[@class=\"arrowDown\"]")).click();
		}
		Thread.sleep(2000);

		Select s=new Select(driver.findElement(By.xpath("//select[@class='flatpickr-monthDropdown-months']")));
		s.selectByVisibleText(month);

		Thread.sleep(2000);


		List<WebElement> allDates =driver.findElements(By.xpath("//div[@class='dayContainer']//span"));
		for(WebElement date:allDates) { 
			if(date.getText().equals(day)) {
			date.click(); 
			break; }

		}

		Thread.sleep(5000);
	}
}
