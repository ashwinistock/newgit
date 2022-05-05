package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLogin {

@FindBy (xpath ="//input[@id='userid']") private WebElement username;
	
	@FindBy (xpath = "//input[@id='password']") private WebElement password ;
	
	@FindBy (xpath = "//button[@type='submit']") private WebElement login;
	
	@FindBy (xpath = "//input[@id='pin']") private WebElement pin;
	
	@FindBy (xpath = "//button[@type='submit']") private WebElement submit ;
	
	public ZerodhaLogin (WebDriver driver) {// we use constructor
		
		PageFactory.initElements(driver, this);// initElement method help to find element  
	}
	public void enteruserName (String Name) {
		username.sendKeys(Name);
	}
	public void enterPassword(String pass) {
		password.sendKeys( pass);
	}
	public void loginto () {
		login.click();	
	}
	public void enterpin(String pin1) {
		pin.sendKeys(pin1);
	}
	public void entersubmit() {
	submit.click();
	}	
}
