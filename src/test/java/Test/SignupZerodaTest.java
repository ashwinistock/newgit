package Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.SignupZeroda;
import POM.Zerodaloginpage;
import Utility.Excel;
import pojo.Browser;

public class SignupZerodaTest {

	WebDriver driver;
	
	@BeforeMethod
	public void openUrl() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com/");
	}
	@Test
	public void validData() throws EncryptedDocumentException, IOException, InterruptedException {
		Zerodaloginpage signpage = new Zerodaloginpage(driver);
		signpage.clicksignup();
			ArrayList <String> list = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(list.get(1));
			
	SignupZeroda signup = new  SignupZeroda(driver);
//	String actual = signup.getTitle(driver);
//	String expected = "Signup and open a Zerodha trading and demat account online and start investing – Zerodha";
	//Assert.assertEquals(actual, expected);
	//signup.enternumber("9045867894");
	String number = Excel.Getop(0, 1, "signupzeroda");
	signup.enternumber( number);
	signup.clickcontin();
	}
			
		}
	
	
// By using getWindowHandles method not sucess.
//	Set <String> forNum = driver.getWindowHandles();
//	Iterator <String> A = forNum.iterator();
//	while (A.hasNext()) {
//		driver.switchTo().window(A.next());
//		 String number = Excel.Getop(0, 1, "signupzeroda");
//			signup.enternumber(number);
//			signup.entersumit();
