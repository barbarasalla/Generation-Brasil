package AnimalHerancaPolimorfismo;
	
	public class Preguica extends Animal {


		public Preguica(String nome, int idade, String produzSom, String acao) {
			super(nome, idade, produzSom, acao);
		}
		
		public void imprimirInfo () {
			System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
					"\nEmite Som: "+getProduzSom()+"\nA��o: "+getAcao());
		}

		@Override
		public void Som() {
			// TODO Auto-generated method stub
			System.out.println("Som emitido pela pregui�a: �nn-�nn �nn-�nn");
		}

		@Override
		public void tipo() {
			// TODO Auto-generated method stub
			System.out.println("ANIMAL DO TIPO PREGUI�A");
		}
}
