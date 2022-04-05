package Familia51;

import java.util.Scanner;

public class Atividade3_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		int matriz[][]= new int[3][3];
		int maior10=0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3;j++) {
				System.out.println("Digite o valor da posição ("+i+", "+j+") da Matriz: ");
				matriz[i][j]=in.nextInt();
				if(matriz[i][j]>10) {
					maior10++;
				}
			}
		}
		System.out.println("\nA matriz possui "+maior10+" valores maiores que 10");
	}
}
