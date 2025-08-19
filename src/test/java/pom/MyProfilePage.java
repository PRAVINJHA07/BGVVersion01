package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	public WebDriver driver;
	
	@FindBy(xpath="//span[normalize-space()='Settings']")
	private WebElement settingBtn;
	
	
	public MyProfilePage(WebDriver driver) {
		 this.driver = driver;
	        PageFactory.initElements(driver, this);
	}
	
	public void settingBtn() {
		settingBtn.click();
	}
	
	

}
