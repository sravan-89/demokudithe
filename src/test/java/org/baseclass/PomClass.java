package org.baseclass;

import org.libglobal.LibGlobal1;

import com.Pojoclass.PojoClassEx;

public class PomClass extends LibGlobal1 {
public static void main(String[] args) throws InterruptedException {
	getDriver();
	getUrl("https://adactinhotelapp.com/");
	String currentuUrl = getCurrentuUrl();
	System.out.println(currentuUrl);
	String title = getTitle();
	System.out.println(title);
	insertType(new PojoClassEx().getTxtUserName(), "Sravvan");
	insertType(new PojoClassEx().getTxtPass(), "12345");
	click(new PojoClassEx().getBtnLogin());
	Thread.sleep(2000);
	//closeBrowser();
}
}

