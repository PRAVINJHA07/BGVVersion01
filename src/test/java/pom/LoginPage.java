package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	@FindBy(xpath= "//input[@id='UserName']")
	private WebElement emailInput;

	@FindBy(xpath = "//input[@id='txtPassword']")
	private WebElement passwordInput;

	@FindBy(xpath = "//button[@id='submitButton']")
	private WebElement loginButton;
	
	
	 public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	

	// Page Actions
	    public void enterEmail(String email) {
	        //emailInput.clear();
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        //passwordInput.clear();
	        passwordInput.sendKeys(password);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }


}
