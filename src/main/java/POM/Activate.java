package POM;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Activate {

	WebDriver driver;
	@FindBy (xpath = "//a[@class='button button-blue']")private WebElement activate;
	@FindBy (xpath = "//div[text()='Bank']")private WebElement bank;
	
	 public Activate (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void clickActivate() {
		activate.click();
	
	
	//String mainpage = driver.getWindowHandle();
	//System.out.println(mainpage);
//
//	Set<String> B = driver.getWindowHandles();
//	Iterator<String> A = B.iterator();
//	while(A.hasNext()) {
//		driver.switchTo().window(A.next());
//		String Actual = driver.getTitle();
//		System.out.println(Actual);
//		String Expected = "My account / Console";
//		if(Actual.equals(Expected)) {
//			driver.findElement(By.xpath("//div[text()='Bank']")).click();
			
//		}
//	}
	}
	
	
	
	
	
	
	public void clickbank ()
	{
		ArrayList<String> List = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(List.get(1));
		bank.click();
	}
	
	
	
	
	
	
//	public void clickbank() {
//		driver.switchTo().frame(bank);
//		bank.click();
//	}
//	public void clickbank() {
//		Set <String> ban= driver.getWindowHandles();
//		Iterator <String> B = ban.iterator();
//		driver.switchTo().window(B.next());
//		while(B.hasNext()) {
//			
//				driver.switchTo().window(B.next());
//				String Actual = driver.getTitle();
//				String Expected = "My account / Console";
//				if(Actual.equals(Expected)) {
//					bank.click();
//					System.out.println(Actual);
//				}}}
              }
		
	

