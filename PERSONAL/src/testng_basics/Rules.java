package testng_basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Rules {
	

		//replace main() with @Test
		@Test
		public void demo()
		{
			//System.out.println("from demo");
			Reporter.log("from demo",true);
		}
	

}
