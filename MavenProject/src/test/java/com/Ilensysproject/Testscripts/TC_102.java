package com.Ilensysproject.Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_102 {

	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
        //ChromeDriver driver = new ChromeDriver();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//FirefoxDriver driver = new FirefoxDriver();
        WebDriverManager.edgedriver().setup();
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://test.salesforce.com/");
	
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("uttam@trescent-uat.com");;
		driver.findElement(By.id("password")).sendKeys("Trescent@123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		System.out.println("test");
		driver.close();
}
}