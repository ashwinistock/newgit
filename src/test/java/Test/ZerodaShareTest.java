package Test;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.ZerodaShares;
import POM.ZerodhaLogin;
import Utility.Excel;
import pojo.Browser;

@Listeners(ListernTest.class)
public class ZerodaShareTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openURl() throws EncryptedDocumentException, IOException {
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
	public void valiData() throws EncryptedDocumentException, IOException, InterruptedException {
		
			
			ZerodaShares share = new ZerodaShares(driver);
			share.SelectStockList(driver,"TATASTEEL");
			share.clickBuy();
			
			
			
			
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
//			wait.until(ExpectedConditions.visibilityOf(TATASTEEL));
//			Thread.sleep(6000);
//			share.selectTATAsteel("TATASTEEL");
//			share.clickBuy();
//			share.clickStock();
//	}
	}}
