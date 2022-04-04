package Familia51;

import java.util.Scanner;

public class Atividade2_Q4{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		
		int idade, opSexo, opCaractPsic, totalPessoas=0, somaCalma=0, somaNervFem=0, somaAgresMasc=0, somaCalmOutr=0, somaId40Nerv=0, somaCalma18=0;
		
		while(totalPessoas<=150){
			System.out.println("Digite a idade: ");
			idade= in.nextInt();
			System.out.println("Digite o sexo [1, 2 ou 3]:");
			System.out.println("[1] Feminino\n[2] Masculino\n[3] Outros");
			opSexo= in.nextInt();
			System.out.println("Selecione uma das caracteristica abaixo que você mais se identifica [1, 2 ou 3]:");
			System.out.println("[1] Pessoa calma\n[2] Pessoa nervosa\n[3] Pessoa agressiva");
			opCaractPsic= in.nextInt();
			
			if(opCaractPsic==1) {
				somaCalma++;
			} 
			if(opCaractPsic==1 && idade<18) {
				somaCalma18++;
			}
			if(opCaractPsic==2 && opSexo==1) {
				somaNervFem++;
			} 
			
			if(opCaractPsic==3 && opSexo==2) {
				somaAgresMasc++;
			}
			
			if(opCaractPsic==1 && opSexo==3) {
				somaCalmOutr++;
			}
			
			if(idade>40 && opCaractPsic==2) {
				somaId40Nerv++;
			}
			
			totalPessoas++;
		}
		
		System.out.println("\nNúmero de pessoas calma: "+somaCalma+"\nNúmero de mulheres nervosas: "+somaNervFem+"\nNúmero de homens agressivas: "+somaAgresMasc+"\nNúmero de outros calmos: "+somaCalmOutr+"\nNúmero de pessoas nervosas com mais de 40 anos: "+somaId40Nerv+"\nNúmero de pessoas calmas com menos de 18 anos: "+somaCalma18);
	}

}
