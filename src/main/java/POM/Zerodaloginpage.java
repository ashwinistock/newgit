package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zerodaloginpage {

	@FindBy (xpath = "//input[@id='userid']") private WebElement username;
	@FindBy (xpath = "//input[@id='password']") private WebElement password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	@FindBy (xpath = "//input[@id='pin']") private WebElement pinNo;
	@FindBy (xpath = "//a[text()='Forgot user ID or password?']")private WebElement forgotpassword;
	//@FindBy (xpath = "//a[text()='Forgot user ID or password?']") private WebElement forgetpassword;
    @FindBy (xpath = "(//a[@target='_blank'])[3]") private WebElement signin;

	public Zerodaloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserName(String name) {
		username.sendKeys(name);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void gotologin() {
		login.click();
	}
	public void enterpin (String pin) {
		pinNo.sendKeys(pin);
	}
	
	public void clickforgotPassword() {
		forgotpassword.click();
	}
	public void clicksignup () {
		signin.click();
	}
}
