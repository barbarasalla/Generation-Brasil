package Familia51;

public class Cliente {

	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	private int DDD;
	private int telefone;
	private String email;
	
	public Cliente(String primeiroNome, String ultimoNome, String nomesDoMeio, int DDD, int telefone, String email) 
	{	
		this.primeiroNome= primeiroNome;
		this.ultimoNome=ultimoNome;
		this.nomesDoMeio=nomesDoMeio;
		this.DDD=DDD;
		this.telefone=telefone;
		this.email=email;

	}
	
	public String getNomeCompleto() 
	{
		String nomeCompleto=primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	
	public int getDDD()
	{
		return DDD;
	}
	
	public int getTelefone()
	{
		return telefone;
	}
	public String getEmail()
	{
		return email;
	}

}
