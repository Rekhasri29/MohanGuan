package fox;

import java.util.Date;

import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void generateEmailTimeStamp() {
		Date date = new Date();
		String Dateformat = date.toString();
		System.out.println(Dateformat);
		String Dateformat1= Dateformat.replace(" ", "_").replace(":", "_");
		System.out.println(Dateformat1 + "@gmail.com");
		
	}
}
