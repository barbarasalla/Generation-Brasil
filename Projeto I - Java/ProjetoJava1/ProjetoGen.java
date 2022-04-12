import java.util.Scanner;


public class ProjetoGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);

ClasseCadastro cadastro = new ClasseCadastro();	
Resultados res = new Resultados(0,0,0);
Despesas Des = new Despesas(0,0,0,0,0,0);
Ganhos gan = new Ganhos(0,0);
Contador contador= new Contador();

contador.setDias(0);

int opIniciar, x;

do {	

		System.out.println("\nMENU PRINCIPAL: \n\n"
				+ "[1] CADASTRO\n[2] LOGIN\n[3] CONFIGURAÇÕES\n[4] SAIR DO APLICATIVO");
		x = leia.nextInt();
		System.out.println();
		if(x==1)
		{
	
			cadastro.Cadastrar();
		}
		
		else if(x==2)
		{
			cadastro.Login();
		}
	
		else if(x==3)
		{
			cadastro.configuracoes();
		}
	  
//FIM CADASTRO/LOGIN
	    
	do {
		System.out.println("-------------------------MENU PRINCIPAL--------------------------\n\n [1] INICIAR SESSÃO DE REGISTRO\n [2] MENU CONTROLE \n [3] FAZER LOG OFF\n-------------------------------------------------");
		System.out.print("Digite sua escolha: ");
		opIniciar=leia.nextInt();
		
			if (opIniciar==1) {
				res.ZerarResultados();	//Zerando Resultados Total do DIA no RESULTADO
				Des.ZerarDespesas();	//Zerando Despesa Total do DIA
				gan.ZerarGanhos();		//Zerando Ganhos Total do DIA
						
			}
		switch(opIniciar) 
		{
		
			case 1:
				
				System.out.println("\nSESSÃO INICIADA... Dirija sempre com cuidado!\n");
							
				//Menu interativo com usuário	
				
				contador.setDias(contador.getDias()+1);
				int menu = 1;				
				do {
					
					System.out.println("\t\tMENU");
					System.out.println();
					System.out.println("\n [1] GANHOS \n [2] DESPESAS \n [3] ENCERRAR SESSÃO DO DIA \n");
					System.out.print("\nOpção: ");
		
					menu =leia.nextInt();	
					System.out.println("\n-----------------------------------------------------------");
					System.out.println();
					
					switch(menu){
					
						case 1:
							gan.menuGanhos();							
							break;
						case 2:
							Des.menuDespesa();
							break;
						case 3:
							System.out.print("\nEncerrando a sessão ");
							break;
							
						default:
							System.out.print("\nOpção invalido! Digite novamente: ");			
							System.out.println("\n-----------------------------------------------");		
							System.out.println();
							break;				
					}
					
				}while(menu != 3);
				
				
				Des.totalizarDespesaDia();							//Calculando DESPESA DIA
				res.setTotalDespesasDia(Des.getTotDespesaDia());	//Aplicando o total de DESPESA do DIA na Classe RESULTADO
				res.TotalDespesa();									//Calculando Despesa Total no RESULTADO
				
				
				gan.totalizarGanhosDia();							//Calculando GANHOS DIA
				res.setTotalReceitasDia(gan.getGanhosTotaisDias());				//Aplicando o total de GANHOS do DIA na Classe RESULTADO
				res.CalcularGanhosTotal();
				
				res.CalculoLucroDia();								//Calculando LUCROS DIA	
				res.CalculoLucroTotal();							//Calcular Lucro Total	
				
				res.setLucroSemana((res.getLucrosLiquidos())/contador.getSemanas());		//Calculos Semanas
				res.setDespesaSemana((res.getTotalDespesas())/contador.getSemanas());
				res.setReceitaSemana((res.getTotalReceitas())/contador.getSemanas());

				res.setLucroMes((res.getLucrosLiquidos())/contador.getMeses());				//Calculos Meses
				res.setDespesaMes((res.getTotalDespesas())/contador.getMeses());
				res.setReceitaMes((res.getTotalReceitas())/contador.getMeses());
				
				break;
				
				//FIM MENU FLUXO
			case 2:
				
				res.menuResultado();
				
				break;
			case 3:
				System.out.println("\nENCERRANDO SESSÃO...\n");
				break;
			default:
				System.out.print("Opção inválida, digite novamente: ");		
			}
		} while(opIniciar!=3);

	}while(x!=4);
	
	}

}