package Familia51;

import java.util.Scanner;

public class Atividade3_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int num[]= new int[6];
		int par=0, impar=0, somaPar=0, somaImpar=0;
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite o "+(i+1)+"� valor: ");
			num[i]= in.nextInt();
		}		
		
		System.out.println("\nN�meros pares: ");
		for (int i=0; i<num.length;i++) {
			if(num[i]%2==0) {
			System.out.println(num[i]+" ");
			par++;
			somaPar+=num[i];
			}
		}
		System.out.println("Foram digitados "+par+" n�meros pares.");
		System.out.println("A soma dos n�meros pares � "+somaPar);
		
		System.out.println("\nN�meros �mpares: ");
		for (int i=0; i<num.length;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]+" ");
				impar++;
				somaImpar+=num[i];
			}
		}
		System.out.println("Foram digitados "+impar+" n�meros �mpares");
		System.out.println("A soma dos n�meros �mpares � "+somaImpar);
		
	}
}
