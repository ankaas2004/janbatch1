package src.main.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarteaccountcreation {
	
	
	@SuppressWarnings("deprecation")
	public void tarteaccountcreate() throws InterruptedException {
		
		ChromeDriver page = new ChromeDriver();
		page.get("https://tartecosmetics.com/");
		Options op = page.manage();
		Window w =op.window();
		w.maximize();
		
		page.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement cookies = page.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		cookies.click();
		
		page.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement bxclosebutton = page.findElement(By.xpath("//button[@aria-label='no thanks; close the dialog']"));
		bxclosebutton.click();
		
		WebElement loiginicon = page.findElement(By.xpath("//a[@class='svg-account-icon onclick-add-spinner']"));
		loiginicon.click();
		
		WebElement createaccounttab	= page.findElement(By.id("register-tab"));
		createaccounttab.click();
		//---- Loginpage----
		WebElement firstname =page.findElement(By.xpath("//input[@name='dwfrm_profile_customer_firstname']"));
		firstname.sendKeys("anjali");
		WebElement lastname =page.findElement(By.xpath("//input[@name='dwfrm_profile_customer_lastname']"));
		lastname.sendKeys("manaktala");
		
		//--- DOB--
		WebElement birthmonth = page.findElement(By.id("birthmonth"));
		Select monthdropdown = new Select(birthmonth);
		monthdropdown.selectByValue("5");
		WebElement birthday= page.findElement(By.xpath("//select[@name='dwfrm_profile_customer_customerbirthday']"));
		Select daydropdown = new Select(birthday);
		daydropdown.selectByValue("23");
		WebElement birthyear= page.findElement(By.xpath("//select[@name='dwfrm_profile_customer_year']"));
		Select yeardropdown = new Select(birthyear);
		yeardropdown.selectByValue("1985");
		
		//---Phone number
		WebElement phonenumber = page.findElement(By.id("registration-form-phone"));
		phonenumber.sendKeys("9123452345");
		//--- Email
		WebElement email = page.findElement(By.id("registration-form-email"));
		email.sendKeys("anjali.tarte+1@gmail.com");
		WebElement confirmemail = page.findElement(By.id("registration-form-email-confirm"));
		confirmemail.sendKeys("anjali.tarte+1@gmail.com");
		
		//--password
		WebElement password = page.findElement(By.id("registration-form-password"));
		password.sendKeys("Welcome-23");
		WebElement confirmpassword = page.findElement(By.id("registration-form-password-confirm"));
		confirmpassword.sendKeys("Welcome-23");
		//---Create account
		WebElement createaccountbutton = page.findElement(By.xpath("//button[@data-eventname='sign_up']"));
		createaccountbutton.click();
		
	}

	public static void main(String[] args) throws InterruptedException {
		Tarteaccountcreation obj = new Tarteaccountcreation();
		obj.tarteaccountcreate();
		
	}
}
