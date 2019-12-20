package Circulo;

/**
 * <h2> <b> TEST DEL CIRCULO </h2> </b>
 * @author Iván Amor Martín
 * @version 20/12/2019
 * @see <a href = "https://github.com/TheKouichi/Circulo" /> Aqui está el repositorio remoto con todos
 * los pasos del proyecto </a>
 */

/*
 * Comienzo del test
 */
public class TestCirculo {

	public static void main(String[] args) {
		/*
		 * Creación de un nuevo circulo
		 */
		Circulo miCirculo = new Circulo();
		/*
		 * Comienza a utilizarse el metodo get
		 */
		System.out.println(miCirculo.getRadio());
		miCirculo.setRadio(10);
		System.out.println(miCirculo.getRadio());
		/*
		 * Aqui se sacan por pantalla los resultados
		 */
		System.out.println("El Area del circulo es " + miCirculo.calcularSuperficie());
		Circulo tuCirculo = new Circulo(miCirculo);
		System.out.println("El Area del circulo es " + tuCirculo.calcularSuperficie());
	}

}
