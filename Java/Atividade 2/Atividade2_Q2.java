package Familia51;

import java.util.Scanner;

public class Atividade2_Q2 {
	
	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		int num, impar=0,par=0;
			
		for (int i=1; i<=10; i++) {
			System.out.println("Digite o "+i+"º número: ");
			num=in.nextInt();
			if (num%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Foram inseridos "+par+" números pares e "+impar+" números impares.");
	}
}