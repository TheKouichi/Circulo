package Circulo;

/**
 * <h2> <b> TEST DEL CIRCULO </h2> </b>
 * @author Iv·n Amor MartÌn
 * @version 20/12/2019
 * @see <a href = "https://github.com/TheKouichi/Circulo" /> Aqui est· el repositorio remoto con todos
 * los pasos del proyecto </a>
 */
public class TestCirculo {

	public static void main(String[] args) {
		Circulo miCirculo = new Circulo();
		System.out.println(miCirculo.getRadio());
		miCirculo.setRadio(10);
		System.out.println(miCirculo.getRadio());
		System.out.println("El √°rea del c√≠rculo es " + miCirculo.calcularSuperficie());
		Circulo tuCirculo = new Circulo(miCirculo);
		System.out.println("El √°rea del c√≠rculo es " + tuCirculo.calcularSuperficie());
	}

}
