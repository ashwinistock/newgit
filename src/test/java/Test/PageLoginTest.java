package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Zerodaloginpage;
import Utility.Excel;
import Utility.Screenshot;
import pojo.Browser;

public class PageLoginTest {

	WebDriver driver;
	String name;
	@BeforeMethod
	public void openUrl() {
	driver = Browser.OpenBrowser("https://kite.zerodha.com/");	
	}	
	
	@Test
	public void withValidData() throws EncryptedDocumentException, IOException {
		Zerodaloginpage zerodapagelogin = new Zerodaloginpage(driver);
		String name = Excel.Getop(0, 1, "zeroda");
		zerodapagelogin.enterUserName(name);
		String password = Excel.Getop(1, 1, "zeroda");
		zerodapagelogin.enterpassword(password);
		zerodapagelogin.gotologin();
		String pin = Excel.Getop(2, 1, "zeroda");
		zerodapagelogin.enterpin(pin);
	}
	public void takeSS() throws IOException {
		Screenshot.takesScreenshot(driver, name);
	}
	
}
