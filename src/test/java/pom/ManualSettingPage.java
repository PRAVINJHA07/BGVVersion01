package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManualSettingPage {
	public WebDriver driver;
	@FindBy(xpath="//h4[text()='Country']")
	private WebElement countryBtn;
	
	@FindBy(xpath="//h4[text()='State']")
	private WebElement stateBtn;
	
	
	@FindBy(xpath="//h4[text()='City']")
	private WebElement cityBtn;
	
	@FindBy(xpath="//h4[text()='Users']")
	private WebElement userBtn;
	
	
	public ManualSettingPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void countryBtn() {
		countryBtn.click();
	}
	
	public void stateBtn() {
		stateBtn.click();
	}
	
	public void cityBtn() {
		cityBtn.click();
	}
	public void userBtn() {
		userBtn.click();
	}

}
