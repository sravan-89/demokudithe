package org.libglobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal1 {
  public static WebDriver driver ;
	public static void getDriver() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\star electronics\\eclipse-workspace\\Perfect\\drivers\\chromedriver.exe");
    driver =  new ChromeDriver();
    driver.manage().window().maximize();
    
}
	
	public static void getUrl(String url) {
           driver.get(url);
	}
	public static String getTitle() {
		String title = driver.getTitle();
		return title;
}
	public static String getCurrentuUrl() {
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
}
	public static  void closeBrowser() {
        driver.close();
	}
	public static void quitBrowser() {
         driver.quit();
	}
	public static  void click(WebElement ele) {
       ele.click();
	}
	public static void insertType(WebElement ele, String value) {
        ele.sendKeys(value);
	}
}
