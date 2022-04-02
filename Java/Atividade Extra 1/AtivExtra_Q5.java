package Familia51;

import java.util.Scanner;

public class AtivExtra_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		float nota1, nota2, nota3, medPonderada;
		
		System.out.println("Digite a primeira nota: ");
		nota1= in.nextFloat();
		System.out.println("Digite a segunda nota: ");
		nota2= in.nextFloat();
		System.out.println("Digite a terceira nota: ");
		nota3= in.nextFloat();
		
		medPonderada= (nota1*2)+(nota2*3)+(nota3*5)/3;
				
		System.out.println("\nA média ponderada do(a) aluno(a) foi "+ medPonderada);
	}

}
