package Familia51;

public class ProgramaAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro1= new Cachorro ("Tieta", 9, "sim", "Deve correr", "Salsicha");
		Cavalo cavalo1= new Cavalo ("Mansinho", 3, "sim", "Deve correr", "Marrom");
		Preguica preguica1= new Preguica ("Jorge", 6, "sim", "Deve subir em árvores");	
		
		cachorro1.imprimirInfo();
		System.out.println("----------------------------------------------");
		cavalo1.imprimirInfo();
		System.out.println("----------------------------------------------");
		preguica1.imprimirInfo();
		
	}

}
