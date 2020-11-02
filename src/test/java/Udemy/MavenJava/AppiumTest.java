package Udemy.MavenJava;

import org.testng.annotations.Test;

public class AppiumTest {
	
	@Test
	public void AndroidApps()
	{
		System.out.println("Android Launched Successfully");
	}
	
	@Test
	public void iOSApps()
	{
		System.out.println("MAC Launched Successfully");
		System.out.println("Safari Launched Successfully");
		System.out.println("iMesssage Launched Successfully");
		System.out.println("Calc Launched Successfully");
		
	}

	@Test
	public void WindowsApps()
	{
		System.out.println("Windows Launched Successfully");
		System.out.println("Command Prompt Launched Successfully");
	}
}
