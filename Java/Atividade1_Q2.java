package Familia51;

import java.util.Scanner;

public class Atividade1_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		int i,j;
		int [] num= new int[3];		

		for (i=0; i<3; i++) {
			System.out.println("Digite o " + (i+1) + "º número: ");
			num[i]= in.nextInt();
		}
		
		for (i=0; i<num.length; i++) {
			for (j=i+1; j<num.length; j++) {
				if (num[i]>num[j]) {
					int numAux=num[i];
					num[i]=num[j];
					num[j]=numAux;
				}
			}
		}
		
		for(i=0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
	}
}
	
