package it.epicode.be;

public class Es2 {

	public static void main(String[] args) {
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
		System.out.println(intoArray(strArr, d)[2]);


	}
	
	private static int multiply(int a, int b) {
		return  a * b;
	}

	private static String concat(String s, int n) {
		return s + n;
	}
	
	private static String[] intoArray(String[] a, String b) {
		String[] newStrArray = new String[6];
		for (int i = 0; i < newStrArray.length ; i++) {
		if (i < 2) {
			newStrArray[i] = a[i];
		} else if (i == 2) {
				newStrArray[i] = b;
			} else {
				newStrArray[i] = a[i-1];
			}
		}
		return newStrArray;
	}
}
