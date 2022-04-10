package ProjetoJava1;

public class ControleKm {

	private float km;
	private float kmFinal;
	
	public ControleKm (float km, float kmFinal) {
		
		this.km = km;
		this.kmFinal = kmFinal;
		
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}
	
	public float getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(float kmFinal) {
		this.kmFinal = kmFinal;
	}

	public void info_ControleKm() {
		
		System.out.println("Quilometragem rodada: "+km);
	}
	
	
	
}