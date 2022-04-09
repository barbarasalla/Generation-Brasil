package AnimalHerancaPolimorfismo;

public class Cavalo extends Animal {

	private String cor;
	
	public Cavalo(String nome, int idade, String produzSom, String acao, String cor) {
		super(nome, idade, produzSom, acao);
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void imprimirInfo () {
		System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
				"\nAção: "+getAcao()+"\nCor: "+this.getCor()+"\nEmite Som? "+getProduzSom());
	}

	@Override
	public void Som() {
		// TODO Auto-generated method stub
		System.out.println("Som emitido pelo cavalo: iiirrrrí-iiirrrrí");
	}

	@Override
	public void tipo() {
		// TODO Auto-generated method stub
		System.out.println("ANIMAL DO TIPO CAVALO");
	}

}
