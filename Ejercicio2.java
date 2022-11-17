/**Este programa muestra por pantalla "Buenos dias, Buenas tardes o Buenas noches"
*segun la hora que sea.
*AmandaNR*/

public class Ejercicio2 {

	public static void main (String [] args) {
	
		System.out.print("Introduce la hora que es (sin los minutos): ");
		String dato = System.console().readLine();
		int hora = Integer.parseInt( dato );
		
		if ((hora >= 6) && (hora <= 12)) {
			System.out.println("Buenos dias");
		} else if ((hora >= 13) && (hora <= 20)) {
			System.out.println("Buenas tardes");
		} else if ((hora >= 21) && (hora <= 24) || (hora < 6)) {
			System.out.println("Buenas noches"); 
		} else {
			System.out.println("Introduce una hora correcta");
		}
	}
}


