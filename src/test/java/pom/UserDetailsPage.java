package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsPage {
	WebDriver driver;
	
	@FindBy(xpath="//span[@id='select2-RoleId-container']")
	private WebElement roleDropdown;
	
	@FindBy(xpath="//span[@id='select2-DepartmentId-container']")
	private WebElement depDropdown;
	
	@FindBy(xpath="//span[@id='select2-subDepartment-container']")
	private WebElement subDeptmentDropdown;
	
	@FindBy(xpath="//span[@id='select2-DesignationId-container']")
	private WebElement designationDropdown;
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement passwordText;
	
	@FindBy(xpath="//select[@id='IsEnabled']")
	private WebElement isEnabledDropdown;
	
	public WebElement getIsEnabledDropdown() {
		return isEnabledDropdown;
	}

	@FindBy(xpath="//button[@id='editUser']")
	private WebElement createUserBtn;
	
	@FindBy(xpath="//input[@class=\"select2-search__field\"]")
	private WebElement dropDownSeachText;
	
	public UserDetailsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void roleDropdown() {
		roleDropdown.click();
	}
	
	public void depDropdown() {
		depDropdown.click();
	}
	
	public void subDeptmentDropdown() {
		subDeptmentDropdown.click();
	}
	
	public void designationDropdown() {
		designationDropdown.click();
	}
	public void passwordText(String pwd) {
		passwordText.sendKeys(pwd);
	}
	public void createUserBtn() {
		createUserBtn.click();
	}
	public void dropDownSeachText(String name) {
		 dropDownSeachText.sendKeys(name);
	 }

}
