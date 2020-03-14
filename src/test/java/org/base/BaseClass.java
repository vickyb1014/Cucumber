package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
public static WebDriver driver;
public void launchBrowser(){
System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\eclipse-workspace\\CucumberProject\\Drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/");
}
}

