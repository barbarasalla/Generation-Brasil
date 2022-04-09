package AnimalHerancaPolimorfismo;

public abstract class Animal {
	private String nome;
	private int idade;
	private String produzSom;
	private String acao;
	
	public Animal(String nome, int idade, String produzSom, String acao) {
		this.nome= nome;
		this.idade = idade;
		this.produzSom=produzSom;
		this.acao=acao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProduzSom() {
		return produzSom;
	}

	public void setProduzSom(String produzSom) {
		this.produzSom = produzSom;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	abstract public void Som ();
	abstract public void tipo();
}
