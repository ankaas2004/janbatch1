package org.testing.TestScripts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.interactions.Actions;

@Test
public class TC1 {
	
	ChromeDriver page = new ChromeDriver();
	
	@BeforeMethod
	public void launch()
	{
		page.get("https://www.amazon.in/");
		Options op=page.manage();
		Window w=op.window();
		w.maximize();
		
	}
	public void login() throws InterruptedException
	{
		WebElement accountlists = page.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		accountlists.click();
		//WebElement signin = page.findElement(By.xpath("//a[@class='nav-action-signin-button' and @data-nav-role='signin']"));
		//signin.click();
		//page.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement email = page.findElement(By.name("email"));
		email.sendKeys("ankaas2024@gmail.com");
		WebElement continuebutton = page.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
		WebElement password = page.findElement(By.name("password"));
		password.sendKeys("Welcome-23");
		WebElement signbutton=page.findElement(By.id("signInSubmit"));
		signbutton.click();
		page.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement bestsellernav = page.findElement(By.xpath("//a[text()='Best Sellers' and @href='/gp/bestsellers/?ref_=nav_cs_bestsellers']"));
		bestsellernav.click();
		Actions action = new Actions(page);
		action.moveToElement(accountlists).perform();
		page.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement signout = page.findElement(By.xpath("//a[text()='Sign Out' and @class='nav-link nav-item']"));
		signout.click();
		
	}
	
	//@after

}
