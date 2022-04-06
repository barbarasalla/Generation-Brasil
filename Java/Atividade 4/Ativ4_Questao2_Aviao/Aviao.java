package Familia51;

import java.text.NumberFormat;

public class Aviao {
	
	private String empresaAviao;
	private String cor;
	private int quantAcentos;
	private int numRegistro;
	private double precoAviao;
	
	public Aviao (String empresaAviao, String cor, int numRegistro, int quantAcentos, double precoAviao) 
	{
		this.cor=cor;
		this.quantAcentos=quantAcentos;
		this.numRegistro=numRegistro;
		this.empresaAviao=empresaAviao;
		this.precoAviao=precoAviao;
	}
	
	public String getEmpresaAviao() {
		return empresaAviao;
	}


	public void setEmpresaAviao(String empresaAviao) {
		this.empresaAviao = empresaAviao;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public int getQuantAcentos() {
		return quantAcentos;
	}


	public void setQuantAcentos(int quantAcentos) {
		this.quantAcentos = quantAcentos;
	}


	public int getNumRegistro() {
		return numRegistro;
	}



	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}


	public double getPrecoAviao() {
		return precoAviao;
	}


	public void setPrecoAviao(double precoAviao) {
		this.precoAviao = precoAviao;
	}


	public String formatarMoeda() 
	{
		NumberFormat nf=NumberFormat.getCurrencyInstance();//formata o simbolo da moeda para o país selecionado(formata a partir da localidade do sistema
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(precoAviao);
		return formatoMoeda;	
	}
	
	public void imprimir() {
		
		System.out.println("Empresa de aviação: "+empresaAviao+"\nNúmero de registro do avião: "+numRegistro+"\nQuantidade de acentos: "+quantAcentos+
				"\nCor do Avião: "+cor+"\nValor do Avião: "+this.formatarMoeda());
	}
	
	
}
