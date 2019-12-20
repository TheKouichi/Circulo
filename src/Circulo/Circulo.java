package Circulo;

import java.util.Scanner;

/** 
 * Este programa consiste en introducir por teclado un número que será el radio del circulo en cuestión
 * que posteriormente habrá que calcular su superficie mediante un cálculo matemático
 * @author: Iván Amor Martín
 * @version: 20/12/2019
 * @see <a href = "https://github.com/TheKouichi/Circulo" /> Aqui está el repositorio remoto con todos
 * los pasos del proyecto </a>
 */

public class Circulo {
	//atributos o miembros dato
	private double radio;
	
	//Constructor
	public Circulo(double radio){
		this.radio = radio;
	}
	
	
	public Circulo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo");
		radio = entrada.nextDouble();
	}
	
	//Constructor copia
	public Circulo(Circulo copia) {
		radio = copia.radio;
	}
	
	//miembros metodo u operaciones que puedes hacer con el objeto
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularSuperficie() {
		return  Math.PI* Math.pow(radio, 2);
	}
	
}
