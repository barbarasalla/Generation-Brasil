package AnimalHerancaPolimorfismo;

import java.util.Scanner;

public class ProgramaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		Cachorro cachorro= new Cachorro ("Tieta", 9, "sim", "Deve correr", "Salsicha");
		Cavalo cavalo= new Cavalo ("Mansinho", 3, "sim", "Deve correr", "Marrom");
		Preguica preguica= new Preguica ("Jorge", 6, "sim", "Deve subir em árvores");	
		
		System.out.println("Indique qual dos animais você quer conhecer: "+
				"\n[1] Cachorro \n[2] Cavalo \n[2] Preguiça");
		int optip= in.nextInt();
		switch(optip) {
		
			case 1:
				cachorro.tipo();
				System.out.println("----------------------------------------------");
				break;
			case 2: 
				cavalo.tipo();
				System.out.println("----------------------------------------------");
				break;
			case 3:
				preguica.tipo();
				System.out.println("----------------------------------------------");
				break;
		}
		
		System.out.println("Você quer conhecer o som que esse animal emite? "+
		"\n[1] Sim \n[2] Não");
		int op= in.nextInt();
		switch(op) 
		{
			case 1:
				if(optip==1) {
					cachorro.Som();
				} 
				else if(optip==2) {
					cavalo.Som();
				}
				else if(optip==3) {
					preguica.Som();
				}
				else {
					System.out.println("Opção inválida!");
				}
			case 2:
				System.out.println("Usuário encerrou o programa.");
		}		
	}

}
