package testng_fox;

import org.testng.annotations.Test;

public class ClassC {
	
	@Test
	public void methodC1() {
		System.out.println("This is method C1");
	}
	
	@Test
	public void methodC2() {
		System.out.println("This is method C2");
	}
	
	@Test
	public void methodC3() {
		System.out.println("This is method C3");
	}
	
	@Test(priority=-2)
	public void methodC4() {
		System.out.println("This is method C4");
	}

}
