package sub_category_groups;

import org.testng.annotations.Test;

public class SearchPage {

	@Test(priority=1,groups= {"windows.smoke","all"})
	public void testCase_Searchpage(){
		System.out.println("search page-1");
		}
	@Test (priority=2,groups= {"windows.sanity","all"})
	public void testCase_Searchpagetwo(){
		System.out.println("search page-2");
		}
	@Test (priority=3,groups= {"ios.regression","all"})
	public void testCase_SearchpageThree(){
		System.out.println("search page-3");
		}

}
