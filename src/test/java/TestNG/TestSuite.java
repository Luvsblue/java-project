package TestNG;

import org.testng.annotations.Test;

public class TestSuite {
	@Test(priority=1)
private void google() {
	// TODO Auto-generated method stub
System.out.println("google");
}
	@Test(priority=0)
private void youtube() {
	// TODO Auto-generated method stub
System.out.println("yt");
}
}
