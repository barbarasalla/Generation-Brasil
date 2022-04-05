package Familia51;

import java.util.Scanner;

public class Atividade3_Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		float matrizA[][]= new float[2][2];
		float matrizB[][]= new float[2][2];
		int op;
		float matrizSoma[][]=new float[2][2];
		float matrizSubt[][]=new float[2][2];
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2;j++) {
				System.out.println("Digite o valor da posição ("+i+", "+j+") da Matriz A: ");
				matrizA[i][j]=in.nextFloat();
				System.out.println("Digite o valor da posição ("+i+", "+j+") da Matriz B: ");
				matrizB[i][j]=in.nextFloat();
			}
		}
			System.out.println("-------------------MENU-----------------------");
			System.out.println("[1] Somar as duas matrizes\n[2] Subtrair a primeira matriz da segunda\n[3] Adicionar uma constante as duas matrizes\n[4] Imprimir as matrizes");
			op= in.nextInt();
			switch(op){
				case 1:
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							matrizSoma[i][j]=matrizA[i][j]+matrizB[i][j];
							System.out.print(matrizSoma[i][j]+" ");
						}
						System.out.print("\n");
					}
				break;
				case 2:
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							matrizSubt[i][j]=matrizA[i][j]-matrizB[i][j];
							System.out.print(matrizSubt[i][j]+" ");
						}
						System.out.print("\n");
					}
				break;
				case 3:
					System.out.print("Digite uma constante para somar nas matrizes: ");
					float constante= in.nextFloat();
					System.out.println("\nMatriz A somada a constante: ");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							matrizA[i][j]+=constante;
							System.out.print(matrizA[i][j]+" ");
						}
						System.out.print("\n");
					}
					
					System.out.println("\nMatriz B somada a constante: ");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							matrizB[i][j]+=constante;
							System.out.print(matrizB[i][j]+" ");
						}
						System.out.print("\n");
					}
					
				break;	
				case 4:
					System.out.println("\nMatriz A: ");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							System.out.print(matrizA[i][j]+" ");
						}
						System.out.print("\n");
					}
					System.out.println("\nMatriz B: ");
					for(int i=0; i<2; i++) {
						for(int j=0; j<2;j++) {
							System.out.print(matrizB[i][j]+" ");
						}
						System.out.print("\n");
					}
				break;
				default:
					System.out.println("\nPrograma Finalizado");
			}
	}
}
