package groups;

import org.testng.annotations.Test;

public class SearchPage {
	
	@Test(priority=1,groups= {"smoke","all"})
	public void testCase_Searchpage(){
		System.out.println("search page-1");
		}
	@Test (priority=2,groups= {"sanity","all"})
	public void testCase_Searchpagetwo(){
		System.out.println("search page-2");
		}
	@Test (priority=3,groups= {"regression","all"})
	public void testCase_SearchpageThree(){
		System.out.println("search page-3");
		}

}
