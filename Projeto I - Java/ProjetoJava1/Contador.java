import java.util.Scanner;

public class Contador {
	
	private double dias=0;
	private double semanas=0;
	private double meses=0;
	

	Scanner leia= new Scanner(System.in);

	
	public double getDias() {
		return dias;
	}

	public void setDias(double dias) {
		this.dias = dias;
		if(dias>=7.0) {
			double dReal= dias/7;
			int semanas= (int)dReal;
			setSemanas(semanas);
		}
		if(dias>=30) {
			double dR= dias/30;
			int meses= (int)dR;
			setMeses(meses);
		}
	}

	public double getSemanas() {
		return semanas;
	}

	public void setSemanas(double semanas) {
		this.semanas = semanas;
	}

	public double getMeses() {
		return meses;
	}

	public void setMeses(double meses) {
		this.meses = meses;
	}
	
}