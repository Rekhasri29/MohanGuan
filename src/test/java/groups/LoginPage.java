package groups;

import org.testng.annotations.Test;

public class LoginPage {
	@Test(priority=1,groups= {"smoke","sanity","all"})
	public void testCase_Loginpage(){
		System.out.println("Login Page-1");
		}
	@Test (priority=2,groups= {"sanity","all"})
	public void testCase_Loginpagetwo(){
		System.out.println("Login Page-2");
		}
	@Test (priority=3,groups= {"regression","all"})
	public void testCase_LoginpageThree(){
		System.out.println("Login Page-3");
		}

}
