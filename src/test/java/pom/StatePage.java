package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StatePage {
	
	public WebDriver driver;
	@FindBy(xpath="//button[@class='btn btn-white btn-sm']//i[@class='bi-sliders']")
	private WebElement filterBtn;
	
	@FindBy(xpath="//input[@id='SearchCountryName']")
	private WebElement countryText;
	
	
	@FindBy(xpath="//input[@id='SearchStateName']")
	private WebElement StateText;
	
	
	
	@FindBy(xpath="//select[@id='SearchIsEnabled']")
	private WebElement isEnabledDropdown;
	
	@FindBy(xpath="//button[normalize-space()='Apply Filter']")
	private WebElement applyBtn;
	
	public StatePage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void filterBtn() {
		filterBtn.click();
	}
	
	
	public void enterCountryName(String name) {
		countryText.sendKeys(name);
	}
	
	public void enterStateName(String text) {
		StateText.sendKeys(text);
	}
	
	
	
	public WebElement getIsEnabledDropdown() {
		return isEnabledDropdown;
	}
	
	
	public void applyBtn() {
		applyBtn.click();
	}

}
