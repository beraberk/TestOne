package javaforselenium;

import java.util.Scanner;

public class L04_InputVariableValue {

	public static void main(String[] args) {
		//  Rest Assured
		
		Scanner scn1 = new Scanner(System.in);
		
		System.out.println("Write String");
		
		String myStr = scn1.nextLine();
		
		System.out.println("Write int");

		int myInt = scn1.nextInt();
		
		System.out.println(myStr + "    " +myInt);
		
		
		
		
	}

}
