package Familia51;

public class programaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1= new Cliente("João", "Silva", "Lima Da", 81 , 908798562, "joaoSLima@msn.com");
		System.out.println("Nome Completo do Cliente: "+cliente1.getNomeCompleto());
		System.out.println("Telefone do Cliente: ("+cliente1.getDDD()+") "+cliente1.getTelefone());
		System.out.println("E-mail do Cliente: "+cliente1.getEmail());
	}
}
