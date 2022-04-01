package Familia51;

import java.util.Scanner;

public class AtivExtra_Q2 {
	
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite a quantidade de dias que você possui: ");
		dia=in.nextInt();
		ano=dia/365;
		mes=(dia%365)/30;
		dia= (dia%365)%30;
		
		System.out.println("Você possui " + ano + " ano(s), "+mes+" mês(es) e "+ dia+ " dia(s) de vida.");	
		
	}

}

/*inteiro dia, mes, ano

		escreva ("\nDigite a quantidade de dias que você possui: ")
		leia (dia)

		ano = dia/365
		mes = (dia%365)/30
		dia = (dia%365)%30
		
		escreva("\nVocê tem: \n")
		
		escreva (ano, " anos de vida\n")
		escreva (mes, " meses de vida\n")
		escreva (dia, " dias de vida\n")*/