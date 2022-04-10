package ProjetoJava1;

import java.util.Scanner;

public class Resultados extends Contador {
	
	Scanner leia= new Scanner(System.in);
	
	private double totalReceitasDia, totalDespesasDia, lucrosLiquidosDia, kmRodadosDia, combustivelGastoDia, totalReceitas, totalDespesas, lucrosLiquidos, kmRodados, combustivelGasto, lucroSemana, lucroMes;
		
	public Resultados(double totalReceitasDia, double totalDespesasDia, double lucrosLiquidosDia, double kmRodadosDia, double combustivelGastoDia) {
		
			this.totalReceitasDia = totalReceitasDia;
			this.totalDespesasDia = totalDespesasDia;
			this.lucrosLiquidosDia = lucrosLiquidosDia;
			this.kmRodadosDia = kmRodadosDia;
			this.combustivelGastoDia = combustivelGastoDia;
	}	

//RESULTADO DIA:

	public double getTotalReceitasDia() {
		return totalReceitasDia;
	}

	public void setTotalReceitasDia(double totalReceitasDia) {
		this.totalReceitasDia = totalReceitasDia;
	}

	public double getTotalDespesasDia() {
		return totalDespesasDia;
	}

	public void setTotalDespesasDia(double totalDespesasDia) {
		this.totalDespesasDia = totalDespesasDia;
	}

	public double getLucrosLiquidosDia() {
		return lucrosLiquidosDia;
	}

	public void setLucrosLiquidosDia(double lucrosLiquidosDia) {
		this.lucrosLiquidosDia = lucrosLiquidosDia;
		setLucrosLiquidos(getLucrosLiquidos()+this.lucrosLiquidosDia);
	}

	public double getKmRodadosDia() {
		return kmRodadosDia;
	}

	public void setKmRodadosDia(double kmRodadosDia) {
		this.kmRodadosDia = kmRodadosDia;
	}

	public double getCombustivelGastoDia() {
		return combustivelGastoDia;
	}

	public void setCombustivelGastoDia(double combustivelGastoDia) {
		this.combustivelGastoDia = combustivelGastoDia;
	}

	
	public void ZerarResultados() {
		this.totalReceitasDia = 0;
		this.totalDespesasDia = 0;
		this.lucrosLiquidosDia = 0;
		this.kmRodadosDia = 0;
		this.combustivelGastoDia = 0;
	}
//RESULTADO TOTAL:

	public double getTotalReceitas() {
		return totalReceitas;
	}

	public void setTotalReceitas(double totalReceitas) {
		this.totalReceitas += totalReceitas;
	}

	public double getTotalDespesas() {
		return totalDespesas;
	}

	public void setTotalDespesas(double totalDespesas) {
		this.totalDespesas += totalDespesas;
	}

	public double getLucrosLiquidos() {
		return lucrosLiquidos;
	}

	public void setLucrosLiquidos(double lucrosLiquidos) {
		this.lucrosLiquidos += lucrosLiquidos;
	}

	public double getKmRodados() {
		return kmRodados;
	}

	public void setKmRodados(double kmRodados) {
		this.kmRodados = kmRodados;
	}

	public double getCombustivelGasto() {
		return combustivelGasto;
	}

	public void setCombustivelGasto(double combustivelGasto) {
		this.combustivelGasto = combustivelGasto;
	}
	
	public double getLucroSemana() {
		return lucroSemana;
	}
	
	public void setLucroSemana(double lucroSemana) {
		this.lucroSemana= getLucrosLiquidos()/getSemanas();
	}
	
	public double getLucroMes() {
		return lucroMes;
	}

	public void setLucroMes(double lucroMes) {
		this.lucroMes = getLucrosLiquidos()/getMeses();
	}
//METODOS:	

	public void TotalDespesa() {
		setTotalDespesas(getTotalDespesasDia()+getTotalDespesas());
	}
	
	public void CalculoLucroDia() {
		setLucrosLiquidosDia(getTotalReceitasDia()-getTotalDespesasDia());
	}
	
	public void menuResultado() {
		
		int opRes;
		
		do {
		System.out.println("---------Controle de fluxo---------");			
		System.out.println("\n[1] Fluxo do dia \n[2] Fluxo semanal \n[3] Fluxo mensal \n[4] Balanço Total \n[5] Sair");
		System.out.print("\nSelecione uma opção: ");
		opRes= leia.nextInt();
		
		switch(opRes) 
		{
			case 1:
				System.out.println("\n--------Fluxo Do Dia---------\n"			
						+ "\nGanhos Totais: "+getTotalDespesasDia()+"\nDespesas Totais: "+getTotalReceitasDia()+"\nLucro Total Do Dia: "+getLucrosLiquidosDia()+"\nKMs Rodados: ");
				
				System.out.println("\n");
				System.out.println("	TIPOS	|	VALORES	|");
				System.out.println("_________________________________________________");
				System.out.println("Ganhos Totais	|	"+getTotalReceitasDia()+"	|");
				System.out.println("_________________________________________________");
				System.out.println("Despesas Totais	|	"+getTotalDespesasDia()+"	|");
				System.out.println("_________________________________________________");
				System.out.println("KMs		|	");
				System.out.println("_________________________________________________");
				System.out.println("		|");
				System.out.println("_________________________________________________");
				
				break;
			case 2:
				System.out.println("------ Valores Médios Semanal-------"			
						+ "\nGanhos Totais: "+getTotalDespesas()/getSemanas()+"\nDespesas Totais: "+getTotalReceitas()/getSemanas()+"\nLucro Total Do Dia: "+getLucrosLiquidos()/getSemanas()+"\nKMs Rodados: ");
				break;
			case 3:
				System.out.println("------Fluxo Médio Mensal-------"			
						+ "\nGanhos Totais: "+getTotalDespesas()/getMeses()+"\nDespesas Totais: "+getTotalReceitas()/getMeses()+"\nLucro Total Do Dia: "+getLucroMes()+"\nKMs Rodados: ");
				break;
			case 4:
				System.out.println("\n");
				System.out.println("		|	DIA	|	SEMANA		|	MÊS	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Ganhos Totais	|	"+getTotalReceitasDia()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Despesas Totais	|	"+getTotalDespesasDia()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("KMs		|");
				System.out.println("________________________________________________________________________");
				System.out.println("		|");
				System.out.println("________________________________________________________________________");
		}
		
		
		
		} while(opRes!=5);
	}
	
}
