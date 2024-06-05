import org.testng.Assert;
import org.testng.annotations.Test;

public class assertions {
	
	@Test
	public void sampleMethod() {
		String s1= "Mohan";
		String s2="Mohang";
		Assert.assertEquals(s1, s2);

	}

}
