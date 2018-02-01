
public class Ejemplos {
	public static void main(String[] args) {
		int edad = 66;
		double salario = 20000;
		boolean tieneHijos = true;
	
		/*
		 * CASO 1: 
		 * Se concede la subvención 1 a los menores de 25 con hijos o 
		 * a las personas mayores de 50
		 */
		boolean subvencion1 = ((edad < 25) && tieneHijos) || (edad > 45);

		
		/*
		 * CASO 2: 
		 * Se concede la subvención 2 a los menores de 35 que ganen menos de 30000 
		 * o los que tiene 35 o más edad y tienen hijos
		 */
		boolean subvencion2 = ((edad < 35) && (salario < 30000)) || ((edad >= 35) && tieneHijos);

		/*
		 * CASO 3: 
		 * Se concede la subvención 3 a los que o bien son mayores de 65 o ganan menos de 5000 
		 * siempre y cuando tengan hijos
		 */
		boolean subvencion3 = ((edad > 65) || (salario < 5000)) && tieneHijos;
		System.out.println(subvencion3);
		
	}
}
