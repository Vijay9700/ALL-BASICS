package testng_demo;

import org.testng.annotations.Test;

public class A {
	@Test(groups = "smoke")
	public void a() {
		System.out.println("qwerty");
	}

}
