package javaforselenium;

public class L12_ForLoop2 {

	public static void main(String[] args) {
		
		
		
		 String[] productTypes = {"Laptop", "Phone", "Tablet", "ElectronicPen" ,
		  "MP3", "Reader"}; //Array 1. Type
		  
		  for (int i = 0; i < productTypes.length; i++) {
		  
		  System.out.println(productTypes[i]); } //Array'in degerlerini alt alta asagiya yazdiralim
		 		 
		  // We're doing Quality Assurance tests using Selenium WebDriver 
				
		
		  int[] numbers = {10, 20, 30, 40, 50};
		  
		  for (int i = 1; i < numbers.length; i++) { 
			  // Array'in toplam degerinden (length burada 4) kucuk oldukca donmeye devam et
		  
		  System.out.println("The value of index " + i + " is: " + numbers[i]);
		  
		  
		  }
		 
		 
		 

		
		
		
		  String str ="Bu gun hava cok guzel"; // Degisken : Variable
		  
		  str = str.split(" ")[2]; // Hangi kelimeyi alacagini gosterir 
		  
		  char[] charArray = str.toCharArray(); // 
		  
		  for (int i = 0; i<charArray.length; i++) { 
		  
		  System.out.println("Index " + i + " is: " + charArray[i]); }
		 
		
		  for (int i = 0; i<str.length(); i++) { 
		  System.out.println("Index " + i + " is: " + str.charAt(i)); }
			 
		  
		
		
		

	}

}
