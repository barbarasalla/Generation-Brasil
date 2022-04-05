package Familia51;

public class Atividade3_Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,0,5,-2,-5,7};
		
		int soma=A[0]+A[1]+A[5];
		
		System.out.println("A soma dos valores da posição A0 A1 e A5 foi "+soma);
		
		for (int i=0; i<6; i++) {
			A[3]=100;
			System.out.println(A[i]);
		}		
		
	}

}
