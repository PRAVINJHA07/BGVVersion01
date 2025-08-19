package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage {
	
	public WebDriver driver;
	@FindBy(xpath="//button[@type='button']//i[@class='bi-sliders']")
	private WebElement filterBtn;
	
	@FindBy(xpath="//input[@id='SearchCountryName']")
	private WebElement countryText;
	
	
	@FindBy(xpath="//input[@id='SearchCountryCode']")
	private WebElement countryCodeText;
	
	@FindBy(xpath="//input[@id='SearchMobileCode']")
	private WebElement countyMobileCode;
	
	
	@FindBy(xpath="//select[@id='IsEnabled2']")
	private WebElement isEnabledDropdown;
	
	@FindBy(xpath="//button[normalize-space()='Apply Filter']")
	private WebElement applyBtn;
	
	public CountryPage(WebDriver driver) {
		this.driver = driver;
        PageFactory.initElements(driver, this);
	}
	
	public void filterBtn() {
		filterBtn.click();
	}
	
	
	public WebElement getIsEnabledDropdown() {
		return isEnabledDropdown;
	}

	public void enterCountryName(String name) {
		countryText.sendKeys(name);
	}
	
	public void enterCountryCode(String code) {
		countryCodeText.sendKeys(code);
	}
	
	public void enterCountryMobileCode(String mobilecode) {
		countyMobileCode.sendKeys(mobilecode);
	}
	
	
	public void applyBtn() {
		applyBtn.click();
	}

}
