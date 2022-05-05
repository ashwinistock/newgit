package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.BUY;
import POM.ZerodhaLogin;
import Utility.Excel;
import pojo.Browser;

public class BUYtest {

	WebDriver driver;
	
	@BeforeMethod
	public void openUrl() throws EncryptedDocumentException, IOException {
	driver = Browser.OpenBrowser("https://kite.zerodha.com/");
		
	ZerodhaLogin zerodalogin = new ZerodhaLogin(driver);
	  String user = Excel.Getop(0, 1, "zeroda");
		zerodalogin.enteruserName(user);
		String pass = Excel.Getop(1, 1, "zeroda");
		zerodalogin.enterPassword(pass);
		zerodalogin.loginto();
		String pin = Excel.Getop(2, 1, "zeroda");
		zerodalogin.enterpin(pin);
		zerodalogin.entersubmit();
	}
	@Test
	public void validData() throws EncryptedDocumentException, IOException, InterruptedException {
		
			
			BUY buy = new BUY(driver) ;
			Thread.sleep(3000);
			
			buy.clickONShare(driver);
			//buy.shareName();
			buy.clickONBuy();
			buy.clickOnStock();
				
			}
	}

