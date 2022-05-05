package POM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodaShares {
 
	Actions action;
	
	@FindBy (xpath = "//input[@icon='search']") private WebElement search;
	
	@FindBy (xpath = "//button[@class='button-blue buy']") private WebElement TATASTEEL;
	@FindBy (xpath = "//button[@class='button-blue buy']") private WebElement BuyShare;
	@FindBy (xpath = "/html/body/div[1]/form/section/div/footer/div[2]/button[1]/span") private List<WebElement> Stock;

	
	
	public ZerodaShares(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void TATAsteelshare(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(TATASTEEL));
		action = new Actions(driver);
		action.moveToElement(TATASTEEL);
		action.perform(); //reach to share
	}
	public void SelectStockList(WebDriver driver,String stockname) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(TATASTEEL));
		for(int a=0;a<Stock.size();a++) {
			System.out.println(Stock.size());
			String text = Stock.get(a).getText();
			if(text.equalsIgnoreCase(stockname)) {
			action = new Actions(driver);
			action.moveToElement(Stock.get(a));
			action.perform();
			}
		}
	}
	public void SelectStockList(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000));
		wait.until(ExpectedConditions.visibilityOf(TATASTEEL));
		Actions act = new Actions (driver);
		act.moveToElement(Stock.get(1));
		act.perform();
	}
	public void clickBuy() {
		BuyShare.click();
		
	}
		
		
		
		
		
		
//		public void EnterSearch(String share) {
//		search.sendKeys(share);
//	}
		
//		public ZerodaShares(WebDriver driver) {
//			PageFactory.initElements(driver, this);
//		}
//		public void selectTATAsteel(String share) {
//			TATASTEEL.sendKeys(share);
//		}
//		public void clickBuy() {
//			BuyShare.click();
//		}
//		public void clickStock() {
//			Stock.click();
//		}
		
		
//		for (int a=0;a<Stock.size();a++) {
//			System.out.println(Stock.size());
//			String text = Stock.get(a).getText();
//			if(text.equals(stockname)) {
//				action = new Actions(driver);
//				action.moveToElement(Stock.get(a));
//				action.perform();
			}
			
	
	
	

