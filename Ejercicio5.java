/**Este programa resuelve una ecuacion de primer grado.
*AmandaNR*/
import java.util.Scanner;

public class Ejercicio5 {

	public static void main (String [] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Este programa resuelve ecuaciones de primer grado.");
		System.out.print("Introduce el valor de a y el valor de b seguidos de un espacio: ");
		
		double a = s.nextDouble();
		double b = s.nextDouble();
		
		if (a == 0) {
			System.out.println("Esta ecuacion no tiene solucion real.");
		}
		
		double total;
		total = b * -1 / a;
		
		System.out.println("x = "+ total);
	}
}
