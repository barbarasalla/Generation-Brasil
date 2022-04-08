package Familia51;

public class Cachorro extends Animal {
	
	private String raca;

	public Cachorro(String nome, int idade, String som, String acao, String raca) {
		super(nome, idade, som, acao);
		this.raca=raca;
	}
	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public void setAcao(String acao) {
		setAcao("Deve correr");
	}

	public void imprimirInfo () {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
				"\nEmite Som: "+getSom()+"\nAção: "+getAcao()+"\nRaça: "+this.getRaca());
	}

	public void movimento() {
		System.out.println("Ação: Deve subir em árvores");
	}
	
}
