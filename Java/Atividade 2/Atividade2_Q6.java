package Familia51;

import java.util.Scanner;

public class Atividade2_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int num, somaMult=0, totMultiplo3=0;
		
		do {
			System.out.println("Digite um número: ");
			num=in.nextInt();
			if(num%3==0 && num!=0) {
				somaMult+=num;
				totMultiplo3++;
			}
		} while(num!=0);
		
		System.out.println("A média dos números multiplos de 3 é "+somaMult/totMultiplo3);
	}

}
