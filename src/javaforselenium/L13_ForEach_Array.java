package javaforselenium;

public class L13_ForEach_Array {

	public static void main(String[] args) {

		// Selenium da cok kullaniyoruz, cok pratik

		String[] productTypes = { "Laptop", "Phone", "Tablet" };
		for (String product : productTypes) {
			System.out.println(product);

		}

		double[] productPrices = new double[3];
		productPrices[0] = 299.25;
		productPrices[1] = 123.34;
		productPrices[2] = 123.45;

		for (double price : productPrices) {

			System.out.println(price);

		}

		int[] numbers = { 10, 20, 30, 40, 50 };
		for (int number : numbers) {

			System.out.println("The value is: " + number);

		}

		String[] cars = { "BMW ", "Audi ", "Honda ", "Benz " };
		for (String car : cars) {

			System.out.println(car);
		}

		String[] mycars = { "BMW ", "Audi ", "Honda ", "Benz " };

		System.out.println("This is my car:" +mycars[0]);
		System.out.println("This is my car:" +mycars[1]);
		System.out.println("This is my car:" +mycars[2]);
		System.out.println("This is my car:" +mycars[3]);
		
		
		for (String car : cars) {

			System.out.print(car); // without 'll' in println
		}

	}

}
