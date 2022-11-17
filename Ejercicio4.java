/**Este programa calcula el salario semanal de un trabajador
 * contando con las horas extras, que se pagan mas.
*AmandaNR*/

public class Ejercicio4 {
	
	public static void main (String [] args) {
		
		System.out.print("Introduce las horas trabajadas esta semana: ");
		String dato = System.console().readLine();
		int horas = Integer.parseInt(dato);
		
		if (horas <= 40) {
			int total = 12 * horas;
			System.out.println("Su sueldo de esta semana es: "+ total +" euros.");
		}
		if (horas >= 41) {
			int totalExtra = (horas - 40) * 16;
			int totalT = 12 * 40 + totalExtra;
			System.out.println("Su sueldo de esta semana es: "+ totalT +" euros.");
		}
	}
}
