package org.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class LibGlobal {
	public static WebDriver driver;//static variable
	 public static WebDriver getdriver() {
		 //to configure the browser
		 System.setProperty("webdriver.chromedriver", "C:\\Users\\luvsblue muthu\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		return driver;

	}
	 public static void launchBrowser(String url) {
		 driver.get(url);
		 
		}
	public  static WebElement xpath(String xpathvalue) {
		
		WebElement element = driver.findElement(By.xpath(xpathvalue));
		return element;
		}
	public static void textsender(WebElement refName,String values) {
     refName.sendKeys(values);
	}
	public static void buttonClick(WebElement refName) {
      refName.click();
	}

	}
		
	
       
	



