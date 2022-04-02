package Familia51;

import java.util.Scanner;

public class AtivExtra_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		
		int segundos, minutos, hora;
		
		System.out.println("Digite a quantidade de segundos de duração do evento:");
		segundos= in.nextInt();
		
		minutos= segundos/60;
		hora= minutos/60;
		minutos = minutos%60;
		segundos= (segundos%60)%60;
		
		System.out.println("O evento tem "+ hora+ "h. "+ minutos +"min. "+ segundos+ "seg.");	
		
	}
}


