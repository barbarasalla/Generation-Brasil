import java.util.Scanner;

public class Despesas {
	
	Scanner leia =new Scanner(System.in);

		private double Combustivel;
		private double Manutencao;
		private double Limpeza;
		private double Alimentacao;
		private double OutrasDespesas;
		private double totDespesaDia=0;
		private double CombustivelDia=0;
		private double ManutencaoDia=0;
		private double LimpezaDia=0;
		private double AlimentacaoDia=0;
		private double OutrasDespesasDia=0;
		private double DespesaTotal=0;


	public Despesas(double Combustivel, double Manutencao, double Limpeza, double Alimentacao, double OutrasDespesas, double totDespesaDia) {
		
		this.Combustivel = Combustivel;
		this.Manutencao = Manutencao;
		this.Limpeza = Limpeza;
		this.Alimentacao = Alimentacao;
		this.OutrasDespesas = OutrasDespesas;
		this.totDespesaDia= totDespesaDia;	
	}

	//CONTABILIDADE ENTRADA
	
	public double getCombustivel() {
		return Combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.Combustivel = combustivel;
		setCombustivelDia(getCombustivelDia()+this.Combustivel);
	}

	public double getManutencao() {
		return Manutencao;
	}

	public void setManutencao(double manutencao) {
		this.Manutencao = manutencao;
		setManutencaoDia(getManutencaoDia()+this.Manutencao);
	}

	public double getLimpeza() {
		return Limpeza;
	}

	public void setLimpeza(double limpeza) {
		this.Limpeza = limpeza;
		setLimpezaDia(getLimpezaDia()+this.Limpeza);
	}

	public double getAlimentacao() {
		return Alimentacao;
	}

	public void setAlimentacao(double alimentacao) {
		Alimentacao = alimentacao;
		setAlimentacaoDia(getAlimentacaoDia()+this.Alimentacao);
	}

	public double getOutrasDespesas() {
		return OutrasDespesas;
	}

	public void setOutrasDespesas(double outrasDespesas) {
		OutrasDespesas = outrasDespesas;
		setOutrasDespesasDia(getOutrasDespesasDia()+this.OutrasDespesas);
	}

	// CONTABILIDADE DIA
	
	public double getTotDespesaDia() {
		return totDespesaDia;
	}

	public void setTotDespesaDia(double totDespesaDia) {
		this.totDespesaDia = totDespesaDia;
	}

	public double getCombustivelDia() {
		return CombustivelDia;
	}


	public void setCombustivelDia(double combustivelDia) {
		CombustivelDia = combustivelDia;
	}


	public double getManutencaoDia() {
		return ManutencaoDia;
	}


	public void setManutencaoDia(double manutencaoDia) {
		ManutencaoDia = manutencaoDia;
	}


	public double getLimpezaDia() {
		return LimpezaDia;
	}


	public void setLimpezaDia(double limpezaDia) {
		LimpezaDia = limpezaDia;
	}


	public double getAlimentacaoDia() {
		return AlimentacaoDia;
	}


	public void setAlimentacaoDia(double alimentacaoDia) {
		AlimentacaoDia = alimentacaoDia;
	}


	public double getOutrasDespesasDia() {
		return OutrasDespesasDia;
	}


	public void setOutrasDespesasDia(double outrasDespesasDia) {
		OutrasDespesasDia = outrasDespesasDia;
	}

	
	//CONTABILIDADE TOTAL

	public double getDespesaTotal() {
		return DespesaTotal;
	}

	public void setDespesaTotal(double DespesaTotal) {
		this.DespesaTotal = DespesaTotal;
	}
	
	//METODOS CALCULO
	
	public void totalizarDespesaDia() {
		setTotDespesaDia(getCombustivelDia()+getOutrasDespesasDia()+getAlimentacaoDia()+getLimpezaDia()+getManutencaoDia());
	}
	
	public void CalcularDespesaTotal () 
	{
		setDespesaTotal(getTotDespesaDia()+getDespesaTotal());
	}
	
	//METODO ZERAR

	public void ZerarDespesas() {
		setTotDespesaDia(0);
		setCombustivel(0);
		setManutencao(0);
		setLimpeza(0);
		setAlimentacao(0);
		setOutrasDespesas(0);
		setCombustivelDia(0);
		setManutencaoDia(0);
		setLimpezaDia(0);
		setAlimentacaoDia(0);
		setOutrasDespesasDia(0);	
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
					System.out.println("\n-------------------------------------------------------------");
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
					System.out.println("\n--------------------------------------------------------------");
					
					System.out.println();
					break;
					
					
				case 3:
					
					System.out.print("Insira o valor gasto com limpeza: ");
					c =leia.nextDouble();
					setLimpeza(c);
					System.out.println("\n---------------------------------------------------------------");
					
					System.out.println();
					break;
					
				case 4:
					
					System.out.print("Insira o valor gasto com alimentação: ");
					c =leia.nextDouble();
					setAlimentacao(c);
					System.out.println("\n----------------------------------------------------------------");
					
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
					
					System.out.println("\n----------------------------------------------------------------");
					System.out.println();
					break;
				
				
				case 6:
					System.out.println("\nVoltando para o menu...");
					System.out.println("\n-----------------------------------------------------------------");
					System.out.println();
					break;
				
				
				default:
					System.out.println("\nOpção invalido");
					System.out.println("\n-----------------------------------------------------------------");
					System.out.println();
					break;
				
				}
			}while(despesas != 6);
	}
}