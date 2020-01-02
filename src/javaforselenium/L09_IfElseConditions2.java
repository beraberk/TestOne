package javaforselenium;

public class L09_IfElseConditions2 {

	public static void main(String[] args) {
		
		
	
		// && Conditional-AND Her iki sart da dogru olmali, code'un calismasi icin
		// || Conditional-OR En az biri dogru olursa code calisir
		// if(c<b || c>a) { } ; if( c>a || c<b) Yerleri degismekle sonuc degismez
		
		
		int a = 10;
		int b = 20;
		int c = 21;
		
		if(c>b || c<a) {
			
			System.out.println("C is bigger than a or b");
					}
		
		System.out.println("=====================================");
		
		if(c>a && c<b) {
			
			System.out.println("C is bigger than a and smaller than b");
		}
		
		
		
		else if(c!=a) { //isaretin anlami 'Esit degilse' demektir
			
			System.out.println("c is not equal to a");
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
