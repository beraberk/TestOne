package javaforselenium;

public class L05_Operators {

	public static void main(String[] args) {

		// Assignment Operator '='

		int userID = 68;

		System.out.println("User Id is :" + userID);

		int a = 8, b = 3;

		System.out.println("8'i 3'e bol, kalani soyle bana  :" + a % b); // a'yi b'ye bol, kalani bana soyle: reminder is percentage sign

		// Arithmetic Operators (+, -, *, /, %)

		// Increment Operator ++ ................. Decrement Operator --
		
	   // a++; //
		
	

		a = a + 3; 
		b = b-1;
		 
		System.out.println("a'nin degeri:" + a);
		System.out.println("b'nin degeri:" + b);
		
		//Equality and Relational Operators
		
	//	== Equal to
	// != not equal to
	// > greater than 	
	// >= greater than or equal to
	// < less than
	// <= less than or equal to 	
		
		
		a= 10;
		b= 20;
		
		int c=25;
		double d=12.5;
		int e=2;
		
				
		System.out.println(a==b);  // Parantez icleri Boolean deger verir true-false
		System.out.println(a<b); 
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		System.out.println("====== I ====Additional Math Subjects ==========="); 
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(c/d);
		System.out.println(d/e);
		System.out.println(b%d);  // b'yi d'ye bol, kalani soyle
		
		
		
		
		System.out.println("====== II ====Additional Math Subjects ===========");
		
		int division = 100 / 10 / 2;
		System.out.println(division);
		
		int div = 100 / (10 / 2);
		System.out.println(div);
		
		int diff = 200 - (-10); // minus minus equals plus
		System.out.println(diff);
		
				
		System.out.println("======III====Additional Math Subjects ===========");
			
		//Herhangi bir sayinin yuzdesini almak icin:
		
		double myPercentage = (double) Math.round(3 * 250)/100;
		
		long iPercentage = (long) Math.round(4 * 250)/100;
		
		System.out.println(myPercentage);
		
		System.out.println(iPercentage);
		
		//Herhangi bir sayinin karekokunu almak icin:
		
		double z = 12; 
		  
        System.out.println(Math.sqrt(z)); 
  
        z = 72; 
        
        System.out.println(Math.sqrt(z)); 
       
      
        
        
	}

}
