package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassPage {
 // for forgot ID
@FindBy (xpath = "(//label[@class='su-radio-label'])[2]") private WebElement clickForgetID;
@FindBy (xpath = "//input[@placeholder='PAN']") private WebElement panNO;
@FindBy (xpath = "(//label[@class='su-radio-label'])[4]") private WebElement BySMS;
@FindBy (xpath = "//input[@placeholder='Mobile number (as on account)']") private WebElement mobileNO;
@FindBy (xpath = "//button[@class='button-orange wide']") private WebElement clickReset;

// for remember User ID
@FindBy (xpath = "(//label[@class='su-radio-label'])[1]") private WebElement clickrememberID;
@FindBy (xpath = "//input[@placeholder='User ID']") private WebElement userID ;
@FindBy (xpath = "//input[@placeholder='PAN']") private WebElement panNo;
@FindBy (xpath = "(//label[@class='su-radio-label'])[3]") private WebElement clickmail;
@FindBy (xpath = "//input[@placeholder='E-mail (as on account)']") private WebElement Email;

	
	public ForgotPassPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//for forgot user ID
	public void clickForgotID () {
		clickForgetID.click();
	}
	public void enterPanNO(String pan) {
		panNO.sendKeys(pan);
	}
	public void clickonBySMS() {
		BySMS.click();
	}
	public void enterMobliNO(String number) {
		mobileNO.sendKeys(number);
	}
	public void clickonReset() {
		clickReset.click();
	}
	 // for remember user iD
	
	public void clickonRemberID () {
		clickrememberID.click();
	}
	public void enterUserID(String user) {
		userID.sendKeys(user);
	}
	public void clickEmail () {
		clickmail.click();
	}
	public void enterMail (String mail) {
		Email.sendKeys(mail);
	}
	
}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

