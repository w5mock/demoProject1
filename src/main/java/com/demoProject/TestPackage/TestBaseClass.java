package com.demoProject.TestPackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class TestBaseClass
{

	@Parameters("BrowserName")
	@BeforeMethod
	public void method1(String BrowserName)
	{
		if(BrowserName.equals("chrome"))
		{
		System.out.println("hi");
		}
		else
		{
			System.out.println("bye");
		}
	}
	
}
