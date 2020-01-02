package javaforselenium;

public class L02A_PrimitiveDataType {

	public static void main(String[] args) {
		
		/*
		 *   TYPE      DEFAULT   SIZE 
		 *1. boolen     false     1 bit Boolean primitive  
		 
		 *2. byte        0        8 bit (none) Textual primitive 
		
		 *3. char                 16 bit Textual primitive
		
		 *4. short       0        16 bit Numeric primitive 
		
		 *5. int         0        32 bit Numeric primitive 
		
		 *6. long        0        64 bit Numeric primitive 
		 
		 *7. float       0.0      32 bit Numeric primitive 
		
		 *8. double      0.0      64 bit Numeric primitive 
		 */
		
		
	
		
		
		// String Wrapper Class
		 
		
		byte x= Byte.MIN_VALUE;  //Wrapper Class
		byte y= Byte.MAX_VALUE; 
		
		System.out.println("Byte Value between : "+ x +" ~ "+y);
		
		short a = Short.MIN_VALUE;  
		short b = Short.MAX_VALUE;
		System.out.println("Short Value between : "+ a +"  ~  "+b);
		
		
		int c = Integer.MIN_VALUE;
		int d = Integer.MAX_VALUE;
		System.out.println("int Value between : "+ c +"  ~  "+d);
		
		
		double e = Double.MIN_VALUE; //Float ve double decimal sayilar icindir
		double f = Double.MAX_VALUE;
		System.out.println("double Value between : "+ e +"  ~  "+f);
		
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		System.out.println("long Value between : "+ g +"  ~  "+h);
		
			
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		System.out.println("float Value between : "+ i +"  ~  "+j);
		
		
	}

	
	

}
