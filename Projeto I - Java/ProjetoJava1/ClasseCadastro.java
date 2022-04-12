import java.util.Scanner;

public class ClasseCadastro {


		public String nome;
		public String email;
		public String senha;
		public int telefone;
		public int ddd;
		public String confirmar;
		public int x;
		public String cadastro;
		public String login;
		public String senhaConfirma;
		public String senhaLogin;
		public String nome1;
		
		Scanner leia = new Scanner(System.in);
		
		public ClasseCadastro () {
			
			this.nome = " ";
			this.email = " ";
			this.senha = " ";
			this.confirmar = " ";
			this.cadastro = " ";
			this.cadastro=" "; {
			this.x = 0;
			this.login = " ";
			this.senhaLogin = " ";
			this.nome1 =" ";
				 
				System.out.println("\n\n");
				for(x=0; x <=20; x++) {
					System.out.print("--");
					if (x==20)
					{
						System.out.print("  DCAR$ - APLICATIVO FINANCEIRO  ");
						
					}
				}
				
				x = 0;
				for(x=0; x <=20; x++) {
					System.out.print("--");
					
				}
				System.out.println("\n\n");
			 }
			
		 }
			

		public String getCadastro() {
			return cadastro;
		}


		public void setCadastro(String cadastro) {
			this.cadastro = cadastro;
		}


