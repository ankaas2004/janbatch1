package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Gmail1 {
	
	public static void main(String[] args) 
	{
		//ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		SafariDriver sd = new SafariDriver();
		sd.get("https://www.google.com/gmail/about/");
		//ChromeDriver page = new ChromeDriver(options);
		//page.get("https://www.google.com/gmail/about/");
		Options op = sd.manage();
		Window w = op.window();
		w.maximize();
		WebElement SignIn = sd.findElement(By.linkText("Sign in"));
		SignIn.click();
		WebElement username = sd.findElement(By.cssSelector("input#identifierId"));
		username.sendKeys("anjali.liyo");
		WebElement nextbutton = sd.findElement(By.xpath("//span[text()='Next']"));
		nextbutton.click();
	}

}
