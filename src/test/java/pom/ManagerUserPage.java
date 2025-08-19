package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerUserPage {
	WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn btn-sm btn-primary']")
	private WebElement createUserBtn;
	
	
	public ManagerUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createUser() {
		createUserBtn.click();
	}

}
