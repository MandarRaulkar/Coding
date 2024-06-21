package Math;

import java.util.Scanner;

public class Math1{

	public static void main(String[] args) {
		
		double x;
		double y;
		double z;
		
		Scanner sc = new Scanner(System.in);
 		
		System.out.println("Enter the value of one side");
		x = sc.nextDouble();
		
		System.out.println("Enter the value of one side");
		y = sc.nextDouble();
		
		z = Math.sqrt((x * x)+(y * y)) ;
		
		System.out.println("Hypoteneus is " + z);
		
		sc.close();
		

	}

}
