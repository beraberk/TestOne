package javaforselenium;

public class L03_Variables {

	public static void main(String[] args) {

		int userID; // Bunun basina final keyword yazdigimizda variable artik degistirilemez, yani
					// baska bir deger atanamaz

		int empID = 70;

		userID = 15;

		userID = 60;

		System.out.println(userID);

		System.out.println(empID);

		
		//Degisken: 1) Type'ini belirle 2) Ismini ver 3) Degerini  ata
		
		// final key word kullanildiginda artik sayfada verilen ilk degeri esas alip finalize eder
		
		final int idNumber = 125;
		
		int cuzdanNumber = 20001;

		System.out.println("ID Numarasi:  " + idNumber);
		System.out.println("Cuzdan Numarasi:  " + cuzdanNumber);

		
		// String is immutable yani degistirilemez.
		/*
		 * String : Wrapper Classes in Java. A Wrapper class is a class whose object
		 * wraps or contains a primitive data types. When we create an object to a
		 * wrapper class, it contains a field and in this field, we can store a
		 * primitive data types. In other words, we can wrap a primitive value into a
		 * wrapper class object.
		 */

		//================================================================
		
		String str = "This is the Test String";
		System.out.println("String : " + str);
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());

		System.out.println("Contains 'is' : " + str.contains("is"));
		System.out.println("Contains 'si' : " + str.contains("si"));

		double myDouble = 21.85;
		System.out.println("Double Value: " + myDouble);

		boolean vrBoolean = true;
		System.out.println("Boolean Value: " + vrBoolean);

		boolean varolmaKafidir = false;
		System.out.println("Varlik Sorunu: " + varolmaKafidir);


		
		
		
		
		
		
		
	}

}
