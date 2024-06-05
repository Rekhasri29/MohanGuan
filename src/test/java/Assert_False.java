import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Assert_False {
	@Test
	public void rest(){
		String s = "Hello";
		org.testng.Assert.assertFalse(s.contains("Mohan"));
	}

}
