package de.massisoft.ocp.assignments.chapter2.bar;

import de.massisoft.ocp.assignments.chapter2.foo.FooImpl;

public class BarImpl {
	public String ClassName = "BarImpl";
	public static String PckgName = "Bar";
	
	public String getFooInformation() {
		FooImpl foo = new FooImpl();
		return "Foo Class: " + foo.ClassName 
				+ "Foo Package: " + FooImpl.PckgName;
	}
	
	public static void loop() {
		int i = 0;
		
		while(i<=10) {
			System.out.print(i +  " ");
			i++;
		}
	}
}
