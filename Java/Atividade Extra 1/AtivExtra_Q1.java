package Familia51;

import java.util.Scanner;

public class AtivExtra_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int ano, mes, dia, idDias;
		
		System.out.println("Digite quantos anos voc� tem: ");
		ano= in.nextInt();
		System.out.println("Digite quantos meses voc� tem: ");
		mes= in.nextInt();
		System.out.println("Digite quantos dias voc� tem: ");
		dia= in.nextInt();
				
		idDias=(ano*365)+(mes*30)+dia;
		
		System.out.println("Voc� tem " + idDias+ " dias de vida.");
				
	}
}
