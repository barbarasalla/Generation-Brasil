package Familia51;

import java.util.Scanner;

public class AtivExtra_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		double a, b, c, r, s, d;
		
		System.out.println("Digite o primeiro n�mero: ");
		a= in.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		b= in.nextDouble();
		System.out.println("Digite o terceiro n�mero: ");
		c= in.nextDouble();	
		
		r= Math.pow((a+b), 2);
		s= Math.pow((b+c), 2);
		d=(r+s)/2;
		
		System.out.println("\nA soma entre "+ r+ " e "+ s+" dividido por 2 � "+ d);

	}

}
