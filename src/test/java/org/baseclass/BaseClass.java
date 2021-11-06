package org.baseclass;

import org.libglobal.LibGlobal1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass extends LibGlobal1 {
 public static void main(String[] args) {
	getDriver();
	getUrl("https://adactinhotelapp.com/");
	String currentuUrl = getCurrentuUrl();
	System.out.println(currentuUrl);
	String title = getTitle();
	System.out.println(title);
	WebElement txtUserName = driver.findElement(By.id("username"));
	insertType(txtUserName, "Sravan");
	WebElement txtPass = driver.findElement(By.id("password"));
	insertType(txtPass, "12345");
	WebElement btnLogin = driver.findElement(By.name("login"));
	click(btnLogin);
	closeBrowser();
	}
}