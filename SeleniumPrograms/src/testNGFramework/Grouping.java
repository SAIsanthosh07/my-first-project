package testNGFramework;

import org.testng.annotations.Test;

public class Grouping {
	
@Test	(groups = "X")
	public void f1 () {
		System.out.println("Print 1");
	}
	
@Test	(groups = "Y")
	public void f2 () {
		System.out.println("Print 2");
	}
@Test	(groups = "X")
public void f3 () {
	System.out.println("Print 3");
}
@Test	(groups = "Y")
public void f4 () {
	System.out.println("Print 4");
}
@Test	(groups = "X")
public void f5 () {
	System.out.println("Print 5");
}
@Test 	(groups = "Y")
public void f6 () {
	System.out.println("Print 6");
}

}
