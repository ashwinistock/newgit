package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

public static WebDriver OpenBrowser(String URL) {// this method return the webdriver which is driver
		ChromeOptions options = new ChromeOptions();//class od sselenium
		options.addArguments("--disable-notifications");//To disable notification
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);// option it come from Chrome
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		return driver;
}
}
