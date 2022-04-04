package Familia51;

import java.util.Scanner;

public class Atividade2_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int num, somaNum=0;
		
		do {
			System.out.println("Digite um número: ");
			num=in.nextInt();
			somaNum=num+somaNum;
		} while(num!=0);
		System.out.println("A soma dos números digitados foi "+somaNum);
	}
}
