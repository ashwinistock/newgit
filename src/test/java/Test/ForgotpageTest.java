package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import POM.ForgotPassPage;
import POM.Zerodaloginpage;
import Utility.Excel;
import Utility.Screenshot;
import pojo.Browser;


@Listeners(ListernTest.class)
public class ForgotpageTest extends BaseDriver {

	@BeforeClass
	public void GetReports() {
		
	}
	@BeforeMethod
	public void openUrl() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	@Test 
	// for forgot ID of zeroda
	public void ValidDataForgotID() throws EncryptedDocumentException, IOException {
		Zerodaloginpage loginpage = new Zerodaloginpage(driver);
		loginpage.clickforgotPassword();
		
		ForgotPassPage forgotpass = new ForgotPassPage(driver);
		forgotpass.clickForgotID();
		String pan = Excel.Getop(0, 1, "ForgotZeroda");
		forgotpass.enterPanNO(pan);
		forgotpass.clickonBySMS();
		String number = Excel.Getop(0, 1, "ForgotZeroda");
		forgotpass.enterMobliNO(number);
		forgotpass.clickonReset();

			}
	
	@Test
	public void validDataRemberID() throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodaloginpage loginpage = new Zerodaloginpage(driver);
		loginpage.clickforgotPassword();
		
		ForgotPassPage forgotpass = new ForgotPassPage(driver) ;
		forgotpass.clickonRemberID();
		String user = Excel.Getop(2, 1, "ForgotZeroda");
		forgotpass.enterUserID(user);
		String pin = Excel.Getop(0, 1, "ForgotZero");
		forgotpass.enterPanNO(pin);
		forgotpass.clickEmail();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
//		wait.until(ExpectedConditions.invisibilityOf((WebElement) wait));
		Thread.sleep(3000);
		String mail = Excel.Getop(3, 1, "ForgotZeroda");
		forgotpass.enterMail(mail);
		forgotpass.clickonReset();
	}
	
	}
	
	
	
	
	
	
	
	
	


