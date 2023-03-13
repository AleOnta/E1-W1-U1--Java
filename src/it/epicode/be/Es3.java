package it.epicode.be;

import java.util.Scanner;

public class Es3 {

	public static void main(String[] args) {
		//exercise 3 - Using Scanner
		System.out.println("Ex 3 - Using Scanner");
		System.out.println(stringsScanner());

	}

	private static String stringsScanner() {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter the first word:");
		String firstWord = myScanner.nextLine();
		System.out.println("Enter the second word:");
		String secondWord = myScanner.nextLine();
		System.out.println("Enter the third word:");
		String thirdWord = myScanner.nextLine();
		
		System.out.println("Select output mode: 1 = normal, 2 = reverse");
		int outputChoice = myScanner.nextInt();
		if (outputChoice == 1) {
			return firstWord + " " + secondWord + " " + thirdWord;
		} else {
			return thirdWord + " " + secondWord + " " + firstWord;
		}
		
	}
}
