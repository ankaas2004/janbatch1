package src.main.java;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngexample {

	
	@Test
	public void testcase()
	{
		System.out.println("I am test cases");
		
	}
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Beforesuite");
	}
	@AfterSuite
	public void Asuite() 
	{
		System.out.println("After suite");
	}
	@BeforeClass
	public void bclass()
	{
		System.out.println("Before class");
	}
	@AfterClass
	public void aclass()
	{
		System.out.println("after class");
	}
	@BeforeTest
	public void btest()
	{
		System.out.println("Before test");
	}
	@AfterTest
	public void atest() 
	{
	System.out.println("After test");	
	}
	
	@BeforeMethod
	public void bmethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void amethod()
	{
		System.out.println("After method");
	}
}
