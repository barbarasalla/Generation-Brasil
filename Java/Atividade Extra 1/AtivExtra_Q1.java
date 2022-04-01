package Familia51;

import java.util.Scanner;

public class AtivExtra_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int ano, mes, dia, idDias;
		
		System.out.println("Digite quantos anos você tem: ");
		ano= in.nextInt();
		System.out.println("Digite quantos meses você tem: ");
		mes= in.nextInt();
		System.out.println("Digite quantos dias você tem: ");
		dia= in.nextInt();
				
		idDias=(ano*365)+(mes*30)+dia;
		
		System.out.println("Você tem " + idDias+ " dias de vida.");
				
	}
}
