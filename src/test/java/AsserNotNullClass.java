
import org.testng.Assert;
import org.testng.annotations.Test;
public class AsserNotNullClass {
	@Test
	public void methodOne() {
		String s1= "Mohan";
		String s2="Hello";
		Assert.assertNotNull(s2);
	}
	
	

}
