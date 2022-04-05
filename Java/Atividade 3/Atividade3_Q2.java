package Familia51;

import java.util.Scanner;

public class Atividade3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int num[]= new int[6];
		int par=0, impar=0, somaPar=0, somaImpar=0;
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite o "+(i+1)+"º valor: ");
			num[i]= in.nextInt();
		}		
		
		System.out.println("\nNúmeros pares: ");
		for (int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
			System.out.println(num[i]+" ");
			par++;
			somaPar+=num[i];
			}
		}
		System.out.println("Foram digitados "+par+" números pares.");
		System.out.println("A soma dos números pares é "+somaPar);
		
		System.out.println("\nNúmeros ímpares: ");
		for (int i=0; i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]+" ");
				impar++;
				somaImpar+=num[i];
			}
		}
		System.out.println("Foram digitados "+impar+" números ímpares");
		System.out.println("A soma dos números ímpares é "+somaImpar);
		
	}
}
