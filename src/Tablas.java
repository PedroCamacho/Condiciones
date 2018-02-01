
public class Tablas {

	public static void TablaAnd() {
		boolean x = true;
		boolean y = false;
		boolean a1 = x && x;
		boolean a2 = x && y;
		boolean a3 = y && x;
		boolean a4 = y && y;

		System.out.println("Tabla de verdad del AND");
		System.out.println(x + " AND " + x + " = " + a1);
		System.out.println(x + " AND " + y + " = " + a2);
		System.out.println(y + " AND " + x + " = " + a3);
		System.out.println(y + " AND " + y + " = " + a4);
	}

	public static void TablaOr() {
		boolean x = true;
		boolean y = false;
		boolean a1 = x || x;
		boolean a2 = x || y;
		boolean a3 = y || x;
		boolean a4 = y || y;

		System.out.println("Tabla de verdad del OR");
		System.out.println(x + " OR " + x + " = " + a1);
		System.out.println(x + " OR " + y + " = " + a2);
		System.out.println(y + " OR " + x + " = " + a3);
		System.out.println(y + " OR " + y + " = " + a4);
	}

	public static void TablaNot() {
		boolean x = true;
		boolean y = false;
		boolean a1 = !x;
		boolean a2 = !y;
		
		System.out.println("Tabla de verdad del NOT");
		System.out.println("NOT " + x + " = " + a1);
		System.out.println("NOT " + y + " = " + a2);
	}
	
	
	public static void main(String[] args) {
		TablaAnd();
		System.out.println("");
		TablaOr();
		System.out.println("");
		TablaNot();
	}

}
