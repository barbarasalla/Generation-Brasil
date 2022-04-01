package Familia51;

import java.util.Scanner;

public class Atividade1_Q3 {
	
	public static void main(String[] args) {
		
	Scanner in= new Scanner(System.in);
	
	int idade;
	
	System.out.println("Digite sua idade: ");
	idade = in.nextInt();
	
	if(idade>=10 && idade<=14) {
		System.out.println("Você faz parte da categoria 'Infantil' (10-14 anos).");
	}
		else if(idade>14 && idade<=17) {
			System.out.println("Você faz parte da categoria 'Juvenil' (15-17 anos).");
		}
			else if(idade>17 && idade<=25) {
				System.out.println("Você faz parte da categoria 'Adulto' (18-25 anos).");
			}
			else {
				System.out.println("Idade inválida ou categoria inexistente.");
			}
	}
}
