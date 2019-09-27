package com.Pzz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\CommonJarFiles\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://wwww.facebook.com");
	}

}
