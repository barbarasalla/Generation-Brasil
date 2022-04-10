package ProjetoJava1;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClasseCadastro cadastro = new ClasseCadastro();
		try (Scanner leia = new Scanner (System.in)) {
			int x;
			
			
			
			    do
			    {	
				
				System.out.println("\nMENU PRINCIPAL: \n\n"
						+ "1 - CADASTRO\n2 - LOGIN\n3 - CONFIGURAÇÕES\n");
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
			}
			while(x<=0 || x>=4);
		}
	}

}
