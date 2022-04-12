package ProjetoCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class AtivCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		
		int op;
				
		ArrayList<String> estoqueLoja =new ArrayList();
				
		do
		{
			System.out.print("\n[1] Adicionar produtos ao estoque");
			System.out.print("\n[2] Remover produtos do estoque");
			System.out.print("\n[3] Atualizar produtos do estoque");
			System.out.print("\n[4] Mostrar os produtos do estoque");
			System.out.print("\n[0] Encerrar o programa...");
			System.out.print("\n\nSelecione qual opção você deseja: ");
			op=in.nextInt();
					
			switch (op) 
				{
				case 1:
					in.nextLine(); 
					System.out.println("\nDigite o produto que você quer adicionar ao estoque: ");
					String NovoProduto = in.nextLine();
					estoqueLoja.add(NovoProduto);
				break;
				case 2:
					in.nextLine();
					System.out.println("\nDigite o produto que você quer remover do estoque: ");
					String produtoRemovido=in.nextLine();
							
					if (estoqueLoja.contains(produtoRemovido)) 
					{
						estoqueLoja.remove(produtoRemovido);
						System.out.println("\nProduto Removido.");
					} else {
						System.out.println("\nProduto não existente.");
						}
							
					break;
				case 3:
					in.nextLine();
					System.out.println("\nDigite o produto que você quer trocar e atualizar: ");
					String verifica = in.nextLine();
					System.out.println("\nDigite o produto que entrará no lugar de "+verifica+": ");
					String ProdutoAtualiza = in.nextLine();
							
					if (estoqueLoja.contains(verifica))
					{
						estoqueLoja.remove(verifica);
						estoqueLoja.add(ProdutoAtualiza);
					System.out.println("\nProduto Atualizado.");
					} else {
						System.out.println("\nProduto não existente.");
					}
							
					break;
				case 4:
					System.out.println("\nProdutos em estoque: ");
					System.out.println(estoqueLoja);
					break;		
					default:
						System.out.println("Opção inválida");
				}
		} while(op !=0);
	}

}




