package AnimalHerancaPolimorfismo;

public class Cachorro extends Animal {
		
		private String raca;

		public Cachorro(String nome, int idade, String produzSom, String acao, String raca) {
			super(nome, idade, produzSom, acao);
			this.raca=raca;
		}
		
		public String getRaca() {
			return raca;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public void imprimirInfo () {
			System.out.println("\nNome do animal: "+getNome()+"\nIdade do Animal: "+getIdade()+
					"\nAção: "+getAcao()+"\nRaça: "+this.getRaca()+"\nEmite Som? "+getProduzSom());
		}

		public void movimento() {
			System.out.println("Ação: Deve subir em árvores");
		}

		@Override
		public void Som() {
			// TODO Auto-generated method stub
			System.out.println("Som emitido pelo cachorro: au-au au-au");
		}

		@Override
		public void tipo() {
			// TODO Auto-generated method stub
			System.out.println("ANIMAL DO TIPO CACHORRO");
		}
}