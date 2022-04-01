package Familia51;

import java.util.Scanner;

public class Atividade1_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);		
		int i, numMaior=0;
		int [] num= new int[3];		

		for (i=0; i<3; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			num[i]= in.nextInt();
			if (num[i]>numMaior) {
				numMaior=num[i];
			}
		}
		System.out.println("\nO maior número foi " + numMaior+".");
		
	}

}
