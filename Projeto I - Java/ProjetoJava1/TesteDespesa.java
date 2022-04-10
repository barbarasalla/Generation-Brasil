package ProjetoJava1;

import java.util.Scanner;

public class TesteDespesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);

ClasseCadastro cadastro = new ClasseCadastro();	
Resultados res = new Resultados(0,0,0,0,0);
Despesas Des = new Despesas(0,0,0,0,0,0);
Ganhos gan = new Ganhos(0,0);
Contador contador= new Contador();

double totDespesaDia=0, totGanhosDia=0, LucroDia=0;

int opIniciar, x, dia=0;

do {	

		System.out.println("\nMENU PRINCIPAL: \n\n"
				+ "1 - CADASTRO\n2 - LOGIN\n3 - CONFIGURAÇÕES\n4 - SAIR DO APLICATIVO");
		x = leia.nextInt();
		
		if(x==1)
		{
	
			cadastro.getNome();
			cadastro.getEmail();
			cadastro.getSenha();
			cadastro.getDdd();
			cadastro.getTelefone();
			cadastro.cadastroRealizado();
			cadastro.facaLogin();
			cadastro.getLogin();
			cadastro.getSenhaConfirma();
			cadastro.bemVinde();
			
	
		}
		else if(x==2)
		{
			cadastro.facaLogin();
			cadastro.getLogin();
			cadastro.getSenhaLogin();
			cadastro.bemVinde();
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
				System.out.println("\nLEMBRE-SE DE ENCERRAR A SESSÃO QUANDO O SEU DIA DE TRABALHO FINALIZAR..\n");
				System.out.println("\nSESSÃO INICIADA... Dirija sempre com cuidado!");
				//Menu interativo com usuário	
				
				contador.setDias(1);
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
					
						default:
							System.out.print("\nOpção invalido! Digite novamente: ");			
							System.out.println("\n-----------------------------------------------");		
							System.out.println();
							break;				
					}
					
				}while(menu != 3);
				
				
				Des.totalizarDespesaDia();				
				totDespesaDia= Des.getTotDespesaDia(); 
				res.setTotalDespesasDia(totDespesaDia);	//Aplicando o total de DESPESA do DIA na Classe RESULTADO
				
				totGanhosDia = gan.getReceitaDia();
				res.setTotalReceitasDia(totGanhosDia);	//Aplicando o total de GANHOS do DIA na Classe RESULTADO
				
				res.CalculoLucroDia();
				LucroDia = res.getLucrosLiquidos();	//Aplicando o total de LUCRO do DIA em variavel
				
				Des.CalcularDespesaTotal();	//Calculando Despesa Total
				res.TotalDespesa();			//Calculando Despesa Total no RESULTADO

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
