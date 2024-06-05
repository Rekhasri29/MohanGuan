import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
	@Test
	public void MethodFour() {
		String s2 =null;
		Assert.assertNull(s2);
		
	}

}