		public String getNome() {
			System.out.println("\nDigite o seu nome: ");
			nome = leia.nextLine();
			System.out.println("\nVocê confirma seus dados? [S/N] ");
			confirmar = leia.nextLine().toUpperCase();
			while (!confirmar.equals("S"))
			{
				System.out.println("\nDigite novamente o seu nome: ");
				nome = leia.nextLine();
				System.out.println("\nVocê confirma seus dados? [S/N] ");
				confirmar = leia.nextLine().toUpperCase();
			}
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			System.out.println("\nDigite o seu email: ");
			email = leia.nextLine();
			System.out.println("\nVocê confirma seus dados? [S/N] ");
			confirmar = leia.nextLine().toUpperCase();
			while (!confirmar.equals("S"))
			{
				System.out.println("\nDigite novamente o seu email: ");
				email = leia.nextLine();
				System.out.println("\nVocê confirma seus dados? [S/N] ");
				confirmar = leia.nextLine().toUpperCase();
			}
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			System.out.println("\nDigite a sua senha: ");
			
						
			senha = leia.nextLine();
			System.out.println("\nDigite a sua senha novamente: ");
			confirmar = leia.nextLine();
			while (!confirmar.equals(senha))
			{
				System.out.println("\nDigite a sua senha: ");
				senha = leia.nextLine();
				System.out.println("\nDigite a sua senha novamente: ");
				confirmar = leia.nextLine();
			}
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public int getTelefone() {
			System.out.println("\nDigite o seu telefone: ");
			telefone = leia.nextInt();
			System.out.println("\nVocê confirma seus dados? [S/N] ");
			confirmar = leia.next().toUpperCase();
			while (!confirmar.equals("S"))
			{
				System.out.println("\nDigite novamente o seu telefone: ");
				telefone = leia.nextInt();
				System.out.println("\nVocê confirma seus dados? [S/N] ");
				confirmar = leia.next().toUpperCase();
			}
			return telefone;
		}

		public void setTelefone(int telefone) {
			this.telefone = telefone;
		}

		public int getDdd() {
			System.out.println("\nDigite o seu ddd: ");
			ddd = leia.nextInt();
			System.out.println("\nVocê confirma seus dados? [S/N] ");
			confirmar = leia.next().toUpperCase();
			while (!confirmar.equals("S"))
			{
				System.out.println("\nDigite novamente o seu ddd: ");
				ddd = leia.nextInt();
				System.out.println("\nVocê confirma seus dados? [S/N] ");
				confirmar = leia.next().toUpperCase();
			}
			return ddd;
		}

		public void setDdd(int ddd) {
			this.ddd = ddd;
		}

		public String getConfirmar() {
			return confirmar;
		}

		public void setConfirmar(String confirmar) {
			this.confirmar = confirmar;
		}

		public Scanner getLeia() {
			return leia;
		}

		public void setLeia(Scanner leia) {
			this.leia = leia;
		}
		
		public void cadastroRealizado() 
		{
			System.out.println("\n\n");
			for(x=0; x <=20; x++) {
				System.out.print("--");
				if (x==20)
				{
					System.out.print("  CADASTRO REALIZADO COM SUCESSO  ");
					
				}
			}
			
			//LOGIN
			
			x = 0;
			for(x=0; x <=20; x++) {
				System.out.print("--");
				
			}
			System.out.println("\n\n");
		}
		public void facaLogin() 
			{
				System.out.println("\n\n");
			for(x=0; x <=20; x++) {
					System.out.print("--");
				if (x==20)
					{
						System.out.print("  FAÇA SEU LOGIN  ");
						
					}
				}
				
				x = 0;
			for(x=0; x <=20; x++) {
					System.out.print("--");
					
				}
				System.out.println("\n\n");
			}
		public String getLogin()
		{
			System.out.println("\nDigite o seu Login (Email): ");
			login = leia.nextLine();
			return login = leia.nextLine();
		}
		public String setLogin()
		{
			return login;
		}
		public String getSenhaConfirma()
		{
			System.out.println("\nDigite sua senha: ");
			senhaLogin = leia.nextLine();
			
			while (!senhaLogin.equals(senha))
			{
				System.out.println("\nE-mail ou senha inválidos! Faça login novamente! ");
				senhaLogin = leia.nextLine();
				
			}
			return senhaConfirma;
		}

		public void setSenhaConfirma(String senhaLogin)
		{
			this.senhaConfirma = senhaLogin;
		}

		public void bemVinde() 
		{
			System.out.println("\n\n");
		for(x=0; x <=20; x++) {
				System.out.print("--");
			if (x==20)
				{
					System.out.print("  BEM VINDE AO DCAR$  ");
					
				}
			}
			
			x = 0;
		for(x=0; x <=20; x++) {
				System.out.print("--");
				
			}
			System.out.println("\n\n");
		}
		
		public String getSenhaLogin()
		{
			System.out.println("\nDigite sua senha: ");
			senhaLogin = leia.nextLine();
			return senhaLogin;
		}
		public void setSenhaLogin(String senhaLogin)
		{
			this.senhaLogin = senhaLogin;
		}

		public void bemVinde1() 
		{
			System.out.println("\n\n");
		for(x=0; x <=20; x++) {
				System.out.print("--");
			if (x==20)
				{
					System.out.print("  BEM VINDE AO DCAR$  ");
					
				}
			}
			
			x = 0;
		for(x=0; x <=20; x++) {
				System.out.print("--");
				
			}
			System.out.println("\n\n");
		}
		public void configuracoes()

		{
			do
			{
				
			
			System.out.println("\nCONFIGURAÇÕES \n\n"
					+ "1 - ALTERAR CADASTRO\n2 - SAIR\n");
			x = leia.nextInt();
			if(x==1)
			{
				
				System.out.println("\nDeseja alterar o seu nome? [S/N]");
				confirmar = leia.next().toUpperCase();
				while(!confirmar.equals("N") && !confirmar.equals("S"))
				{
					System.out.println("\nDeseja alterar o seu nome? [S/N]");
					confirmar = leia.next().toUpperCase();
				}
				while(confirmar.equals("S"))
				{
					System.out.println("\nDigite o seu nome: ");
					nome = leia.nextLine();
					leia.nextLine();
					System.out.println("\nVocê quer digitar novamente? [S/N] ");
					confirmar = leia.nextLine().toUpperCase();
				}
				
				
				System.out.println("\nDeseja alterar o seu e-mail? [S/N]");
				confirmar = leia.next().toUpperCase();
				while(!confirmar.equals("N") && !confirmar.equals("S"))
				{
					System.out.println("\nDeseja alterar o seu nome? [S/N]");
					confirmar = leia.next().toUpperCase();
				}
				while(confirmar.equals("S"))
				{
					System.out.println("\nDigite o seu e-mail: ");
					email = leia.nextLine();
					leia.nextLine();
					System.out.println("\nVocê quer digitar novamente? [S/N] ");
					confirmar = leia.nextLine().toUpperCase();
				}

				System.out.println("\nDeseja alterar sua senha? [S/N]");
				confirmar = leia.next().toUpperCase();
				while(!confirmar.equals("N") && !confirmar.equals("S"))
				{
					System.out.println("\nDeseja alterar o seu nome? [S/N]");
					confirmar = leia.next().toUpperCase();
				}
				while(confirmar.equals("S"))
				{
					System.out.println("\nDigite a sua senha: ");
					senha = leia.nextLine();
					leia.nextLine();
					System.out.println("\nVocê quer digitar novamente? [S/N] ");
					confirmar = leia.nextLine().toUpperCase();
				}
			System.out.println(confirmar);
			
			}
		
			else if(x==2)
			{
				System.out.println("\nSaindo...");
			}
			}while(x != 2);
	
		}
		public void Cadastrar() 
		{
			getNome();
			getEmail();
			getSenha();
			getDdd();
			getTelefone();
			cadastroRealizado();
			facaLogin();
			getLogin();
			getSenhaConfirma();
			bemVinde();
		}		
		public void Login() 
		{
			facaLogin();
			getLogin();
			getSenhaLogin();
			bemVinde();
		}
}