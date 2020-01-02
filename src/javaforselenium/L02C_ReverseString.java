package javaforselenium;

public class L02C_ReverseString {

	public static void main(String[] args) {
		
		// Method 1) Using StringBuffer class
		StringBuffer a = new StringBuffer("Software Testing Material 1"); // Burayi tersinden yazacak!
		
		// use reverse() method to reverse string
		 System.out.println(a.reverse());
		
		 // Method 2) 
		 
		 String input="Software Testing Material 2";
		 StringBuilder input1 = new StringBuilder();
		 input1.append(input);
		 input1=input1.reverse(); 
		 
		 for (int i=0;i<input1.length();i++)
		 
			 System.out.print(input1.charAt(i));
		 
		 }
}
