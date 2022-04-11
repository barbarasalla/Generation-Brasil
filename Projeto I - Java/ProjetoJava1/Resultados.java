package ProjetoJava1;

import java.util.Scanner;

public class Resultados extends Contador {
	
	Scanner leia= new Scanner(System.in);
	
	private double totalReceitasDia, totalDespesasDia, lucrosLiquidosDia, kmRodadosDia, combustivelGastoDia, 
	totalReceitas, totalDespesas, lucrosLiquidos, kmRodados, combustivelGasto, lucroSemana, lucroMes, 
	despesaSemana, despesaMes, receitaSemana, receitaMes;
		
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
	}
	
	//RESULTADO TOTAL:

	public double getTotalReceitas() {
		return totalReceitas;
	}

	public void setTotalReceitas(double totalReceitas) {
		this.totalReceitas = totalReceitas;
	}

	public double getTotalDespesas() {
		return totalDespesas;
	}

	public void setTotalDespesas(double totalDespesas) {
		this.totalDespesas = totalDespesas;
	}

	public double getLucrosLiquidos() {
		return lucrosLiquidos;
	}

	public void setLucrosLiquidos(double lucrosLiquidos) {
		this.lucrosLiquidos = lucrosLiquidos;
	}
	
	//CONTROLE KM (DIA, TOTAL, SEMANA E MES)
	
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
	
	//CONTROLE TEMPORAL (SEMANA E MES)
	
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
		

	public double getDespesaSemana() {
		return despesaSemana;
	}

	public void setDespesaSemana(double despesaSemana) {
		this.despesaSemana = getTotalDespesas()/getSemanas();
	}

	public double getDespesaMes() {
		return despesaMes;
	}

	public void setDespesaMes(double despesaMes) {
		this.despesaMes = getTotalDespesas()/getMeses();
	}

	public double getReceitaSemana() {
		return receitaSemana;
	}

	public void setReceitaSemana(double receitaSemana) {
		this.receitaSemana = getTotalReceitas()/getSemanas();
	}

	public double getReceitaMes() {
		return receitaMes;
	}

	public void setReceitaMes(double receitaMes) {
		this.receitaMes = getTotalReceitas()/getMeses();
	}
	
	//METODOS CALCULOS

	public void TotalDespesa() {
		setTotalDespesas(getTotalDespesasDia()+getTotalDespesas());
	}
	
	public void CalcularGanhosTotal() {
		setTotalReceitas(getTotalReceitasDia()+getTotalReceitas());
	}
	
	public void CalculoLucroDia() {
		setLucrosLiquidosDia(getTotalReceitasDia()-getTotalDespesasDia());
	}
	
	public void CalculoLucroTotal() {
		setLucrosLiquidos(getLucrosLiquidosDia()+getLucrosLiquidos());
	}
	
	//ZERAR RESULTADOS DIA
	
	public void ZerarResultados() {

		setLucrosLiquidosDia(0);
		setTotalReceitasDia(0);
		setTotalDespesasDia(0);
		this.totalDespesasDia=0;
		this.kmRodadosDia = 0;
		this.combustivelGastoDia = 0;
	}
	
	public void menuResultado() {
		
		int opRes;
		
		do {
		System.out.println("---------Controle de fluxo---------");			
		System.out.println("\n[1] Fluxo do dia \n[2] Fluxo semanal \n[3] Fluxo mensal \n[4] Balanço Total \n[5] Sair dos Resultados");
		System.out.print("\nSelecione uma opção: ");
		opRes= leia.nextInt();
		
		switch(opRes) 
		{
			case 1:
				System.out.println("\n--------Fluxo Do Dia---------\n"			
						+ "\nGanhos Totais: "+getTotalReceitasDia()+"\nDespesas Totais: "+getTotalDespesasDia()+"\nLucro Total Do Dia: "+getLucrosLiquidosDia()+"\nKMs Rodados: ");
				
				System.out.println("\n");
				System.out.println("	TIPOS	|	VALORES	|");
				System.out.println("________________________________");
				System.out.println("Ganhos Totais	|	"+getTotalReceitasDia()+"	|");
				System.out.println("________________________________");
				System.out.println("Despesas Totais	|	"+getTotalDespesasDia()+"	|");
				System.out.println("_______________________________");
				System.out.println("Lucros Totais	|	"+getLucrosLiquidosDia()+"	|");
				System.out.println("_______________________________");
				System.out.println("KMs Rodados	|	");
				System.out.println("_______________________________");
				System.out.println("Preço/KM	|	");
				System.out.println("___________________________");
				
				break;
				
			case 2:
				System.out.println("------ Valores Médios Semanal-------"			
						+ "\nGanhos Totais: "+getTotalReceitas()/getSemanas()+"\nDespesas Totais: "+getTotalDespesas()/getSemanas()+"\nLucro Total Do Dia: "+getLucrosLiquidos()/getSemanas()+"\nKMs Rodados: ");
				
				System.out.println("\n");
				System.out.println("		|	DIA	|	SEMANA		|	MÊS	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Ganhos Totais	|	"+getReceitaSemana()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Despesas Totais	|	"+getDespesaSemana()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Lucros Totais	|	"+getLucroSemana()+"	|	");
				System.out.println("________________________________________________________________________");
				System.out.println("KMs		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Preço/KM	|	");
				System.out.println("________________________________________________________________________");
				
				break;
			case 3:
				System.out.println("------Fluxo Médio Mensal-------"			
						+ "\nGanhos Totais: "+getTotalReceitas()/getMeses()+"\nDespesas Totais: "+getTotalDespesas()/getMeses()+"\nLucro Total Do Dia: "+getLucroMes()+"\nKMs Rodados: ");
				
				System.out.println("\n");
				System.out.println("		|	DIA	|	SEMANA		|	MÊS	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Ganhos Totais	|	"+getReceitaMes()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Despesas Totais	|	"+getDespesaMes()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Lucros Totais	|	"+getLucroMes()+"	|	");
				System.out.println("________________________________________________________________________");
				System.out.println("KMs		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Preço/KM	|	");
				System.out.println("________________________________________________________________________");
				
				break;
			case 4:
				
				System.out.println("\n");
				System.out.println("		|	TOTAL	|	SEMANA		|	MÊS	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Ganhos Totais	|	"+getTotalReceitas()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Despesas Totais	|	"+getTotalDespesas()+"	|			|		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Lucros Totais	|	"+getLucrosLiquidos()+"	|	");
				System.out.println("________________________________________________________________________");
				System.out.println("KMs		|");
				System.out.println("________________________________________________________________________");
				System.out.println("Preço/KM	|	");
				System.out.println("________________________________________________________________________");
				break;
			default:
				System.out.print("\nOpção inválida! Digite novamente: ");
			}
		
		
		
		} while(opRes!=5);
	}
	
}
