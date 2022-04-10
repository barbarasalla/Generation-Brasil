package ProjetoJava1;

import java.util.Scanner;
import java.text.NumberFormat;

public class Despesas {
	
	Scanner leia =new Scanner(System.in);

		private double Combustivel;
		private double Manutencao;
		private double Limpeza;
		private double Alimentacao;
		private double OutrasDespesas;
		private double totDespesaDia;
		private double CombustivelTotal;
		private double ManutencaoTotal;
		private double LimpezaTotal;
		private double AlimentacaoTotal;
		private double OutrasDespesasTotal;
		private double DespesaTotal=0;


	public Despesas(double Combustivel, double Manutencao, double Limpeza, double Alimentacao, double OutrasDespesas, double totDespesaDia) {
		
		this.Combustivel = Combustivel;
		this.Manutencao = Manutencao;
		this.Limpeza = Limpeza;
		this.Alimentacao = Alimentacao;
		this.OutrasDespesas = OutrasDespesas;
		this.totDespesaDia= totDespesaDia;	
	}


	public double getCombustivel() {
		return Combustivel;
	}


	public void setCombustivel(double combustivel) {
		this.Combustivel = combustivel;
	}


	public double getManutencao() {
		return Manutencao;
	}


	public void setManutencao(double manutencao) {
		Manutencao = manutencao;
	}



	public double getLimpeza() {
		return Limpeza;
	}


	public void setLimpeza(double limpeza) {
		Limpeza = limpeza;
	}


	public double getAlimentacao() {
		return Alimentacao;
	}



	public void setAlimentacao(double alimentacao) {
		Alimentacao = alimentacao;
	}


	public double getOutrasDespesas() {
		return OutrasDespesas;
	}


	public void setOutrasDespesas(double outrasDespesas) {
		OutrasDespesas = outrasDespesas;
	}


	public double getTotDespesaDia() {
		return totDespesaDia;
	}


	public void setTotDespesaDia(double totDespesaDia) {
		this.totDespesaDia = totDespesaDia;
	}
	
	public void totalizarDespesaDia() {
		setTotDespesaDia(getCombustivel()+getOutrasDespesas()+getAlimentacao()+getLimpeza()+getManutencao());
	}

	public double getCombustivelTotal() {
		return CombustivelTotal;
	}
	
	public void setCombustivelTotal(double combustivelTotal) {
		CombustivelTotal = combustivelTotal;
	}

	public double getManutencaoTotal() {
		return ManutencaoTotal;
	}

	public void setManutencaoTotal(double manutencaoTotal) {
		ManutencaoTotal = manutencaoTotal;
	}

	public double getLimpezaTotal() {
		return LimpezaTotal;
	}

	public void setLimpezaTotal(double limpezaTotal) {
		LimpezaTotal = limpezaTotal;
	}

	public double getAlimentacaoTotal() {
		return AlimentacaoTotal;
	}

	public void setAlimentacaoTotal(double alimentacaoTotal) {
		AlimentacaoTotal = alimentacaoTotal;
	}

	public double getOutrasDespesasTotal() {
		return OutrasDespesasTotal;
	}

	public void setOutrasDespesasTotal(double outrasDespesasTotal) {
		OutrasDespesasTotal = outrasDespesasTotal;
	}


	public double getDespesaTotal() {
		return DespesaTotal;
	}


	public void setDespesaTotal(double DespesaTotal) {
		this.DespesaTotal = DespesaTotal;
	}
	
	
	public void CalcularDespesaTotal () 
	{
		setDespesaTotal(getTotDespesaDia()+getDespesaTotal());
	}

	public void ZerarDespesas() {
		this.Combustivel = 0;
		this.Manutencao = 0;
		this.Limpeza = 0;
		this.Alimentacao = 0;
		this.OutrasDespesas = 0;
		this.totDespesaDia= 0;
		
	}
	
	
	public String FormCombustivel() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormCombustivel = nf.format(Combustivel);
		return FormCombustivel;	
		
	}
	
	public String FormManutencao() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormManutencao = nf.format(Manutencao);
		return FormManutencao;
		
	}
	
	public String FormLimpeza() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormLimpeza = nf.format(Limpeza);
		return FormLimpeza;
	}
	
	public String FormAlimentacao() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormAlimentacao = nf.format(Alimentacao);
		return FormAlimentacao;
	}

	public String FormOutrasDespesas() {
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String FormOutrasDespesas = nf.format(OutrasDespesas);
		return FormOutrasDespesas;
	}
		
	public void menuDespesa() 
	{
		double c = 0, m = 0;
		int  despesas, man = 0;;
		String[] tipoDeMan= new String[30];
		
		do {
			
			System.out.println("\t\tDESPESAS");
			System.out.println();
			System.out.println("1°) Combustivel" +"\n2°) Manutenção"+"\n3°) Limpeza"+"\n4°) Alimentação"+"\n5°) Outras Despesas"+"\n6°) Voltar ao menu");
			System.out.print("\nOpção: ");
			
			despesas = leia.nextInt();			
			switch(despesas) {
				
				
				case 1:
					
					System.out.print("Insira o gasto com combustivel: ");
					c =leia.nextDouble();
					setCombustivel(c);
					System.out.println("\n***************************************************************");
					System.out.println();
					break;

				case 2:
					
					System.out.print("Insira o tipo de Manutenção: ");				
					leia.nextLine();
					tipoDeMan[man] = leia.nextLine();      
					man++;
		
					System.out.print("Insira o valor gasto: ");
					m =leia.nextDouble();
					setManutencao(m);
					System.out.println("\n***************************************************************");
					
					System.out.println();
					break;
					
					
				case 3:
					
					System.out.print("Insira o valor gasto com limpeza: ");
					c =leia.nextDouble();
					setLimpeza(c);
					System.out.println("\n***************************************************************");
					
					System.out.println();
					break;
					
				case 4:
					
					System.out.print("Insira o valor gasto com alimentação: ");
					c =leia.nextDouble();
					setAlimentacao(c);
					System.out.println("\n***************************************************************");
					
					System.out.println();
					break;
				
				case 5:
					
					System.out.print("Insira o valor gasto com outras despesas: ");
					c =leia.nextDouble();
					setOutrasDespesas(c);
					leia.nextLine();
					System.out.print("Insira o nome da despesa: ");				
					tipoDeMan[man] = leia.nextLine();     
					man++;
					
					System.out.println("\n***************************************************************");
					System.out.println();
					break;
				
				
				case 6:
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
			}while(despesas != 6);
	}
}
