package TestNGFramework;

import org.testng.annotations.Test;

public class MethodDependency {
	@Test
	public void F1() {
		System.out.println("Printing F1");
	}
	@Test
	public void F2() {
		System.out.println("Printing F2");
	}
	@Test
	public void F3() {
		System.out.println("Printing F3");
	}
	@Test
	public void F4() {
		System.out.println("Printing F4");
	}
	@Test(enabled = false)
	public void F5() {
		System.out.println("Printing F5");
	}


}
