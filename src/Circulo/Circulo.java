package Circulo;

import java.util.Scanner;

/**
 * <h2> <b> SUPERFICIE DE UN CIRCULO </b> </h2> 
 * <p> Este programa consiste en introducir por teclado un n�mero que ser� el radio del circulo en cuesti�n
 * que posteriormente habr� que calcular su superficie mediante un c�lculo matem�tico </p>
 * @author: Iv�n Amor Mart�n
 * @version: 20/12/2019
 * @see <a href = "https://github.com/TheKouichi/Circulo" /> Aqui est� el repositorio remoto con todos
 * los pasos del proyecto </a>
 */

public class Circulo {
	//atributos o miembros dato
	/*
	 * La variable radio declarada privada y de tipo double
	 */
	private double radio;
	
	//Constructor
	
	/**
	 * Constructor para sacar el radio del circulo
	 * @param radio Este radio dar� lugar al c�lculo de la superficie de dicho circulo
	 */
	public Circulo(double radio){
		this.radio = radio;
	}
	
	
	public Circulo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo");
		radio = entrada.nextDouble();
	}
	
	//Constructor copia
	/*
	 * Este es el constructor copia del proyecto
	 */
	public Circulo(Circulo copia) {
		radio = copia.radio;
	}
	
	//miembros metodo u operaciones que puedes hacer con el objeto
	
	/*
	 * Estos dos m�todos a continuacion son los getters y setters del proyecto
	 */
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularSuperficie() {
		/**
		 * @return Este m�todo devuelve el valor de la superficie del circulo
		 */
		return  Math.PI* Math.pow(radio, 2);
	}
	
}
