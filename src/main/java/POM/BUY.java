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

public class BUY {

	WebDriver driver;
	//@FindBy (xpath = "(//span[@class='nice-name'])") private List <WebElement> Share;
	
	@FindBy(xpath="//span[@class=\"symbol\"]")private List<WebElement> ChooseShare;
	@FindBy (xpath = "//span[text()='TATAMOTORS']") private WebElement TATAMOTORS;
	@FindBy (xpath = "//button[@class='button-blue buy']") private WebElement clickBuy;
	@FindBy (xpath ="/html/body/div[1]/form/section/div/footer/div[2]/button[1]/span") private WebElement ClickStock;


	public BUY (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void shareName() 
	{
		TATAMOTORS.click();
			
		}
	public void clickONShare(WebDriver driver) 
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(3000));
	wait.until(ExpectedConditions.visibilityOfAllElements(ChooseShare));
	Actions act=new Actions(driver);
	for(int a=1;a<ChooseShare.size();a++)
	act.moveToElement(ChooseShare.get(6));
	act.perform();
	}
 
	public void clickONBuy()
	{
		clickBuy.click();
	}
	public void clickOnStock() 
	{
		 ClickStock.click();
	}
	

	
	
	
	
	
	
//	{
//			WebDriverWait wait = new WebDriverWait(driver,Duration.ofMillis(3000) );
//			wait.until(ExpectedConditions.visibilityOf((WebElement) Share));
//			for(int a=1;a<Share.size();a++) {
//				Actions act = new Actions(driver);
//				act.moveToElement(Share.get(a));
//				act.perform();
//			}
			
	
}
