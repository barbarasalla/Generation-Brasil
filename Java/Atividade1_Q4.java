package Familia51;

import java.util.Scanner;

public class Atividade1_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		int num;
		System.out.println("Digite um n�mero: ");
		num=in.nextInt();
		if (num%2==0) {
			System.out.printf("O n�mero " + num + " � par e sua raiz quadrada � %2.2f", Math.sqrt(num));
		}else {
			System.out.printf("O n�mero " + num + " � impar e seu quadrado � %2.0f", Math.pow(num, 2));
		}
	}

}
