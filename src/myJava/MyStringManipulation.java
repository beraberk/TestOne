package myJava;

public class MyStringManipulation {

	public static void main(String[] args) {
		
			
        String str = "This is the test string"; 
        
		
		    
      
        System.out.println("========================================================");
        
        
        System.out.println(str.length());
        
        
        System.out.println(str.concat("  Hayirli geceler"));
        
        System.out.println(str.concat("  It is useful")); // iki ifadeyi birlestir
		
        System.out.println("Iceriyor mu:" +str.contains("test"));
        
        System.out.println("Cami yaptirmak gunah degildir : " +str.contains("cami"));
        
        System.out.println("Contains check1: " + str.contains("is"));
		
         System.out.println("Contains check2: " + str.contains("to"));
		
        System.out.println("S Harfi nerede :" +str.indexOf('s'));
        
        System.out.println("index of 'i' is: " + str.indexOf('i'));
		
        
       System.out.println("Bos bir soru: " +str.isEmpty());
        
        System.out.println("Check if String is empty: " + str.isEmpty());
		
        
        System.out.println("Replace Example: " + str.replaceAll("This", "That"));
		
        System.out.println("Anlamsiz bir degisiklik ornegi: " +str.replaceAll("test", "mest"));
        System.out.println("String : " + str);
		
		
		
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
		
		
		
		System.out.println("Substring Example: " + str.substring(2));
		
		
		System.out.println("Substring Example: " + str.substring(2, 6)); 
		// 2 ile 6'ci karakterin arasini -6. karakter dahil degil-
		
		
		System.out.println("Lower case Example:" + str.toLowerCase());
		
		
		
		String str1 = "Hello";
		
		System.out.println("length is: "+ str1.length());
		
		System.out.println("Character at index two:" + str1.charAt(3));
		
		System.out.println("Character at index four: " +str1.charAt(4));
		
		String str2 = "Hello";
		
		System.out.println("ends with check two: " + str1.equals(str2));
		
		String str3 = "Welcome";
		
		String str4 = "";
		
		String str5 = "                Spaces all around ";
		
		System.out.println("Thrim the leading and trailing spaces: " + str5.trim());
		
		String str6 = "Hello";
		
		System.out.println("Replace Example: " + str6.replace('e', 'a'));
		
		String str7 = "You are my friend";
		
		System.out.println(str7.concat("  You were not my friend"));
		
		System.out.println("starts with check 1: " + str7.startsWith("You"));
		System.out.println("starts with check 2: " + str7.startsWith("are"));
		System.out.println("ends with check 1: " + str7.endsWith("friend"));
		System.out.println("ends with check 2: " + str7.endsWith("klm"));
		System.out.println("Lower case Example:" + str7.toUpperCase());
		
	
		
		System.out.println();
		
		

	}

}
