import java.text.NumberFormat;
import java.util.Scanner;

public class Resultados extends Contador {
	
	Scanner leia= new Scanner(System.in);
	
	private double totalReceitasDia, totalDespesasDia, lucrosLiquidosDia, totalReceitas, totalDespesas, lucrosLiquidos, lucroSemana, lucroMes, 
	despesaSemana, despesaMes, receitaSemana, receitaMes;
		
	public Resultados(double totalReceitasDia, double totalDespesasDia, double lucrosLiquidosDia) {
		
			this.totalReceitasDia = totalReceitasDia;
			this.totalDespesasDia = totalDespesasDia;
			this.lucrosLiquidosDia = lucrosLiquidosDia;
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
	
	//CONTROLE TEMPORAL (SEMANA E MES)
	
	public double getLucroSemana() {
		return lucroSemana;
	}
	
	public void setLucroSemana(double lucroSemana) {
		this.lucroSemana= lucroSemana;
	}
	
	public double getLucroMes() {
		return lucroMes;
	}

	public void setLucroMes(double lucroMes) {
		this.lucroMes = lucroMes;
	}
		
	public double getDespesaSemana() {
		return despesaSemana;
	}

	public void setDespesaSemana(double despesaSemana) {
		this.despesaSemana = despesaSemana;
	}

	public double getDespesaMes() {
		return despesaMes;
	}

	public void setDespesaMes(double despesaMes) {
		this.despesaMes = despesaMes;
	}

	public double getReceitaSemana() {
		return receitaSemana;
	}

	public void setReceitaSemana(double receitaSemana) {
		this.receitaSemana = receitaSemana;
	}

	public double getReceitaMes() {
		return receitaMes;
	}

	public void setReceitaMes(double receitaMes) {
		this.receitaMes = receitaMes;
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
	}
	
	public String FormatarValores(double valor) {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormatarValores = nf.format(valor);
		return FormatarValores;
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
				
				System.out.println("\n");
				System.out.println("	TIPOS	|	VALORES		|");
				System.out.println("_______________________________________");
				System.out.println("Ganhos Totais	|	"+FormatarValores(getTotalReceitasDia())+"		|");
				System.out.println("_______________________________________");
				System.out.println("Despesas Totais	|	"+FormatarValores(getTotalDespesasDia())+"		|");
				System.out.println("_______________________________________");
				System.out.println("Lucros Totais	|	"+FormatarValores(getLucrosLiquidosDia())+"		|");
				System.out.println("_______________________________________");
				
				break;
				
			case 2:
			
				System.out.println("\n");
				System.out.println("		|	SEMANA	|");
				System.out.println("_____________________________________________");
				System.out.println("Ganhos Totais	|	"+FormatarValores(getReceitaSemana())+"	|");
				System.out.println("_____________________________________________");
				System.out.println("Despesas Totais	|	"+FormatarValores(getDespesaSemana())+"	|");
				System.out.println("_____________________________________________");
				System.out.println("Lucros Totais	|	"+FormatarValores(getLucroSemana())+"	|");
				System.out.println("_____________________________________________");				
				
				break;
			case 3:
				
				System.out.println("\n");
				System.out.println("		|	MÊS	|");
				System.out.println("_________________________________________");
				System.out.println("Ganhos Totais	|	"+FormatarValores(getReceitaMes())+"	|");
				System.out.println("_________________________________________");
				System.out.println("Despesas Totais	|	"+FormatarValores(getDespesaMes())+"	|");
				System.out.println("_________________________________________");
				System.out.println("Lucros Totais	|	"+FormatarValores(getLucroMes())+"	|");
				System.out.println("_________________________________________");

				break;
			case 4:
				
				System.out.println("\n");
				System.out.println("		|	TOTAL		|	SEMANA		|	MÊS	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Ganhos Totais	|	"+FormatarValores(getTotalReceitas())+"	|	"+FormatarValores(getReceitaSemana())+"	|	"+FormatarValores(getReceitaMes())+"	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Despesas Totais	|	"+FormatarValores(getTotalDespesas())+"	|	"+FormatarValores(getDespesaSemana())+"	|	"+FormatarValores(getDespesaMes())+"	|");
				System.out.println("________________________________________________________________________");
				System.out.println("Lucros Totais	|	"+FormatarValores(getLucrosLiquidos())+"	|	"+FormatarValores(getLucroSemana())+"	|	"+FormatarValores(getLucroMes())+"	|");
				System.out.println("________________________________________________________________________");


				break;
			default:
				System.out.print("\nOpção inválida! Digite novamente: ");
				break;
			}
		
		
		
		} while(opRes!=5);
	}
	
}