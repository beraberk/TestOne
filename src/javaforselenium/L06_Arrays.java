package javaforselenium;

public class L06_Arrays {

	public static void main(String[] args) {

		String a = "Tevekkul";

		// String h = "selam", "kelam", "sabah"; Bu sekilde yazildiginda hata mesaji verir, array gerekli

		System.out.println(a);
		System.out.println("=======================");
		// 1. Yol

		String[] productTypes = { "Laptop", "Phone", "Tablet", "Reader" }; // more than one value

		System.out.println(productTypes[0]);
		System.out.println(productTypes[1]);
		System.out.println(productTypes[2]);
		System.out.println(productTypes[3]);

		
		/*
		 * for (String electronic : productTypes)
		 * System.out.println("Electronic Device: "+ electronic); // Hepsini alt alta
		 * asagiya alir
		 * 
		 * System.out.println("");
		 * 
		 * 
		 * 
		 * String productTypes []= {"Laptop","Phone","Tablet","Reader"}; //more than one
		 * value System.out.println(productTypes[0]);
		 * System.out.println(productTypes[1]); System.out.println(productTypes[2]);
		 * System.out.println("");
		 */
		 

		// 2. Yol

		double[] productPrices = new double[3];

		productPrices[0] = 399.66;
		productPrices[1] = 499.77;
		productPrices[2] = 199.55;

		System.out.println(productPrices[0]);
		System.out.println(productPrices[1]);
		System.out.println(productPrices[2]);

		System.out.println(productTypes[0]);
		System.out.println(productTypes[1]);

		// ========================

		System.out.println("Count of production array member : " + productPrices.length);
		System.out.println();

		System.out.println(productTypes[0] + ": " + (productPrices[0]));

	}
	}


