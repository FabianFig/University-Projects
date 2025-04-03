package Project1;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		String hello = "Hello, World";
		System.out.println(hello);
		String regex = "[,]";
		String[] arrtest = hello.split(regex);
		for (String s : arrtest) {
			System.out.println(s);
		}
		
		
		
	}
}
