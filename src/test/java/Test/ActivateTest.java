package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.Activate;
import POM.ZerodhaLogin;
import Utility.Excel;
import Utility.ExtendReport;
import Utility.Screenshot;
import pojo.Browser;
@Listeners(ListernTest.class)
public class ActivateTest extends BaseDriver {
	ExtentReports reports;
	ExtentTest test;

	@BeforeClass
	public void setReport() {
		reports = ExtendReport.addReport();
	}
	
	@BeforeMethod
	public void openurl() throws EncryptedDocumentException, IOException {
		
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
		test = reports.createTest("login page");
		ZerodhaLogin login = new ZerodhaLogin(driver);
		String user = Excel.Getop(0, 1, "zeroda");
		login.enteruserName(user);
		String pass = Excel.Getop(1, 1, "zeroda");
		login.enterPassword(pass);
		login.loginto();
		String pin = Excel.Getop(2, 1, "zeroda");
		login.enterpin(pin);
		login.entersubmit();
	}
	@Test
	public void clickActive() {
		test = reports.createTest("gotoClick onActive");
		Activate actv = new Activate(driver);
		actv.clickActivate();
		
		actv.clickbank();
	}
	@AfterMethod
	public void catchResult(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
		}
		else if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getTestName());
		}
		else {
			test.log(Status.FAIL, result.getName());
		}
	}
	@AfterClass
	public void flushresult() {
		reports.flush();
	}
	
}
