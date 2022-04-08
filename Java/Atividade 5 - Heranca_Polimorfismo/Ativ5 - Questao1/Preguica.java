package Familia51;

public class Preguica extends Animal {


	public Preguica(String nome, int idade, String som, String acao) {
		super(nome, idade, som, acao);
	}
	
	public void imprimirInfo () {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
				"\nEmite Som: "+getSom()+"\nAção: "+getAcao());
	}
}

