package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		// exercise 2 - multiply method
		System.out.println("Ex 2 - multiply");
		int a = 5, b = 10;
		System.out.println(a + " * " + b + " = " + multiply(a, b));
		
		// exercise 2 - concat method
		System.out.println("Ex 2 - concat");
		String c = "An example of a even number is: ";
		System.out.println(concat(c, b));
		
		//exercise 2 - push into array method
		System.out.println("Ex 2 - pushIntoArray");
		String d = "third";
		String[] strArr = new String[5];
		strArr[0] = "first"; strArr[1] = "second"; strArr[2] = "fourth"; strArr[3] = "fifth"; strArr[4] = "sixth";
		System.out.println("Here is the new Array: " + intoArray(strArr, d));
		// System.out.println("Here is the new Array: " + intoArray(strArr, d)[2]);
		
		//exercise 3 - Using Scanner
		System.out.println("Ex 3 - Using Scanner");
		System.out.println(stringsScanner());
		
		// exercise 4 - Rectangle perimeter
		System.out.println("Ex 4 - Calculating Rectangle Perimeter");
		double g = 2.89, h = 1.41;
		System.out.println(calculateRectanglePerimeter(g, h));
		
		//exercise 4 - Odd or Even
		System.out.println("Ex 4 - Odd or Even");
		System.out.println(isItOddOrEven(157));
		
		//exercise 4 - Triangle Area
		System.out.println("Ex 4 - Area Triangle");
		double sideA = 4.20, sideB = 6.40, sideC = 4.10;
		System.out.println(EroneIsTheMan(sideA, sideB, sideC));
		}


	private static int multiply(int a, int b) {
		return  a * b;
	}

	private static String concat(String s, int n) {
		return s + n;
	}
	
	private static String[] intoArray(String[] a, String b) {
		String[] newStrArray = new String[6];
		newStrArray[0] = a[0]; newStrArray[1] = a[1]; newStrArray[2] = b; newStrArray[3] = a[2]; newStrArray[4] = a[3]; newStrArray[5] = a[4];
		return newStrArray;
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
	
	private static String calculateRectanglePerimeter(double base, double height) {
		double perimeter = (base * 2) + (height * 2);
		return "The perimeter is: " + perimeter;
	}
	
	private static int isItOddOrEven(int a) {
		if (a % 2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	
	private static String EroneIsTheMan(double a, double b, double c) {
		double semiP = (a + b + c) / 2;
		double semiPMinusA = semiP - a;
		double semiPMinusB = semiP - b;
		double semiPMinusC = semiP - c;
		double AreaToTheSecond = semiP * semiPMinusA * semiPMinusB * semiPMinusC;
		double Area = Math.sqrt(AreaToTheSecond);
		return "The Area of the triangle is: " + Area;
	}
}



