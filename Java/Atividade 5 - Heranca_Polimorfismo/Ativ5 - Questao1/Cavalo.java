package Familia51;

public class Cavalo extends Animal {

	private String cor;

	public Cavalo(String nome, int idade, String som, String acao, String cor) {
		super(nome, idade, som, acao);
		this.cor=cor;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimirInfo () {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
				"\nEmite Som: "+getSom()+"\nAção: "+getAcao()+"\nCor: "+this.getCor());
	}
}
