package ProjetoJava1;

import java.util.Scanner;

public class Contador {
	
	Scanner leia= new Scanner(System.in);
	
	private int dias;
	private int semanas;
	private int meses;
	
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias += dias;
		if(dias>=7) {
			contSemanas();
		}
	}

	public int getSemanas() {
		return semanas;
	}

	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}
	
	public void contSemanas() {
		setSemanas(getDias()%7);
	}
	
	public void contMeses() {
		setMeses(getDias()%30);
	}
}
