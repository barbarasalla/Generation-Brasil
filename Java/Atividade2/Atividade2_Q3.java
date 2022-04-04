package Familia51;

import java.util.Scanner;

public class Atividade2_Q3 {
	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		int idade,maior50=0, menor25=0;
		
		System.out.println("Digite sua idade: ");
		idade= in.nextInt();
		
		while(idade!=-99) {
			System.out.println("Digite sua idade: ");
			idade= in.nextInt();
			if(idade>50) {
				maior50++;
			}
			if(idade<25 && idade>=0) {
				menor25++;
			}
		}
		System.out.println("Quantidade de idades maior que 50: "+maior50+"\nQuantidade de idades menor que 25: "+menor25);
	}
}
