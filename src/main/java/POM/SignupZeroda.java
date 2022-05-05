package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupZeroda {

	@FindBy (xpath = "//input[@id='user_mobile']") private WebElement number ;
	@FindBy (xpath = "//button[@type='submit']") private WebElement submit;
	//@FindBy (xpath = "") private WebElement ;
	
	public SignupZeroda(WebDriver driver) {
	 PageFactory.initElements(driver, this);	
	}
	public String getTitle(WebDriver driver) {
		return driver.getTitle();	
	}
	public void enternumber (String num) {
		number.sendKeys(num);
	}
	public void clickcontin() {
		submit.click();
	}
}
