package basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Example {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Executing Before Suite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Executing Before Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Executing Before Class");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Executing after Suite");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Executing after Test");
	}
	@AfterSuite
	public void afterClass()
	{
		System.out.println("Executing after Class");
	}
	@Test
	public void testCase1()
	{
		System.out.println(" test case1");
	}
	@Test
	public void testCase2()
	{
		System.out.println(" test case 2");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
}
