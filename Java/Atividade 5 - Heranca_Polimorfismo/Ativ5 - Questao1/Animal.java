package Familia51;

public class Animal {
	private String nome;
	private int idade;
	private String som;
	private String acao;
	
	public Animal(String nome, int idade, String som, String acao) {
		this.nome= nome;
		this.idade = idade;
		this.som=som;
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

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
}
