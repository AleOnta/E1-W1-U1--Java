package it.epicode.be;

public class Es4 {

	public static void main(String[] args) {
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
