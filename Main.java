package d;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// Array list. resizable array.
		//se pueden agregar elementos despues de que se haya hecho la compilacion
		// store reference data types
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("panchos");
		food.add("pizza");
		food.add("asado");
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
		 
	}
}
			
