package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Linkedin {
	public void loginpage() {
	ChromeDriver page = new ChromeDriver();
	page.get("https://www.linkedin.com");
	Options op = page.manage();
	Window w = op.window();
	w.maximize();
	WebElement username1= page.findElement(By.xpath("//input[@autocomplete='username']"));
	username1.sendKeys("ankaas2004@gmail.com");
	WebElement password = page.findElement(By.xpath("//input[@name='session_password']"));
	password.sendKeys("xxxx");
	WebElement signin =page.findElement(By.xpath("//button[@data-tracking-control-name='homepage-basic_sign-in-submit-btn']"));
	signin.click();
	
	}
	public static void main(String[] args) 
	{
		Linkedin obj = new Linkedin();
		obj.loginpage();
	}
}
