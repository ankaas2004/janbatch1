package src.main.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

public class Createnewaccountlinkedin
{

	public void createnewaccrount() throws InterruptedException 
	{
		ChromeDriver page = new ChromeDriver();
		page.get("https://www.linkedin.com");
		Options op = page.manage();
		Window w = op.window();
		w.maximize();
	//----------bylinktext ------
		WebElement createaccount = page.findElement(By.linkText("New to LinkedIn? Join now"));
		createaccount.click();
	///------bycsslocator ----
		WebElement emailorphonenumber = page.findElement(By.cssSelector("input#email-or-phone"));
		emailorphonenumber.sendKeys("ankaas2025@gmail.com");
		//-----by id---
		
		WebElement password = page.findElement(By.id("password"));
		password.sendKeys("Welcome-23");
		//--by button class ---
		WebElement joinbutton= page.findElement(By.xpath("//button[@value ='Agree & Join']"));
		joinbutton.click();
		//---by name---
		WebElement firstname = page.findElement(By.name("first-name"));
		firstname.sendKeys("anjali");
		//----by id---
		WebElement lastname = page.findElement(By.id("last-name"));
		lastname.sendKeys("manaktala");
		//----by button---
		WebElement continuebutton = page.findElement(By.xpath("//button[@value='Continue']"));
		continuebutton.click();
		this.wait(100000);
		WebElement locationElement = page.findElement(By.id("typeahead-input-for-location"));
		locationElement.sendKeys("Delhi, India");
		//by span class
		WebElement nextbutton = page.findElement(By.xpath("//span[@class='artdeco-button__text']"));
		nextbutton.click();
		
		
		
	}
		public static void main(String[] args) throws InterruptedException 
		{
		Createnewaccountlinkedin obj = new Createnewaccountlinkedin();
		obj.createnewaccrount();
		}
}
