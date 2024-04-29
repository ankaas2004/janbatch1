package src.main.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBaccountCreation {
	
	public void fbaccountcreation() throws InterruptedException 
	{
	ChromeDriver page = new ChromeDriver();
	page.get("https://www.facebook.com/");
	Options op=page.manage();
	Window w =op.window();
	w.maximize();
	
	WebElement createnewaccount = page.findElement(By.linkText("Create new account"));
	createnewaccount.click();
	
	//WebElement firstname = page.findElement(By.cssSelector("input#u_3_b_QM"));
	
	page.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//---Radio button
	
	WebElement firstname = page.findElement(By.name("firstname"));
	firstname.sendKeys("anjali");
	
	WebElement lastname = page.findElement(By.xpath("//input[@name='lastname']"));
	lastname.sendKeys("manaktala");
	
	WebElement email = page.findElement(By.name("reg_email__"));
	email.sendKeys("ankaas2024@gmail.com");
	page.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	WebElement confirmemail = page.findElement(By.name("reg_email_confirmation__"));
	confirmemail.sendKeys("ankaas2024@gmail.com");
	
	WebElement password = page.findElement(By.id("password_step_input"));
	password.sendKeys("xxxxxx");
	
	WebElement birthday = page.findElement(By.name("birthday_day"));
	Select day = new Select(birthday);
	day.selectByValue("23");
	
	WebElement birthmonth = page.findElement(By.name("birthday_month"));
	Select month= new Select(birthmonth);
	month.selectByValue("5");
	
	WebElement birthyear = page.findElement(By.name("birthday_year"));
	Select year = new Select(birthyear);
	year.selectByValue("1985");
	
	
	WebElement genderradiobutton = page.findElement(By.xpath("//input[@type='radio' and @value='1']"));
	genderradiobutton.click();

	WebElement signupbutton = page.findElement(By.name("websubmit"));
	signupbutton.click();
	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	FBaccountCreation obj = new FBaccountCreation();
	obj.fbaccountcreation();
		
	}

}
