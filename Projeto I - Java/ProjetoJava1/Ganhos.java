package ProjetoJava1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ganhos {
	
	Scanner leia =new Scanner(System.in);

	private double receita;
	private double gorjeta;
	private double ganhosTotaisDias=0;
	private double receitaDia=0;
	private double gorjetaDia=0;
	private double ganhosTotais=0;
	private double receitaTotal=0;
	private double gorjetaTotal=0;
	private int ContCorrida;	
	
	public Ganhos (double r, double g)
	{
		this.setReceita(r);
		this.setGorjeta(g);	
	}

	public double getReceita() {
		return receita;
	}

	public void setReceita(double receita) {
		this.receita += receita;
		AdicionarCorrida();
		setReceitaDia(getReceitaDia()+this.receita);
	}

	public double getGorjeta() {
		return gorjeta;
	}

	public void setGorjeta(double gorjeta) {
		this.gorjeta += gorjeta;
		setGorjetaDia(getGorjetaDia()+this.gorjeta);
	}
	
	public double getReceitaDia() {
		return receitaDia;
	}

	public void setReceitaDia(double receitaDia) {
		this.receitaDia = receitaDia;
		setReceitaTotal(getReceitaTotal()+this.receitaDia);		
	}

	public double getGorjetaDia() {
		return gorjetaDia;
	}

	public void setGorjetaDia(double gorjetaDia) {
		this.gorjetaDia = gorjetaDia;
		setGorjetaTotal(getGorjetaTotal()+this.gorjetaDia);
	}

	public double getReceitaTotal() {
		return receitaTotal;
	}

	public void setReceitaTotal(double receitaTotal) {
		this.receitaTotal = receitaTotal;
	}

	public double getGorjetaTotal() {
		return gorjetaTotal;
	}

	public void setGorjetaTotal(double gorjetaTotal) {
		this.gorjetaTotal = gorjetaTotal;
	}
	

	public double getGanhosTotaisDias() {
		return ganhosTotaisDias;
	}

	public void setGanhosTotaisDias(double ganhosTotaisDias) {
		this.ganhosTotaisDias = ganhosTotaisDias;
		setGanhosTotais(getGanhosTotais()+ganhosTotaisDias);
	}

	public double getGanhosTotais() {
		return ganhosTotais;
	}

	public void setGanhosTotais(double ganhosTotais) {
		this.ganhosTotais = ganhosTotais;
	}
	
	public void totalizarGanhosDia() {
		setGanhosTotaisDias(getReceitaDia()+getGorjetaDia());
	}
	
	public void ZerarGanhos() {
		this.receita=0;
		this.gorjeta=0;
		this.ganhosTotaisDias=0;
	}

	public void setContCorrida(int contCorrida) {
		ContCorrida = contCorrida;
	}
	
	public int getContCorrida() {
		return ContCorrida;
	}

	public void AdicionarCorrida() 
	{
		setContCorrida(getContCorrida()+1);
	}

	//Formatando moedas
	public String formatarReceita()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoReceita = nf.format(receita);
		return formatoReceita;
	}
	public String formatarGorjeta()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoGorjeta = nf.format(gorjeta);
		return formatoGorjeta;
	}
	
	//Fim de formatação de moedas
	public void imprimir()
	{
		System.out.println("\nVocê apurou "+this.formatarReceita()+" recebeu "+this.formatarGorjeta()+" de gorjeta e pagou o equivalente.");
	}
	
	public void menuGanhos() {
		
		double c = 0 ;
		int  ganhos=1;
		
		do {
			
			System.out.println("\t\tGANHOS");
			System.out.println();
			System.out.println("1°) Receita da corrida" +"\n2°) Gorgetas"+"\n3°) Voltar ao menu");
			System.out.print("\nOpção: ");
			ganhos = leia.nextInt();
			
			switch(ganhos) {
			
			case 1:
				System.out.print("Insira quanto você lucrou com a corrida: ");
				c =leia.nextDouble();
				setReceita(c);
				System.out.println("\n***************************************************************");
			
				System.out.println();
			break;
			
			case 2:
				System.out.print("Insira o quanto você recebeu de gorgeta: ");
				c =leia.nextDouble();
				setGorjeta(c);
				System.out.println("\n***************************************************************");
				
				System.out.println();
				break;
			
			case 3:
				System.out.println("\nVoltando para o menu...");
				
				System.out.println("\n***************************************************************");
			
				System.out.println();
				break;
			
			default:
				System.out.println("\nOpção invalido");				
				System.out.println("\n***************************************************************");
				System.out.println();
				break;			
			}
		
		}while(ganhos != 3);
	}
}