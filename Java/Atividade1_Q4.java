package Familia51;

import java.util.Scanner;

public class Atividade1_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		int num;
		System.out.println("Digite um número: ");
		num=in.nextInt();
		if (num%2==0) {
			System.out.printf("O número " + num + " é par e sua raiz quadrada é %2.2f", Math.sqrt(num));
		}else {
			System.out.printf("O número " + num + " é impar e seu quadrado é %2.0f", Math.pow(num, 2));
		}
	}

}
