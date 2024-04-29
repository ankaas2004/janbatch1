package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Gmail {
	
	public static void main(String[] args) {
		
		//ChromeOptions options = new ChromeOptions(); 
		//options.add_argument = {'user-data-dir':'/Users/Application/Chrome/anjali manaktala'}
		ChromeDriver page = new ChromeDriver();
		page.get("https://www.google.com/gmail/about/");
				Options op = page.manage();
				Window w = op.window();
				w.maximize();
				WebElement SignIn = page.findElement(By.linkText("Sign in"));
				SignIn.click();
				WebElement username = page.findElement(By.cssSelector("input#identifierId"));
				username.sendKeys("ankaas2024@gmail.com");
				WebElement nextbutton = page.findElement(By.xpath("//span[text()='Next']"));
				nextbutton.click();
			}

	}


