package testNGFramework;

import org.testng.annotations.Test;

public class MethodDependencyDemo {
	@Test
	public void f1() {
		System.out.println("f1");
	}
	@Test (dependsOnMethods ="f3")
	public void f2() {
		System.out.println("f2");
	}
	@Test //(enabled=false)
	public void f3() {
		System.out.println("f3");
	}
	@Test
	public void f4() {
		System.out.println("f4");
	}
	@Test
	public void f5() {
		System.out.println("f5");
	} 

}
