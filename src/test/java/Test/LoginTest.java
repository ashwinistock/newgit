package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ZerodhaLogin;
import Utility.Excel;
import Utility.Screenshot;
import pojo.Browser;

public class LoginTest {

	WebDriver driver;
	String name;
	
	@BeforeMethod
	public void loginTes() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void WithvalidData() throws EncryptedDocumentException, IOException {
		ZerodhaLogin zerodalogin = new ZerodhaLogin(driver);
	  String user = Excel.Getop(0, 1, "zeroda");
		zerodalogin.enteruserName(user);
		String pass = Excel.Getop(1, 1, "zeroda");
		zerodalogin.enterPassword(pass);
		zerodalogin.loginto();
		String pin = Excel.Getop(2, 1, "zeroda");
		zerodalogin.enterpin(pin);
		zerodalogin.entersubmit();
		name = "framezerodha";
	}
	@AfterMethod
	public void Takess () throws IOException {
		Screenshot.takesScreenshot(driver, name);
	}
}
