package de.massisoft.ocp.assignments.chapter2.foo;

import de.massisoft.ocp.assignments.chapter2.bar.BarImpl;

public class FooImpl {
	public String ClassName = "FooImpl";
	public static String PckgName = "Foo";
	
	public static void main(String[] args) {
		BarImpl bar = new BarImpl();
		System.out.println("Bar Class: " + bar.ClassName);
		System.out.println("Bar Package: " + BarImpl.PckgName);
		System.out.println(bar.getFooInformation());
		System.out.println("*****************************************");
		
		System.out.println("Number of params: " + args.length);
		
		BarImpl.loop();
		System.out.println("\n*****************************************");
	}
	

}
