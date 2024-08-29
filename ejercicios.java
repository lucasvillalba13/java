package d;
import java.util.*;

public class ejercicios {

	public static void main(String[] args) {
	
		//ejercicio 1	
		
		int x = 18;
		int z = 6;
	
		int division =  x / z; 
		int suma = x + z;
		int multiplicacion = x * z;
		int resta = x - z;
		int modulo = x % z;
		
		ArrayList<Integer> operaciones = new ArrayList();
		
		operaciones.add(division);
		operaciones.add(suma);
		operaciones.add(multiplicacion);
		operaciones.add(resta);
		operaciones.add(modulo);
		
		for (int i = 0; i<operaciones.size(); i++) {
			System.out.println("el resultado es: " +operaciones.get(i));
		}			
		
		//ejercicio 2 
		
		int a = 100;
		int b = 102;
		
		if (a > b) {
			System.out.println("'A' es mayor que 'B'");
		} else if (a == b){ 
			System.out.println("'A' es igual a 'B'");
		}else if (a < b) {
			System.out.println("'A' es menor que 'B'");
		}
		
		// ejercicio 3
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cual es tu nombre?");
		String nombre = scanner.nextLine();
		
		System.out.println("Bienvenido "+ nombre+ " a Java!");
		
		
				
		// ejercicio 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce un radio");
		double radio = scanner.nextDouble();
		
		double resultado = Math.PI*radio;
		System.out.println(resultado);
		
		// ejercicio 6
	
		Scanner seis = new Scanner(System.in); 
		System.out.println("introduce un numero para comprobr si es divisible por 2");
		int respuesta = scanner.nextInt();
		
		if (respuesta%2==0) {
			System.out.println("si es divisible por 2");	
		} else {
			System.out.println("no es divisible por 2");
		}
	}
}