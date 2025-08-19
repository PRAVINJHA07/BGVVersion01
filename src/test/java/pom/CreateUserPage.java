package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage {
	WebDriver driver;

	@FindBy(xpath="//input[@id='FullName']")
	private WebElement userName;

	@FindBy(xpath="//select[@id='Gender']")
	private WebElement gender;


	@FindBy(xpath="//input[@id='DateOfBirth']")
	private WebElement dateOfBirth;


	@FindBy(xpath="//input[@id='EmailId']")
	private WebElement emailId;

	@FindBy(xpath="//input[@id='AlternateEmailId']")
	private WebElement alterNateEmailId;

	@FindBy(xpath="//input[@id='MobileNumber']")
	private WebElement mobileNumber;

	@FindBy(xpath="//input[@id='AlternateMobileNumber']")
	private WebElement alterNateMobileNumber;

	@FindBy(xpath="//input[@id='Address1']")
	private WebElement add1;

	@FindBy(xpath="//input[@id='Address2']")
	private WebElement add2;

	@FindBy(xpath="//span[@id='select2-CountryId-container']")
	private WebElement countryDropdown;

	@FindBy(xpath="//span[@id='select2-StateId-container']")
	private WebElement stateDropDown;

	@FindBy(xpath="//span[@id='select2-CityId-container']")
	private WebElement cityDropDown;

	@FindBy(xpath="//input[@id='PinCode']")
	private WebElement pineCode;

	@FindBy(xpath="(//a[contains(text(),'Next')])[2]")
	private WebElement NextBtn;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	private WebElement dropDownSeachText;
	
	public CreateUserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void userName(String name) {
		userName.sendKeys(name);
	}

	public void dateOfBirth() {
		dateOfBirth.click();
	}

	public void emailIdtext(String email) {
		emailId.sendKeys(email);
	}

	public void alternateEmailId(String atEmail) {
		alterNateEmailId.sendKeys(atEmail);
	}
	public void mobileNumber(String no) {
		mobileNumber.sendKeys(no);
	}

	public void alterNetmobileNumber(String no) {
		alterNateMobileNumber.sendKeys(no);
	}

	public void add1(String no) {
		add1.sendKeys(no);
	}


	public void add2(String no) {
        add2.sendKeys(no);
	}

	public void countryDropdown() {
		countryDropdown.click();
	}
	
	public void stateDropDown() {
		stateDropDown.click();
	}
	
	public void cityDropDown() {
		cityDropDown.click();
	}
	
	public void pineCode(String code) {
		
		pineCode.sendKeys(code);

	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	public WebElement getCityDropDown() {
		return cityDropDown;
	}
	 public void dropDownSeachText(String name) {
		 dropDownSeachText.sendKeys(name);
	 }
	
	public void NextBtn() {
		NextBtn.click();
	}
}
